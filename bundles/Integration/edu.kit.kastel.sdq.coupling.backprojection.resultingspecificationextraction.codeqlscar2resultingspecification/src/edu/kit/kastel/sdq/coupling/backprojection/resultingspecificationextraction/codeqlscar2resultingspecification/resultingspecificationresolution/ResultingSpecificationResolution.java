package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.List;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;

public abstract class ResultingSpecificationResolution {
	
	protected static String DELIMITER = ";";
	protected ResolvedImplementationValues resultingValues;
	protected Correspondences_ResolvedImplementationValues correspondences_ResultingValues; 
	
	public ResultingSpecificationResolution() {
		super();
		this.resultingValues = CodeQLResultingValuesModelGenerationUtil.createResultingValues();
		this.correspondences_ResultingValues = CodeQLResultingValueCorrespondencesUtil.createCorrespondences_ResolvedImplementationValues();
	}

	
	protected Query config;
	
	public void setConfiguration(Query config) {
		this.config = config;
	}
	
	public Correspondences_ResolvedImplementationValues getResultingValueCorrespondences() {
		return correspondences_ResultingValues;
	}
	
	public abstract ResolvedImplementationValues calculateResultingValues(SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, Correspondences_CodeQLScar codeQLScarCorrespondence);
	


	protected boolean sameConfiguration(List<Result> resultEntries) {
		
		if(resultEntries.isEmpty()) {
			return true;
		}
		
		return resultEntries.stream().map(Result::getRuleId).distinct().collect(Collectors.toList()).size() == 1;
	}

}
