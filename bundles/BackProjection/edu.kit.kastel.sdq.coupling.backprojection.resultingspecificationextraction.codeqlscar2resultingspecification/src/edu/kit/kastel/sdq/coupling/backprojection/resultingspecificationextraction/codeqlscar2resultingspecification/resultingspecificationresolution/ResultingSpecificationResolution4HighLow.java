package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model.SCARResultingValuesModelElementUtil;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;


public class ResultingSpecificationResolution4HighLow extends ResultingSpecificationResolution {
	
	public ResultingSpecificationResolution4HighLow() {
		super();
	}

	@Override
	public CodeQLResultingValues calculateResultingValues(SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, CodeQLSCARCorrespondences codeQLScarCorrespondence) {
		
		
	
		
		List<ResultEntry> parameterSinkResultEntries = scar.getResultEntries().stream().filter(entry -> entry.getSink().getSystemElement() instanceof ParameterIdentification).collect(Collectors.toList()); 
		
		if(!sameConfiguration(parameterSinkResultEntries)) {
			//TODO Normally Handle different configurations, but for our access analysis approach, we do not need this. 
			throw new RuntimeException("Somehow not all entries do not have the same configuration");
		}
		
		config = CodeQLSCARCorrespondenceUtil.getCorresponding(parameterSinkResultEntries.get(0).getConfig(), codeQLScarCorrespondence);
		
		if(config.getAppliedSecurityLevel().size() != 2 || config.getAllowedFlows().size() != 1) {
			throw new RuntimeException("Configuration contains more than two levels or more than 1 allowed flow. Therefore not high low scenario");
		}
		
		
		for(ResultEntry parameterSinkResultEntry : parameterSinkResultEntries) {
			
			Optional<ResultingValue> resultSpecEntryForParameter = resultingValues.getResultingValues().stream().filter(entry -> entry.getParameter().equals(parameterSinkResultEntry.getSink().getSystemElement())).findAny();
			
			//Many Implicit assumptions here: 
			//1. we have every time the same configuration - see above. 
			//2. We use the High <-> Low Relationship. Flows are only reported when there is a flow from high -> low. 
			//	 Therefore, the resolution has just to replace the low level of a sink with high and store it as resulting specification entry
			//   Therefore, if such a entry exists for a parameter, it is already high. 
			if(resultSpecEntryForParameter.isEmpty()) {
				
				ParameterIdentificiation_CodeQLResultingValues parameter = SCARResultingValuesModelElementUtil.getOrTransformAndAddParameterIdentification((ParameterIdentification)parameterSinkResultEntry.getSink().getSystemElement(), resultingValues, correspondences_ResultingValues);
				ConfigurationID_ResultingValues config = SCARResultingValuesModelElementUtil.getOrTransformAndAddConfigurationID(parameterSinkResultEntry.getConfig(), resultingValues, correspondences_ResultingValues);
				SecurityLevel_ResultingValues securityLevel = SCARResultingValuesModelElementUtil.getOrTransformAndAddSecurityLevel(parameterSinkResultEntry.getSource().getSecurityLevel(), config, scar, codeQL, codeQLScarCorrespondence, resultingValues, correspondences_ResultingValues);
							
				ResultingValue resultingValue = CodeQLResultingValuesModelGenerationUtil.createResultingValue(parameter, securityLevel, config);
				resultingValues.getResultingValues().add(resultingValue);
			}
		}
		
		return resultingValues;

	}
}
