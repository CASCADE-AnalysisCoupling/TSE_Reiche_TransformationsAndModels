package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class ResultEntryElement {

	private final Parameter systemElement;
	private final Level securityProperty;

	public ResultEntryElement(Parameter systemElement, Level securityProperty) {
		super();
		this.systemElement = systemElement;
		this.securityProperty = securityProperty;
	}

	public Parameter getSystemElement() {
		return systemElement;
	}

	public Level getSecurityProperty() {
		return securityProperty;
	}

	//According to https://www.baeldung.com/java-hashcode
	@Override
	public int hashCode() {
		int hash = 7;

		hash = 31 * hash + (systemElement == null ? 0 : systemElement.hashCode());
		hash = 31 * hash + (securityProperty == null ? 0 : securityProperty.hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object toCompare) {
		
		if (toCompare == null) {
			return false;
		}
		if (!(toCompare instanceof ResultEntryElement)) {
			return false;
		}
		if (toCompare == this) {
			return true;
		}

		ResultEntryElement casted = (ResultEntryElement) toCompare;

		return this.systemElement.equals(casted.systemElement) && this.securityProperty.equals(casted.securityProperty);
	}
}
