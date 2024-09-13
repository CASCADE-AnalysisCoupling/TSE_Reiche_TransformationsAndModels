package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;

public class JOANAResultingValueCorrespondencesUtil {
	public static Correspondences_ResolvedImplementationValues createCorrespondences_JOANAResultingValues() {
		return JoanaresultingvaluescorrespondencesFactory.eINSTANCE.createCorrespondences_ResolvedImplementationValues();
	}

	public static ParameterCorrespondence_JOANAResultingValues createCorrespondence(
			Parameter_ResolvedImplementationValues parameter_ResultingValues,
			Parameter_SCAR parameter_SCAR) {
		ParameterCorrespondence_JOANAResultingValues corr = JoanaresultingvaluescorrespondencesFactory.eINSTANCE
				.createParameterCorrespondence_JOANAResultingValues();
		corr.setParameter_SCAR(parameter_SCAR);
		corr.setParameter_ResolvedImplementationValues(parameter_ResultingValues);
		return corr;
	}

	public static LevelCorrespondence_ResolvedImplementationValues createCorrespondence(Level securityLevel_CodeQL,
			Level_ResolvedImplementationValues securityLevel_ResultingValues) {
		LevelCorrespondence_ResolvedImplementationValues corr = JoanaresultingvaluescorrespondencesFactory.eINSTANCE
				.createLevelCorrespondence_ResolvedImplementationValues();
		corr.setLevel_JOANA(securityLevel_CodeQL);
		corr.setLevel_ResolvedImplementationValues(securityLevel_ResultingValues);
		return corr;
	}

	public static EntryPointCorrespondence_JOANAResultingValues createCorrespondence(EntryPoint_SCAR config_SCAR,
			EntryPoint_ResolvedImplementationValues config_ResultingValues) {
		EntryPointCorrespondence_JOANAResultingValues corr = JoanaresultingvaluescorrespondencesFactory.eINSTANCE
				.createEntryPointCorrespondence_JOANAResultingValues();
		corr.setEntryPoint_ResolvedImplementationValues(config_ResultingValues);
		corr.setEntryPoint_SCAR(config_SCAR);
		return corr;
	}

	public static boolean correspondenceExists(Parameter_ResolvedImplementationValues parameter,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getParameter_ResolvedImplementationValues().equals(parameter));
	}

	public static boolean correspondenceExists(Parameter_SCAR parameter,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getParameter_SCAR().equals(parameter));
	}

	public static boolean correspondenceExists(Level securityLevel,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getLevelCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getLevel_JOANA().equals(securityLevel));
	}

	public static boolean correspondenceExists(Level_ResolvedImplementationValues securityLevel,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getLevelCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getLevel_ResolvedImplementationValues().equals(securityLevel));
	}

	public static boolean correspondenceExists(EntryPoint_SCAR config,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream()
				.anyMatch(correspondence -> correspondence.getEntryPoint_SCAR().getTag().equals(config.getTag()));
	}

	public static boolean correspondenceExists(EntryPoint_ResolvedImplementationValues config,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(
				correspondence -> correspondence.getEntryPoint_ResolvedImplementationValues().getTag().equals(config.getTag()));
	}

	public static boolean correspondenceExists(Level securityLevel,
			Level_ResolvedImplementationValues securityLevel_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getLevel_JOANA().equals(securityLevel)
					&& correspondence.getLevel_ResolvedImplementationValues().equals(securityLevel_ResultingValues);
		});
	}

	public static boolean correspondenceExists(Parameter_SCAR parameter_SCAR,
			Parameter_ResolvedImplementationValues parameter_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getParameter_SCAR().equals(parameter_SCAR)
					&& correspondence.getParameter_ResolvedImplementationValues().equals(parameter_ResultingValues);
		});
	}

	public static boolean correspondenceExists(EntryPoint_SCAR config_SCAR,
			EntryPoint_ResolvedImplementationValues config_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> {
			return correspondence.getEntryPoint_SCAR().getTag().equals(config_SCAR.getTag())
					&& correspondence.getEntryPoint_ResolvedImplementationValues().equals(config_ResultingValues);
		});
	}

	public static void createAndAddIfCorrespondenceNotExists(Level securityLevel_CodeQL,
			Level_ResolvedImplementationValues securityLevel_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		if (!correspondenceExists(securityLevel_CodeQL, securityLevel_ResultingValues, correspondences)) {
			correspondences.getLevelCorrespondences()
					.add(createCorrespondence(securityLevel_CodeQL, securityLevel_ResultingValues));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(Parameter_SCAR parameter_SCAR,
			Parameter_ResolvedImplementationValues parameter_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		if (!correspondenceExists(parameter_SCAR, parameter_ResultingValues, correspondences)) {
			correspondences.getParameterCorrespondences()
					.add(createCorrespondence(parameter_ResultingValues, parameter_SCAR));
		}
	}

	public static void createAndAddIfCorrespondenceNotExists(EntryPoint_SCAR config_SCAR,
			EntryPoint_ResolvedImplementationValues config_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		if (!correspondenceExists(config_SCAR, config_ResultingValues, correspondences)) {
			correspondences.getEntryPointCorrespondences()
					.add(createCorrespondence(config_SCAR, config_ResultingValues));
		}
	}

	public static EntryPoint_SCAR getCorresponding(
			EntryPoint_ResolvedImplementationValues config_ResultingValues,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream()
				.filter(correspondence -> correspondence.getEntryPoint_ResolvedImplementationValues().equals(config_ResultingValues))
				.findFirst().get().getEntryPoint_SCAR();
	}

	public static Parameter_SCAR getCorresponding(Parameter_ResolvedImplementationValues parameter,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getParameterCorrespondences().stream()
				.filter(correspondence -> correspondence.getParameter_ResolvedImplementationValues().equals(parameter)).findFirst()
				.get().getParameter_SCAR();
	}

	public static Level getCorresponding(Level_ResolvedImplementationValues resultingLevel,
			Correspondences_ResolvedImplementationValues correspondences) {
		return correspondences.getLevelCorrespondences().stream()
				.filter(correspondence -> correspondence.getLevel_ResolvedImplementationValues().equals(resultingLevel)).findFirst()
				.get().getLevel_JOANA();
	}

}
