package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.util.Tuple;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model.ResultingValuesModelHandlingUtil;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.model.SCARResultingValuesModelElementUtil;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;

public class ResultingSpecificationResolution4AccessAnalysis extends ResultingSpecificationResolution {

	private Map<Tuple<Parameter_SCAR, SecurityLevel_SCAR>, Collection<Result>> sinkEntryAssignment = new HashMap<>();

	public ResultingSpecificationResolution4AccessAnalysis() {
		super();
	}

	private ResolvedImplementationValue combine(Tuple<Parameter_SCAR, SecurityLevel_SCAR> originalSink,
			Collection<Result> resultEntries, SourceCodeAnalysisResult scar, TainttrackingRoot codeQL,
			Correspondences_CodeQLScar codeQLScarCorrespondence) {

		List<Result> relevantResultEntries = resultEntries.stream()
				.filter(entry -> isResultEntryValidWRTAccessAnalysis(entry)).collect(Collectors.toList());

		if (!sameConfiguration(relevantResultEntries)) {
			throw new RuntimeException("Somehow not all entries do not have the same configuration");
		}

		if (relevantResultEntries.size() == 0) {
			return null;
		}

		Collection<String> unifiedLevels = new HashSet<>();

		for (Result entry : relevantResultEntries) {
			unifiedLevels.addAll(ResultingValuesModelHandlingUtil
					.splitLevelNameIntoBasicLevels(entry.getSource().getSecurityLevel().getName(), DELIMITER));
		}

		String unifiedSortedLevelName = String.join(DELIMITER,
				unifiedLevels.stream().sorted().collect(Collectors.toList()));

		Parameter_ResolvedImplementationValues parameter = SCARResultingValuesModelElementUtil
				.getOrTransformAndAddParameterIdentification((Parameter_SCAR) originalSink.getFirst(), resultingValues,
						correspondences_ResultingValues);
		RuleId_ResolvedImplementationValue config = SCARResultingValuesModelElementUtil
				.getOrTransformAndAddConfigurationID(relevantResultEntries.get(0).getRuleId(), resultingValues,
						correspondences_ResultingValues);
		SecurityLevel_ResolvedImplementationValues securityLevel = SCARResultingValuesModelElementUtil
				.getOrTransformAndAddSecurityLevelByName(unifiedSortedLevelName, config, scar, codeQL,
						codeQLScarCorrespondence, resultingValues, correspondences_ResultingValues);

		return CodeQLResultingValuesModelGenerationUtil.createResultingValue(parameter, securityLevel, config);
	}

	private boolean isResultEntryValidWRTAccessAnalysis(Result resultEntry) {
		Collection<String> sourceBasicLevels = ResultingValuesModelHandlingUtil
				.splitLevelNameIntoBasicLevels(resultEntry.getSource().getSecurityLevel().getName(), DELIMITER);
		Collection<String> sinkBasicLevels = ResultingValuesModelHandlingUtil
				.splitLevelNameIntoBasicLevels(resultEntry.getSink().getSecurityLevel().getName(), DELIMITER);

		boolean valid = !(sourceBasicLevels.size() >= sinkBasicLevels.size()
				&& containsAny(sourceBasicLevels, sinkBasicLevels));

		return valid;
	}

	@Override
	public ResolvedImplementationValues calculateResultingValues(SourceCodeAnalysisResult scar,
			TainttrackingRoot codeQL, Correspondences_CodeQLScar codeQLScarCorrespondence) {

		Collection<Result> mappableResultEntries = filterMappableResultEntries(scar);

		calculateSinkResultEntryRelations(mappableResultEntries);

		for (Entry<Tuple<Parameter_SCAR, SecurityLevel_SCAR>, Collection<Result>> entry : sinkEntryAssignment
				.entrySet()) {
			ResolvedImplementationValue resultingValue = combine(entry.getKey(), entry.getValue(), scar, codeQL,
					codeQLScarCorrespondence);

			if (resultingValue != null) {
				resultingValues.getResultingValues().add(resultingValue);
			}

		}

		return resultingValues;
	}

	private Collection<Result> filterMappableResultEntries(SourceCodeAnalysisResult scar) {
		return scar.getResultEntries().stream()
				.filter(resultEntry -> resultEntry.getSink().getSystemElement() instanceof Parameter_SCAR)
				.collect(Collectors.toList());
	}

	public void calculateSinkResultEntryRelations(Collection<Result> mappableEntries) {
		for (Result resultEntry : mappableEntries) {
			if (!(resultEntry.getSink().getSystemElement() instanceof Parameter_SCAR)) {
				continue;
			}

			Tuple<Parameter_SCAR, SecurityLevel_SCAR> sinkTuple = getOrCreateAndAddOriginalSink(resultEntry);

			sinkEntryAssignment.get(sinkTuple).add(resultEntry);

		}
	}

	public Tuple<Parameter_SCAR, SecurityLevel_SCAR> getOrCreateAndAddOriginalSink(Result resultEntry) {

		if (!(resultEntry.getSink().getSystemElement() instanceof Parameter_SCAR)) {
			return null;
		}

		for (Tuple<Parameter_SCAR, SecurityLevel_SCAR> sinkAssignment : sinkEntryAssignment.keySet()) {
			if (sinkAssignment.getFirst().equals(resultEntry.getSink().getSystemElement())
					&& sinkAssignment.getSecond().equals(resultEntry.getSink().getSecurityLevel())) {
				return sinkAssignment;
			}
		}

		Tuple<Parameter_SCAR, SecurityLevel_SCAR> sinkTuple = new Tuple<Parameter_SCAR, SecurityLevel_SCAR>(
				(Parameter_SCAR) resultEntry.getSink().getSystemElement(), resultEntry.getSink().getSecurityLevel());
		sinkEntryAssignment.put(sinkTuple, new ArrayList<Result>());

		return sinkTuple;

	}

	public static <T> boolean containsAny(Collection<T> ifContaining, Collection<T> testAgainst) {
		for (T elementToTest : testAgainst) {
			if (ifContaining.contains(elementToTest)) {
				return true;
			}
		}

		return false;
	}

}
