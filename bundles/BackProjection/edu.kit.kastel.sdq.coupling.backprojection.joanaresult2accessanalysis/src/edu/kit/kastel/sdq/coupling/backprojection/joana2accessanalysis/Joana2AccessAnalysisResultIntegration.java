package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis;


import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.BackprojectionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.resultingspecificationresolution.ResultingSpecificationResolution4AccessAnalysis;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser.JoanaResult2SCARParser;

public class Joana2AccessAnalysisResultIntegration {


	private final String javaModelLocation;
	private final String joanaModelLocation;
	private final String correspondenceModelLocation;
	private final String joanaResultLocation;
	private final String repositoryModelLocation;
	private final String confidentialitySpecificationLocation;
	private final String originBackupLocation;
	private final String policyStyle;
	
	
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
	
	public void integrate() {
		Models input = Models.createModelsFromFiles(javaModelLocation, joanaModelLocation,
				correspondenceModelLocation, joanaResultLocation,
				repositoryModelLocation, confidentialitySpecificationLocation, originBackupLocation);
		
		JoanaResult2SCARParser parser = new JoanaResult2SCARParser(input.getJavaRoot(), input.getJoanaRoot());
		
		
		SourceCodeAnalysisResult scar = parser.readJOANAOutput(input.getJoanaResult());
		
		ResultingSpecificationResolution extractor = new ResultingSpecificationResolution4AccessAnalysis();
		ResultingSpecification resultingSpec = extractor.calculateResultingSpecification(scar);
		
		Backprojector backprojector = BackprojectionFactory.create(policyStyle, input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile());
		backprojector.project(resultingSpec);
		
		input.updateConfidentialityModel(confidentialitySpecificationLocation);
	
	}
}
