package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.CodeQLResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolutionFactory;

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
	
	
	public CodeQL2ExtendedDataFlowAnalysisResultIntegration(String policyStyle, String javaModelLocation,
			String codeQLModelLocation, String correspondenceModelLocation, String codeQLResultLocation,
			String parameterAnnotationModelLocation, String dataDictionaryLocation, String originBackupLocation,
			String repositoryModelLocation) {
		this.policyStyle = policyStyle;
		this.javaModelLocation = javaModelLocation;
		this.codeQLModelLocation = codeQLModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.codeQLResultLocation = codeQLResultLocation;
		this.parameterAnnotationModelLocation = parameterAnnotationModelLocation;
		this.dataDictionaryLocation = dataDictionaryLocation;
		this.originBackupLocation = originBackupLocation;
		this.repositoryModelLocation = repositoryModelLocation;
	}
	
	public void integrate() {
		
		Models input = Models.createModelsFromFiles(javaModelLocation,
				codeQLModelLocation, 
				correspondenceModelLocation,
				codeQLResultLocation, 
				repositoryModelLocation,
				parameterAnnotationModelLocation,
				dataDictionaryLocation,
				originBackupLocation);
		
		ResultingSpecificationResolution resolution = ResultingSpecificationResolutionFactory.generateResultingSpecificationResolution(policyStyle, input.getTainttrackingRoot().getConfigurations().get(0));
		CodeQLResultingSpecificationExtractor extractor = new CodeQLResultingSpecificationExtractor(resolution);
		
		ResultingSpecification resultingSpecification = extractor.extract(input.getTainttrackingRoot(), input.getJavaRoot(), input.getCodeQLResult());
	}
}
