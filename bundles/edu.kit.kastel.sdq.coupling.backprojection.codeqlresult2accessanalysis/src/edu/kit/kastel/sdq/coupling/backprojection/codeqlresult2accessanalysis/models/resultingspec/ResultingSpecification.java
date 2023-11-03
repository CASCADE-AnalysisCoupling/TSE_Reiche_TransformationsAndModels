package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.resultingspec;

import java.util.ArrayList;
import java.util.Collection;

public class ResultingSpecification {
	private final Collection<ResultingSpecEntry> resultingEntries = new ArrayList<ResultingSpecEntry>();
	
	public Collection<ResultingSpecEntry> getEntries(){
		return resultingEntries;
	}
	
	public void addEntry(ResultingSpecEntry entry) {
		resultingEntries.add(entry);
	}
}
