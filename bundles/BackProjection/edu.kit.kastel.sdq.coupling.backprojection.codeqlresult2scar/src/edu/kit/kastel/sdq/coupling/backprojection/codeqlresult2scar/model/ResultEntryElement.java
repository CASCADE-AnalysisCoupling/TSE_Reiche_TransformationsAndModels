package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class ResultEntryElement<T> {

	private final T systemElement;
	private final SecurityLevel securityProperty;
	
	
	public ResultEntryElement(T systemElement, SecurityLevel securityProperty) {
		super();
		this.systemElement = systemElement;
		this.securityProperty = securityProperty;
	}
	
	public T getSystemElement() {
		return systemElement;
	}
	
	public SecurityLevel getSecurityProperty() {
		return securityProperty;
	}
	
	
}
