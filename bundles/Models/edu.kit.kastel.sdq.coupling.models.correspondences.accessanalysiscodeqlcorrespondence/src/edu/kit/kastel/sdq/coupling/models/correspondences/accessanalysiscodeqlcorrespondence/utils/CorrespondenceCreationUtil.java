package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.ConfigurationCorrespondence;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.DataSetSecurityLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class CorrespondenceCreationUtil {

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
	
	
}
