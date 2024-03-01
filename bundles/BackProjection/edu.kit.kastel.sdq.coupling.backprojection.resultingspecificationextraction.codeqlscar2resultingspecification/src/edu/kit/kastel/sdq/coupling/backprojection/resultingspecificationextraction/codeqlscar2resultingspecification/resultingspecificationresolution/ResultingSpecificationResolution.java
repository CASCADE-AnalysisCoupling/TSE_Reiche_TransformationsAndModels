package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.List;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public abstract class ResultingSpecificationResolution {
	
	protected static String DELIMITER = ";";
	protected ResultingSpecification resultingSpecification;
	
	public ResultingSpecificationResolution(Configuration config) {
		super();
		this.config = config;
		this.resultingSpecification = new ResultingSpecification();
	}
	
	protected Configuration config;
	
	public void setConfiguration(Configuration config) {
		this.config = config;
	}
	
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	


	protected boolean sameConfiguration(List<ResultEntry> resultEntries) {
		return resultEntries.stream().map(ResultEntry::getConfig).distinct().collect(Collectors.toList()).size() != resultEntries.size();
	}

}
