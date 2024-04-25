package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.List;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.utils.CodeQLResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;

public abstract class ResultingSpecificationResolution {
	
	protected static String DELIMITER = ";";
	protected CodeQLResultingValues resultingValues;
	protected Correspondences_CodeQLResultingValues correspondences_ResultingValues; 
	
	public ResultingSpecificationResolution() {
		super();
		this.resultingValues = CodeQLResultingValuesModelGenerationUtil.createResultingValues();
		this.correspondences_ResultingValues = CodeQLResultingValueCorrespondencesUtil.createCorrespondences_CodeQLResultingValues();
	}

	
	protected Configuration config;
	
	public void setConfiguration(Configuration config) {
		this.config = config;
	}
	
	public Correspondences_CodeQLResultingValues getResultingValueCorrespondences() {
		return correspondences_ResultingValues;
	}
	
	public abstract CodeQLResultingValues calculateResultingValues(SourceCodeAnalysisResult scar, TainttrackingRoot codeQL, CodeQLSCARCorrespondences codeQLScarCorrespondence);
	


	protected boolean sameConfiguration(List<ResultEntry> resultEntries) {
		
		if(resultEntries.isEmpty()) {
			return true;
		}
		
		return resultEntries.stream().map(ResultEntry::getConfig).distinct().collect(Collectors.toList()).size() == 1;
	}

}
