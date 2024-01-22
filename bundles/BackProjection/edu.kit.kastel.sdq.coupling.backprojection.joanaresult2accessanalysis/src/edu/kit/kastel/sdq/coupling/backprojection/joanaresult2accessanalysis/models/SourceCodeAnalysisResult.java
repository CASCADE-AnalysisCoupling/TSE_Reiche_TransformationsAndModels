package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

import java.util.HashSet;
import java.util.Set;


public class SourceCodeAnalysisResult {
	private Set<ResultEntry> resultEntries = new HashSet<ResultEntry>();
	
	public Set<ResultEntry> getResultEntries() {
		return resultEntries;
	}
	
	public void addResultEntry(ResultEntry entry) {
		resultEntries.add(entry);
	}
	
	
	public void print() {
		resultEntries.forEach(entry -> {System.out.println(entry.toString());});
	}
}
