package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.backprojection;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;

public interface Backproject {
	public void project(ResolvedImplementationValues resultingValues);
}
