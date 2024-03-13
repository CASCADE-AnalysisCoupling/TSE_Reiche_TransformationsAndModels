package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
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

public abstract class AccessAnalysis2CodeQLSecurityGenerator {



	private final TainttrackingRoot root;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final PCMJavaCorrespondenceRoot correspondences;
	protected static final String SUBLEVEL_DELIMITER = ";";
	
	
	public AccessAnalysis2CodeQLSecurityGenerator(ConfidentialitySpecification accessAnalysisSpec,
			PCMJavaCorrespondenceRoot correspondences) {
		super();
		this.root = CodeQLModelgenerationUtil.generateDataFlowRoot();
		this.accessAnalysisSpec = accessAnalysisSpec;
		this.correspondences = correspondences;
	}
	
	public void generateCodeQLConfiguration(Collection<StereotypeApplication> steretypeApplications) {
		Configuration config = CodeQLModelgenerationUtil.generateConfiguration();
		
		Collection<SecurityLevel> appliedSecurityLevels = generateSecurityLevels(AccessAnalysisResolutionUtil.filterDataSets(accessAnalysisSpec.getDataIdentifier()));
		config.getAppliedSecurityLevel().addAll(appliedSecurityLevels);
		Collection<AllowedFlow> allowedFlows = generateAllowedFlows(config);
		Collection<SecurityLevelAnnotation> annotations = generateSecurityLevelAnnotations(steretypeApplications, appliedSecurityLevels);
		
		
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
	
		
			
			//for now, assume that no parameter or return is annotated more than once for evaluation pruposes
			//implementation for all provided roles in alignment extendeddataflowanalysis2codeql
			for(ParametersAndDataPair pair : parametersAndDataPairs) {

				
				Collection<String> sources = pair.getParameterSources();
				for(String source : sources) {
				
					if(source.toLowerCase().contains("return")) {
						
					} else if (source.toLowerCase().contains("sizeof")) {
						
					} else if (source.toLowerCase().contains("call")) {
						
					} else {
						Collection<ProvidedParameterIdentification> pcmParameters = PCMJavaCorrespondenceResolutionUtils.getParameterIdentification(correspondences, signature, source);
						
						for(ProvidedParameterIdentification pcmParameter : pcmParameters) {
							Collection<DataSet> dataSets = AccessAnalysisResolutionUtil.filterDataSets(pair.getDataTargets());
							
							Optional<Parameter> param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, pcmParameter);
							SecurityLevel level = getSecurityLevelForDataSets(dataSets, codeQLSecurityLevels);
							ParameterAnnotation annotation = CodeQLModelgenerationUtil.generateParameterAnnotation(param.get(), level);
							
							annotations.add(annotation);
						}
					}
				}
			
			}
		}
		
		return annotations;
	}
	
	
	protected abstract Collection<SecurityLevel> generateSecurityLevels(Collection<DataSet> dataSets);

	protected abstract Collection<AllowedFlow> generateAllowedFlows(Configuration config);


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
