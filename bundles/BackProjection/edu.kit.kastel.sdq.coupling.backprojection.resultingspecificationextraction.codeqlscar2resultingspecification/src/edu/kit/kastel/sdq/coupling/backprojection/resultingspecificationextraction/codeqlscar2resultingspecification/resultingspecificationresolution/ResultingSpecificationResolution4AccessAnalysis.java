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
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;


public class ResultingSpecificationResolution4AccessAnalysis extends ResultingSpecificationResolution {

	private Map<Tuple<ParameterIdentification, SecurityLevel_SCAR>, Collection<ResultEntry>> sinkEntryAssignment = new HashMap<>();
	
	public ResultingSpecificationResolution4AccessAnalysis() {
		super();
	}

	private ResultingValue combine(Tuple<ParameterIdentification, SecurityLevel_SCAR> originalSink, Collection<ResultEntry> resultEntries, SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, CodeQLSCARCorrespondences codeQLScarCorrespondence) {
		

		List<ResultEntry> relevantResultEntries = resultEntries.stream().filter(entry -> isResultEntryValidWRTAccessAnalysis(entry)).collect(Collectors.toList());
		
		if(!sameConfiguration(relevantResultEntries)) {
			throw new RuntimeException("Somehow not all entries do not have the same configuration");
		}
		
		if(relevantResultEntries.size() == 0) {
			return null;
		}
		
		Collection<String> unifiedLevels = new HashSet<>();
		
		
		for(ResultEntry entry : relevantResultEntries) {
			unifiedLevels.addAll(ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(entry.getSource().getSecurityLevel().getName(), DELIMITER));
		}
		
		String unifiedSortedLevelName = String.join(DELIMITER, unifiedLevels.stream().sorted().collect(Collectors.toList()));
		
		ParameterIdentificiation_CodeQLResultingValues parameter = SCARResultingValuesModelElementUtil.getOrTransformAndAddParameterIdentification((ParameterIdentification)originalSink.getFirst(), resultingValues, correspondences_ResultingValues);
		ConfigurationID_ResultingValues config = SCARResultingValuesModelElementUtil.getOrTransformAndAddConfigurationID(relevantResultEntries.get(0).getConfig(), resultingValues, correspondences_ResultingValues);
		SecurityLevel_ResultingValues securityLevel = SCARResultingValuesModelElementUtil.getOrTransformAndAddSecurityLevelByName(unifiedSortedLevelName, config, scar, codeQL, codeQLScarCorrespondence, resultingValues, correspondences_ResultingValues);
		
	
		
		return CodeQLResultingValuesModelGenerationUtil.createResultingValue(parameter, securityLevel, config);
	}




	private boolean isResultEntryValidWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<String> sourceBasicLevels = ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(resultEntry.getSource().getSecurityLevel().getName(), DELIMITER);
		Collection<String> sinkBasicLevels = ResultingValuesModelHandlingUtil.splitLevelNameIntoBasicLevels(resultEntry.getSink().getSecurityLevel().getName(), DELIMITER);
		
		boolean valid = !(sourceBasicLevels.size() >= sinkBasicLevels.size() && containsAny(sourceBasicLevels, sinkBasicLevels));

		return valid;
	}

	

	@Override
	public CodeQLResultingValues calculateResultingValues(SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, CodeQLSCARCorrespondences codeQLScarCorrespondence) {
	
		Collection<ResultEntry> mappableResultEntries = filterMappableResultEntries(scar);
		
		calculateSinkResultEntryRelations(mappableResultEntries);
		
		for(Entry<Tuple<ParameterIdentification, SecurityLevel_SCAR>, Collection<ResultEntry>> entry : sinkEntryAssignment.entrySet()) {
			ResultingValue resultingValue = combine(entry.getKey(), entry.getValue(), scar, codeQL, codeQLScarCorrespondence);
			
			if(resultingValue != null) {
				resultingValues.getResultingValues().add(resultingValue);
			}
			
		}
		
		return resultingValues;
	}
	
	private Collection<ResultEntry> filterMappableResultEntries(SourceCodeAnalysisResult scar) {
		return scar.getResultEntries().stream().filter(resultEntry -> resultEntry.getSink().getSystemElement() instanceof ParameterIdentification).collect(Collectors.toList());
	}

	public void calculateSinkResultEntryRelations(Collection<ResultEntry> mappableEntries) {
		for(ResultEntry resultEntry : mappableEntries) {
			if(!(resultEntry.getSink().getSystemElement() instanceof ParameterIdentification)) {
				continue;
			}
			
			Tuple<ParameterIdentification, SecurityLevel_SCAR> sinkTuple = getOrCreateAndAddOriginalSink(resultEntry);
			
			sinkEntryAssignment.get(sinkTuple).add(resultEntry);
			
		}
	}
	
	public Tuple<ParameterIdentification, SecurityLevel_SCAR> getOrCreateAndAddOriginalSink(ResultEntry resultEntry) {
		
		if(!(resultEntry.getSink().getSystemElement() instanceof ParameterIdentification)) {
			return null;
		}
		
		for(Tuple<ParameterIdentification, SecurityLevel_SCAR> sinkAssignment : sinkEntryAssignment.keySet()) {
			if(sinkAssignment.getFirst().equals(resultEntry.getSink().getSystemElement()) && sinkAssignment.getSecond().equals(resultEntry.getSink().getSecurityLevel())) {
				return sinkAssignment;
			}
		}
		
		Tuple<ParameterIdentification, SecurityLevel_SCAR> sinkTuple = new Tuple<ParameterIdentification, SecurityLevel_SCAR>((ParameterIdentification)resultEntry.getSink().getSystemElement(), resultEntry.getSink().getSecurityLevel());
		sinkEntryAssignment.put(sinkTuple, new ArrayList<ResultEntry>());
		
		return sinkTuple;
			
	}
	
	public static <T> boolean containsAny(Collection<T> ifContaining, Collection<T> testAgainst) {
		for(T elementToTest : testAgainst) {
			if(ifContaining.contains(elementToTest)) {
				return true;
			}
		} 
		
		return false;
	}


}
