package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;

public interface Backproject {
	public void project(ResultingSpecification resultingSpec);
}
