package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class ResultingSpecificationResolution4HighLow extends ResultingSpecificationResolution {

	
	private final static String LOW_NAME = "low";
	private final static String HIGH_NAME = "high";
	
	public ResultingSpecificationResolution4HighLow(Configuration config) {
		super(config);
	}

	@Override
	public ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar) {
		
		if(config.getAppliedSecurityLevel().size() != 2 || config.getAllowedFlows().size() != 1) {
			throw new RuntimeException("Configuration contains more than two levels or more than 1 allowed flow. Therefore not high low scenario");
		}
		
		
		List<ResultEntry> parameterSinkResultEntries = scar.getResultEntries().stream().filter(entry -> entry.getSink().getSystemElement() instanceof Parameter).collect(Collectors.toList()); 
		
		if(!sameConfiguration(parameterSinkResultEntries)) {
			//TODO Normally Handle different configurations, but for our access analysis approach, we do not need this. 
			throw new RuntimeException("Somehow not all entries do not have the same configuration");
		}
		
		for(ResultEntry parameterSinkResultEntry : parameterSinkResultEntries) {
			
			Optional<ResultingSpecEntry> resultSpecEntryForParameter = resultingSpecification.getEntries().stream().filter(entry -> entry.getSystemElement().equals(parameterSinkResultEntry.getSink().getSystemElement())).findAny();
			
			//Many Implicit assumptions here: 
			//1. we have every time the same configuration - see above. 
			//2. We use the High <-> Low Relationship. Flows are only reported when there is a flow from high -> low. 
			//	 Therefore, the resolution has just to replace the low level of a sink with high and store it as resulting specification entry
			//   Therefore, if such a entry exists for a parameter, it is already high. 
			if(resultSpecEntryForParameter.isEmpty()) {
				ResultingSpecEntry resultingSpecEntry = new ResultingSpecEntry(parameterSinkResultEntry.getSource().getSecurityProperty(), (Parameter)parameterSinkResultEntry.getSink().getSystemElement(), parameterSinkResultEntry.getConfig());
				resultingSpecification.addEntry(resultingSpecEntry);
			}
		}
		
		return resultingSpecification;

	}
}
