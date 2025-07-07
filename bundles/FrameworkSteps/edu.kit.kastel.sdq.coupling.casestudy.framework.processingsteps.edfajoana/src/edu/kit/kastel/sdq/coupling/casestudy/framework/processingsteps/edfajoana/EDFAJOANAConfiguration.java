package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfajoana;

import edu.kit.kastel.sdq.analysiscouplingframework.exceptions.MissingPathIdentifierException;
import edu.kit.kastel.sdq.analysiscouplingframework.parser.Configuration;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.ProcessingStrategy;

public class EDFAJOANAConfiguration extends Configuration{

	public EDFAJOANAConfiguration(String configFile) {
		super(configFile);
	}
	
	@Override
	protected ProcessingStrategy createStrategy() throws MissingPathIdentifierException {
		return new EDFAJOANAProcessingStrategy(super.registry);
	}

}
