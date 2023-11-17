package edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

public class PCMJavaCorrespondenceModelGenerationUtil {
	public static ProvidedSignature generateProvidedSignature(OperationProvidedRole provRole, OperationSignature signature) {
		ProvidedSignature provSig = PcmjavacorrespondenceFactory.eINSTANCE.createProvidedSignature();
		provSig.setProvidedRole(provRole);
		provSig.setProvidedSignature(signature);
		return provSig;
	}
	
	public static ProvidedOperationSignature2JavaMethod generateProvidedOperationSignature2JavaMethod(ProvidedSignature sig, Method javaMethod) {
		ProvidedOperationSignature2JavaMethod correspondence = PcmjavacorrespondenceFactory.eINSTANCE.createProvidedOperationSignature2JavaMethod();
		correspondence.setJavaMethod(javaMethod);
		correspondence.setPcmMethod(sig);
		return correspondence;
	}
	
	public static ProvidedParameterIdentification generateProvidedParameterIdentification(ProvidedSignature sig, Parameter param) {
		ProvidedParameterIdentification paramIdent = PcmjavacorrespondenceFactory.eINSTANCE.createProvidedParameterIdentification();
		paramIdent.setParameter(param);
		paramIdent.setProvidedSignature(sig);
		return paramIdent;
	}
	
	public static PCMParameter2JavaParameter generatePcmParameter2JavaParameter(ProvidedParameterIdentification paramIdent, edu.kit.kastel.sdq.coupling.models.java.members.Parameter param) {
		PCMParameter2JavaParameter correspondence = PcmjavacorrespondenceFactory.eINSTANCE.createPCMParameter2JavaParameter();
		correspondence.setPcmParameterIdentification(paramIdent);
		correspondence.setJavaParameter(param);
		return correspondence;
	}
	
	public static BasicComponent2Class generateBasicComponent2Class(BasicComponent component, Class clazz) {
		BasicComponent2Class correspondence = PcmjavacorrespondenceFactory.eINSTANCE.createBasicComponent2Class();
		correspondence.setComponent(component);
		correspondence.setJavaClass(clazz);
		return correspondence;
	}
	
	public static CompositeDataType2Class generateCompositeDataType2Class(CompositeDataType datatype, Class clazz) {
		CompositeDataType2Class correspondence = PcmjavacorrespondenceFactory.eINSTANCE.createCompositeDataType2Class();
		correspondence.setCompositeDataType(datatype);
		correspondence.setJavaClass(clazz);
		return correspondence;
	}
}
