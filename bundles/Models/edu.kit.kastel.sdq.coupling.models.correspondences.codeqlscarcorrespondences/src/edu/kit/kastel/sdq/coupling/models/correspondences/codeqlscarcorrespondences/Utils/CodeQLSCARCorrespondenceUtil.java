package edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils;

import java.util.Collection;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeqlscarcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.FieldCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.ParameterCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.SystemElementCorrespondence;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class CodeQLSCARCorrespondenceUtil {

	public static Correspondences_CodeQLScar createCodeQLSCARCorrespondences() {
		return CodeqlscarcorrespondencesFactory.eINSTANCE.createCorrespondences_CodeQLScar();
	}

	public static FieldCorrespondence createCorrespondence(Field field_JAVA, Field_SCAR field_SCAR) {
		FieldCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE.createFieldCorrespondence();
		corr.setField_Java(field_JAVA);
		corr.setField_SCAR(field_SCAR);
		return corr;
	}

	public static ParameterCorrespondence createCorrespondence(Parameter parameter_JAVA,
			Parameter_SCAR parameter_SCAR) {
		ParameterCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE.createParameterCorrespondence();
		corr.setParameter_Java(parameter_JAVA);
		corr.setParameter_SCAR(parameter_SCAR);
		return corr;
	}

	public static SecurityLevelCorrespondence createCorrespondence(SecurityLevel securityLevel_CodeQL,
			SecurityLevel_SCAR securityLevel_SCAR) {
		SecurityLevelCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE
				.createSecurityLevelCorrespondence();
		corr.setSecurityLevel_CodeQL(securityLevel_CodeQL);
		corr.setSecurityLevel_SCAR(securityLevel_SCAR);
		return corr;
	}

	public static ConfigurationCorrespondence createCorrespondence(HybridConfiguration config_CodeQL,
			RuleId config_SCAR) {
		ConfigurationCorrespondence corr = CodeqlscarcorrespondencesFactory.eINSTANCE
				.createConfigurationCorrespondence();
		corr.setConfiguration_CodeQL(config_CodeQL);
		corr.setConfiguration_SCAR(config_SCAR);
		return corr;
	}

	public static boolean correspondenceExists(Field field, Correspondences_CodeQLScar correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.anyMatch(correspondence -> correspondence.getField_Java().equals(field));
	}

	public static boolean correspondenceExists(Field_SCAR field, Correspondences_CodeQLScar correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.anyMatch(correspondence -> correspondence.getField_SCAR().equals(field));
	}

	public static boolean correspondenceExists(Parameter parameter, Correspondences_CodeQLScar correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.anyMatch(correspondence -> correspondence.getParameter_Java().equals(parameter));
	}

	public static boolean correspondenceExists(Parameter_SCAR parameter, Correspondences_CodeQLScar correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.anyMatch(correspondence -> correspondence.getParameter_SCAR().equals(parameter));
	}

	public static boolean correspondenceExists(SecurityLevel securityLevel,
			Correspondences_CodeQLScar correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getSecurityLevel_CodeQL().equals(securityLevel));
	}

	public static boolean correspondenceExists(HybridConfiguration config, Correspondences_CodeQLScar correspondences) {
		return correspondences.getConfigurationCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getConfiguration_CodeQL().equals(config));
	}

	public static boolean correspondenceExists(RuleId config,
			Correspondences_CodeQLScar correspondences) {
		return correspondences.getConfigurationCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getConfiguration_SCAR().getId().equals(config.getId()));
	}

	public static boolean correspondenceExists(SecurityLevel_SCAR securityLevel,
			Correspondences_CodeQLScar correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getSecurityLevel_SCAR().equals(securityLevel));
	}

	public static boolean correspondenceExists(SecurityLevel securityLevel, SecurityLevel_SCAR securityLevelScar,
			Correspondences_CodeQLScar correspondences) {
		return correspondences.getSecurityLevelCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getSecurityLevel_SCAR().equals(securityLevelScar)
					&& correspondence.getSecurityLevel_CodeQL().equals(securityLevel);
		});
	}

	public static boolean correspondenceExists(Field field, Field_SCAR fieldScar,
			Correspondences_CodeQLScar correspondences) {
		return getFieldCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.anyMatch(correspondence -> {
					return correspondence.getField_SCAR().equals(fieldScar)
							&& correspondence.getField_Java().equals(field);
				});
	}

	public static boolean correspondenceExists(Parameter parameter, Parameter_SCAR parameterScar,
			Correspondences_CodeQLScar correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.anyMatch(correspondence -> {
					return correspondence.getParameter_SCAR().equals(parameterScar)
							&& correspondence.getParameter_Java().equals(parameter);
				});
	}

	public static boolean correspondenceExists(HybridConfiguration config, RuleId configScar,
			Correspondences_CodeQLScar correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getConfiguration_SCAR().getId().equals(configScar.getId())
					&& correspondence.getConfiguration_CodeQL().equals(config);
		});
	}

	public static Collection<FieldCorrespondence> getFieldCorrespondences(
			Collection<SystemElementCorrespondence> systemElementCorrespondences) {
		return systemElementCorrespondences.stream().filter(FieldCorrespondence.class::isInstance)
				.map(FieldCorrespondence.class::cast).collect(Collectors.toList());
	}

	public static Collection<ParameterCorrespondence> getParameterCorrespondences(
			Collection<SystemElementCorrespondence> systemElementCorrespondences) {
		return systemElementCorrespondences.stream().filter(ParameterCorrespondence.class::isInstance)
				.map(ParameterCorrespondence.class::cast).collect(Collectors.toList());
	}

	public static void createAndAddIfCorrespondenceNotExists(SecurityLevel securityLevel,
			SecurityLevel_SCAR securityLevelScar, Correspondences_CodeQLScar correspondences) {
		if (!correspondenceExists(securityLevel, securityLevelScar, correspondences)) {
			correspondences.getSecurityLevelCorrespondences()
					.add(createCorrespondence(securityLevel, securityLevelScar));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(Field field, Field_SCAR fieldScar,
			Correspondences_CodeQLScar correspondences) {
		if (!correspondenceExists(field, fieldScar, correspondences)) {
			correspondences.getSystemElementCorrespondences().add(createCorrespondence(field, fieldScar));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(Parameter parameter, Parameter_SCAR parameterScar,
			Correspondences_CodeQLScar correspondences) {
		if (!correspondenceExists(parameter, parameterScar, correspondences)) {
			correspondences.getSystemElementCorrespondences().add(createCorrespondence(parameter, parameterScar));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(HybridConfiguration config,
			RuleId configScar, Correspondences_CodeQLScar correspondences) {
		if (!correspondenceExists(config, configScar, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createCorrespondence(config, configScar));
		}
	}

	public static HybridConfiguration getCorresponding(RuleId config,
			Correspondences_CodeQLScar correspondences) {
		return correspondences.getConfigurationCorrespondences().stream()
				.filter(correspondence -> correspondence.getConfiguration_SCAR().equals(config)).findFirst().get()
				.getConfiguration_CodeQL();
	}
	
	public static Query getCorrespondingQuery(RuleId ruleId,
			Correspondences_CodeQLScar correspondences) {
		
		HybridConfiguration config = correspondences.getConfigurationCorrespondences().stream()
				.filter(correspondence -> correspondence.getConfiguration_SCAR().equals(ruleId)).findFirst().get()
				.getConfiguration_CodeQL();
		
		if(config.getMainConfigurationElement() instanceof Query) {
			return (Query) config.getMainConfigurationElement();
		} else {
			throw new RuntimeException("Expected Query, got something different");
		}
		
	}

	public static Parameter getCorresponding(Parameter_SCAR parameter_SCAR,
			Correspondences_CodeQLScar correspondences) {
		return getParameterCorrespondences(correspondences.getSystemElementCorrespondences()).stream()
				.filter(correspondence -> correspondence.getParameter_SCAR().equals(parameter_SCAR)).findFirst().get()
				.getParameter_Java();
	}

}
