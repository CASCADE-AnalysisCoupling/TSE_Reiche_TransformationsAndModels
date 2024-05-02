package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import com.google.common.collect.Sets;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.utils.AccessAnalysisResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.labeledtaintflow.CodeQLLabeledTaintFlowUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class AccessAnalysis2CodeQLSecurityGenerator4FullDynamicLevels extends AccessAnalysis2CodeQLSecurityGenerator{
	private static final boolean HIGH_CONJUNCTIVE = false;

	public AccessAnalysis2CodeQLSecurityGenerator4FullDynamicLevels(ConfidentialitySpecification accessAnalysisSpec,
			PCMJavaCorrespondenceRoot correspondences) {
		super(accessAnalysisSpec, correspondences);
	}
	@Override
	protected Collection<SecurityLevel> generateSecurityLevels(Collection<DataSet> dataSets) {

		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels(dataSets);

		Collection<SecurityLevel> securityLevels = new HashSet<SecurityLevel>();

		for (List<SecurityLevel> securityLevelNames : securityLevelPowerSet) {

			String securityLevelName =  CodeQLLabeledTaintFlowUtil.combineSecurityLevelNames(SUBLEVEL_DELIMITER, securityLevelNames);
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(securityLevelName);

			securityLevels.add(level);
			
			AccessAnalysisCodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(AccessAnalysisResolutionUtil.getDataSetsForBasicLevels(dataSets, securityLevelNames), level, getSecurityCorrespondences());
		}

		return securityLevels;
	}
	
	@Override
	protected Collection<AllowedFlow> generateAllowedFlows(Configuration config) {

		Collection<AllowedFlow> allowedFlows = new ArrayList<AllowedFlow>();
		
		for (SecurityLevel potentiallyFrom : config.getAppliedSecurityLevel()) {
			for (SecurityLevel potentiallyTo : config.getAppliedSecurityLevel()) {

				if(potentiallyFrom.equals(potentiallyTo)) {
					continue;
				}
				
				Collection<SecurityLevel> potentiallyFromSplit = CodeQLResolutionUtil.resolveBasicLevels(potentiallyFrom, config, SUBLEVEL_DELIMITER);
				Collection<SecurityLevel> potentiallyToSplit = CodeQLResolutionUtil.resolveBasicLevels(potentiallyTo, config, SUBLEVEL_DELIMITER);
				
				
				if (CodeQLLabeledTaintFlowUtil.allowedFlowConditionConjunctive(HIGH_CONJUNCTIVE, potentiallyFromSplit, potentiallyToSplit)) {
					AllowedFlow allowed = CodeQLModelgenerationUtil.generateAllowedFlow(potentiallyFrom, potentiallyTo);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}
	
	private Set<Set<SecurityLevel>> generatePowerSetOfSecurityLevels(Collection<DataSet> dataSets) {
		Set<SecurityLevel> basicLevels = new HashSet<SecurityLevel>();


		// initial set
		for (DataSet literal : dataSets) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(literal.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}
	
	private Set<List<SecurityLevel>> generatePowerSetWithSortedLevels(Collection<DataSet> dataSets) {
		Set<Set<SecurityLevel>> powerSetSecurityLevels = generatePowerSetOfSecurityLevels(dataSets);
		Set<List<SecurityLevel>> powerSetWithSortedLevels = new HashSet<List<SecurityLevel>>();

		for (Set<SecurityLevel> set : powerSetSecurityLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(CodeQLLabeledTaintFlowUtil.sortSecurityLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}


}
