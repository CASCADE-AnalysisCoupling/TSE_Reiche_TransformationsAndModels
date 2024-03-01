package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class ResultingSpecEntry {


	private final Parameter systemElement;
	private Level securityProperty;
	private final EntryPoint entryPoint;
	
	public ResultingSpecEntry(Parameter systemElement, Level securityProperty, EntryPoint entryPoint) {
		super();
		this.systemElement = systemElement;
		this.securityProperty = securityProperty;
		this.entryPoint = entryPoint;
	}

	public Parameter getSystemElement() {
		return systemElement;
	}

	public Level getSecurityProperty() {
		return securityProperty;
	}

	public void setSecurityProperty(Level securityProperty) {
		this.securityProperty = securityProperty;
	}

	public EntryPoint getEntryPoint() {
		return entryPoint;
	}
	
	@Override
	public String toString() {
		return String.format("(%s:%s,%s,%s)", systemElement.getName(), systemElement.getType().getName(), securityProperty.getName(), entryPoint.getId());
	}
}
