package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils;


import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_CodeQLResultingValues;


public class CodeQLResultingValueCorrespondencesUtil {
	public static Correspondences_CodeQLResultingValues createCorrespondences_CodeQLResultingValues() {
		return CodeqlresultingvaluescorrespondencesFactory.eINSTANCE.createCorrespondences_CodeQLResultingValues();	
	}
	

	public static ParameterCorrespondence_CodeQLResultingValues createCorrespondence(ParameterIdentificiation_CodeQLResultingValues parameter_ResultingValues, ParameterIdentification parameter_SCAR) {
		ParameterCorrespondence_CodeQLResultingValues corr = CodeqlresultingvaluescorrespondencesFactory.eINSTANCE.createParameterCorrespondence_CodeQLResultingValues();
		corr.setParameter_SCAR(parameter_SCAR);
		corr.setParameter_ResultingValues(parameter_ResultingValues);
		return corr;
	}
	
	public static SecurityLevelCorrespondence_CodeQLResultingValues createCorrespondence(SecurityLevel securityLevel_CodeQL, SecurityLevel_ResultingValues securityLevel_ResultingValues) {
		SecurityLevelCorrespondence_CodeQLResultingValues corr = CodeqlresultingvaluescorrespondencesFactory.eINSTANCE.createSecurityLevelCorrespondence_CodeQLResultingValues();
		corr.setSecurityLevel_CodeQL(securityLevel_CodeQL);
		corr.setSecurityLevel_CodeQLResultingValues(securityLevel_ResultingValues);
		return corr;
	}
	
	public static ConfigurationCorrespondence_CodeQLResultingValues createCorrespondence(ConfigurationID_SCAR config_SCAR, ConfigurationID_ResultingValues config_ResultingValues) {
		ConfigurationCorrespondence_CodeQLResultingValues corr = CodeqlresultingvaluescorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence_CodeQLResultingValues();
		corr.setConfiguration_ResultingValues(config_ResultingValues);
		corr.setConfiguration_SCAR(config_SCAR);
		return corr;
	}
	
	public static boolean correspondenceExists(ParameterIdentificiation_CodeQLResultingValues parameter, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> correspondence.getParameter_ResultingValues().equals(parameter));
	}
	
	public static boolean correspondenceExists(ParameterIdentification parameter, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> correspondence.getParameter_SCAR().equals(parameter));
	}
	
	public static boolean correspondenceExists(SecurityLevel securityLevel, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getSecurityLevel_CodeQL().equals(securityLevel));
	}
	
	
	public static boolean correspondenceExists(SecurityLevel_ResultingValues securityLevel, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getSecurityLevel_CodeQLResultingValues().equals(securityLevel));
	}
	
	public static boolean correspondenceExists(ConfigurationID_SCAR config, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> correspondence.getConfiguration_SCAR().getId().equals(config.getId()));
	}
	
	public static boolean correspondenceExists(ConfigurationID_ResultingValues config, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> correspondence.getConfiguration_ResultingValues().getId().equals(config.getId()));
	}

	
	public static boolean correspondenceExists(SecurityLevel securityLevel, SecurityLevel_ResultingValues securityLevel_ResultingValues, Correspondences_CodeQLResultingValues correspondences){
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getSecurityLevel_CodeQL().equals(securityLevel) && correspondence.getSecurityLevel_CodeQLResultingValues().equals(securityLevel_ResultingValues);});
	}
	
	public static boolean correspondenceExists(ParameterIdentification parameter_SCAR, ParameterIdentificiation_CodeQLResultingValues parameter_ResultingValues, Correspondences_CodeQLResultingValues correspondences){
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getParameter_SCAR().equals(parameter_SCAR) && correspondence.getParameter_ResultingValues().equals(parameter_ResultingValues);});
	}
	
	public static boolean correspondenceExists(ConfigurationID_SCAR config_SCAR, ConfigurationID_ResultingValues config_ResultingValues, Correspondences_CodeQLResultingValues correspondences){
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getConfiguration_SCAR().getId().equals(config_SCAR.getId()) && correspondence.getConfiguration_ResultingValues().equals(config_ResultingValues);});
	}
	
	
	public static void createAndAddIfCorrespondenceNotExists(SecurityLevel securityLevel_CodeQL, SecurityLevel_ResultingValues securityLevel_ResultingValues, Correspondences_CodeQLResultingValues correspondences) {
		if(!correspondenceExists(securityLevel_CodeQL, securityLevel_ResultingValues, correspondences)) {
			correspondences.getSecurityLevelCorrespondences().add(createCorrespondence(securityLevel_CodeQL, securityLevel_ResultingValues));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(ParameterIdentification parameter_SCAR, ParameterIdentificiation_CodeQLResultingValues parameter_ResultingValues, Correspondences_CodeQLResultingValues correspondences) {
		if(!correspondenceExists(parameter_SCAR, parameter_ResultingValues, correspondences)) {
			correspondences.getParameterCorrespondences().add(createCorrespondence(parameter_ResultingValues, parameter_SCAR));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(ConfigurationID_SCAR config_SCAR, ConfigurationID_ResultingValues config_ResultingValues, Correspondences_CodeQLResultingValues correspondences) {
		if(!correspondenceExists(config_SCAR, config_ResultingValues, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createCorrespondence(config_SCAR, config_ResultingValues));
		}
	}
	
	public static ConfigurationID_SCAR getCorresponding(ConfigurationID_ResultingValues config_ResultingValues, Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence.getConfiguration_ResultingValues().equals(config_ResultingValues)).findFirst().get().getConfiguration_SCAR();
	}


	public static ParameterIdentification getCorresponding(ParameterIdentificiation_CodeQLResultingValues parameter,
			Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().filter(correspondence -> correspondence.getParameter_ResultingValues().equals(parameter)).findFirst().get().getParameter_SCAR();
	}


	public static SecurityLevel getCorresponding(SecurityLevel_ResultingValues resultingSecurityLevel,Correspondences_CodeQLResultingValues correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().filter(correspondence -> correspondence.getSecurityLevel_CodeQLResultingValues().equals(resultingSecurityLevel)).findFirst().get().getSecurityLevel_CodeQL(); 
	}
	
}
