package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.outputformatreader.CodeQLSarifReader;

public class CodeQLResult2AccessAnalysisHandler extends AbstractHandler{

	private final String CODEQL_RESULT_FILE_PATH = Paths.get("/home/frederik/CodingLocation/CodeQL/java/output.sarif").toAbsolutePath().toString();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		String codeQLSarifContent = "";
		try {
			codeQLSarifContent = Files.readString(Paths.get(CODEQL_RESULT_FILE_PATH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CodeQLSarifReader sarifReader = new CodeQLSarifReader();
		SourceCodeAnalysisResult scar = sarifReader.interpretCodeQLSarif(codeQLSarifContent);
		
		
		return true;
	}
	
	
	
}
