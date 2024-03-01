package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.scarparser.CodeQLSarifOutput2SCARParser;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution.ResultingSpecificationResolution;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;

public class CodeQLResultingSpecificationExtractor {

	private final ResultingSpecificationResolution extractor;
	
	public CodeQLResultingSpecificationExtractor(ResultingSpecificationResolution extractor) {
		this.extractor = extractor;
	}
	
	public ResultingSpecification extract(TainttrackingRoot tainttrackingRoot, JavaRoot javaRoot, String codeQLResult) {
		CodeQLSarifOutput2SCARParser parser = new CodeQLSarifOutput2SCARParser(tainttrackingRoot, javaRoot);
		SourceCodeAnalysisResult scar = parser.interpretCodeQLSarif(codeQLResult);
		return extractor.calculateResultingSpecification(scar);
	}
	
}
