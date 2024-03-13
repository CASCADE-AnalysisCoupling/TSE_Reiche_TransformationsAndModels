package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.CollectionUtil;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.Triple;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

public class ResultingSpecificationResolution4AccessAnalysis extends ResultingSpecificationResolution {


	private Map<Triple<Parameter, Level, EntryPoint>, Collection<ResultEntry>> sinkEntryAssignment = new HashMap<>();

	public ResultingSpecificationResolution4AccessAnalysis(EntryPoint config) {
		super(config);
	}
	
	public ResultingSpecificationResolution4AccessAnalysis() {
		super();
	}

	private ResultingSpecEntry combine(Triple<Parameter, Level, EntryPoint> originalSink,
			Collection<ResultEntry> resultEntries) {

		List<ResultEntry> relevantResultEntries = resultEntries.stream()
				.filter(entry -> isResultEntryValidWRTAccessAnalysis(entry)).collect(Collectors.toList());

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

	private boolean isResultEntryValidWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<Level> sourceBasicLevels = JOANAResolutionUtil
				.resolveBasicLevels(resultEntry.getSource().getSecurityProperty(), resultEntry.getEntryPoint(), SUBLEVEL_DELIMITER);
		Collection<Level> sinkBasicLevels = JOANAResolutionUtil
				.resolveBasicLevels(resultEntry.getSink().getSecurityProperty(), resultEntry.getEntryPoint(), SUBLEVEL_DELIMITER);

		return !(sourceBasicLevels.size() >= sinkBasicLevels.size()
				&& CollectionUtil.containsAny(sourceBasicLevels, sinkBasicLevels));

	
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

	private Collection<ResultEntry> filterMappableResultEntries(SourceCodeAnalysisResult scar) {
		return scar.getResultEntries().stream()
				.filter(resultEntry -> resultEntry.getSink().getSystemElement() instanceof Parameter)
				.collect(Collectors.toList());
	}

	public void calculateSinkResultEntryRelations(Collection<ResultEntry> mappableEntries) {
		for (ResultEntry resultEntry : mappableEntries) {
			if (!(resultEntry.getSink().getSystemElement() instanceof Parameter)) {
				continue;
			}

			Triple<Parameter, Level, EntryPoint> sink = getOrCreateAndAddOriginalSink(resultEntry);

			sinkEntryAssignment.get(sink).add(resultEntry);

		}
	}

	public Triple<Parameter, Level, EntryPoint> getOrCreateAndAddOriginalSink(ResultEntry resultEntry) {

		if (!(resultEntry.getSink().getSystemElement() instanceof Parameter)) {
			return null;
		}

		for (Triple<Parameter, Level, EntryPoint> sinkAssignment : sinkEntryAssignment.keySet()) {
			if (sinkAssignment.getFirst().equals(resultEntry.getSink().getSystemElement())
					&& sinkAssignment.getSecond().equals(resultEntry.getSink().getSecurityProperty())
					&& sinkAssignment.getThird().equals(resultEntry.getEntryPoint())) {
				return sinkAssignment;
			}
		}

		Triple<Parameter, Level, EntryPoint> sinkAssignment = new Triple<Parameter, Level, EntryPoint>(
				(Parameter) resultEntry.getSink().getSystemElement(), resultEntry.getSink().getSecurityProperty(),
				resultEntry.getEntryPoint());
		sinkEntryAssignment.put(sinkAssignment, new ArrayList<ResultEntry>());

		return sinkAssignment;

	}



}
