package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis;


import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.backprojection.Backproject;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.CodeQLResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;

public class CodeQL2ExtendedDataFlowAnalysisResultIntegration {


	private final String policyStyle;
	private final String javaModelLocation;
	private final String codeQLModelLocation;
	private final String correspondenceModelLocation;
	private final String codeQLResultLocation;
	private final String parameterAnnotationModelLocation;
	private final String dataDictionaryLocation;
	private final String originBackupLocation;
	private final String repositoryModelLocation;
	protected final String scarLocation;
	protected final String resultingValuesLocation;
	protected final String edfaCodeQLCorrespondenceLocation;
	protected final String scarCorrespondencesLocation;
	protected final String resultingValuesCorrespondencesLocation;
	
	
	
	public CodeQL2ExtendedDataFlowAnalysisResultIntegration(String javaModelLocation,
			String codeQLModelLocation, String correspondenceModelLocation, String codeQLResultLocation,
			String parameterAnnotationModelLocation, String dataDictionaryLocation, String originBackupLocation,
			String repositoryModelLocation, String policyStyle, String scarLocation, String resultingValuesLocation, String edfaCodeQLCorrespondenceLocation, String scarCorrespondencesLocation, String resultingValuesCorrespondencesLocation) {
		this.policyStyle = policyStyle;
		this.javaModelLocation = javaModelLocation;
		this.codeQLModelLocation = codeQLModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.codeQLResultLocation = codeQLResultLocation;
		this.parameterAnnotationModelLocation = parameterAnnotationModelLocation;
		this.dataDictionaryLocation = dataDictionaryLocation;
		this.originBackupLocation = originBackupLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.scarLocation = scarLocation;
		this.resultingValuesLocation = resultingValuesLocation;
		this.edfaCodeQLCorrespondenceLocation = edfaCodeQLCorrespondenceLocation;
		this.scarCorrespondencesLocation = scarCorrespondencesLocation;
		this.resultingValuesCorrespondencesLocation = resultingValuesCorrespondencesLocation;
	}
	
	public void integrate() {
		
		Models models = Models.createModelsFromFiles(javaModelLocation,
				codeQLModelLocation, 
				correspondenceModelLocation,
				codeQLResultLocation, 
				repositoryModelLocation,
				parameterAnnotationModelLocation,
				dataDictionaryLocation,
				originBackupLocation,
				edfaCodeQLCorrespondenceLocation);
		
		ResultingSpecificationResolution resolution = ResultingSpecificationResolutionFactory.generateResultingSpecificationResolution(policyStyle);
		CodeQLResultingSpecificationExtractor extractor = new CodeQLResultingSpecificationExtractor(resolution);
		
		CodeQLResultingValues resultingValues = extractor.extract(models.getTainttrackingRoot(), models.getJavaRoot(), models.getCodeQLResult());
		
		CorrespondencesResolver resolver = new CorrespondencesResolver(models.getEdfaCodeQLCorrespondences(), resolution.getResultingValueCorrespondences(), extractor.getSCARCorrespondence(), models.getCorrespondenceRoot());
		Backproject backprojector = new Backprojector(models.getRepository(), models.getCorrespondenceRoot(), models.getParameterAnnotations(), models.getTainttrackingRoot().getConfigurations().get(0), models.getDataDictionary(), resolver);
		backprojector.project(resultingValues);
		models.updateSpecification(parameterAnnotationModelLocation);
		models.persistCorrespondencesAndModels(scarLocation, extractor.getSourceCodeAnalysisResult(), resultingValuesLocation,resultingValues ,scarCorrespondencesLocation, extractor.getSCARCorrespondence(), resultingValuesCorrespondencesLocation, resolution.getResultingValueCorrespondences());
		
		System.out.println("Result Integration CodeQL to Access Analysis Done");
	}
}
