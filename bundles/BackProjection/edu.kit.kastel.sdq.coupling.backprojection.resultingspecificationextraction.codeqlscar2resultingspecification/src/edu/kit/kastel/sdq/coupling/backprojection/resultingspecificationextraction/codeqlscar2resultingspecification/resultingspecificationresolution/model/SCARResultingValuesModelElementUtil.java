package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesElementHandlingUtils;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;

public class SCARResultingValuesModelElementUtil {

	public static ParameterIdentificiation_CodeQLResultingValues getOrTransformAndAddParameterIdentification(
			ParameterIdentification parameter_SCAR, CodeQLResultingValues resultingValues,
			Correspondences_CodeQLResultingValues correspondence) {

		//RC8
		ParameterIdentificiation_CodeQLResultingValues parameter_ResultingValues = CodeQLResultingValuesElementHandlingUtils
				.getOrCreateAndAddParameter(parameter_SCAR.getParameterName(), parameter_SCAR.getParameterType(),
						parameter_SCAR.getMethodName(), parameter_SCAR.getFullyQualifiedClassName(), resultingValues);
		
		CodeQLResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(parameter_SCAR,
				parameter_ResultingValues, correspondence);

		return parameter_ResultingValues;

	}

	public static ConfigurationID_ResultingValues getOrTransformAndAddConfigurationID(
			ConfigurationID_SCAR configID_SCAR, CodeQLResultingValues resultingValues,
			Correspondences_CodeQLResultingValues correspondence) {

		//RC8
		ConfigurationID_ResultingValues config = CodeQLResultingValuesElementHandlingUtils.getOrCreateAndAddConfigById(configID_SCAR.getId(), resultingValues);
		
		CodeQLResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(configID_SCAR, config, correspondence);
		
		return config;
	}

	public static SecurityLevel_ResultingValues getOrTransformAndAddSecurityLevel(SecurityLevel_SCAR securityLevel_SCAR, ConfigurationID_ResultingValues config, 
			SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, CodeQLSCARCorrespondences codeQLScarCorrespondence, CodeQLResultingValues resultingValues ,Correspondences_CodeQLResultingValues resultingValueCorrespondences) {
				
		return getOrTransformAndAddSecurityLevelByName(securityLevel_SCAR.getName(), config, scar, codeQL, codeQLScarCorrespondence, resultingValues, resultingValueCorrespondences);
	}
	
	public static SecurityLevel_ResultingValues getOrTransformAndAddSecurityLevelByName(String securityLevelName, ConfigurationID_ResultingValues config, 
			SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, CodeQLSCARCorrespondences codeQLScarCorrespondence, CodeQLResultingValues resultingValues ,Correspondences_CodeQLResultingValues resultingValueCorrespondences) {
		
		SecurityLevel_ResultingValues securityLevel_ResultingValues = CodeQLResultingValuesElementHandlingUtils.getOrCreateAndAddSecurityLevelByName(securityLevelName, resultingValues);
		ConfigurationID_SCAR config_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(config, resultingValueCorrespondences);
		Configuration config_CodeQL = CodeQLSCARCorrespondenceUtil.getCorresponding(config_SCAR, codeQLScarCorrespondence);
		
		//RC9,RC10
		SecurityLevel securityLeveL_CodeQL = CodeQLResolutionUtil.lookupLevel(securityLevel_ResultingValues.getName(), config_CodeQL);
		
		CodeQLResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(securityLeveL_CodeQL, securityLevel_ResultingValues, resultingValueCorrespondences);
		
		
		return securityLevel_ResultingValues;
	}


}
