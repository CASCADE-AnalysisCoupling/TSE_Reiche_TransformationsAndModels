package edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.util;

import java.util.Collection;
import java.util.Optional;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.EdfajoanacorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.LiteralsLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class EDFAJOANACorrespondenceUtil {
	public static LiteralsLevelCorrespondence createLiteralSecurityLevelCorrespondence(Collection<Literal> literals, Level securityLevel) {
		LiteralsLevelCorrespondence correspondence = EdfajoanacorrespondencesFactory.eINSTANCE.createLiteralsLevelCorrespondence();
		correspondence.getLiterals_EDFA().addAll(literals);
		correspondence.setLevel_JOANA(securityLevel);
		return correspondence;
	}
	
	public static ConfigurationCorrespondence createConfigurationCorrespondence(FullyImplicitConfiguration config_EDFA, HybridConfiguration config_JOANA) {
		ConfigurationCorrespondence correspondence = EdfajoanacorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence();
		correspondence.setConfiguration_EDFA(config_EDFA);
		correspondence.setConfiguration_JOANA(config_JOANA);
		return correspondence;
	}
	
	public static Correspondences_EDFAJOANA createCorrespondences() {
		return EdfajoanacorrespondencesFactory.eINSTANCE.createCorrespondences_EDFAJOANA();
	}
	
	public static Collection<Literal> getCorresponding(Level securityLevel,
			Correspondences_EDFAJOANA correspondences) {
		return correspondences.getLiteralLevelCorrespondences().stream().filter(correspondence -> correspondence.getLevel_JOANA().equals(securityLevel)).findFirst().get().getLiterals_EDFA();
	}
	
	
	public static void createAndAddIfCorrespondenceNotExists(FullyImplicitConfiguration specification, HybridConfiguration config, Correspondences_EDFAJOANA correspondences) {
		if(!correspondenceExists(specification, config, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createConfigurationCorrespondence(specification, config));
		}
	}
	
	public static boolean correspondenceExists(FullyImplicitConfiguration config_EDFA, HybridConfiguration config_JOANA, Correspondences_EDFAJOANA correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getConfiguration_EDFA().equals(config_EDFA) && correspondence.getConfiguration_JOANA().equals(config_JOANA);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<Literal> literals, Level level, Correspondences_EDFAJOANA correspondences) {
		if(!correspondenceExists(literals, level, correspondences)) {
			correspondences.getLiteralLevelCorrespondences().add(createLiteralSecurityLevelCorrespondence(literals, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<Literal> literals, Level level, Correspondences_EDFAJOANA correspondences) {
		return correspondences.getLiteralLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getLiterals_EDFA().containsAll(literals) && correspondence.getLevel_JOANA().equals(level);});
	}
	

	public static FullyImplicitConfiguration getCorresponding(HybridConfiguration config_JOANA, Correspondences_EDFAJOANA correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence.getConfiguration_JOANA().equals(config_JOANA)).findFirst().get().getConfiguration_EDFA();
	}
	
	public static void deleteIfExists(Level level, Correspondences_EDFAJOANA correspondences) {
		
		Optional<LiteralsLevelCorrespondence> correspondence = correspondences.getLiteralLevelCorrespondences().stream().filter(x -> x.getLevel_JOANA().equals(level)).findFirst(); 
		
		if(correspondence.isEmpty())
			return;
		
		correspondences.getLiteralLevelCorrespondences().remove(correspondence.get());
	}
}
