package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class ResultingSpecEntry {
	
	private SecurityLevel securityProperty;
	private final Parameter systemElement;
	
	public ResultingSpecEntry(SecurityLevel securityProperty, Parameter systemElement) {
		super();
		this.securityProperty = securityProperty;
		this.systemElement = systemElement;
	}

	public SecurityLevel getSecurityProperty() {
		return securityProperty;
	}

	public Parameter getSystemElement() {
		return systemElement;
	}
	
	public void setSecurityProperty(SecurityLevel securityProperty) {
		this.securityProperty = securityProperty;
	}
}
