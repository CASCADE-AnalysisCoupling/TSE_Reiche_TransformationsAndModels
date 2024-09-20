package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model.SCARResultingValuesModelElementUtil;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;


public class ResultingSpecificationResolution4HighLow extends ResultingSpecificationResolution {
	
	public ResultingSpecificationResolution4HighLow() {
		super();
	}

	@Override
	public ResolvedImplementationValues calculateResultingValues(SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, Correspondences_CodeQLScar codeQLScarCorrespondence) {
		
		
	
		
		List<Result> parameterSinkResultEntries = scar.getResultEntries().stream().filter(entry -> entry.getSink().getSystemElement() instanceof Parameter_SCAR).collect(Collectors.toList()); 
		
		if(!sameConfiguration(parameterSinkResultEntries)) {
			//TODO Normally Handle different configurations, but for our access analysis approach, we do not need this. 
			throw new RuntimeException("Somehow not all entries do not have the same configuration");
		}
		
		config = CodeQLSCARCorrespondenceUtil.getCorrespondingQuery(parameterSinkResultEntries.get(0).getRuleId(), codeQLScarCorrespondence);
		
		if(config.getAppliedSecurityLevel().size() != 2 || config.getAllowedFlows().getAllowedFlows().size() != 1) {
			throw new RuntimeException("Configuration contains more than two levels or more than 1 allowed flow. Therefore not high low scenario");
		}
		
		
		for(Result parameterSinkResultEntry : parameterSinkResultEntries) {
			
			Optional<ResolvedImplementationValue> resultSpecEntryForParameter = resultingValues.getResultingValues().stream().filter(entry -> entry.getParameter().equals(parameterSinkResultEntry.getSink().getSystemElement())).findAny();
			
			//Many Implicit assumptions here: 
			//1. we have every time the same configuration - see above. 
			//2. We use the High <-> Low Relationship. Flows are only reported when there is a flow from high -> low. 
			//	 Therefore, the resolution has just to replace the low level of a sink with high and store it as resulting specification entry
			//   Therefore, if such a entry exists for a parameter, it is already high. 
			if(resultSpecEntryForParameter.isEmpty()) {
				
				Parameter_ResolvedImplementationValues parameter = SCARResultingValuesModelElementUtil.getOrTransformAndAddParameterIdentification((Parameter_SCAR)parameterSinkResultEntry.getSink().getSystemElement(), resultingValues, correspondences_ResultingValues);
				RuleId_ResolvedImplementationValue config = SCARResultingValuesModelElementUtil.getOrTransformAndAddConfigurationID(parameterSinkResultEntry.getRuleId(), resultingValues, correspondences_ResultingValues);
				SecurityLevel_ResolvedImplementationValues securityLevel = SCARResultingValuesModelElementUtil.getOrTransformAndAddSecurityLevel(parameterSinkResultEntry.getSource().getSecurityLevel(), config, scar, codeQL, codeQLScarCorrespondence, resultingValues, correspondences_ResultingValues);
							
				ResolvedImplementationValue resultingValue = CodeQLResultingValuesModelGenerationUtil.createResultingValue(parameter, securityLevel, config);
				resultingValues.getResultingValues().add(resultingValue);
			}
		}
		
		return resultingValues;

	}
}
