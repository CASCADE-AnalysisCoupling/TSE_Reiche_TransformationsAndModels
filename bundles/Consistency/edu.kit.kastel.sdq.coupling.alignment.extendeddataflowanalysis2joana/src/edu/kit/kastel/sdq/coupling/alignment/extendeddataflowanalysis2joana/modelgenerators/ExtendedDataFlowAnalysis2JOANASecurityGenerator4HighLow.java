package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;

import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.util.EDFAJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class ExtendedDataFlowAnalysis2JOANASecurityGenerator4HighLow
		extends ExtendedDataFlowAnalysis2JOANASecurityGenerator {

	private static final String lowLevelName = "low";
	private static final String highLevelName = "high";

	public ExtendedDataFlowAnalysis2JOANASecurityGenerator4HighLow(ParameterAnnotations parameterAnnotations,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super(parameterAnnotations, correspondences, dictionary);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Collection<Level> generateLevels(Collection<Literal> literals) {
		//2 = High and Low
		if (literals.size() != 2) {
			throw new RuntimeException();
		}
		
		Collection<Level> levels = new ArrayList<Level>();
		
		for(Literal lit : literals) {
			Level level = JOANAModelGenerationUtil.generateLevel(lit.getName());
			levels.add(level);
			
			EDFAJOANACorrespondenceUtil.createAndAddIfCorrespondenceNotExists(List.of(lit), level, edfaJoanaCorrespondences);
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
