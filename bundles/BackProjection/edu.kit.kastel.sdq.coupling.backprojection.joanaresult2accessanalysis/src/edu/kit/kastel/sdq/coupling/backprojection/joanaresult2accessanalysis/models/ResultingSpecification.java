package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

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
}
