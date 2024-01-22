package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;


/* 
 * This extractor is based on the original idea of the thesis 
 *  "Enabling the Information Transfer between Architecture and Source Code for Security Analysis"
*/
public class NaivePowerSetLatticeResultingSpecificationExtractor extends ResultingSpecificationExtractor {

	private ResultingSpecification resultingSpecification;
	
	public NaivePowerSetLatticeResultingSpecificationExtractor(Configuration config) {
		super(config);
		this.resultingSpecification = new ResultingSpecification();
	}


	protected SecurityLevel combine(SecurityLevel source, SecurityLevel sink) {
	
		Collection<SecurityLevel> sourceBasicLevels =  CodeQLResolutionUtil.resolveBasicLevels(source, config);
		Collection<SecurityLevel> sinkBasicLevels =  CodeQLResolutionUtil.resolveBasicLevels(sink, config);
		
		Set<SecurityLevel> combinedLevels = new HashSet<SecurityLevel>();
		
		sourceBasicLevels.stream().forEach(level -> {combinedLevels.add(level);});
		sinkBasicLevels.stream().forEach(level -> {combinedLevels.add(level);});
		
		return CodeQLResolutionUtil.findLevelFromSetOfBasicLevels(combinedLevels, config);
	
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
	
	private boolean isResultEntryValitWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<SecurityLevel> sourceBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(resultEntry.getSource().getSecurityProperty(), config);
		Collection<SecurityLevel> sinkBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(resultEntry.getSink().getSecurityProperty(), config);
		
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


	private ResultingSpecEntry combine(ResultEntry resultEntry) {
		Parameter targetParameter = null;
		if(resultEntry.getSink().getSystemElement() instanceof Parameter) {
			targetParameter = (Parameter)resultEntry.getSink().getSystemElement();
		}
		
		ResultingSpecEntry resultingSpecEntry = resultingSpecification.getResultingSpecEntryForTargetIfExisting(targetParameter).orElse(null);
		
		SecurityLevel newLevel;
		if(resultingSpecEntry == null) {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultEntry.getSink().getSecurityProperty());
			return new ResultingSpecEntry(newLevel, targetParameter);
		} else {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultingSpecEntry.getSecurityProperty());
			resultingSpecEntry.setSecurityProperty(newLevel);
			return resultingSpecEntry;
		}
	}
}
