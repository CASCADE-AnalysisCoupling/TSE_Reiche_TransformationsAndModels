package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeDataType;

import edu.kit.kastel.sdq.coupling.models.codeql.code.Class;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter;

public class Correspondences {
	private final Map<BasicComponent, Class> classComponentCorrespondences;
	private final Map<ProvidedSignature, Method> methodProvidedSignatureCorrespondences;
	private final Map<CompositeDataType, Class> classCompositeTypeCorrespondences;
	private final Map<ParameterIdentification, Parameter> parameterToParameterCorrespondences;
	
	public Correspondences() {
		classComponentCorrespondences = new HashMap<BasicComponent, Class>();
		methodProvidedSignatureCorrespondences = new HashMap<ProvidedSignature, Method>();
		classCompositeTypeCorrespondences = new HashMap<CompositeDataType, Class>();
		parameterToParameterCorrespondences = new HashMap<ParameterIdentification, Parameter>();
	}

	public Map<BasicComponent, Class> getClassComponentCorrespondences() {
		return classComponentCorrespondences;
	}

	public Map<ProvidedSignature, Method> getMethodProvidedSignatureCorrespondences() {
		return methodProvidedSignatureCorrespondences;
	}

	public Map<CompositeDataType, Class> getClassCompositeTypeCorrespondences() {
		return classCompositeTypeCorrespondences;
	}

	public Map<ParameterIdentification, Parameter> getParameterToParameterCorrespondences() {
		return parameterToParameterCorrespondences;
	}
	
	
	
	
}
