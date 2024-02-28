package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution;

import java.util.Collection;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

public abstract class ResultingSpecificationExtractor {
	
	public ResultingSpecificationExtractor(EntryPoint entryPoint) {
		super();
		this.entryPoint = entryPoint;
	}
	
	public ResultingSpecificationExtractor() {
		super();
	}
	
	protected EntryPoint entryPoint;
	
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	


	protected boolean containsLevelWithSubname(Level level) {
		Collection<Level> existingBasicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(level, entryPoint);

		for (Level toCheck : existingBasicLevels) {
			for (Level checkAgainst : existingBasicLevels) {
				if (toCheck.getName().equals(checkAgainst.getName())) {
					continue;
				} else if (toCheck.getName().contains(checkAgainst.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public void setEntryPoint(EntryPoint entryPoint) {
		this.entryPoint = entryPoint;
	}

}
