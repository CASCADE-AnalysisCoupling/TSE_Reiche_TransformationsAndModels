package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis;


import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.BackprojectionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser.JoanaResult2SCARParser;

public class Joana2AccessAnalysisResultIntegration {


	protected final String javaModelLocation;
	protected final String joanaModelLocation;
	protected final String correspondenceModelLocation;
	protected final String joanaResultLocation;
	protected final String repositoryModelLocation;
	protected final String confidentialitySpecificationLocation;
	protected final String originBackupLocation;
	protected final String policyStyle;
	
	
	public Joana2AccessAnalysisResultIntegration(String javaModelLocation, String joanaModelLocation,
			String correspondenceModelLocation, String joanaResultLocation, String repositoryModelLocation,
			String confidentialitySpecificationLocation, String policyStyle, String originBackupLocation) {
		super();
		this.javaModelLocation = javaModelLocation;
		this.joanaModelLocation = joanaModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.joanaResultLocation = joanaResultLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.confidentialitySpecificationLocation = confidentialitySpecificationLocation;
		this.policyStyle = policyStyle;
		this.originBackupLocation = originBackupLocation;
	}
	
	public void integrate(ResultingSpecificationResolutionFactory resolutionFactory, BackprojectionFactory backprojectionFactory) {
		Models input = Models.createModelsFromFiles(javaModelLocation, joanaModelLocation,
				correspondenceModelLocation, joanaResultLocation,
				repositoryModelLocation, confidentialitySpecificationLocation, originBackupLocation);
		
		JoanaResult2SCARParser parser = new JoanaResult2SCARParser(input.getJavaRoot(), input.getJoanaRoot());
		SourceCodeAnalysisResult scar = parser.readJOANAOutput(input.getJoanaResult());
		
		
		ResultingSpecificationResolution extractor = resolutionFactory.generateResultingSpecificationResolution(policyStyle);
		ResultingSpecification resultingSpec = extractor.calculateResultingSpecification(scar);
		
		Backprojector backprojector = backprojectionFactory.create(policyStyle, input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile());
		backprojector.project(resultingSpec);
		
		input.updateConfidentialityModel(confidentialitySpecificationLocation);
	
		System.out.println("Result Integration JOANA to Access Analysis Done");
	}
}
