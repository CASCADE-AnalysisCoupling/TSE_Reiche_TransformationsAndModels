package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.util.Tuple;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class ResultingSpecificationResolution4AccessAnalysis extends ResultingSpecificationResolution {

	private Map<Tuple<Parameter, SecurityLevel>, Collection<ResultEntry>> sinkEntryAssignment = new HashMap<>();
	
	public ResultingSpecificationResolution4AccessAnalysis(Configuration config) {
		super(config);
	}

	private ResultingSpecEntry combine(Tuple<Parameter, SecurityLevel> originalSink, Collection<ResultEntry> resultEntries) {
		

		List<ResultEntry> relevantResultEntries = resultEntries.stream().filter(entry -> isResultEntryValidWRTAccessAnalysis(entry)).collect(Collectors.toList());
		
		if(!sameConfiguration(relevantResultEntries)) {
			throw new RuntimeException("Somehow not all entries do not have the same configuration");
		}
		
		if(relevantResultEntries.size() == 0) {
			return null;
		}
		
		Collection<SecurityLevel> unifiedLevels = new HashSet<SecurityLevel>();
		
		
		for(ResultEntry entry : relevantResultEntries) {
			unifiedLevels.addAll(CodeQLResolutionUtil.resolveBasicLevels(entry.getSource().getSecurityProperty(), entry.getConfig(), DELIMITER));
		}
		
		
		
		return new ResultingSpecEntry(CodeQLResolutionUtil.findLevelFromSetOfBasicLevels(unifiedLevels, relevantResultEntries.get(0).getConfig()), originalSink.getFirst(), relevantResultEntries.get(0).getConfig());
	}




	private boolean isResultEntryValidWRTAccessAnalysis(ResultEntry resultEntry) {
		Collection<SecurityLevel> sourceBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(resultEntry.getSource().getSecurityProperty(), resultEntry.getConfig(), DELIMITER);
		Collection<SecurityLevel> sinkBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(resultEntry.getSink().getSecurityProperty(), resultEntry.getConfig(), DELIMITER);
		
		boolean valid = !(sourceBasicLevels.size() >= sinkBasicLevels.size() && containsAny(sourceBasicLevels, sinkBasicLevels));

		return valid;
	}

	

	@Override
	public ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar) {
	
		Collection<ResultEntry> mappableResultEntries = filterMappableResultEntries(scar);
		
		calculateSinkResultEntryRelations(mappableResultEntries);
		
		for(Entry<Tuple<Parameter, SecurityLevel>, Collection<ResultEntry>> entry : sinkEntryAssignment.entrySet()) {
			ResultingSpecEntry specEntry = combine(entry.getKey(), entry.getValue());
			
			if(specEntry != null) {
				resultingSpecification.addEntry(specEntry);
			}
			
		}
		
		return resultingSpecification;
	}
	
	private Collection<ResultEntry> filterMappableResultEntries(SourceCodeAnalysisResult scar) {
		return scar.getResultEntries().stream().filter(resultEntry -> resultEntry.getSink().getSystemElement() instanceof Parameter).collect(Collectors.toList());
	}

	public void calculateSinkResultEntryRelations(Collection<ResultEntry> mappableEntries) {
		for(ResultEntry resultEntry : mappableEntries) {
			if(!(resultEntry.getSink().getSystemElement() instanceof Parameter)) {
				continue;
			}
			
			Tuple<Parameter, SecurityLevel> sinkTuple = getOrCreateAndAddOriginalSink(resultEntry);
			
			sinkEntryAssignment.get(sinkTuple).add(resultEntry);
			
		}
	}
	
	public Tuple<Parameter, SecurityLevel> getOrCreateAndAddOriginalSink(ResultEntry resultEntry) {
		
		if(!(resultEntry.getSink().getSystemElement() instanceof Parameter)) {
			return null;
		}
		
		for(Tuple<Parameter, SecurityLevel> sinkAssignment : sinkEntryAssignment.keySet()) {
			if(sinkAssignment.getFirst().equals(resultEntry.getSink().getSystemElement()) && sinkAssignment.getSecond().equals(resultEntry.getSink().getSecurityProperty())) {
				return sinkAssignment;
			}
		}
		
		Tuple<Parameter, SecurityLevel> sinkTuple = new Tuple<Parameter, SecurityLevel>((Parameter)resultEntry.getSink().getSystemElement(), resultEntry.getSink().getSecurityProperty());
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
