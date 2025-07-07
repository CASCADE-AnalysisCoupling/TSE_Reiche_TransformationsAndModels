package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.CollectionUtil;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.ResultingValuesModelHandlingUtil;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.SCARResultingValuesModelElementUtil;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.Triple;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util.JOANAResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Flow;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class ResultingSpecificationResolution4AccessAnalysis extends ResultingSpecificationResolution {


	protected Map<Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR>, Collection<Flow>> sinkEntryAssignment = new HashMap<>();

	public ResultingSpecificationResolution4AccessAnalysis() {
		super();
	}

	protected ResolvedImplementationValue combine(Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR> originalSink,
			Collection<Flow> resultEntries, JOANASCARCorrespondences joanaScarCorrespondences) {

		List<Flow> relevantResultEntries = resultEntries.stream()
				.filter(entry -> isResultEntryValidWRTAccessAnalysis(entry)).collect(Collectors.toList());

		if (relevantResultEntries.size() == 0) {
			return null;
		}
		
		Collection<String> unifiedLevels = new HashSet<String>();

		for (Flow entry : relevantResultEntries) {
			unifiedLevels.addAll(ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(entry.getSource().getSourceLevel().getName(),  SUBLEVEL_DELIMITER));
		}

		String unifiedSortedLevelName = String.join(SUBLEVEL_DELIMITER, unifiedLevels.stream().sorted().collect(Collectors.toList()));
		
		Parameter_ResolvedImplementationValues parameter = SCARResultingValuesModelElementUtil.getOrTransformAndAddParameter((Parameter_SCAR) originalSink.getFirst(), resultingValues, correspondences_ResultingValues);
		EntryPoint_ResolvedImplementationValues entryPoint = SCARResultingValuesModelElementUtil.getOrTransformAndAddConfigurationID(originalSink.getThird(), resultingValues, correspondences_ResultingValues);
		Level_ResolvedImplementationValues level = SCARResultingValuesModelElementUtil.getOrTransformAndAddSecurityLevelByName(unifiedSortedLevelName, entryPoint, joanaScarCorrespondences, resultingValues, correspondences_ResultingValues);
		
		return JOANAResultingValuesModelGenerationUtil.createResultingValue(parameter, level, entryPoint);
	}

	protected boolean isResultEntryValidWRTAccessAnalysis(Flow resultEntry) {
		Collection<String> sourceBasicLevels = ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(resultEntry.getSource().getSourceLevel().getName(), SUBLEVEL_DELIMITER);
		Collection<String> sinkBasicLevels = ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(resultEntry.getSink().getSinkLevel().getName(), SUBLEVEL_DELIMITER);

		return !(sourceBasicLevels.size() >= sinkBasicLevels.size()
				&& CollectionUtil.containsAny(sourceBasicLevels, sinkBasicLevels));

	
	}

	@Override
	public ResolvedImplementationValues calculateResultingSpecification(SourceCodeAnalysisResult scar, JOANASCARCorrespondences joanaScarCorrespondences) {

		Collection<Flow> mappableResultEntries = filterMappableResultEntries(scar);

		calculateSinkResultEntryRelations(mappableResultEntries);

		for (Entry<Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR>, Collection<Flow>> entry : sinkEntryAssignment
				.entrySet()) {
			ResolvedImplementationValue resultingvalue = combine(entry.getKey(), entry.getValue(), joanaScarCorrespondences);

			if (resultingvalue != null) {
				resultingValues.getResultingValues().add(resultingvalue);
			}

		}

		return resultingValues;
	}

	protected Collection<Flow> filterMappableResultEntries(SourceCodeAnalysisResult scar) {
		return scar.getFlows().stream()
				.filter(resultEntry -> resultEntry.getSink().getSystemElement() instanceof Parameter_SCAR)
				.collect(Collectors.toList());
	}

	public void calculateSinkResultEntryRelations(Collection<Flow> mappableEntries) {
		for (Flow resultEntry : mappableEntries) {
			if (!(resultEntry.getSink().getSystemElement() instanceof Parameter_SCAR)) {
				continue;
			}

			Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR> sink = getOrCreateAndAddOriginalSink(resultEntry);

			sinkEntryAssignment.get(sink).add(resultEntry);

		}
	}

	public Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR> getOrCreateAndAddOriginalSink(Flow resultEntry) {

		if (!(resultEntry.getSink().getSystemElement() instanceof Parameter_SCAR)) {
			return null;
		}

		for (Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR> sinkAssignment : sinkEntryAssignment.keySet()) {
			if (sinkAssignment.getFirst().equals(resultEntry.getSink().getSystemElement())
					&& sinkAssignment.getSecond().equals(resultEntry.getSink().getSinkLevel())
					&& sinkAssignment.getThird().equals(resultEntry.getEntryPoint())) {
				return sinkAssignment;
			}
		}

		Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR> sinkAssignment = new Triple<Parameter_SCAR, Level_SCAR, EntryPoint_SCAR>(
				(Parameter_SCAR) resultEntry.getSink().getSystemElement(), resultEntry.getSink().getSinkLevel(),
				resultEntry.getEntryPoint());
		sinkEntryAssignment.put(sinkAssignment, new ArrayList<Flow>());

		return sinkAssignment;

	}



}
