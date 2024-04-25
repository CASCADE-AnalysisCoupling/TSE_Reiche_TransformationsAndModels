package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.resultingspecificationresolution;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

//TODO: Reimplement Class if necessary
public class ResultingSpecificationResolution4ConjunctivePowerset extends ResultingSpecificationResolution {

	public ResultingSpecificationResolution4ConjunctivePowerset() {
		super();
	}

	@Override
	public CodeQLResultingValues calculateResultingValues(SourceCodeAnalysisResult scar, TainttrackingRoot codeQL,
			CodeQLSCARCorrespondences codeQLScarCorrespondence) {
		// TODO Auto-generated method stub
		return null;
	}

//	protected SecurityLevel combine(SecurityLevel source, SecurityLevel sink) {
//
//		Collection<SecurityLevel> sourceBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(source, config,
//				DELIMITER);
//		Collection<SecurityLevel> sinkBasicLevels = CodeQLResolutionUtil.resolveBasicLevels(sink, config, DELIMITER);
//
//		Set<SecurityLevel> combinedLevels = new HashSet<SecurityLevel>();
//
//		sourceBasicLevels.stream().forEach(level -> {
//			combinedLevels.add(level);
//		});
//		sinkBasicLevels.stream().forEach(level -> {
//			combinedLevels.add(level);
//		});
//
//		return CodeQLResolutionUtil.findLevelFromSetOfBasicLevels(combinedLevels, config);
//
//	}
//
//	@Override
//	public ResultingSpecification calculateResultingValues(SourceCodeAnalysisResult scar) {
//
//		scar.getResultEntries().forEach(resultEntry -> {
//			ResultingSpecEntry resultingEntry = combine(resultEntry);
//			resultingValues.addEntry(resultingEntry);
//		});
//
//		return resultingValues;
//	}
//
//	private ResultingSpecEntry combine(ResultEntry resultEntry) {
//		Parameter targetParameter = null;
//		if (resultEntry.getSink().getSystemElement() instanceof Parameter) {
//			targetParameter = (Parameter) resultEntry.getSink().getSystemElement();
//		}
//
//		ResultingSpecEntry resultingSpecEntry = resultingValues
//				.getResultingSpecEntryForTargetIfExisting(targetParameter).orElse(null);
//
//		SecurityLevel newLevel;
//		if (resultingSpecEntry == null) {
//			newLevel = combine(resultEntry.getSource().getSecurityProperty(),
//					resultEntry.getSink().getSecurityProperty());
//			return new ResultingSpecEntry(newLevel, targetParameter, resultEntry.getConfig());
//		} else {
//			newLevel = combine(resultEntry.getSource().getSecurityProperty(), resultingSpecEntry.getSecurityProperty());
//			resultingSpecEntry.setSecurityProperty(newLevel);
//			return resultingSpecEntry;
//		}
//	}

}
