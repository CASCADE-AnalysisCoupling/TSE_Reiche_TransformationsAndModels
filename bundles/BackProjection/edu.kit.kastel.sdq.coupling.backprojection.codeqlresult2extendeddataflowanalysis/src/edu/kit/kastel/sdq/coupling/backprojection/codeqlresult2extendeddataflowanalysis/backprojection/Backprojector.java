package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.backprojection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;


import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class Backprojector implements Backproject{
	
	private final Repository repository;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final ExtensionRoot extensionRoot;
	private final Configuration config;
	private final PCMDataDictionary dictionary;
	private static final String DELIMITER = ";";
	
	
	public Backprojector(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ExtensionRoot extensionRoot, Configuration config, PCMDataDictionary dictionary) {
		super();
		this.repository = repository;
		this.correspondences = correspondences;
		this.extensionRoot = extensionRoot;
		this.config = config;
		this.dictionary = dictionary;
	}

	@Override
	public void project(ResultingSpecification resultingSpec) {
		for(ResultingSpecEntry resultingSpecEntry : resultingSpec.getEntries()) {
						
			//Resolve System Element
			PCMParameter2JavaParameter parameterCorrespondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(correspondences,resultingSpecEntry.getSystemElement());

			// Assumption: One annotation for one system element. If multiple: find the one with the corresponding security property - value pair. 
			ProvidedParameterCharacteristicAnnotation annot = extensionRoot.getParameterAnnotations().stream().filter(potentialAnnot -> areProvidedParameterIdentificationsEqual(potentialAnnot.getProvidedParameter(), parameterCorrespondence.getPcmParameterIdentification())).findFirst().get();
			
			for(EnumCharacteristic characteristic : annot.getCharacteristics()) {
				//Normally, check with additional info, if types assigned to securityLevel is equal, best with correspondence models. --> Resolve Security Property and fitting annotation
				Collection<Literal> resolvedLiterals = resolveLiteralsForLevel(resultingSpecEntry.getSecurityProperty(), characteristic.getEnumCharacteristicType().getType().getLiterals());
				
				if(!resolvedLiterals.isEmpty()) {
					characteristic.getValues().clear();
					characteristic.getValues().addAll(resolvedLiterals);
				}
			}
		}
	}
	
	private boolean areProvidedParameterIdentificationsEqual(ProvidedParameterIdentification extensionProvidedParameterIdent, edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification correspondenceIdentification){
			//ID AND STRING Based
		//		return extensionProvidedParameterIdent.getProvidedOperation().getOperationSignature().getId().equals(correspondenceIdentification.getProvidedSignature().getProvidedSignature().getId()) && 
//			 extensionProvidedParameterIdent.getProvidedOperation().getProvidedRole().getId().equals(correspondenceIdentification.getProvidedSignature().getProvidedRole().getId())  &&
//			 extensionProvidedParameterIdent.getParameter().getParameterName().equals(correspondenceIdentification.getParameter().getParameterName());
		
		// Object Based
		return extensionProvidedParameterIdent.getProvidedOperation().getOperationSignature().equals(correspondenceIdentification.getProvidedSignature().getProvidedSignature()) && 
				 extensionProvidedParameterIdent.getProvidedOperation().getProvidedRole().equals(correspondenceIdentification.getProvidedSignature().getProvidedRole())  &&
				 extensionProvidedParameterIdent.getParameter().equals(correspondenceIdentification.getParameter());
	}

	private Collection<Literal> resolveLiteralsForLevel(SecurityLevel securityProperty, Collection<Literal> literalsForFittingAnnotation) {
		Collection<Literal> resolvedLiterals = new HashSet<Literal>();
		
		Collection<SecurityLevel> basicLevels = CodeQLResolutionUtil.resolveBasicLevels(securityProperty, config, DELIMITER);
		resolvedLiterals = literalsForFittingAnnotation.stream().filter( literal -> basicLevels.stream().anyMatch(level -> level.getName().equals(literal.getName()))).toList();
	
		for(SecurityLevel basicLevel : basicLevels) {
			//this could be replaced by correspondence relationships between the levels of an enum and basic levels

			
			for(Literal literal : literalsForFittingAnnotation) {
				if(literal.getName().equals(basicLevel.getName())) {
					resolvedLiterals.add(literal);
				}
			}
		}
		
		return resolvedLiterals;
	}
}
