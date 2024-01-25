package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class ResultingSpecification {
	private final Set<ResultingSpecEntry> resultingEntries = new HashSet<ResultingSpecEntry>();
	
	public Set<ResultingSpecEntry> getEntries(){
		return resultingEntries;
	}
	
	public void addEntry(ResultingSpecEntry entry) {
		resultingEntries.add(entry);
	}
	
	public Optional<ResultingSpecEntry> getResultingSpecEntryForTargetIfExisting(Parameter target){
		return resultingEntries.stream().filter(existingSpecEntry -> existingSpecEntry.getSystemElement().equals(target)).findFirst();
	}
}
