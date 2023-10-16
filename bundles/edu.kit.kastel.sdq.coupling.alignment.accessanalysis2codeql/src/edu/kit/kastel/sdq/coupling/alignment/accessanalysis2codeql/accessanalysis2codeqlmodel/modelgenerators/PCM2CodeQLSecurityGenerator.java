package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.kit.kastel.sdq.coupling.models.java.members.Parameter;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;

import com.google.common.collect.Sets;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.AccessAnalysisResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public class PCM2CodeQLSecurityGenerator {



	private final TainttrackingRoot root;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final Correspondences correspondences;
	
	public PCM2CodeQLSecurityGenerator(ConfidentialitySpecification accessAnalysisSpec,
			Correspondences correspondences) {
		super();
		this.root = CodeQLModelgenerationUtil.generateDataFlowRoot();
		this.accessAnalysisSpec = accessAnalysisSpec;
		this.correspondences = correspondences;
	}
	
	public void generateCodeQLConfiguration(Collection<StereotypeApplication> steretypeApplications) {
		Configuration config = CodeQLModelgenerationUtil.generateConfiguration();
		
		Collection<SecurityLevel> appliedSecurityLevels = generateSecurityLevels();
		Collection<AllowedFlow> allowedFlows = generateAllowedFlows(appliedSecurityLevels);
		Collection<SecurityLevelAnnotation> annotations = generateSecurityLevelAnnotations(steretypeApplications, appliedSecurityLevels);
		
		config.getAppliedSecurityLevel().addAll(appliedSecurityLevels);
		config.getAllowedFlows().addAll(allowedFlows);
		config.getSecurityLevelAnnotations().addAll(annotations);
		
		root.getConfigurations().add(config);
		
	}
	
	private Collection<SecurityLevelAnnotation> generateSecurityLevelAnnotations(Collection<StereotypeApplication> informationFlowApplications, Collection<SecurityLevel> codeQLSecurityLevels){

		Collection<SecurityLevelAnnotation> annotations = new ArrayList<SecurityLevelAnnotation>();
		Collection<StereotypeApplication> informationFlows = AccessAnalysisResolutionUtil.filterInformationFlowApplications(informationFlowApplications);
		
		
		for(StereotypeApplication application : informationFlows) {
			OperationSignature signature = (OperationSignature) application.getAppliedTo();
			Collection<StereotypeApplication> appl = Collections.singletonList(application);
			Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl, "parametersAndDataPairs", ParametersAndDataPair.class);
			//Optional<List<ParametersAndDataPair>> StereotypeAPI.<List<ParametersAndDataPair>>getTaggedValueSafe(signature, "parametersAndDataPairs", "ParametersAndDataPair");
	
		
			
			//for now, assume that no parameter or return is annotated more than once for evaluation pruposes
			//if not, build collectors
			for(ParametersAndDataPair pair : parametersAndDataPairs) {

				ParameterIdentification pcmParameter = null;
				Collection<String> sources = pair.getParameterSources();
				for(String source : sources) {
				
					if(source.toLowerCase().contains("return")) {
						
					} else if (source.toLowerCase().contains("sizeof")) {
						
					} else if (source.toLowerCase().contains("call")) {
						
					} else {
						pcmParameter = getParameterIdentification(signature, source);
						Collection<DataSet> dataSets = AccessAnalysisResolutionUtil.filterDataSets(pair.getDataTargets());
						
						Parameter param = correspondences.getParameterToParameterCorrespondences().get(pcmParameter);
						SecurityLevel level = getSecurityLevelForDataSets(dataSets, codeQLSecurityLevels);
						ParameterAnnotation annotation = CodeQLModelgenerationUtil.generateParameterAnnotation(param, level);
						
						annotations.add(annotation);
					}
				}
			
			}
		}
		
		return annotations;
	}
	
	private Collection<SecurityLevel> generateSecurityLevels() {
		
		
		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels();
		
		
		Collection<SecurityLevel> securityLevels = new HashSet<SecurityLevel>();
		
		for(List<SecurityLevel> securityLevelNames : securityLevelPowerSet) {
			
			String securityLevelName = combineSecurityLevelNames(securityLevelNames);
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(securityLevelName);
			
			securityLevels.add(level);
		}
		
		return securityLevels;
	}

	private Collection<AllowedFlow> generateAllowedFlows(Collection<SecurityLevel> availableLevels) {

		Collection<AllowedFlow> allowedFlows = new ArrayList<AllowedFlow>();
		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels();
		
		for(List<SecurityLevel> potentiallyFrom : securityLevelPowerSet) {
			for(List<SecurityLevel> potentiallyTo: securityLevelPowerSet) {
				
				if(allowedFlowCondition(potentiallyFrom, potentiallyTo)) {
					SecurityLevel from = findCombinedLevelForSeperateLevels(potentiallyFrom, availableLevels);
					SecurityLevel to = findCombinedLevelForSeperateLevels(potentiallyTo, availableLevels);
					
					AllowedFlow allowed = CodeQLModelgenerationUtil.generateAllowedFlow(from, to);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}

	private String combineSecurityLevelNames(Collection<SecurityLevel> securityLevels) {
		List<String> securityLevelNames = securityLevels.stream().map(securityLevel -> securityLevel.getName()).collect(Collectors.toList());
		
		return String.join("", securityLevelNames);
	}

	private Set<Set<SecurityLevel>> generatePowerSetOfSecurityLevels() {
		Set<SecurityLevel> basicLevels = new HashSet<SecurityLevel>();

		// initial set
		for (DataSet dataSet : AccessAnalysisResolutionUtil.filterDataSets(accessAnalysisSpec.getDataIdentifier())) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(dataSet.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}

	private List<SecurityLevel> sortSecurityLevels(Collection<SecurityLevel> levels){
		return levels.stream().sorted(Comparator.comparing(SecurityLevel::getName)).collect(Collectors.toList());
	}
	
	private Set<List<SecurityLevel>> generatePowerSetWithSortedLevels(){
		Set<Set<SecurityLevel>> powerSetSecurityLevels = generatePowerSetOfSecurityLevels();
		Set<List<SecurityLevel>> powerSetWithSortedLevels = new HashSet<List<SecurityLevel>>();
		
		for(Set<SecurityLevel> set : powerSetSecurityLevels) {
			if(!set.isEmpty()) {
				powerSetWithSortedLevels.add(sortSecurityLevels(set));
			}
		}
		
		return powerSetWithSortedLevels;
	}
	
	//Allowed Flow Condition according to Häring
	private boolean allowedFlowCondition(Collection<SecurityLevel> potentiallyFrom, Collection<SecurityLevel> potentiallyTo) {
		return potentiallyFrom.size() == potentiallyTo.size() + 1 && potentiallyFrom.containsAll(potentiallyTo);	
	}
	
	private SecurityLevel findCombinedLevelForSeperateLevels(Collection<SecurityLevel> seperateLevels, Collection<SecurityLevel> combinedLevels) {
		for(SecurityLevel combined : combinedLevels) {
			String combinedNameOfSeparateLevels = combineSecurityLevelNames(seperateLevels);
			
			if(combined.getName().equals(combinedNameOfSeparateLevels)) {
				return combined;
			}
		}
		
		return null;
	}
	
	private SecurityLevel getSecurityLevelForDataSets(Collection<DataSet> datasets, Collection<SecurityLevel> securityLevels) {
		Collection<DataSet> sortedDataSets = datasets.stream().sorted(Comparator.comparing(DataSet::getName)).collect(Collectors.toList());
		List<String> dataSetsNames = sortedDataSets.stream().map(dataset -> dataset.getName()).collect(Collectors.toList());
		String combinedDataSetName = String.join("", dataSetsNames);
		
		for(SecurityLevel level : securityLevels) {
			if(level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}
	
	private ParameterIdentification getParameterIdentification(OperationSignature signature, String name) {
		Collection<ParameterIdentification> generatedParameterIdentifications = correspondences.getParameterToParameterCorrespondences().keySet();
		
		for(ParameterIdentification identification : generatedParameterIdentifications) {
			if(identification.getSignature().getSignature().equals(signature) && identification.getParamerter().getParameterName().equals(name)) {
				return identification;
			}
		}
		return null;
	}

	public TainttrackingRoot getRoot() {
		return root;
	}

	public Correspondences getCorrespondences() {
		return correspondences;
	}
}
