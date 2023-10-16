package org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

public class ProvidedSignature {


	private final OperationProvidedRole role;
	private final OperationSignature signature;
	
	public ProvidedSignature(OperationProvidedRole role, OperationSignature signature) {
		super();
		this.role = role;
		this.signature = signature;
	}
	
	public OperationProvidedRole getRole() {
		return role;
	}
	public OperationSignature getSignature() {
		return signature;
	}
}
