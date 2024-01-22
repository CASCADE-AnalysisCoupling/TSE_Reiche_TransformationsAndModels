package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.resultingspecificationresultion;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;

public abstract class ResultingSpecificationExtractor {
	
	public ResultingSpecificationExtractor(Configuration config) {
		super();
		this.config = config;
	}
	
	protected final Configuration config;
	
	public abstract ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar);
	


	protected boolean containsSecurityLevelWithSubname(SecurityLevel level) {
		Collection<SecurityLevel> existingBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(level, config);

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
}
