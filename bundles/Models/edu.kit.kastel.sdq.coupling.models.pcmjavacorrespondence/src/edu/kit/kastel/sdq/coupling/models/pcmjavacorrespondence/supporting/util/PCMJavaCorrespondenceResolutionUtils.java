package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util;

import java.util.Collection;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

public class PCMJavaCorrespondenceResolutionUtils {

	public static Method getMethod(PCMJavaCorrespondenceRoot root, ProvidedSignature providedSignature) {
		return root.getProvidedoperationsignature2javamethod().stream()
				.filter(entry -> entry.getPcmMethod().equals(providedSignature))
				.map(entry -> entry.getJavaMethod())
				.findFirst().get();
	}
	
	public static Collection<ProvidedParameterIdentification> getProvidedParameters(PCMJavaCorrespondenceRoot root){
		return root.getPcmparameter2javaparameter().stream().map(entry -> entry.getPcmParameterIdentification()).collect(Collectors.toList());
	}
	
	public static Parameter getJavaParameters(PCMJavaCorrespondenceRoot root, ProvidedParameterIdentification parameterIdent) {
		return root.getPcmparameter2javaparameter().stream().filter(entry -> entry.getPcmParameterIdentification().equals(parameterIdent)).map(entry -> entry.getJavaParameter()).findFirst().get();
	}
	
	public static Collection<BasicComponent> BasicComponent2JavaClass_getBasicComponents(PCMJavaCorrespondenceRoot root){
		return root.getBasiccomponent2class().stream().map(entry -> entry.getComponent()).collect(Collectors.toList());
	}
	
	public static PCMParameter2JavaParameter getParameterCorrespondence(PCMJavaCorrespondenceRoot root, Parameter parameter) {
		return root.getPcmparameter2javaparameter().stream().filter(corr -> corr.getJavaParameter().equals(parameter)).findFirst().get();
	}
	
	public static PCMParameter2JavaParameter getParameterCorrespondence(PCMJavaCorrespondenceRoot root, ProvidedParameterIdentification parameter) {
		return root.getPcmparameter2javaparameter().stream().filter(corr -> corr.getPcmParameterIdentification().equals(parameter)).findFirst().get();
	}
	
	public static OperationInterface2Interface getOperationInterface2InterfaceCorrespondence(PCMJavaCorrespondenceRoot root, OperationInterface interf) {
		return root.getOperationInterface2interface().stream().filter(corr -> corr.getPcmInterface().equals(interf)).findFirst().get();
	}
	
	public static ProvidedParameterIdentification getParameterIdentification(PCMJavaCorrespondenceRoot correspondenceRoot, OperationSignature signature, String parameterName) {
		Collection<ProvidedParameterIdentification> generatedParameterIdentifications = PCMJavaCorrespondenceResolutionUtils.getProvidedParameters(correspondenceRoot);

		for (ProvidedParameterIdentification identification : generatedParameterIdentifications) {
			if (identification.getProvidedSignature().getProvidedSignature().equals(signature)
					&& identification.getParameter().getParameterName().equals(parameterName)) {
				return identification;
			}
		}
		return null;
	}
	
	public static ProvidedParameterIdentification getParameterIdentification(PCMJavaCorrespondenceRoot correspondenceRoot, OperationProvidedRole role, OperationSignature signature, String parameterName) {
		Collection<ProvidedParameterIdentification> generatedParameterIdentifications = PCMJavaCorrespondenceResolutionUtils.getProvidedParameters(correspondenceRoot);
		
		for (ProvidedParameterIdentification identification : generatedParameterIdentifications) {
			if (identification.getProvidedSignature().getProvidedRole().equals(role) 
					&& identification.getProvidedSignature().getProvidedSignature().equals(signature)
					&& identification.getParameter().getParameterName().equals(parameterName)) {
				return identification;
			}
		}
		return null;
	}
}
