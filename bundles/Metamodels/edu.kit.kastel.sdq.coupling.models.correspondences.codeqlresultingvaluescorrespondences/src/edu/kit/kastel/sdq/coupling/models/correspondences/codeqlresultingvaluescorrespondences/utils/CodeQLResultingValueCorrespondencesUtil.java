package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.CodeqlresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ConfigurationCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.ParameterCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.SecurityLevelCorrespondence_ResolvedImplementationValues;

public class CodeQLResultingValueCorrespondencesUtil {
	public static Correspondences_ResolvedImplementationValues createCorrespondences_ResolvedImplementationValues() {
		return CodeqlresultingvaluescorrespondencesFactory.eINSTANCE
				.createCorrespondences_ResolvedImplementationValues();
	}

	public static ParameterCorrespondence_ResolvedImplementationValues createCorrespondence(
			Parameter_ResolvedImplementationValues parameter_ResolvedImplementationValues,
			Parameter_SCAR parameter_SCAR) {
		ParameterCorrespondence_ResolvedImplementationValues corr = CodeqlresultingvaluescorrespondencesFactory.eINSTANCE
				.createParameterCorrespondence_ResolvedImplementationValues();
		corr.setParameter_SCAR(parameter_SCAR);
		corr.setParameter_ResolvedImplementationValues(parameter_ResolvedImplementationValues);
		return corr;
	}

	public static SecurityLevelCorrespondence_ResolvedImplementationValues createCorrespondence(
			SecurityLevel securityLevel_CodeQL,
			SecurityLevel_ResolvedImplementationValues securityLevel_ResolvedImplementationValues) {
		SecurityLevelCorrespondence_ResolvedImplementationValues corr = CodeqlresultingvaluescorrespondencesFactory.eINSTANCE
				.createSecurityLevelCorrespondence_ResolvedImplementationValues();
		corr.setSecurityLevel_CodeQL(securityLevel_CodeQL);
		corr.setSecurityLevel_ResolvedImplementationValues(securityLevel_ResolvedImplementationValues);
		return corr;
	}

	public static ConfigurationCorrespondence_ResolvedImplementationValues createCorrespondence(RuleId config_SCAR,
			RuleId_ResolvedImplementationValue config_ResolvedImplementationValues) {
		ConfigurationCorrespondence_ResolvedImplementationValues corr = CodeqlresultingvaluescorrespondencesFactory.eINSTANCE
				.createConfigurationCorrespondence_ResolvedImplementationValues();
		corr.setConfiguration_ResultingValues(config_ResolvedImplementationValues);
		corr.setConfiguration_SCAR(config_SCAR);
		return corr;
	}

	public static boolean correspondenceExists(Parameter_ResolvedImplementationValues parameter,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(
				correspondence -> correspondence.getParameter_ResolvedImplementationValues().equals(parameter));
	}

	public static boolean correspondenceExists(Parameter_SCAR parameter,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getParameter_SCAR().equals(parameter));
	}

	public static boolean correspondenceExists(SecurityLevel securityLevel,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getSecurityLevel_CodeQL().equals(securityLevel));
	}

	public static boolean correspondenceExists(SecurityLevel_ResolvedImplementationValues securityLevel,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> correspondence
				.getSecurityLevel_ResolvedImplementationValues().equals(securityLevel));
	}

	public static boolean correspondenceExists(RuleId config,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getConfigurationCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getConfiguration_SCAR().getId().equals(config.getId()));
	}

	public static boolean correspondenceExists(RuleId_ResolvedImplementationValue config,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> correspondence
				.getConfiguration_ResultingValues().getId().equals(config.getId()));
	}

	public static boolean correspondenceExists(SecurityLevel securityLevel,
			SecurityLevel_ResolvedImplementationValues securityLevel_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getSecurityLevel_CodeQL().equals(securityLevel)
					&& correspondence.getSecurityLevel_ResolvedImplementationValues()
							.equals(securityLevel_ResolvedImplementationValues);
		});
	}

	public static boolean correspondenceExists(Parameter_SCAR parameter_SCAR,
			Parameter_ResolvedImplementationValues parameter_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getParameter_SCAR().equals(parameter_SCAR) && correspondence
					.getParameter_ResolvedImplementationValues().equals(parameter_ResolvedImplementationValues);
		});
	}

	public static boolean correspondenceExists(RuleId config_SCAR,
			RuleId_ResolvedImplementationValue config_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getConfiguration_SCAR().getId().equals(config_SCAR.getId()) && correspondence
					.getConfiguration_ResultingValues().equals(config_ResolvedImplementationValues);
		});
	}

	public static void createAndAddIfCorrespondenceNotExists(SecurityLevel securityLevel_CodeQL,
			SecurityLevel_ResolvedImplementationValues securityLevel_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		if (!correspondenceExists(securityLevel_CodeQL, securityLevel_ResolvedImplementationValues, correspondences)) {
			correspondences.getSecurityLevelCorrespondences()
					.add(createCorrespondence(securityLevel_CodeQL, securityLevel_ResolvedImplementationValues));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(Parameter_SCAR parameter_SCAR,
			Parameter_ResolvedImplementationValues parameter_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		if (!correspondenceExists(parameter_SCAR, parameter_ResolvedImplementationValues, correspondences)) {
			correspondences.getParameterCorrespondences()
					.add(createCorrespondence(parameter_ResolvedImplementationValues, parameter_SCAR));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(RuleId config_SCAR,
			RuleId_ResolvedImplementationValue config_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		if (!correspondenceExists(config_SCAR, config_ResolvedImplementationValues, correspondences)) {
			correspondences.getConfigurationCorrespondences()
					.add(createCorrespondence(config_SCAR, config_ResolvedImplementationValues));
		}
	}

	public static RuleId getCorresponding(RuleId_ResolvedImplementationValue config_ResolvedImplementationValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences
				.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence
						.getConfiguration_ResultingValues().equals(config_ResolvedImplementationValues))
				.findFirst().get().getConfiguration_SCAR();
	}

	public static Parameter_SCAR getCorresponding(Parameter_ResolvedImplementationValues parameter,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream()
				.filter(correspondence -> correspondence.getParameter_ResolvedImplementationValues().equals(parameter))
				.findFirst().get().getParameter_SCAR();
	}

	public static SecurityLevel getCorresponding(SecurityLevel_ResolvedImplementationValues resultingSecurityLevel,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences
				.getSecurityLevelCorrespondences().stream().filter(correspondence -> correspondence
						.getSecurityLevel_ResolvedImplementationValues().equals(resultingSecurityLevel))
				.findFirst().get().getSecurityLevel_CodeQL();
	}

}
