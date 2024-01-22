package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

/* 
 * This extractor is based on the original idea of the thesis 
 *  "Enabling the Information Transfer between Architecture and Source Code for Security Analysis"
*/
public class NaivePowerSetLatticeResultingSpecificationExtractor extends ResultingSpecificationExtractor {

	private ResultingSpecification resultingSpecification;

	public NaivePowerSetLatticeResultingSpecificationExtractor(EntryPoint entryPoint) {
		super(entryPoint);
	}
	
	public NaivePowerSetLatticeResultingSpecificationExtractor() {
		super();
	}

	protected Level combine(Level source, Level sink) {

		Collection<Level> sourceBasicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(source, entryPoint);
		Collection<Level> sinkBasicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(sink, entryPoint);

		Set<Level> combinedLevels = new HashSet<Level>();

		sourceBasicLevels.stream().forEach(level -> {
			combinedLevels.add(level);
		});
		sinkBasicLevels.stream().forEach(level -> {
			combinedLevels.add(level);
		});

		return JOANAResolutionUtil.findLevelFromSetOfBasicLevels(combinedLevels, entryPoint);

	}


	private boolean isResultEntryValitWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<Level> sourceBasicLevels = JOANAResolutionUtil.resolveBasicLevels(resultEntry.getSource().getSecurityProperty(), entryPoint);
		Collection<Level> sinkBasicLevels = JOANAResolutionUtil.resolveBasicLevels(resultEntry.getSink().getSecurityProperty(), entryPoint);
		
		return !containsAny(sourceBasicLevels, sinkBasicLevels);
	}
	
	public static <T> boolean containsAny(Collection<T> ifContaining, Collection<T> testAgainst) {
		for(T elementToTest : testAgainst) {
			if(ifContaining.contains(elementToTest)) {
				return true;
			}
		} 
		
		return false;
	}


	@Override
	public ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar) {
		for(ResultEntry resultEntry : scar.getResultEntries()) {
			if(isResultEntryValitWRTAccessAnalysis(resultEntry)) {
				ResultingSpecEntry entry = combine(resultEntry);
				resultingSpecification.addEntry(entry);
			}
		}
		
		return resultingSpecification;
	}
	
	private ResultingSpecEntry combine(ResultEntry resultEntry) {
		Parameter targetParameter = null;
		if(resultEntry.getSink().getSystemElement() instanceof Parameter) {
			targetParameter = (Parameter)resultEntry.getSink().getSystemElement();
		}
		
		ResultingSpecEntry resultingSpecEntry = resultingSpecification.getResultingSpecEntryForTargetIfExisting(targetParameter).orElse(null);
		
		Level newLevel;
		if(resultingSpecEntry == null) {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultEntry.getSink().getSecurityProperty());
			return new ResultingSpecEntry(targetParameter, newLevel, entryPoint);
		} else {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultingSpecEntry.getSecurityProperty());
			resultingSpecEntry.setSecurityProperty(newLevel);
			return resultingSpecEntry;
		}
	}
}
