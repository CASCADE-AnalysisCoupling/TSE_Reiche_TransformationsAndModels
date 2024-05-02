package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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


import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util.EDFACodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public abstract class ExtendedDataFlowAnalysis2CodeQLSecurityGenerator {

	protected final TainttrackingRoot root;
	protected final ParameterAnnotations extensionRoot;
	protected final PCMJavaCorrespondenceRoot correspondences;
	protected final PCMDataDictionary dictionary;
	protected final Correspondences_EDFACodeQL edfaCodeQLCorrespondences;
	protected static final String SUBLEVEL_DELIMITER = ";";
	protected static final boolean HIGH_CONJUNCTIVE = false;
	
	
	public ExtendedDataFlowAnalysis2CodeQLSecurityGenerator(ParameterAnnotations extensionRoot,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super();
		this.root = CodeQLModelgenerationUtil.generateDataFlowRoot();
		this.extensionRoot = extensionRoot;
		this.correspondences = correspondences;
		this.dictionary = dictionary;
		this.edfaCodeQLCorrespondences = EDFACodeQLCorrespondenceUtil.createCorrespondences();
	}

	public void generateCodeQLConfiguration() {
		Configuration config = CodeQLModelgenerationUtil.generateConfiguration();
		
		Enumeration targetEnum = dictionary.getCharacteristicEnumerations().get(0);
		Collection<SecurityLevel> appliedSecurityLevels = generateSecurityLevels(targetEnum.getLiterals());
		config.getAppliedSecurityLevel().addAll(appliedSecurityLevels);
		Collection<AllowedFlow> allowedFlows = generateAllowedFlows(config);
		Collection<SecurityLevelAnnotation> annotations = generateSecurityLevelAnnotations(appliedSecurityLevels);

		
		config.getAllowedFlows().addAll(allowedFlows);
		config.getSecurityLevelAnnotations().addAll(annotations);

		root.getConfigurations().add(config);
		EDFACodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(extensionRoot, config, edfaCodeQLCorrespondences);
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

	protected abstract Collection<AllowedFlow> generateAllowedFlows(Configuration config);

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
}
