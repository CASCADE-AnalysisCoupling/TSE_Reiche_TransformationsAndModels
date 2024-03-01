package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class ResultingSpecEntry {
	
	private SecurityLevel securityProperty;
	private final Parameter systemElement;
	private final Configuration config;
	
	public ResultingSpecEntry(SecurityLevel securityProperty, Parameter systemElement, Configuration config) {
		super();
		this.securityProperty = securityProperty;
		this.systemElement = systemElement;
		this.config = config;
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
	
	public Configuration getConfiguration() {
		return config;
	}
}
