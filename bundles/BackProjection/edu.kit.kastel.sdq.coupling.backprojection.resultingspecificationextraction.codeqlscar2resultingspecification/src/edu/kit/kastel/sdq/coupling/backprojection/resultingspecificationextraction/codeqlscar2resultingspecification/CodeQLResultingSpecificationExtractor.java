package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.scarparser.CodeQLSarifOutput2SCARParser;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;

public class CodeQLResultingSpecificationExtractor {

	private final ResultingSpecificationResolution extractor;
	private CodeQLSarifOutput2SCARParser parser;
	private SourceCodeAnalysisResult scar;
	
	public CodeQLResultingSpecificationExtractor(ResultingSpecificationResolution extractor) {
		this.extractor = extractor;
	}
	
	public CodeQLResultingValues extract(TainttrackingRoot tainttrackingRoot, JavaRoot javaRoot, String codeQLResult) {
		parser = new CodeQLSarifOutput2SCARParser(tainttrackingRoot, javaRoot);
		scar = parser.interpretCodeQLSarif(codeQLResult);
		return extractor.calculateResultingValues(scar, tainttrackingRoot, parser.getScarCorrespondences());
	}

	public CodeQLSCARCorrespondences getSCARCorrespondence() {
		return parser.getScarCorrespondences();
	}
	
	public SourceCodeAnalysisResult getSourceCodeAnalysisResult() {
		return scar;
	}
	
	
}
