package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis;

import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection.BackprojectionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser.JoanaResult2SCARParser;

public class Joana2ExtendedDataFlowAnalysisResultIntegration {
	

	private final String javaModelLocation;
	private final String joanaModelLocation;
	private final String correspondenceModelLocation;
	private final String joanaResultLocation;
	private final String repositoryModelLocation;
	private final String originBackupLocation;
	private final String parameterAnnotationModelLocation;
	private final String dataDictionaryLocation;
	private final String policyStyle;
	
	public Joana2ExtendedDataFlowAnalysisResultIntegration(String javaModelLocation, String joanaModelLocation,
			String correspondenceModelLocation, String joanaResultLocation, String repositoryModelLocation,
			String originBackupLocation, String parameterAnnotationModelLocation, String dataDictionaryLocation,
			String policyStyle) {
		super();
		this.javaModelLocation = javaModelLocation;
		this.joanaModelLocation = joanaModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.joanaResultLocation = joanaResultLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.originBackupLocation = originBackupLocation;
		this.parameterAnnotationModelLocation = parameterAnnotationModelLocation;
		this.dataDictionaryLocation = dataDictionaryLocation;
		this.policyStyle = policyStyle;
	}

	
	public void integrate() {
		
		Models input = Models.createModelsFromFiles(javaModelLocation, joanaModelLocation,
				correspondenceModelLocation, joanaResultLocation,
				repositoryModelLocation, parameterAnnotationModelLocation, dataDictionaryLocation , originBackupLocation);
		JoanaResult2SCARParser parser = new JoanaResult2SCARParser(input.getJavaRoot(), input.getJoanaRoot());
		SourceCodeAnalysisResult scar = parser.readJOANAOutput(input.getJoanaResult());
		
		ResultingSpecificationResolution extractor = ResultingSpecificationResolutionFactory.generateResultingSpecificationResolution(policyStyle);
		ResultingSpecification resultingSpec = extractor.calculateResultingSpecification(scar);
		
		Backprojector backprojector = BackprojectionFactory.create(policyStyle, input.getRepository(), input.getCorrespondenceRoot(), input.getParameterAnnotations());
		backprojector.project(resultingSpec);
		
		input.updateArchitecturalSpecification(parameterAnnotationModelLocation);
		
		System.out.println("Result Integration CodeQL to Extended Data Flow Analysis Done");
	}
	
	
}
