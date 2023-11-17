package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.resultingspecificationresolution;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.utils.BackprojectionUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public abstract class ResultingSpecificationExtractor {
	
	public ResultingSpecificationExtractor(EntryPoint entryPoint) {
		super();
		this.entryPoint = entryPoint;
	}
	
	public ResultingSpecificationExtractor() {
		super();
	}
	
	protected EntryPoint entryPoint;
	
	protected abstract Level combine(Level source, Level sink);
	protected abstract ResultingSpecEntry combine(ResultEntry resultEntry);
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	


	protected boolean containsLevelWithSubname(Level level) {
		Collection<Level> existingBasicLevels = BackprojectionUtil.splitLevelIntoBasicLevels(level, entryPoint);

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
	
	protected Level findLevelFromSetOfBasicLevels(Collection<Level> levels) {
		
		String levelNameToSearch = levels.stream().sorted(Comparator.comparing(Level::getName)).map(level -> level.getName()).collect(Collectors.joining(";"));
		Optional<Level> calculatedLevel = entryPoint.getLevel().stream().filter(level -> level.getName().equals(levelNameToSearch)).findFirst();
		return calculatedLevel.get();
	}
	
	public void setEntryPoint(EntryPoint entryPoint) {
		this.entryPoint = entryPoint;
	}

}
