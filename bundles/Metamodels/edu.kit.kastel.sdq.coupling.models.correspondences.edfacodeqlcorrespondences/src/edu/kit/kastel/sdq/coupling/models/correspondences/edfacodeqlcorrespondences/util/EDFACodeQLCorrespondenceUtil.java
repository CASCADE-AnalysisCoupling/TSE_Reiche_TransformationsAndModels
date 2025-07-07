package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL;

public class EDFACodeQLCorrespondenceUtil {
	
	public static LiteralSecurityLevelCorrespondence_EDFACodeQL createLiteralSecurityLevelCorrespondence(Collection<Literal> literals, SecurityLevel securityLevel) {
		LiteralSecurityLevelCorrespondence_EDFACodeQL correspondence = EdfacodeqlcorrespondencesFactory.eINSTANCE.createLiteralSecurityLevelCorrespondence_EDFACodeQL();
		correspondence.getLiterals_EDFA().addAll(literals);
		correspondence.setSecurityLevel_CodeQL(securityLevel);
		return correspondence;
	}
	
	public static ConfigurationCorrespondence_EDFACodeQL createConfigurationCorrespondence(FullyImplicitConfiguration config_EDFA, HybridConfiguration config) {
		ConfigurationCorrespondence_EDFACodeQL correspondence = EdfacodeqlcorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence_EDFACodeQL();
		correspondence.setConfiguration_EDFA(config_EDFA);
		correspondence.setConfiguration_CodeQL(config);
		return correspondence;
	}
	
	public static Correspondences_EDFACodeQL createCorrespondences() {
		return EdfacodeqlcorrespondencesFactory.eINSTANCE.createCorrespondences_EDFACodeQL();
	}
	
	public static Collection<Literal> getCorresponding(SecurityLevel securityLevel,
			Correspondences_EDFACodeQL correspondences) {
		return correspondences.getLiteralSecurityLevelCorrespondences().stream().filter(correspondence -> correspondence.getSecurityLevel_CodeQL().equals(securityLevel)).findFirst().get().getLiterals_EDFA();
	}
	
	
	public static void createAndAddIfCorrespondenceNotExists(FullyImplicitConfiguration config_EDFA, HybridConfiguration config_CodeQL, Correspondences_EDFACodeQL correspondences) {
		if(!correspondenceExists(config_EDFA, config_CodeQL, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createConfigurationCorrespondence(config_EDFA, config_CodeQL));
		}
	}
	
	public static boolean correspondenceExists(FullyImplicitConfiguration config_EDFA, HybridConfiguration config_CodeQL, Correspondences_EDFACodeQL correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getConfiguration_EDFA().equals(config_EDFA) && correspondence.getConfiguration_CodeQL().equals(config_CodeQL);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<Literal> literals, SecurityLevel level, Correspondences_EDFACodeQL correspondences) {
		if(!correspondenceExists(literals, level, correspondences)) {
			correspondences.getLiteralSecurityLevelCorrespondences().add(createLiteralSecurityLevelCorrespondence(literals, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<Literal> literals, SecurityLevel level, Correspondences_EDFACodeQL correspondences) {
		return correspondences.getLiteralSecurityLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getLiterals_EDFA().containsAll(literals) && correspondence.getSecurityLevel_CodeQL().equals(level);});
	}
	

	public static FullyImplicitConfiguration getCorresponding(HybridConfiguration config_CodeQL, Correspondences_EDFACodeQL correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence.getConfiguration_CodeQL().equals(config_CodeQL)).findFirst().get().getConfiguration_EDFA();
	}

}
