package edu.kit.kastel.sdq.casestudy.framework.processingsteps.accessanalysiscodeql.adapters;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.AccessAnalysis2CodeQLAlignment;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.AccessAnalysis2CodeQLSecurityGenerator;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.Creator4SG4FullDynamicLevels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.Creator4SG4HighLow;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators.SecurityGeneratorCreator;


public class AccessAnalysis2CodeQLAdapter implements ExecutableProcessingStepAdapter{
	
	/**
	 * args[0]: OK message, <br>
	 * args[1]: NotOK message, <br>
	 * args[2]: repositoryPath<br>
	 * args[3]: confidentialityModelPath<br>
	 * args[4]: codeBasePackageName<br>
	 * args[5]: javaModelPath<br>
	 * args[6]: codeQLModelPath<br>
	 * args[7]: correspondenceModelPath<br>
	 * args[8]: codeQLQueryFolderPath<br>
	 * args[9]: policyStyle<br>
	 * args[10]: accessAnalysisCodeQLCorrespondenceModelPath<br>
	 */
	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);
		
		try {
			SecurityGeneratorCreator sgc = null;
			switch (args[12]) {
			case "Disjunctive":
				sgc = new Creator4SG4FullDynamicLevels();
				break;
			case "HighLow":
				sgc = new Creator4SG4HighLow();
				break;
			default:
				sgc = null;
			}

			if (sgc == null) {
				throw new IllegalArgumentException("Casestudy type '" + args[12] + "' couldn't be found. (CodeQL)");
			}
			AccessAnalysis2CodeQLAlignment alignment = new AccessAnalysis2CodeQLAlignment(args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10], args[11], sgc);
			alignment.performAlignment();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}
		
		return result;
	}

}
