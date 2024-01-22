package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

import edu.kit.kastel.sdq.coupling.models.identifier.Entity;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class ResultEntryElement<T extends Entity> {

	private final T systemElement;
	private final Level securityProperty;

	public ResultEntryElement(T systemElement, Level securityProperty) {
		super();
		this.systemElement = systemElement;
		this.securityProperty = securityProperty;
	}

	public T getSystemElement() {
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

		ResultEntryElement<?> casted = (ResultEntryElement<?>) toCompare;

		return this.systemElement.equals(casted.systemElement) && this.securityProperty.equals(casted.securityProperty);
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s)", systemElement.getName(), securityProperty.getName());
	}
}
