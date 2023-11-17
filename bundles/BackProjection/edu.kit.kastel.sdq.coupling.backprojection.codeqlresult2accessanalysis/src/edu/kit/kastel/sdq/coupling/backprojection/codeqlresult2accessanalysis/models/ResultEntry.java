package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models;

public class ResultEntry {
	
	private final ResultEntryElement source;
	private final ResultEntryElement sink;
	
	public ResultEntry(ResultEntryElement source, ResultEntryElement sink) {
		super();
		this.source = source;
		this.sink = sink;
	}
	
	public ResultEntryElement getSource() {
		return source;
	}
	public ResultEntryElement getSink() {
		return sink;
	}
}
