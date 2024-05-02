package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfacodeql;

import edu.kit.kastel.sdq.analysiscouplingframework.exceptions.MissingPathIdentifierException;
import edu.kit.kastel.sdq.analysiscouplingframework.parser.Configuration;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.ProcessingStrategy;

public class EDFACodeQLConfiguration extends Configuration{

	public EDFACodeQLConfiguration(String configFile) {
		super(configFile);
	}
	
	@Override
	protected ProcessingStrategy createStrategy() throws MissingPathIdentifierException {
		return new EDFACodeQLProcessingStrategy(super.registry);
	}

}
