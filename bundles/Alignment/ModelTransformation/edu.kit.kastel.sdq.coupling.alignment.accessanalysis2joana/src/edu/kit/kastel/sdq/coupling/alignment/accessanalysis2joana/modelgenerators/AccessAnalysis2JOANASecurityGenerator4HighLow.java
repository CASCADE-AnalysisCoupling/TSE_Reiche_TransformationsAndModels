package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.utils.AccessAnalysisJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class AccessAnalysis2JOANASecurityGenerator4HighLow extends AccessAnalysis2JOANASecurityGenerator {


	private static final String lowLevelName = "low";
	private static final String highLevelName = "high";
	
	public AccessAnalysis2JOANASecurityGenerator4HighLow(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec) {
		super(correspondences, accessAnalysisSpec);
	}

	@Override
	protected Collection<Level> generateLevels(Collection<DataSet> dataSets) {
		//2 = High and Low
		if (dataSets.size() != 2) {
			throw new RuntimeException();
		}
		
		Collection<Level> levels = new ArrayList<Level>();
		
		for(DataSet dataSet : dataSets) {
			Level level = JOANAModelGenerationUtil.generateLevel(dataSet.getName());
			levels.add(level);
			
			AccessAnalysisJOANACorrespondenceUtil.createAndAddIfCorrespondenceNotExists(List.of(dataSet), level, accessAnalysisJOANACorrespondences);
		}
		
		return levels;
	}

	@Override
	protected Collection<MayFlow> generateMayFlows(EntryPoint currentEntryPoint) {
		Level high = getHighLevel(currentEntryPoint);
		Level low = getLowLevel(currentEntryPoint);

		List<MayFlow> mayFlows = new ArrayList<MayFlow>();

		mayFlows.add(JOANAModelGenerationUtil.generateMayFlow(low, high));

		return mayFlows;
	}

	// Could be replaced by correspondence definitions or something similar.
	private Level getHighLevel(EntryPoint currentEntryPoint) {
		return currentEntryPoint.getLevel().stream().filter(level -> level.getName().equals(highLevelName)).findFirst()
				.get();
	}

	// Could be replaced by correspondence definitions or something similar.
	private Level getLowLevel(EntryPoint currentEntryPoint) {
		return currentEntryPoint.getLevel().stream().filter(level -> level.getName().equals(lowLevelName)).findFirst()
				.get();
	}
}
