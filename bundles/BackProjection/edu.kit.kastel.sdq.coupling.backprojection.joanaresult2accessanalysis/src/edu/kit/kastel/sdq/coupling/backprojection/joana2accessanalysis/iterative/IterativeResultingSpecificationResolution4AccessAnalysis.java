package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.iterative;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolution4AccessAnalysis;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.Triple;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

public class IterativeResultingSpecificationResolution4AccessAnalysis
		extends ResultingSpecificationResolution4AccessAnalysis {
	
	public IterativeResultingSpecificationResolution4AccessAnalysis(EntryPoint config) {
		super(config);
	}
	
	public IterativeResultingSpecificationResolution4AccessAnalysis() {
		super();
	}
	
	@Override
	public ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar) {

		Collection<ResultEntry> mappableResultEntries = filterMappableResultEntries(scar);

		calculateSinkResultEntryRelations(mappableResultEntries);

		for (Entry<Triple<Parameter, Level, EntryPoint>, Collection<ResultEntry>> entry : sinkEntryAssignment
				.entrySet()) {
			ResultingSpecEntry specEntry = combine(entry.getKey(), entry.getValue());

			if (specEntry != null) {
				resultingSpecification.addEntry(specEntry);
			}

		}

		return resultingSpecification;
	}
	
	@Override
	protected ResultingSpecEntry combine(Triple<Parameter, Level, EntryPoint> originalSink,
			Collection<ResultEntry> resultEntries) {

		// no filter of valid relation
		// TODO berechne Schnitt von srclevel und sinklevel als neues assignment
		List<ResultEntry> relevantResultEntries = resultEntries.stream().collect(Collectors.toList());

		if (relevantResultEntries.size() == 0) {
			return null;
		}

		Collection<Level> unifiedLevels = new HashSet<Level>();

		for (ResultEntry entry : relevantResultEntries) {
			unifiedLevels.addAll(JOANAResolutionUtil.resolveBasicLevels(entry.getSource().getSecurityProperty(),
					entry.getEntryPoint(), SUBLEVEL_DELIMITER));
		}

		return new ResultingSpecEntry(originalSink.getFirst(), JOANAResolutionUtil
				.findLevelFromSetOfBasicLevels(unifiedLevels, originalSink.getThird()),
				originalSink.getThird());
	}
}
