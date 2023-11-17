package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class ResultEntry {

	private final ResultEntryElement source;
	private final ResultEntryElement sink;
	private final EntryPoint entryPoint;

	public ResultEntry(ResultEntryElement source, ResultEntryElement sink, EntryPoint entryPoint) {
		super();
		this.source = source;
		this.sink = sink;
		this.entryPoint = entryPoint;
	}

	public ResultEntryElement getSource() {
		return source;
	}

	public ResultEntryElement getSink() {
		return sink;
	}

	public EntryPoint getEntryPoint() {
		return entryPoint;
	}
	
	@Override 
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + (source == null ? 0 : source.hashCode());
		hash = 31 * hash + (sink == null ? 0 : sink.hashCode());
		hash = 31 * hash + (entryPoint == null ? 0 : entryPoint.hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object toCompare) {

		if (toCompare == null) {
			return false;
		}
		if (!(toCompare instanceof ResultEntry)) {
			return false;
		}
		if(toCompare == this) {
			return true;
		}
		

		ResultEntry toCompareResultEntry = (ResultEntry) toCompare;

		return this.source.equals(toCompareResultEntry.getSource()) && this.sink.equals(toCompareResultEntry.getSink())
				&& this.entryPoint.equals(toCompareResultEntry.getEntryPoint());

	}

}
