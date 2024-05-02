package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;

import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util.EDFACodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class ExtendedDataFlowAnalysis2CodeQLSecurityGenerator4HighLow extends ExtendedDataFlowAnalysis2CodeQLSecurityGenerator{


	private static final String lowLevelName = "low";
	private static final String highLevelName = "high";

	
	public ExtendedDataFlowAnalysis2CodeQLSecurityGenerator4HighLow(ParameterAnnotations extensionRoot,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super(extensionRoot, correspondences, dictionary);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Collection<SecurityLevel> generateSecurityLevels(Collection<Literal> literals) {
		//2 = High and Low
		if (literals.size() != 2) {
			throw new RuntimeException();
		}
		
		Collection<SecurityLevel> levels = new ArrayList<SecurityLevel>();
		
		for(Literal lit : literals) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(lit.getName());
			levels.add(level);
			
			EDFACodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(List.of(lit), level, edfaCodeQLCorrespondences);
		}
		
		return levels;
	}

	@Override
	protected Collection<AllowedFlow> generateAllowedFlows(Configuration config) {
		SecurityLevel high = getHighLevel(config);
		SecurityLevel low = getLowLevel(config);

		List<AllowedFlow> mayFlows = new ArrayList<AllowedFlow>();

		mayFlows.add(CodeQLModelgenerationUtil.generateAllowedFlow(low, high));

		return mayFlows;
	}

	// Could be replaced by correspondence definitions or something similar.
	private SecurityLevel getHighLevel(Configuration config) {
		return config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(highLevelName)).findFirst()
				.get();
	}

	// Could be replaced by correspondence definitions or something similar.
	private SecurityLevel getLowLevel(Configuration config) {
		return config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(lowLevelName)).findFirst()
				.get();
	}
}
