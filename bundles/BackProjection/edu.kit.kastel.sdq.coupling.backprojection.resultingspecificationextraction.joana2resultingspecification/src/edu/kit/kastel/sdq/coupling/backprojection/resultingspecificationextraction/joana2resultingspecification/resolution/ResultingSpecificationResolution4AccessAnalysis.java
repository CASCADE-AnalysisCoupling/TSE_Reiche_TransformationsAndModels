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
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util.JOANAResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class ResultingSpecificationResolution4AccessAnalysis extends ResultingSpecificationResolution {


	protected Map<Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying>, Collection<ResultEntry>> sinkEntryAssignment = new HashMap<>();

	public ResultingSpecificationResolution4AccessAnalysis() {
		super();
	}

	protected ResultingValue combine(Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying> originalSink,
			Collection<ResultEntry> resultEntries, JOANASCARCorrespondences joanaScarCorrespondences) {

		List<ResultEntry> relevantResultEntries = resultEntries.stream()
				.filter(entry -> isResultEntryValidWRTAccessAnalysis(entry)).collect(Collectors.toList());

		if (relevantResultEntries.size() == 0) {
			return null;
		}

		Collection<String> unifiedLevels = new HashSet<String>();

		for (ResultEntry entry : relevantResultEntries) {
			unifiedLevels.addAll(ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(entry.getSource().getLevel().getName(),  SUBLEVEL_DELIMITER));
		}

		String unifiedSortedLevelName = String.join(SUBLEVEL_DELIMITER, unifiedLevels.stream().sorted().collect(Collectors.toList()));
		
		ParameterIdentification_JOANAResultingValues parameter = SCARResultingValuesModelElementUtil.getOrTransformAndAddParameterIdentification((ParameterIdentifying) originalSink.getFirst(), resultingValues, correspondences_ResultingValues);
		EntryPointIdentification_ResultingValues entryPoint = SCARResultingValuesModelElementUtil.getOrTransformAndAddConfigurationID(originalSink.getThird(), resultingValues, correspondences_ResultingValues);
		Level_ResultingValues level = SCARResultingValuesModelElementUtil.getOrTransformAndAddSecurityLevelByName(unifiedSortedLevelName, entryPoint, joanaScarCorrespondences, resultingValues, correspondences_ResultingValues);
		
		return JOANAResultingValuesModelGenerationUtil.createResultingValue(parameter, level, entryPoint);
	}

	protected boolean isResultEntryValidWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<String> sourceBasicLevels = ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(resultEntry.getSource().getLevel().getName(), SUBLEVEL_DELIMITER);
		Collection<String> sinkBasicLevels = ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(resultEntry.getSink().getLevel().getName(), SUBLEVEL_DELIMITER);

		return !(sourceBasicLevels.size() >= sinkBasicLevels.size()
				&& CollectionUtil.containsAny(sourceBasicLevels, sinkBasicLevels));

	
	}

	@Override
	public JOANAResultingValues calculateResultingSpecification(SourceCodeAnalysisResult scar, JOANASCARCorrespondences joanaScarCorrespondences) {

		Collection<ResultEntry> mappableResultEntries = filterMappableResultEntries(scar);

		calculateSinkResultEntryRelations(mappableResultEntries);

		for (Entry<Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying>, Collection<ResultEntry>> entry : sinkEntryAssignment
				.entrySet()) {
			ResultingValue resultingvalue = combine(entry.getKey(), entry.getValue(), joanaScarCorrespondences);

			if (resultingvalue != null) {
				resultingValues.getResultingValues().add(resultingvalue);
			}

		}

		return resultingValues;
	}

	protected Collection<ResultEntry> filterMappableResultEntries(SourceCodeAnalysisResult scar) {
		return scar.getResultEntries().stream()
				.filter(resultEntry -> resultEntry.getSink().getSystemElement() instanceof ParameterIdentifying)
				.collect(Collectors.toList());
	}

	public void calculateSinkResultEntryRelations(Collection<ResultEntry> mappableEntries) {
		for (ResultEntry resultEntry : mappableEntries) {
			if (!(resultEntry.getSink().getSystemElement() instanceof ParameterIdentifying)) {
				continue;
			}

			Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying> sink = getOrCreateAndAddOriginalSink(resultEntry);

			sinkEntryAssignment.get(sink).add(resultEntry);

		}
	}

	public Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying> getOrCreateAndAddOriginalSink(ResultEntry resultEntry) {

		if (!(resultEntry.getSink().getSystemElement() instanceof ParameterIdentifying)) {
			return null;
		}

		for (Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying> sinkAssignment : sinkEntryAssignment.keySet()) {
			if (sinkAssignment.getFirst().equals(resultEntry.getSink().getSystemElement())
					&& sinkAssignment.getSecond().equals(resultEntry.getSink().getLevel())
					&& sinkAssignment.getThird().equals(resultEntry.getEntryPoint())) {
				return sinkAssignment;
			}
		}

		Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying> sinkAssignment = new Triple<ParameterIdentifying, Level_SCAR, EntryPointIdentifying>(
				(ParameterIdentifying) resultEntry.getSink().getSystemElement(), resultEntry.getSink().getLevel(),
				resultEntry.getEntryPoint());
		sinkEntryAssignment.put(sinkAssignment, new ArrayList<ResultEntry>());

		return sinkAssignment;

	}



}
