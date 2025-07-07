package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection.Backproject;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection.Backprojector;
import edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.models.Models;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.CodeQLResultingSpecificationExtractor;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolutionFactory;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;

public class CodeQL2AccessAnalysisResultIntegration {

	protected final String policyStyle;
	protected final String javaModelLocation;
	protected final String codeQLModelLocation;
	protected final String pcmJavacorrespondenceModelLocation;
	protected final String codeQLresultFileLocation;
	protected final String confidentialitySpecificationLocation;
	protected final String originBackupLocation;
	protected final String repositoryModelLocation;
	protected final String accessanalysisCodeQLCorrespondenceLocation;
	protected final String scarLocation;
	protected final String resultingValuesLocation;
	protected final String scarCorrespondencesLocation;
	protected final String resultingValuesCorrespondencesLocation;
	protected final String codeQL_Configurations_Location;

	public CodeQL2AccessAnalysisResultIntegration(String policyStyle, String javaModelLocation,
			String codeQLModelLocation, String pcmJavacorrespondenceModelLocation, String codeQLresultFileLocation,
			String repositoryModelLocation, String confidentialitySpecificationLocation, String originBackupLocation,
			String scarLocation, String resultingValuesLocation, String accessanalysisCodeQLCorrespondenceLocation,
			String scarCorrespondencesLocation, String resultingValuesCorrespondencesLocation,
			String codeQL_Configurations_Location) {
		super();
		this.policyStyle = policyStyle;
		this.javaModelLocation = javaModelLocation;
		this.codeQLModelLocation = codeQLModelLocation;
		this.pcmJavacorrespondenceModelLocation = pcmJavacorrespondenceModelLocation;
		this.codeQLresultFileLocation = codeQLresultFileLocation;
		this.repositoryModelLocation = repositoryModelLocation;
		this.confidentialitySpecificationLocation = confidentialitySpecificationLocation;
		this.originBackupLocation = originBackupLocation;
		this.accessanalysisCodeQLCorrespondenceLocation = accessanalysisCodeQLCorrespondenceLocation;
		this.scarLocation = scarLocation;
		this.resultingValuesLocation = resultingValuesLocation;
		this.scarCorrespondencesLocation = scarCorrespondencesLocation;
		this.resultingValuesCorrespondencesLocation = resultingValuesCorrespondencesLocation;
		this.codeQL_Configurations_Location = codeQL_Configurations_Location;
	}

	public void performResultIntegration() {
		Models models = Models.createModelsFromFiles(javaModelLocation, 
				codeQLModelLocation,
				pcmJavacorrespondenceModelLocation, codeQLresultFileLocation, 
				repositoryModelLocation,
				confidentialitySpecificationLocation,
				originBackupLocation, 
				accessanalysisCodeQLCorrespondenceLocation,
				codeQL_Configurations_Location);

		// Input -> ResultingSpecification
		ResultingSpecificationResolution resolution = ResultingSpecificationResolutionFactory
				.generateResultingSpecificationResolution(policyStyle);
		CodeQLResultingSpecificationExtractor extractor = new CodeQLResultingSpecificationExtractor(resolution);

		ResolvedImplementationValues resultingValues = extractor.extract(models.getTainttrackingRoot(),
				models.getJavaRoot(), models.getCodeQLResult(), models.getCodeQL_Configurations());

		// BackProjection ResultingSpecification -> AAM
		Backproject backprojector = new Backprojector(models.getCorrespondenceRoot(),
				models.getProfile(), extractor.getSCARCorrespondence(), resolution.getResultingValueCorrespondences(),
				models.getAccessAnalysisCodeQLCorrespondences());
		backprojector.project(resultingValues);
		models.updateConfidentialityModel(confidentialitySpecificationLocation);
		models.persistCorrespondencesAndModels(scarLocation, extractor.getSourceCodeAnalysisResult(),
				resultingValuesLocation, resultingValues, scarCorrespondencesLocation,
				extractor.getSCARCorrespondence(), resultingValuesCorrespondencesLocation,
				resolution.getResultingValueCorrespondences());

		System.out.println("Result Integration CodeQL to Access Analysis Done");
	}

}
