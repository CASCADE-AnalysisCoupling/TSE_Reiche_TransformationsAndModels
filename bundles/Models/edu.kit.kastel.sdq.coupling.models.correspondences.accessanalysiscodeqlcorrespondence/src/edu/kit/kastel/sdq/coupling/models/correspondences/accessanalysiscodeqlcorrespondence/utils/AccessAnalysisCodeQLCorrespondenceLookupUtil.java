package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class AccessAnalysisCodeQLCorrespondenceLookupUtil {

	public static Collection<DataSet> getCorresponding(SecurityLevel securityLevel,
			AccessAnalysisCodeQLCorrespondenceRoot correspondences) {
		return correspondences.getDataSetSecurityLevelCorrespondence().stream().filter(correspondence -> correspondence.getSecurityLevel().equals(securityLevel)).findFirst().get().getDataSets();
	}


	
}
