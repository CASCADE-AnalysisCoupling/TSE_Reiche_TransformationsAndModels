package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

import java.util.HashSet;
import java.util.Set;


public class SourceCodeAnalysisResult {
	private Set<ResultEntry> resultEntries = new HashSet<ResultEntry>();
	
	public Set<ResultEntry> getResultEntries() {
		return resultEntries;
	}
	
	public void addResultEntry(ResultEntry entry) {
		//TODO: Circumventing creating an hash value for now, not nice and against Set idea, but well...
//		for(ResultEntry existing : resultEntries) {
//			if(existing.equals(entry)) {
//				return;
//			}
//		}
		
		resultEntries.add(entry);
	}
	
}
