package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models;

import java.util.ArrayList;
import java.util.Collection;

public class SourceCodeAnalysisResult {
	private final Collection<ResultEntry> resultEntries = new ArrayList<ResultEntry>(); 
	
	
	public Collection<ResultEntry> getResultEntries() {
		return resultEntries;
	}
	
	public void addResultEntry(ResultEntry entry) {
		resultEntries.add(entry);
	}
	
}
