package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils;

import java.util.Collection;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.BasicComponent;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
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
}
