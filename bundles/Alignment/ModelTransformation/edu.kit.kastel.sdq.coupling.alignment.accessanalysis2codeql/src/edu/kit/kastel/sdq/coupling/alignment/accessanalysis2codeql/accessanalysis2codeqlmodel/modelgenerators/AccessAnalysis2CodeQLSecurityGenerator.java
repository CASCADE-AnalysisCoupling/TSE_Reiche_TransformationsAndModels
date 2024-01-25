package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;

import com.google.common.collect.Sets;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.AccessAnalysisResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.labeledtaintflow.CodeQLLabeledTaintFlowUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public class AccessAnalysis2CodeQLSecurityGenerator {



	private final TainttrackingRoot root;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final PCMJavaCorrespondenceRoot correspondences;
	private static final String SUBLEVEL_DELIMITER = ";";
	private static final boolean HIGH_CONJUNCTIVE = false;
	
	public AccessAnalysis2CodeQLSecurityGenerator(ConfidentialitySpecification accessAnalysisSpec,
			PCMJavaCorrespondenceRoot correspondences) {
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

				ProvidedParameterIdentification pcmParameter = null;
				Collection<String> sources = pair.getParameterSources();
				for(String source : sources) {
				
					if(source.toLowerCase().contains("return")) {
						
					} else if (source.toLowerCase().contains("sizeof")) {
						
					} else if (source.toLowerCase().contains("call")) {
						
					} else {
						pcmParameter = PCMJavaCorrespondenceResolutionUtils.getParameterIdentification(correspondences, signature, source);
						Collection<DataSet> dataSets = AccessAnalysisResolutionUtil.filterDataSets(pair.getDataTargets());
						
						Parameter param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, pcmParameter);
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
			
			String securityLevelName = CodeQLLabeledTaintFlowUtil.combineSecurityLevelNames(SUBLEVEL_DELIMITER, securityLevelNames);
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
				
				if(CodeQLLabeledTaintFlowUtil.allowedFlowConditionConjunctive(HIGH_CONJUNCTIVE, potentiallyFrom, potentiallyTo)) {
					SecurityLevel from = CodeQLLabeledTaintFlowUtil.findCombinedLevelForSeperateLevels(SUBLEVEL_DELIMITER,potentiallyFrom, availableLevels);
					SecurityLevel to = CodeQLLabeledTaintFlowUtil.findCombinedLevelForSeperateLevels(SUBLEVEL_DELIMITER, potentiallyTo, availableLevels);
					
					AllowedFlow allowed = CodeQLModelgenerationUtil.generateAllowedFlow(from, to);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
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
	
	private Set<List<SecurityLevel>> generatePowerSetWithSortedLevels(){
		Set<Set<SecurityLevel>> powerSetSecurityLevels = generatePowerSetOfSecurityLevels();
		Set<List<SecurityLevel>> powerSetWithSortedLevels = new HashSet<List<SecurityLevel>>();
		
		for(Set<SecurityLevel> set : powerSetSecurityLevels) {
			if(!set.isEmpty()) {
				powerSetWithSortedLevels.add(CodeQLLabeledTaintFlowUtil.sortSecurityLevels(set));
			}
		}
		
		return powerSetWithSortedLevels;
	}
	

	private SecurityLevel getSecurityLevelForDataSets(Collection<DataSet> datasets, Collection<SecurityLevel> securityLevels) {
		Collection<DataSet> sortedDataSets = datasets.stream().sorted(Comparator.comparing(DataSet::getName)).collect(Collectors.toList());
		List<String> dataSetsNames = sortedDataSets.stream().map(dataset -> dataset.getName()).collect(Collectors.toList());
		String combinedDataSetName = String.join(SUBLEVEL_DELIMITER, dataSetsNames);
		
		for(SecurityLevel level : securityLevels) {
			if(level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}

	public TainttrackingRoot getRoot() {
		return root;
	}

	public  PCMJavaCorrespondenceRoot getCorrespondences() {
		return correspondences;
	}
	
	
}
