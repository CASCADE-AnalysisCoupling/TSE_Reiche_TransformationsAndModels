package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications;

import org.palladiosimulator.pcm.repository.Parameter;

public class ParameterIdentification {
	
	private final ProvidedSignature signature;
	private final Parameter paramerter;
	
	public ParameterIdentification(ProvidedSignature signature, Parameter paramerter) {
		super();
		this.signature = signature;
		this.paramerter = paramerter;
	}

	public ProvidedSignature getSignature() {
		return signature;
	}

	public Parameter getParamerter() {
		return paramerter;
	}
	
}
