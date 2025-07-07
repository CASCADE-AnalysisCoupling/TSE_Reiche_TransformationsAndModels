package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model;


import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesElementHandlingUtils;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;

public class SCARResultingValuesModelElementUtil {

	public static Parameter_ResolvedImplementationValues getOrTransformAndAddParameterIdentification(
			Parameter_SCAR parameter_SCAR, ResolvedImplementationValues resultingValues,
			Correspondences_ResolvedImplementationValues correspondence) {

		Parameter_ResolvedImplementationValues parameter_ResultingValues = CodeQLResultingValuesElementHandlingUtils
				.getOrCreateAndAddParameter(parameter_SCAR.getParameterName(), parameter_SCAR.getParameterType(),
						parameter_SCAR.getMethodName(), parameter_SCAR.getFullyQualifiedClassName(), resultingValues);
		
		CodeQLResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(parameter_SCAR,
				parameter_ResultingValues, correspondence);

		return parameter_ResultingValues;

	}

	public static RuleId_ResolvedImplementationValue getOrTransformAndAddConfigurationID(
			RuleId configID_SCAR, ResolvedImplementationValues resultingValues,
			Correspondences_ResolvedImplementationValues correspondence) {

		//RC8
		RuleId_ResolvedImplementationValue config = CodeQLResultingValuesElementHandlingUtils.getOrCreateAndAddConfigById(configID_SCAR.getId(), resultingValues);
		
		CodeQLResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(configID_SCAR, config, correspondence);
		
		return config;
	}

	public static SecurityLevel_ResolvedImplementationValues getOrTransformAndAddSecurityLevel(SecurityLevel_SCAR securityLevel_SCAR, RuleId_ResolvedImplementationValue config, 
			SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, Correspondences_CodeQLScar codeQLScarCorrespondence, ResolvedImplementationValues resultingValues ,Correspondences_ResolvedImplementationValues resultingValueCorrespondences) {
				
		return getOrTransformAndAddSecurityLevelByName(securityLevel_SCAR.getName(), config, scar, codeQL, codeQLScarCorrespondence, resultingValues, resultingValueCorrespondences);
	}
	
	public static SecurityLevel_ResolvedImplementationValues getOrTransformAndAddSecurityLevelByName(String securityLevelName, RuleId_ResolvedImplementationValue config, 
			SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, Correspondences_CodeQLScar codeQLScarCorrespondence, ResolvedImplementationValues resultingValues ,Correspondences_ResolvedImplementationValues resultingValueCorrespondences) {
		
		SecurityLevel_ResolvedImplementationValues securityLevel_ResultingValues = CodeQLResultingValuesElementHandlingUtils.getOrCreateAndAddSecurityLevelByName(securityLevelName, resultingValues);
		RuleId config_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(config, resultingValueCorrespondences);
		Query config_CodeQL = CodeQLSCARCorrespondenceUtil.getCorrespondingQuery(config_SCAR, codeQLScarCorrespondence);
		

		SecurityLevel securityLeveL_CodeQL = CodeQLResolutionUtil.lookupLevel(securityLevel_ResultingValues.getName(), config_CodeQL);
		
		CodeQLResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(securityLeveL_CodeQL, securityLevel_ResultingValues, resultingValueCorrespondences);
		
		
		return securityLevel_ResultingValues;
	}


}
