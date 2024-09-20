package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;

public interface Backproject {
	public void project(ResolvedImplementationValues resultingValues);
}
