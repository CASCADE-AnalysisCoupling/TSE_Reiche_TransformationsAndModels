package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Enumeration;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util.EDFACodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;

public abstract class ExtendedDataFlowAnalysis2CodeQLSecurityGenerator {

	protected final TainttrackingRoot root;
	protected final ParameterAnnotations extensionRoot;
	protected final PCMJavaCorrespondenceRoot correspondences;
	protected final PCMDataDictionary dictionary;
	protected final Correspondences_EDFACodeQL edfaCodeQLCorrespondences;
	protected static final String SUBLEVEL_DELIMITER = ";";
	protected static final boolean HIGH_CONJUNCTIVE = false;
	private final Configurations codeQL_Configurations;


	public ExtendedDataFlowAnalysis2CodeQLSecurityGenerator(ParameterAnnotations extensionRoot,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super();
		this.root = CodeQLModelgenerationUtil.generateDataFlowRoot();
		this.extensionRoot = extensionRoot;
		this.correspondences = correspondences;
		this.dictionary = dictionary;
		this.edfaCodeQLCorrespondences = EDFACodeQLCorrespondenceUtil.createCorrespondences();
		this.codeQL_Configurations = ConfigurationrepresentationUtil.generateConfigurations();
	}

	public void generateCodeQLConfiguration(JavaRoot sourceCode, FullyImplicitConfiguration edfa_configuration) {
		Query query = CodeQLModelgenerationUtil.generateQuery();
		HybridConfiguration codeQL_Configuration = ConfigurationrepresentationUtil.generatedHybridConfiguration(query, Collections.singleton(sourceCode));
		codeQL_Configurations.getConfigurations().add(codeQL_Configuration);
		
		Enumeration targetEnum = dictionary.getCharacteristicEnumerations().get(0);
		Collection<SecurityLevel> appliedSecurityLevels = generateSecurityLevels(targetEnum.getLiterals());
		query.getAppliedSecurityLevel().addAll(appliedSecurityLevels);
		Collection<AllowedFlow> allowedFlows = generateAllowedFlows(query);
		Collection<SecurityLevelAnnotation> annotations = generateSecurityLevelAnnotations(appliedSecurityLevels);

		
		query.getAllowedFlows().getAllowedFlows().addAll(allowedFlows);
		query.getSecurityLevelAnnotations().addAll(annotations);
		
		
		root.getQueries().add(query);
		EDFACodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(edfa_configuration, codeQL_Configuration, edfaCodeQLCorrespondences);
	}

	private Collection<SecurityLevelAnnotation> generateSecurityLevelAnnotations(
			Collection<SecurityLevel> codeQLSecurityLevels) {

		Collection<SecurityLevelAnnotation> annotations = new ArrayList<SecurityLevelAnnotation>();

		//for now, assume that no parameter is annotated more than once for evaluation purposes. Would need to perform multiple annotations.
		for(edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation annotation : extensionRoot.getAnnotations()) {
			
			if(annotation.getParameterIdentification() instanceof ProvidedOperationParameterIdentification) {
				ProvidedOperationParameterIdentification provParam = (ProvidedOperationParameterIdentification) annotation.getParameterIdentification();
				OperationSignature signature = (OperationSignature) provParam.getOperationSignature();
				

				//Assume for eval purposes that only one characteristic is annotated which contains the 
				//elements from which the security levels are calculated from.
				for (EnumCharacteristic characteristic : annotation.getCharacteristics()) {

					ProvidedParameterIdentification pcmParameter = PCMJavaCorrespondenceResolutionUtils.getParameterIdentification(correspondences, provParam.getProvidedRole(), signature,
							provParam.getParameter().getParameterName());
					Optional<Parameter> param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, pcmParameter);
					SecurityLevel level = getSecurityLevelForLiterals(characteristic.getValues(), codeQLSecurityLevels);
					ParameterAnnotation codeqlAnnotation = CodeQLModelgenerationUtil.generateParameterAnnotation(param.get(),
							level);

					annotations.add(codeqlAnnotation);
				}
			} else if(annotation.getParameterIdentification() instanceof GeneralOperationParameterIdentification) {
				GeneralOperationParameterIdentification generalParameterIdent = (GeneralOperationParameterIdentification) annotation.getParameterIdentification();
				
				Collection<BasicComponent> correspondingBasicComponents = correspondences.getBasiccomponent2class().stream().map(entry -> entry.getComponent()).collect(Collectors.toList());
				
				for(BasicComponent component : correspondingBasicComponents) {
					Collection<OperationProvidedRole> operationProvidedRoles = component.getProvidedRoles_InterfaceProvidingEntity().stream().filter(OperationProvidedRole.class::isInstance).map(OperationProvidedRole.class::cast).collect(Collectors.toList());
					
					for(OperationProvidedRole role : operationProvidedRoles) {
						if(role.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface().contains(generalParameterIdent.getOperationSignature())) {

							ProvidedParameterIdentification correspondenceParameterIdent = PCMJavaCorrespondenceResolutionUtils.getParameterIdentification(correspondences, role, generalParameterIdent.getOperationSignature(), generalParameterIdent.getParameter().getParameterName());
							
							Optional<Parameter> javaParam = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, correspondenceParameterIdent);
							
							if(javaParam.isEmpty()){
								throw new RuntimeException("%s:%s not found".formatted(generalParameterIdent.getOperationSignature().getEntityName(), generalParameterIdent.getParameter().getParameterName()));
							}
							
							for (EnumCharacteristic characteristic : annotation.getCharacteristics()) {

								SecurityLevel level = getSecurityLevelForLiterals(characteristic.getValues(), codeQLSecurityLevels);
								ParameterAnnotation codeqlAnnotation = CodeQLModelgenerationUtil.generateParameterAnnotation(javaParam.get(),
										level);

								annotations.add(codeqlAnnotation);
							}
							
						}
					}
				}
			}
		}
	
		return annotations;
	}

	
	protected abstract Collection<SecurityLevel> generateSecurityLevels(Collection<Literal> literals);

	protected abstract Collection<AllowedFlow> generateAllowedFlows(Query config);

	 SecurityLevel getSecurityLevelForLiterals(Collection<Literal> literals,
			Collection<SecurityLevel> securityLevels) {
		Collection<Literal> sortedDataSets = literals.stream().sorted(Comparator.comparing(Literal::getName))
				.collect(Collectors.toList());
		List<String> dataSetsNames = sortedDataSets.stream().map(dataset -> dataset.getName())
				.collect(Collectors.toList());
		String combinedDataSetName = String.join(SUBLEVEL_DELIMITER, dataSetsNames);

		for (SecurityLevel level : securityLevels) {
			if (level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}

	public TainttrackingRoot getRoot() {
		return root;
	}

	public PCMJavaCorrespondenceRoot getCorrespondences() {
		return correspondences;
	}
	
	public Correspondences_EDFACodeQL getEDFACodeQLCorrespondences() {
		return edfaCodeQLCorrespondences;
	}
	
	public Configurations getCodeQL_Configurations() {
		return codeQL_Configurations;
	}
}
