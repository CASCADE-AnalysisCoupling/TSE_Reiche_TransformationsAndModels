package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection.Backproject;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.CodeQLResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution4AccessAnalysis;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution4ConjunctivePowerset;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution4HighLow;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolutionFactory;

public class CodeQL2AccessAnalysisResultIntegration {

	
	public CodeQL2AccessAnalysisResultIntegration(String policyStyle, String javaModelLocation, String codeQLModelLocation,
			String correspondenceModelLocation, String resultFileLocation, String repositoryModelLocation, String confidentialitySpecificationLocation,
			String originBackupLocation) {
		super();
		this.policyStyle = policyStyle;
		this.javaModelLocation = javaModelLocation;
		this.codeQLModelLocation = codeQLModelLocation;
		this.correspondenceModelLocation = correspondenceModelLocation;
		this.resultFileLocation = resultFileLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.confidentialitySpecificationLocation = confidentialitySpecificationLocation;
		this.originBackupLocation = originBackupLocation;
	}


	private final String policyStyle;
	private final String javaModelLocation;
	private final String codeQLModelLocation;
	private final String correspondenceModelLocation;
	private final String resultFileLocation;
	private final String confidentialitySpecificationLocation;
	private final String originBackupLocation;
	private final String repositoryModelLocation;
	
	public void performResultIntegration() {
		Models input = Models.createModelsFromFiles(javaModelLocation,
				codeQLModelLocation, 
				correspondenceModelLocation,
				resultFileLocation, 
				repositoryModelLocation,
				confidentialitySpecificationLocation,
				originBackupLocation);

		//Input -> ResultingSpecification
		ResultingSpecificationResolution resolution = ResultingSpecificationResolutionFactory.generateResultingSpecificationResolution(policyStyle, input.getTainttrackingRoot().getConfigurations().get(0));
		CodeQLResultingSpecificationExtractor extractor = new CodeQLResultingSpecificationExtractor(resolution);
		
		ResultingSpecification resultingSpecification = extractor.extract(input.getTainttrackingRoot(), input.getJavaRoot(), input.getCodeQLResult());
		
		//BackProjection ResultingSpecification -> AAM
		Backproject backprojector = new Backprojector(input.getRepository(), input.getCorrespondenceRoot(), input.getConfidentiality(), input.getProfile(), input.getTainttrackingRoot().getConfigurations().get(0));
		backprojector.project(resultingSpecification);
		input.updateConfidentialityModel(confidentialitySpecificationLocation);
	}
	
	
}
