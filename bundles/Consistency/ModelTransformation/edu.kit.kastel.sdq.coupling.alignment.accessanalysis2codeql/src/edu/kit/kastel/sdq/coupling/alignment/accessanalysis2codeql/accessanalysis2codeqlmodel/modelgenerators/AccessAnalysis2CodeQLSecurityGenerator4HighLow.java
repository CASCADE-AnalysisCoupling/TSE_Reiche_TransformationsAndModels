package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class AccessAnalysis2CodeQLSecurityGenerator4HighLow extends AccessAnalysis2CodeQLSecurityGenerator{

	private static final String lowLevelName = "low";
	private static final String highLevelName = "high";

	
	public AccessAnalysis2CodeQLSecurityGenerator4HighLow(ConfidentialitySpecification accessAnalysisSpec,
			PCMJavaCorrespondenceRoot correspondences) {
		super(accessAnalysisSpec, correspondences);
	}

	@Override
	protected Collection<SecurityLevel> generateSecurityLevels(Collection<DataSet> dataSets) {
		//2 = High and Low
		if (dataSets.size() != 2) {
			throw new RuntimeException();
		}
		
		Collection<SecurityLevel> levels = new ArrayList<SecurityLevel>();
		
		for(DataSet dataSet : dataSets) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(dataSet.getName());
			levels.add(level);
			
			
			AccessAnalysisCodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(List.of(dataSet), level, getSecurityCorrespondences());
			
		}
		
		return levels;
	}

	@Override
	protected Collection<AllowedFlow> generateAllowedFlows(Query config) {
		SecurityLevel high = getHighLevel(config);
		SecurityLevel low = getLowLevel(config);

		List<AllowedFlow> mayFlows = new ArrayList<AllowedFlow>();

		mayFlows.add(CodeQLModelgenerationUtil.generateAllowedFlow(low, high));

		return mayFlows;
	}

	// Could be replaced by correspondence definitions or something similar.
	private SecurityLevel getHighLevel(Query config) {
		return config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(highLevelName)).findFirst()
				.get();
	}

	// Could be replaced by correspondence definitions or something similar.
	private SecurityLevel getLowLevel(Query config) {
		return config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(lowLevelName)).findFirst()
				.get();
	}
}
