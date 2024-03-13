package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

public class ResultingSpecification {
	Set<ResultingSpecEntry> resultingSpecEntries = new HashSet<ResultingSpecEntry>();
	
	public Set<ResultingSpecEntry> getEntries(){
		return resultingSpecEntries;
	}
	
	public void addEntry(ResultingSpecEntry entry) {
		resultingSpecEntries.add(entry);
	}
	
	public Optional<ResultingSpecEntry> getResultingSpecEntryForTargetIfExisting(Parameter target){
		return resultingSpecEntries.stream().filter(existingSpecEntry -> existingSpecEntry.getSystemElement().equals(target)).findFirst();
	}
	
	public void print() {
		for(ResultingSpecEntry entry : resultingSpecEntries) {
			System.out.println(entry.toString());
		}
	}
}
