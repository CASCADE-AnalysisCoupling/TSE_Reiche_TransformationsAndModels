package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class AccessAnalysisCodeQLCorrespondenceUtil {

	public static DataSetSecurityLevelCorrespondence createDataSetSecurityLevelCorrespondence(Collection<DataSet> dataSets, SecurityLevel securityLevel) {
		DataSetSecurityLevelCorrespondence correspondence = AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createDataSetSecurityLevelCorrespondence();
		correspondence.getDataSets().addAll(dataSets);
		correspondence.setSecurityLevel(securityLevel);
		return correspondence;
	}
	
	public static ConfigurationCorrespondence createConfigurationCorrespondence(ConfidentialitySpecification specification, Configuration config) {
		ConfigurationCorrespondence correspondence = AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createConfigurationCorrespondence();
		correspondence.setAccessAnalysisConfig(specification);
		correspondence.setCodeQLConfig(config);
		return correspondence;
	}
	
	public static Collection<DataSet> getCorresponding(SecurityLevel securityLevel,
			AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		return correspondences.getDataSetSecurityLevelCorrespondence().stream().filter(correspondence -> correspondence.getSecurityLevel().equals(securityLevel)).findFirst().get().getDataSets();
	}
	
	public static AccessAnalysisCodeQLCorrespondenceRoot createCorrespondenceModel() {
		return AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createAccessAnalysisCodeQLCorrespondenceRoot();
	}
	
	public static void createAndAddIfCorrespondenceNotExists(ConfidentialitySpecification confidentialitySpec, Configuration config, AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		if(!correspondenceExists(confidentialitySpec, config, correspondences)) {
			correspondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().add(createConfigurationCorrespondence(confidentialitySpec, config));
		}
	}
	
	public static boolean correspondenceExists(ConfidentialitySpecification confidentialitySpec, Configuration config, AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		return correspondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().stream().anyMatch(correspondence -> {return correspondence.getAccessAnalysisConfig().equals(confidentialitySpec) && correspondence.getCodeQLConfig().equals(config);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<DataSet> dataSets, SecurityLevel level, AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		if(!correspondenceExists(dataSets, level, correspondences)) {
			correspondences.getDataSetSecurityLevelCorrespondence().add(createDataSetSecurityLevelCorrespondence(dataSets, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<DataSet> dataSets, SecurityLevel level, AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		return correspondences.getDataSetSecurityLevelCorrespondence().stream().anyMatch(correspondence -> {return correspondence.getDataSets().containsAll(dataSets) && correspondence.getSecurityLevel().equals(level);});
	}
	

	public static ConfidentialitySpecification getCorresponding(Configuration configuration, AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		return correspondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().stream().filter(correspondence -> correspondence.getCodeQLConfig().equals(configuration)).findFirst().get().getAccessAnalysisConfig();
	}
}
