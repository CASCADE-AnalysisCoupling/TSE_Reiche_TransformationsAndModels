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

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
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
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.utils.AccessAnalysisResolutionUtil;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessanalysiscodeqlcorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.Correspondences_AccessAnalysisCodeQL;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.util.AccessanalysiscodeqlcorrespondenceSwitch;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.labeledtaintflow.CodeQLLabeledTaintFlowUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceUtil;

public abstract class AccessAnalysis2CodeQLSecurityGenerator {



	private final TainttrackingRoot root;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final Correspondences_AccessAnalysisCodeQL securityCorrespondences;
	private final Configurations codeQL_Configurations;


	protected static final String SUBLEVEL_DELIMITER = ";";
	
	
	public AccessAnalysis2CodeQLSecurityGenerator(ConfidentialitySpecification accessAnalysisSpec,
			PCMJavaCorrespondenceRoot correspondences) {
		super();
		this.root = CodeQLModelgenerationUtil.generateDataFlowRoot();
		this.accessAnalysisSpec = accessAnalysisSpec;
		this.correspondences = correspondences;
		this.securityCorrespondences = AccessanalysiscodeqlcorrespondenceFactory.eINSTANCE.createCorrespondences_AccessAnalysisCodeQL();
		this.codeQL_Configurations = ConfigurationrepresentationUtil.generateConfigurations();
	}
	
	public void generateCodeQLConfiguration(Collection<StereotypeApplication> steretypeApplications, JavaRoot sourceCode, FullyImplicitConfiguration accessAnalysisConfiguration) {
		Query query = CodeQLModelgenerationUtil.generateQuery();
		
		HybridConfiguration codeQL_Configuration = ConfigurationrepresentationUtil.generatedHybridConfiguration(query, Collections.singleton(sourceCode));
		codeQL_Configurations.getConfigurations().add(codeQL_Configuration);
		
		securityCorrespondences.getConfigurationCorrespondences_AccessAnalysisCodeQL().add(AccessAnalysisCodeQLCorrespondenceUtil.createConfigurationCorrespondence(accessAnalysisConfiguration, codeQL_Configuration));
		
		Collection<SecurityLevel> appliedSecurityLevels = generateSecurityLevels(AccessAnalysisResolutionUtil.filterDataSets(accessAnalysisSpec.getDataIdentifier()));
		query.getAppliedSecurityLevel().addAll(appliedSecurityLevels);
		Collection<AllowedFlow> allowedFlows = generateAllowedFlows(query);
		Collection<SecurityLevelAnnotation> annotations = generateSecurityLevelAnnotations(steretypeApplications, appliedSecurityLevels);
		
		
		query.getAllowedFlows().getAllowedFlows().addAll(allowedFlows);
		query.getSecurityLevelAnnotations().addAll(annotations);
		
		root.getQueries().add(query);
		AccessAnalysisCodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(accessAnalysisConfiguration, codeQL_Configuration, securityCorrespondences);
		
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
							securityCorrespondences.getDataSetSecurityLevelCorrespondence().add(AccessAnalysisCodeQLCorrespondenceUtil.createDataSetSecurityLevelCorrespondence(dataSets, level));
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

	protected abstract Collection<AllowedFlow> generateAllowedFlows(Query config);


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
	
	public Correspondences_AccessAnalysisCodeQL getSecurityCorrespondences() {
		return securityCorrespondences;
	}

	public Configurations getCodeQLConfigurations() {
		return codeQL_Configurations;
	}
	
}
