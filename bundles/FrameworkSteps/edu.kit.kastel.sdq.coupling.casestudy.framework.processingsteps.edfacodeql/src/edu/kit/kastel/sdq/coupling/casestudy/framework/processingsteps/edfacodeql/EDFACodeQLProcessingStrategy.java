package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfacodeql;

import edu.kit.kastel.sdq.analysiscouplingframework.exceptions.MissingPathIdentifierException;
import edu.kit.kastel.sdq.analysiscouplingframework.parser.Registry;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.ProcessingStrategy;

public class EDFACodeQLProcessingStrategy extends ProcessingStrategy {

	public EDFACodeQLProcessingStrategy(Registry registry) throws MissingPathIdentifierException {
		super(new EDFACodeQLAlignmentPS(registry), new EDFACodeQLCompletionPS(registry),
				new EDFACodeQLSourceCodeAnalysisPS(registry), new EDFACodeQLResolutionPS(registry),
				new EDFACodeQLIntegrationPS(registry));
	}

}
