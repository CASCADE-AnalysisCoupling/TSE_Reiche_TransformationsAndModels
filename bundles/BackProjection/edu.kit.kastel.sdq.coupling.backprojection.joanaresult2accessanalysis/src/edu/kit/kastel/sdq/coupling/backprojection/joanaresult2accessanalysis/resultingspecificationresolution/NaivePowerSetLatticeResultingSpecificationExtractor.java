package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.utils.BackprojectionUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

/* 
 * This extractor is based on the original idea of the thesis 
 *  "Enabling the Information Transfer between Architecture and Source Code for Security Analysis"
*/
public class NaivePowerSetLatticeResultingSpecificationExtractor extends ResultingSpecificationExtractor {

	private ResultingSpecification resultingSpecification;

	public NaivePowerSetLatticeResultingSpecificationExtractor(EntryPoint entryPoint) {
		super(entryPoint);
	}
	
	public NaivePowerSetLatticeResultingSpecificationExtractor() {
		super();
	}

	@Override
	protected Level combine(Level source, Level sink) {

		Collection<Level> sourceBasicLevels = BackprojectionUtil.splitLevelIntoBasicLevels(source, entryPoint);
		Collection<Level> sinkBasicLevels = BackprojectionUtil.splitLevelIntoBasicLevels(sink, entryPoint);

		Set<Level> combinedLevels = new HashSet<Level>();

		sourceBasicLevels.stream().forEach(level -> {
			combinedLevels.add(level);
		});
		sinkBasicLevels.stream().forEach(level -> {
			combinedLevels.add(level);
		});

		return findLevelFromSetOfBasicLevels(combinedLevels);

	}

	@Override
	protected ResultingSpecEntry combine(ResultEntry resultEntry) {
	
		Parameter targetParameter = resultEntry.getSink().getSystemElement();
		ResultingSpecEntry resultingSpecEntry = resultingSpecification
				.getResultingSpecEntryForTargetIfExisting(targetParameter).orElse(null);

		Level newLevel;
		if (resultingSpecEntry == null) {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(),
					resultEntry.getSink().getSecurityProperty());

			return new ResultingSpecEntry(targetParameter, newLevel, resultEntry.getEntryPoint());

		} else {
			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultingSpecEntry.getSecurityProperty());

			resultingSpecEntry.setSecurityProperty(newLevel);
			return resultingSpecEntry;

		}
	}

	@Override
	public ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar) {
	
		this.resultingSpecification = new ResultingSpecification();
		//Ignore Different EntryPoints due to powerset approach, otherwise, handling of different entrypoints and level necessary;
		for (ResultEntry resultEntry : scar.getResultEntries()) {
			this.setEntryPoint(resultEntry.getEntryPoint());
			ResultingSpecEntry entry = combine(resultEntry);
			resultingSpecification.addEntry(entry);
		}

		return resultingSpecification;
	}
}
