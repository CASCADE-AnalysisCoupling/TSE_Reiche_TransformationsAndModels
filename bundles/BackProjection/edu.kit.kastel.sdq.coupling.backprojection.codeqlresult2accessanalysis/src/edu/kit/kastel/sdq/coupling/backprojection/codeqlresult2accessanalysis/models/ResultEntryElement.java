package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public class ResultEntryElement {

	private final Parameter systemElement;
	private final SecurityLevel securityProperty;
	
	
	public ResultEntryElement(Parameter systemElement, SecurityLevel securityProperty) {
		super();
		this.systemElement = systemElement;
		this.securityProperty = securityProperty;
	}
	
	public Parameter getSystemElement() {
		return systemElement;
	}
	
	public SecurityLevel getSecurityProperty() {
		return securityProperty;
	}
	
	
}
