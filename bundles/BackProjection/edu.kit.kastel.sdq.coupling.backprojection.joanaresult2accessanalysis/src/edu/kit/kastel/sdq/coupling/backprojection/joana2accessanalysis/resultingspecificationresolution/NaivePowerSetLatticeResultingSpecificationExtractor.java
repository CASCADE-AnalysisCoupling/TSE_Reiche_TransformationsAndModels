package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.resultingspecificationresolution;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

/* 
 * This extractor is based on the original idea of the thesis 
 *  "Enabling the Information Transfer between Architecture and Source Code for Security Analysis"
*/
public class NaivePowerSetLatticeResultingSpecificationExtractor extends ResultingSpecificationResolution {



	public NaivePowerSetLatticeResultingSpecificationExtractor(EntryPoint config) {
		super(config);
	}
	
	public NaivePowerSetLatticeResultingSpecificationExtractor() {
		super();
	}

	protected Level combine(Level source, Level sink) {

		Collection<Level> sourceBasicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(source, config, SUBLEVEL_DELIMITER);
		Collection<Level> sinkBasicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(sink, config, SUBLEVEL_DELIMITER);

		Set<Level> combinedLevels = new HashSet<Level>();

		sourceBasicLevels.stream().forEach(level -> {
			combinedLevels.add(level);
		});
		sinkBasicLevels.stream().forEach(level -> {
			combinedLevels.add(level);
		});

		return JOANAResolutionUtil.findLevelFromSetOfBasicLevels(combinedLevels, config);

	}


	private boolean isResultEntryValitWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<Level> sourceBasicLevels = JOANAResolutionUtil.resolveBasicLevels(resultEntry.getSource().getSecurityProperty(), config, SUBLEVEL_DELIMITER);
		Collection<Level> sinkBasicLevels = JOANAResolutionUtil.resolveBasicLevels(resultEntry.getSink().getSecurityProperty(), config, SUBLEVEL_DELIMITER);
		
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
			return new ResultingSpecEntry(targetParameter, newLevel, config);
		} else {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultingSpecEntry.getSecurityProperty());
			resultingSpecEntry.setSecurityProperty(newLevel);
			return resultingSpecEntry;
		}
	}
}
