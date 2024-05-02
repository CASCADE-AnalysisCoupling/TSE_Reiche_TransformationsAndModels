package edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.ConfigurationCorrespondence_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.EdfacodeqlcorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.LiteralSecurityLevelCorrespondence_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

public class EDFACodeQLCorrespondenceUtil {
	
	public static LiteralSecurityLevelCorrespondence_EDFACodeQL createLiteralSecurityLevelCorrespondence(Collection<Literal> literals, SecurityLevel securityLevel) {
		LiteralSecurityLevelCorrespondence_EDFACodeQL correspondence = EdfacodeqlcorrespondencesFactory.eINSTANCE.createLiteralSecurityLevelCorrespondence_EDFACodeQL();
		correspondence.getLiterals_EDFA().addAll(literals);
		correspondence.setSecurityLevel_CodeQL(securityLevel);
		return correspondence;
	}
	
	public static ConfigurationCorrespondence_EDFACodeQL createConfigurationCorrespondence(ParameterAnnotations parameterAnnotations_EDFA, Configuration config) {
		ConfigurationCorrespondence_EDFACodeQL correspondence = EdfacodeqlcorrespondencesFactory.eINSTANCE.createConfigurationCorrespondence_EDFACodeQL();
		correspondence.setConfiguration_EDFA(parameterAnnotations_EDFA);
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
	
	
	public static void createAndAddIfCorrespondenceNotExists(ParameterAnnotations specification, Configuration config, Correspondences_EDFACodeQL correspondences) {
		if(!correspondenceExists(specification, config, correspondences)) {
			correspondences.getConfigurationCorrespondences().add(createConfigurationCorrespondence(specification, config));
		}
	}
	
	public static boolean correspondenceExists(ParameterAnnotations specification, Configuration config, Correspondences_EDFACodeQL correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getConfiguration_EDFA().equals(specification) && correspondence.getConfiguration_CodeQL().equals(config);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<Literal> literals, SecurityLevel level, Correspondences_EDFACodeQL correspondences) {
		if(!correspondenceExists(literals, level, correspondences)) {
			correspondences.getLiteralSecurityLevelCorrespondences().add(createLiteralSecurityLevelCorrespondence(literals, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<Literal> literals, SecurityLevel level, Correspondences_EDFACodeQL correspondences) {
		return correspondences.getLiteralSecurityLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getLiterals_EDFA().containsAll(literals) && correspondence.getSecurityLevel_CodeQL().equals(level);});
	}
	

	public static ParameterAnnotations getCorresponding(Configuration configuration, Correspondences_EDFACodeQL correspondences) {
		return correspondences.getConfigurationCorrespondences().stream().filter(correspondence -> correspondence.getConfiguration_CodeQL().equals(configuration)).findFirst().get().getConfiguration_EDFA();
	}

}
