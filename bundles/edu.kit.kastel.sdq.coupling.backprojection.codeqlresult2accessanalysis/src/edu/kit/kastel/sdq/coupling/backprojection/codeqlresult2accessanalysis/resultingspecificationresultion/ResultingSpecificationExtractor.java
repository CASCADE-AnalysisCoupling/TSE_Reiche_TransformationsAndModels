package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion;

import java.util.Collection;
import java.util.HashSet;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.resultingspec.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class ResultingSpecificationExtractor {

	private Configuration config;
	private Collection<SecurityLevel> basicSecurityLevels;
	
	public ResultingSpecificationExtractor(Configuration config) {
		this.config = config;
	}
	
	public ResultingSpecification generateResultingSpecification(SourceCodeAnalysisResult scar) {
		
		ResultingSpecification resSpec = new ResultingSpecification();
		
		return resSpec;
		
	}
	
	private Collection<SecurityLevel> splitLevelIntoBasicLevels(SecurityLevel level){
		
		Collection<SecurityLevel> basicExtractedLevels = new HashSet<SecurityLevel>();
		
		if(basicSecurityLevels.contains(level)) {
			basicExtractedLevels.add(level);
			return basicExtractedLevels;
		}
		
		
		
		
		
		return basicExtractedLevels;
	}
}
