package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis;

import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection.BackprojectionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser.JoanaResult2SCARParser;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

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
	protected final String scarLocation;
	protected final String resultingValuesLocation;
	protected final String edfaJoanaCorrespondenceLocation;
	protected final String scarCorrespondencesLocation;
	protected final String resultingValuesCorrespondencesLocation;
	
	public Joana2ExtendedDataFlowAnalysisResultIntegration(String javaModelLocation, String joanaModelLocation,
			String correspondenceModelLocation, String joanaResultLocation, String repositoryModelLocation,
			String originBackupLocation, String parameterAnnotationModelLocation, String dataDictionaryLocation,
			String policyStyle, String scarLocation, String resultingValuesLocation, String edfaJoanaCorrespondenceLocation, String scarCorrespondencesLocation, String resultingValuesCorrespondencesLocation) {
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
		this.scarLocation = scarLocation;
		this.resultingValuesLocation = resultingValuesLocation;
		this.edfaJoanaCorrespondenceLocation = edfaJoanaCorrespondenceLocation;
		this.scarCorrespondencesLocation = scarCorrespondencesLocation;
		this.resultingValuesCorrespondencesLocation = resultingValuesCorrespondencesLocation;
	}

	
	public void integrate() {
		
		Models models = Models.createModelsFromFiles(javaModelLocation, joanaModelLocation,
				correspondenceModelLocation, joanaResultLocation,
				repositoryModelLocation, parameterAnnotationModelLocation, dataDictionaryLocation , originBackupLocation, edfaJoanaCorrespondenceLocation);
		JoanaResult2SCARParser parser = new JoanaResult2SCARParser(models.getJavaRoot(), models.getJoanaRoot());
		SourceCodeAnalysisResult scar = parser.readJOANAOutput(models.getJoanaResult());
		
		ResultingSpecificationResolution extractor = new ResultingSpecificationResolutionFactory().generateResultingSpecificationResolution(policyStyle);
		JOANAResultingValues resultingSpec = extractor.calculateResultingSpecification(scar, parser.getScarCorrespondences());
		
		CorrespondencesResolver resolver = new CorrespondencesResolver(models.getEdfaJoanaCorrespondences(), extractor.getCorrespondences_ResultingValues(), parser.getScarCorrespondences(), models.getCorrespondenceRoot());
		
		Backprojector backprojector = BackprojectionFactory.create(policyStyle, models.getParameterAnnotations(), resolver);
		backprojector.project(resultingSpec);
		
		models.updateArchitecturalSpecification(parameterAnnotationModelLocation);
		
		models.persistCorrespondencesAndModels(scarLocation, scar, resultingValuesLocation, resultingSpec, scarCorrespondencesLocation, parser.getScarCorrespondences(), resultingValuesCorrespondencesLocation, extractor.getCorrespondences_ResultingValues());
		
		System.out.println("Result Integration CodeQL to Extended Data Flow Analysis Done");
	}
	
	
}
