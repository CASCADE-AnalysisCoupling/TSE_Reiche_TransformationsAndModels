package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public abstract class ResultingSpecificationExtractor {
	
	public ResultingSpecificationExtractor(Configuration config) {
		super();
		this.config = config;
	}
	
	protected final Configuration config;
	
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	



}
