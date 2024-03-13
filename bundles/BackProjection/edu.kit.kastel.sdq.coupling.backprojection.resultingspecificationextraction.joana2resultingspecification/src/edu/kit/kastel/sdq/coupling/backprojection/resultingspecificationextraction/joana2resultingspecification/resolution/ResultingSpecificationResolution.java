package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import java.util.Collection;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

public abstract class ResultingSpecificationResolution {
	
	protected static final String SUBLEVEL_DELIMITER = ";";
	protected final ResultingSpecification resultingSpecification; 
	
	public ResultingSpecificationResolution(EntryPoint config) {
		super();
		this.config = config;
		this.resultingSpecification = new ResultingSpecification();
	}
	
	public ResultingSpecificationResolution() {
		super();
		this.resultingSpecification = new ResultingSpecification();
	}
	
	protected EntryPoint config;
	
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	


	protected boolean containsLevelWithSubname(Level level) {
		Collection<Level> existingBasicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(level, config, SUBLEVEL_DELIMITER);

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
		this.config = entryPoint;
	}

}
