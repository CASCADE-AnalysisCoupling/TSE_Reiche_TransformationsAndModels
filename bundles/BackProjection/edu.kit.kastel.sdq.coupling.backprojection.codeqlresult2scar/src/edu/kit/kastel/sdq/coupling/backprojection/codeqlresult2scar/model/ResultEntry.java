package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.model;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public class ResultEntry {
	
	private final ResultEntryElement<?> source;
	private final ResultEntryElement<?> sink;
	private final Configuration config;
	
	public ResultEntry(ResultEntryElement<?> source, ResultEntryElement<?> sink, Configuration config) {
		super();
		this.source = source;
		this.sink = sink;
		this.config = config;
	}
	
	public ResultEntryElement<?> getSource() {
		return source;
	}
	public ResultEntryElement<?> getSink() {
		return sink;
	}
	
	public Configuration getConfig() {
		return config;
	}
}
