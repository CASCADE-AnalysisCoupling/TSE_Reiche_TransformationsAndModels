package edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.EntryPointCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.JoanaresultingvaluescorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.LevelCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.ParameterCorrespondence_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;

public class JOANAResultingValueCorrespondencesUtil {
	public static Correspondences_JOANAResultingValues createCorrespondences_JOANAResultingValues() {
		return JoanaresultingvaluescorrespondencesFactory.eINSTANCE.createCorrespondences_JOANAResultingValues();	
	}
	

	public static ParameterCorrespondence_JOANAResultingValues createCorrespondence(ParameterIdentification_JOANAResultingValues parameter_ResultingValues, ParameterIdentifying parameter_SCAR) {
		ParameterCorrespondence_JOANAResultingValues corr = JoanaresultingvaluescorrespondencesFactory.eINSTANCE.createParameterCorrespondence_JOANAResultingValues();
		corr.setParameter_SCAR(parameter_SCAR);
		corr.setParameter_ResultingValues(parameter_ResultingValues);
		return corr;
	}
	
	public static LevelCorrespondence_JOANAResultingValues createCorrespondence(Level securityLevel_CodeQL, Level_ResultingValues securityLevel_ResultingValues) {
		LevelCorrespondence_JOANAResultingValues corr = JoanaresultingvaluescorrespondencesFactory.eINSTANCE.createLevelCorrespondence_JOANAResultingValues();
		corr.setLevel_JOANA(securityLevel_CodeQL);
		corr.setLevel_ResultingValues(securityLevel_ResultingValues);
		return corr;
	}
	
	public static EntryPointCorrespondence_JOANAResultingValues createCorrespondence(EntryPointIdentifying config_SCAR, EntryPointIdentification_ResultingValues config_ResultingValues) {
		EntryPointCorrespondence_JOANAResultingValues corr = JoanaresultingvaluescorrespondencesFactory.eINSTANCE.createEntryPointCorrespondence_JOANAResultingValues();
		corr.setEntryPoint_ResultingValues(config_ResultingValues);
		corr.setEntryPoint_SCAR(config_SCAR);
		return corr;
	}
	
	public static boolean correspondenceExists(ParameterIdentification_JOANAResultingValues parameter, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> correspondence.getParameter_ResultingValues().equals(parameter));
	}
	
	public static boolean correspondenceExists(ParameterIdentifying parameter, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> correspondence.getParameter_SCAR().equals(parameter));
	}
	
	public static boolean correspondenceExists(Level securityLevel, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getLevel_JOANA().equals(securityLevel));
	}
	
	
	public static boolean correspondenceExists(Level_ResultingValues securityLevel, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> correspondence.getLevel_ResultingValues().equals(securityLevel));
	}
	
	public static boolean correspondenceExists(EntryPointIdentifying config, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> correspondence.getEntryPoint_SCAR().getTag().equals(config.getTag()));
	}
	
	public static boolean correspondenceExists(EntryPointIdentification_ResultingValues config, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> correspondence.getEntryPoint_ResultingValues().getTag().equals(config.getTag()));
	}

	
	public static boolean correspondenceExists(Level securityLevel, Level_ResultingValues securityLevel_ResultingValues, Correspondences_JOANAResultingValues correspondences){
		return correspondences.getLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getLevel_JOANA().equals(securityLevel) && correspondence.getLevel_ResultingValues().equals(securityLevel_ResultingValues);});
	}
	
	public static boolean correspondenceExists(ParameterIdentifying parameter_SCAR, ParameterIdentification_JOANAResultingValues parameter_ResultingValues, Correspondences_JOANAResultingValues correspondences){
		return correspondences.getParameterCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getParameter_SCAR().equals(parameter_SCAR) && correspondence.getParameter_ResultingValues().equals(parameter_ResultingValues);});
	}
	
	public static boolean correspondenceExists(EntryPointIdentifying config_SCAR, EntryPointIdentification_ResultingValues config_ResultingValues, Correspondences_JOANAResultingValues correspondences){
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getEntryPoint_SCAR().getTag().equals(config_SCAR.getTag()) && correspondence.getEntryPoint_ResultingValues().equals(config_ResultingValues);});
	}
	
	
	public static void createAndAddIfCorrespondenceNotExists(Level securityLevel_CodeQL, Level_ResultingValues securityLevel_ResultingValues, Correspondences_JOANAResultingValues correspondences) {
		if(!correspondenceExists(securityLevel_CodeQL, securityLevel_ResultingValues, correspondences)) {
			correspondences.getLevelCorrespondences().add(createCorrespondence(securityLevel_CodeQL, securityLevel_ResultingValues));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(ParameterIdentifying parameter_SCAR, ParameterIdentification_JOANAResultingValues parameter_ResultingValues, Correspondences_JOANAResultingValues correspondences) {
		if(!correspondenceExists(parameter_SCAR, parameter_ResultingValues, correspondences)) {
			correspondences.getParameterCorrespondences().add(createCorrespondence(parameter_ResultingValues, parameter_SCAR));
		}
	}
	
	public static void createAndAddIfCorrespondenceNotExists(EntryPointIdentifying config_SCAR, EntryPointIdentification_ResultingValues config_ResultingValues, Correspondences_JOANAResultingValues correspondences) {
		if(!correspondenceExists(config_SCAR, config_ResultingValues, correspondences)) {
			correspondences.getEntryPointCorrespondences().add(createCorrespondence(config_SCAR, config_ResultingValues));
		}
	}
	
	public static EntryPointIdentifying getCorresponding(EntryPointIdentification_ResultingValues config_ResultingValues, Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().filter(correspondence -> correspondence.getEntryPoint_ResultingValues().equals(config_ResultingValues)).findFirst().get().getEntryPoint_SCAR();
	}


	public static ParameterIdentifying getCorresponding(ParameterIdentification_JOANAResultingValues parameter,
			Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getParameterCorrespondences().stream().filter(correspondence -> correspondence.getParameter_ResultingValues().equals(parameter)).findFirst().get().getParameter_SCAR();
	}


	public static Level getCorresponding(Level_ResultingValues resultingLevel,Correspondences_JOANAResultingValues correspondences) {
		return correspondences.getLevelCorrespondences().stream().filter(correspondence -> correspondence.getLevel_ResultingValues().equals(resultingLevel)).findFirst().get().getLevel_JOANA(); 
	}
	
}
