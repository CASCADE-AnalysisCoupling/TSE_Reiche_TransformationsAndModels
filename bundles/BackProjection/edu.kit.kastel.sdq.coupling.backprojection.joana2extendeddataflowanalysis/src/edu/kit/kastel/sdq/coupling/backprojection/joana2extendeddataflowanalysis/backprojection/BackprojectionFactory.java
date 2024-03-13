package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;


import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class BackprojectionFactory {

	private BackprojectionFactory() {};
	
	public static Backprojector create(String policyStyle, Repository repository, PCMJavaCorrespondenceRoot correspondences, ParameterAnnotations parameterAnnotations) {
		Backprojector backprojector;
		
		switch (policyStyle) {
		case "HighLow": {
			backprojector = new Backprojector4HighLow(repository, correspondences, parameterAnnotations);
			break;
		} 
		case "Disjunctive": {
			backprojector = new Backprojector4AccessAnalysis(repository, correspondences, parameterAnnotations);
			break;
		} 
		case "Conjunctive": {
			throw new UnsupportedOperationException("Conjunctive Policy Style not yet supported");
		}
		default:
			throw new IllegalArgumentException("Extractor not implemented for policy style " + policyStyle);
		}
		
		return backprojector;
	}
	
	
}
