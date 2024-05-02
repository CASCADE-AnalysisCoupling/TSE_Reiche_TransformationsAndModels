package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.SCARResultingValuesModelElementUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util.JOANAResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class ResultingSpecificationResolution4HighLow extends ResultingSpecificationResolution {

	
	private final static String LOW_NAME = "low";
	private final static String HIGH_NAME = "high";
	

	public ResultingSpecificationResolution4HighLow() {
		super();
	}

	@Override
	public JOANAResultingValues calculateResultingSpecification(SourceCodeAnalysisResult scar, JOANASCARCorrespondences joanaScarCorrespondences) {
		
		
		
		List<ResultEntry> parameterSinkResultEntries = scar.getResultEntries().stream().filter(entry -> entry.getSink().getSystemElement() instanceof ParameterIdentifying).collect(Collectors.toList()); 
		
		for(ResultEntry parameterSinkResultEntry : parameterSinkResultEntries) {
			
			EntryPoint entryPoint_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(parameterSinkResultEntry.getEntryPoint(), joanaScarCorrespondences);
			
			if(entryPoint_JOANA.getLevel().size() != 2 || entryPoint_JOANA.getLattice().getMayFlow().size() != 1) {
				throw new RuntimeException("Configuration contains more than two levels or more than 1 allowed flow. Therefore not high low scenario");
			}
			
			Optional<ResultingValue> resultingValueForParameter = resultingValues.getResultingValues().stream().filter(entry -> entry.getSystemElement().equals(parameterSinkResultEntry.getSink().getSystemElement())).filter(entry -> entry.getConfiguration().equals(parameterSinkResultEntry.getEntryPoint())).findAny();
			
			//Many Implicit assumptions here: 
			//1. we have every time the same configuration - see above. 
			//2. We use the High <-> Low Relationship. Flows are only reported when there is a flow from high -> low. 
			//	 Therefore, the resolution has just to replace the low level of a sink with high and store it as resulting specification entry
			//   Therefore, if such a entry exists for a parameter, it is already high. 
			if(resultingValueForParameter.isEmpty()) {
				
				ParameterIdentification_JOANAResultingValues parameter = SCARResultingValuesModelElementUtil.getOrTransformAndAddParameterIdentification((ParameterIdentifying) parameterSinkResultEntry.getSink().getSystemElement(), resultingValues, correspondences_ResultingValues);
				EntryPointIdentification_ResultingValues entryPoint = SCARResultingValuesModelElementUtil.getOrTransformAndAddConfigurationID(parameterSinkResultEntry.getEntryPoint(), resultingValues, correspondences_ResultingValues);
				Level_ResultingValues level = SCARResultingValuesModelElementUtil.getOrTransformAndAddSecurityLevel(parameterSinkResultEntry.getSource().getLevel(), entryPoint, joanaScarCorrespondences, resultingValues, correspondences_ResultingValues);
				
				ResultingValue resultingValue = JOANAResultingValuesModelGenerationUtil.createResultingValue(parameter, level, entryPoint);
				resultingValues.getResultingValues().add(resultingValue);
			}
		}
		
		return resultingValues;
	}
	
}
