package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis;


import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.BackprojectionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser.JoanaResult2SCARParser;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class Joana2AccessAnalysisResultIntegration {

	protected final String javaModelLocation;
	protected final String joanaModelLocation;
	protected final String correspondenceModelLocation;
	protected final String joanaResultLocation;
	protected final String repositoryModelLocation;
	protected final String confidentialitySpecificationLocation;
	protected final String originBackupLocation;
	protected final String policyStyle;
	protected final String scarLocation;
	protected final String resultingValuesLocation;
	protected final String accessAnalysisJOANACorrespondencesLocation;
	protected final String scarCorrespondencesLocation;
	protected final String resultingValuesCorrespondencesLocation;
	
	public Joana2AccessAnalysisResultIntegration(String javaModelLocation, String joanaModelLocation,
			String correspondenceModelLocation, String joanaResultLocation, String repositoryModelLocation,
			String confidentialitySpecificationLocation, String originBackupLocation, String policyStyle,
			String scarLocation, String resultingValuesLocation, String accessAnalysisJOANACorrespondencesLocation,
			String scarCorrespondencesLocation, String resultingValuesCorrespondencesLocation) {
		super();
		this.javaModelLocation = javaModelLocation;
		this.joanaModelLocation = joanaModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.joanaResultLocation = joanaResultLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.confidentialitySpecificationLocation = confidentialitySpecificationLocation;
		this.originBackupLocation = originBackupLocation;
		this.policyStyle = policyStyle;
		this.scarLocation = scarLocation;
		this.resultingValuesLocation = resultingValuesLocation;
		this.accessAnalysisJOANACorrespondencesLocation = accessAnalysisJOANACorrespondencesLocation;
		this.scarCorrespondencesLocation = scarCorrespondencesLocation;
		this.resultingValuesCorrespondencesLocation = resultingValuesCorrespondencesLocation;
	}

	
	public void integrate(ResultingSpecificationResolutionFactory resolutionFactory, BackprojectionFactory backprojectionFactory) {
		Models models = Models.createModelsFromFiles(javaModelLocation, joanaModelLocation,
				correspondenceModelLocation, joanaResultLocation,
				repositoryModelLocation, confidentialitySpecificationLocation, originBackupLocation, accessAnalysisJOANACorrespondencesLocation);
		
		JoanaResult2SCARParser parser = new JoanaResult2SCARParser(models.getJavaRoot(), models.getJoanaRoot());
		SourceCodeAnalysisResult scar = parser.readJOANAOutput(models.getJoanaResult());
		
		
		ResultingSpecificationResolution extractor = resolutionFactory.generateResultingSpecificationResolution(policyStyle);
		JOANAResultingValues resultingSpec = extractor.calculateResultingSpecification(scar, parser.getScarCorrespondences());
		
		CorrespondencesResolver resolver = new CorrespondencesResolver(models.getAccessanalysisJOANACorrespondences(), extractor.getCorrespondences_ResultingValues(), parser.getScarCorrespondences(), models.getCorrespondenceRoot());
		
		Backprojector backprojector = backprojectionFactory.create(policyStyle, resolver, models.getProfile());
		backprojector.project(resultingSpec);
		
		models.updateConfidentialityModel(confidentialitySpecificationLocation, models.getConfidentiality());
		models.persistCorrespondencesAndModels(scarLocation, scar, resultingValuesLocation, resultingSpec, scarCorrespondencesLocation, parser.getScarCorrespondences(), resultingValuesCorrespondencesLocation, extractor.getCorrespondences_ResultingValues());
	
		System.out.println("Result Integration JOANA to Access Analysis Done");
	}
}
