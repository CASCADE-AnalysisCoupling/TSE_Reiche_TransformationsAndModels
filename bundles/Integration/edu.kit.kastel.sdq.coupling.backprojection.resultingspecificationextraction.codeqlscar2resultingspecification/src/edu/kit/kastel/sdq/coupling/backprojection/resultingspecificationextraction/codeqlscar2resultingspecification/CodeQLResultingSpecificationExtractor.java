package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.scarparser.CodeQLSarifOutput2SCARParser;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;

public class CodeQLResultingSpecificationExtractor {

	private final ResultingSpecificationResolution extractor;
	private CodeQLSarifOutput2SCARParser parser;
	private SourceCodeAnalysisResult scar;
	
	public CodeQLResultingSpecificationExtractor(ResultingSpecificationResolution extractor) {
		this.extractor = extractor;
	}
	
	public ResolvedImplementationValues extract(TainttrackingRoot tainttrackingRoot, JavaRoot javaRoot, String codeQLResult, Configurations codeql_Configurations) {
		parser = new CodeQLSarifOutput2SCARParser(tainttrackingRoot, javaRoot, codeql_Configurations);
		scar = parser.interpretCodeQLSarif(codeQLResult);
		return extractor.calculateResultingValues(scar, tainttrackingRoot, parser.getScarCorrespondences());
	}

	public Correspondences_CodeQLScar getSCARCorrespondence() {
		return parser.getScarCorrespondences();
	}
	
	public SourceCodeAnalysisResult getSourceCodeAnalysisResult() {
		return scar;
	}
	
	
}
