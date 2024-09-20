package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.util;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class EDFAJOANACorrespondenceUtil {
	public static LiteralsLevelCorrespondence createLiteralSecurityLevelCorrespondence(Collection<Literal> literals, Level securityLevel) {
		LiteralsLevelCorrespondence correspondence = EdfajoanacorrespondencesFactory.eINSTANCE.createLiteralsLevelCorrespondence();
		correspondence.getLiterals_EDFA().addAll(literals);
		correspondence.setLevel_JOANA(securityLevel);
		return correspondence;
	}
	
	public static ConfigurationCorrespondence createConfigurationCorrespondence(ParameterAnnotations parameterAnnotations_EDFA, EntryPoint config) {
		ConfigurationCorrespondence correspondence = EdfajoanacorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence();
		correspondence.setConfiguration_EDFA(parameterAnnotations_EDFA);
		correspondence.setConfiguration_JOANA(config);
		return correspondence;
	}
	
	public static Correspondences_EDFAJOANA createCorrespondences() {
		return EdfajoanacorrespondencesFactory.eINSTANCE.createCorrespondences_EDFAJOANA();
	}
	
	public static Collection<Literal> getCorresponding(Level securityLevel,
			Correspondences_EDFAJOANA correspondences) {
		return correspondences.getLiteralLevelCorrespondences().stream().filter(correspondence -> correspondence.getLevel_JOANA().equals(securityLevel)).findFirst().get().getLiterals_EDFA();
	}
	
	
	public static void createAndAddIfCorrespondenceNotExists(ParameterAnnotations specification, EntryPoint config, Correspondences_EDFAJOANA correspondences) {
		if(!correspondenceExists(specification, config, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createConfigurationCorrespondence(specification, config));
		}
	}
	
	public static boolean correspondenceExists(ParameterAnnotations specification, EntryPoint config, Correspondences_EDFAJOANA correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getConfiguration_EDFA().equals(specification) && correspondence.getConfiguration_JOANA().equals(config);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<Literal> literals, Level level, Correspondences_EDFAJOANA correspondences) {
		if(!correspondenceExists(literals, level, correspondences)) {
			correspondences.getLiteralLevelCorrespondences().add(createLiteralSecurityLevelCorrespondence(literals, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<Literal> literals, Level level, Correspondences_EDFAJOANA correspondences) {
		return correspondences.getLiteralLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getLiterals_EDFA().containsAll(literals) && correspondence.getLevel_JOANA().equals(level);});
	}
	

	public static ParameterAnnotations getCorresponding(EntryPoint configuration, Correspondences_EDFAJOANA correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence.getConfiguration_EDFA().equals(configuration)).findFirst().get().getConfiguration_EDFA();
	}
}
