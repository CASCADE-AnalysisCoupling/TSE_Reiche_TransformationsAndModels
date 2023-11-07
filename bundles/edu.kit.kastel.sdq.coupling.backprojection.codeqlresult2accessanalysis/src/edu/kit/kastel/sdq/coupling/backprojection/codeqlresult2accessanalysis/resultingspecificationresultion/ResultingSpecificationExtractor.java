package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.resultingspec.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.resultingspec.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.utils.BackprojectionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public abstract class ResultingSpecificationExtractor {
	
	public ResultingSpecificationExtractor(Configuration config) {
		super();
		this.config = config;
	}
	
	protected final Configuration config;
	
	protected abstract SecurityLevel combine(SecurityLevel source, SecurityLevel sink);
	protected abstract ResultingSpecEntry combine(ResultEntry resultEntry);
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	


	protected boolean containsSecurityLevelWithSubname(SecurityLevel level) {
		Collection<SecurityLevel> existingBasicLevels = BackprojectionUtil.splitLevelIntoBasicLevels(level, config);

		for (SecurityLevel toCheck : existingBasicLevels) {
			for (SecurityLevel checkAgainst : existingBasicLevels) {
				if (toCheck.getName().equals(checkAgainst.getName())) {
					continue;
				} else if (toCheck.getName().contains(checkAgainst.getName())) {
					return true;
				}
			}
		}
		return false;
	}
	
	protected SecurityLevel findLevelFromSetOfBasicLevels(Collection<SecurityLevel> levels) {
		
		String levelNameToSearch = levels.stream().sorted(Comparator.comparing(SecurityLevel::getName)).map(level -> level.getName()).collect(Collectors.joining(";"));
		Optional<SecurityLevel> calculatedLevel = config.getAppliedSecurityLevel().stream().filter(level -> level.getName().equals(levelNameToSearch)).findFirst();
		return calculatedLevel.get();
	}

}
