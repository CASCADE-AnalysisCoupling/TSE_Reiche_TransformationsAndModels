package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfajoana;

import edu.kit.kastel.sdq.analysiscouplingframework.exceptions.MissingPathIdentifierException;
import edu.kit.kastel.sdq.analysiscouplingframework.parser.Registry;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.ProcessingStrategy;

public class EDFAJOANAProcessingStrategy extends ProcessingStrategy {

	public EDFAJOANAProcessingStrategy(Registry registry) throws MissingPathIdentifierException {
		super(new EDFAJOANAAlignmentPS(registry), new EDFAJOANACompletionPS(registry),
				new EDFAJOANASourceCodeAnalysisPS(registry), new EDFAJOANAResolutionPS(registry),
				new EDFAJOANAIntegrationPS(registry));
	}

}
