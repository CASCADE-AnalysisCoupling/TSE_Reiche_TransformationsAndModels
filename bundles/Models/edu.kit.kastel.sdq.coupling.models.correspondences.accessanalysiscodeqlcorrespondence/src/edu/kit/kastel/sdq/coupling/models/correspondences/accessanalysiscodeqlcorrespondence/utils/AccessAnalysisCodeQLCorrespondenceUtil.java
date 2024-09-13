package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.Correspondences_AccessAnalysisCodeQL;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class AccessAnalysisCodeQLCorrespondenceUtil {

	public static DataSetSecurityLevelCorrespondence createDataSetSecurityLevelCorrespondence(Collection<DataSet> dataSets, SecurityLevel securityLevel) {
		DataSetSecurityLevelCorrespondence correspondence = AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createDataSetSecurityLevelCorrespondence();
		correspondence.getDataSets().addAll(dataSets);
		correspondence.setSecurityLevel(securityLevel);
		return correspondence;
	}
	
	public static ConfigurationCorrespondence createConfigurationCorrespondence(FullyImplicitConfiguration accessAnalysisConfig, HybridConfiguration codeQLconfig) {
		ConfigurationCorrespondence correspondence = AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createConfigurationCorrespondence();
		correspondence.setAccessAnalysisConfig(accessAnalysisConfig);
		correspondence.setCodeQLConfig(codeQLconfig);
		return correspondence;
	}
	
	public static Collection<DataSet> getCorresponding(SecurityLevel securityLevel,
			Correspondences_AccessAnalysisCodeQL correspondences) {
		return correspondences.getDataSetSecurityLevelCorrespondence().stream().filter(correspondence -> correspondence.getSecurityLevel().equals(securityLevel)).findFirst().get().getDataSets();
	}
	
	public static Correspondences_AccessAnalysisCodeQL createCorrespondenceModel() {
		return AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createCorrespondences_AccessAnalysisCodeQL();
	}
	
	public static void createAndAddIfCorrespondenceNotExists(FullyImplicitConfiguration accessAnalysisConfig, HybridConfiguration codeQLConfig, Correspondences_AccessAnalysisCodeQL correspondences) {
		if(!correspondenceExists(accessAnalysisConfig, codeQLConfig, correspondences)) {
			correspondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().add(createConfigurationCorrespondence(accessAnalysisConfig, codeQLConfig));
		}
	}
	
	public static boolean correspondenceExists(FullyImplicitConfiguration accessAnalysisConfig, HybridConfiguration codeQLConfig, Correspondences_AccessAnalysisCodeQL correspondences) {
		return correspondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().stream().anyMatch(correspondence -> {return correspondence.getAccessAnalysisConfig().equals(accessAnalysisConfig) && correspondence.getCodeQLConfig().equals(codeQLConfig);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<DataSet> dataSets, SecurityLevel level, Correspondences_AccessAnalysisCodeQL correspondences) {
		if(!correspondenceExists(dataSets, level, correspondences)) {
			correspondences.getDataSetSecurityLevelCorrespondence().add(createDataSetSecurityLevelCorrespondence(dataSets, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<DataSet> dataSets, SecurityLevel level, Correspondences_AccessAnalysisCodeQL correspondences) {
		return correspondences.getDataSetSecurityLevelCorrespondence().stream().anyMatch(correspondence -> {return correspondence.getDataSets().containsAll(dataSets) && correspondence.getSecurityLevel().equals(level);});
	}
	

	public static FullyImplicitConfiguration getCorresponding(HybridConfiguration codeQLConfig, Correspondences_AccessAnalysisCodeQL correspondences) {
		return correspondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().stream().filter(correspondence -> correspondence.getCodeQLConfig().equals(codeQLConfig)).findFirst().get().getAccessAnalysisConfig();
	}
}
