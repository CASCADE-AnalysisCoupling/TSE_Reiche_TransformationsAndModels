package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util.JOANAResultingValuesModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public abstract class ResultingSpecificationResolution {
	
	protected static final String SUBLEVEL_DELIMITER = ";";
	protected final ResolvedImplementationValues resultingValues; 
	protected Correspondences_ResolvedImplementationValues correspondences_ResultingValues;
	
	public ResultingSpecificationResolution() {
		super();
		this.resultingValues = JOANAResultingValuesModelGenerationUtil.createResultingValues();
		this.correspondences_ResultingValues = JOANAResultingValueCorrespondencesUtil.createCorrespondences_JOANAResultingValues();
	}
	
	public abstract ResolvedImplementationValues calculateResultingSpecification(SourceCodeAnalysisResult scar, JOANASCARCorrespondences joanaScarCorrespondences);
		
	public Correspondences_ResolvedImplementationValues getCorrespondences_ResultingValues() {
		return correspondences_ResultingValues;
	}

}
