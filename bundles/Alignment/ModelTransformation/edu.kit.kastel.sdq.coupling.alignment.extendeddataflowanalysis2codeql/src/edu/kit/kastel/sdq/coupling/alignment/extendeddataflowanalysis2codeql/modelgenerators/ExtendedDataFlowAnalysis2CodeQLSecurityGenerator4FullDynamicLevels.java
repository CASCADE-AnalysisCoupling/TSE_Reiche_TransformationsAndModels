package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;

import com.google.common.collect.Sets;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.utils.EDFAResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.labeledtaintflow.CodeQLLabeledTaintFlowUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util.EDFACodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class ExtendedDataFlowAnalysis2CodeQLSecurityGenerator4FullDynamicLevels extends ExtendedDataFlowAnalysis2CodeQLSecurityGenerator{

	
	public ExtendedDataFlowAnalysis2CodeQLSecurityGenerator4FullDynamicLevels(ParameterAnnotations extensionRoot,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super(extensionRoot, correspondences, dictionary);
	}

	@Override
	protected Collection<SecurityLevel> generateSecurityLevels(Collection<Literal> literals) {

		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels(literals);

		Collection<SecurityLevel> securityLevels = new HashSet<SecurityLevel>();

		for (List<SecurityLevel> securityLevelNames : securityLevelPowerSet) {

			String securityLevelName =  CodeQLLabeledTaintFlowUtil.combineSecurityLevelNames(SUBLEVEL_DELIMITER, securityLevelNames);
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(securityLevelName);

			securityLevels.add(level);
			
			EDFACodeQLCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(EDFAResolutionUtil.getLiteralsForBasicLevels(literals, securityLevelNames), level, edfaCodeQLCorrespondences);
		}

		return securityLevels;
	}
	
	@Override
	protected Collection<AllowedFlow> generateAllowedFlows(Query query) {

		Collection<AllowedFlow> allowedFlows = new ArrayList<AllowedFlow>();
		
		for (SecurityLevel potentiallyFrom : query.getAppliedSecurityLevel()) {
			for (SecurityLevel potentiallyTo : query.getAppliedSecurityLevel()) {

				if(potentiallyFrom.equals(potentiallyTo)) {
					continue;
				}
				
				Collection<SecurityLevel> potentiallyFromSplit = CodeQLResolutionUtil.resolveBasicLevels(potentiallyFrom, query, SUBLEVEL_DELIMITER);
				Collection<SecurityLevel> potentiallyToSplit = CodeQLResolutionUtil.resolveBasicLevels(potentiallyTo, query, SUBLEVEL_DELIMITER);
				
				
				if (CodeQLLabeledTaintFlowUtil.allowedFlowConditionConjunctive(HIGH_CONJUNCTIVE, potentiallyFromSplit, potentiallyToSplit)) {
					AllowedFlow allowed = CodeQLModelgenerationUtil.generateAllowedFlow(potentiallyFrom, potentiallyTo);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}
	
	private Set<Set<SecurityLevel>> generatePowerSetOfSecurityLevels(Collection<Literal> literals) {
		Set<SecurityLevel> basicLevels = new HashSet<SecurityLevel>();

		/*
		 * TODO: This is fitted that only one enumeration exists (e.g., in
		 * Travelplanner). 
		 * Remark: Generation of a fitting lattice and joined
		 * levels has to be provided if multiple Enumerations exist -
		 * however, not necessary for TSE Eval.
		 */
		

		// initial set
		for (Literal literal : literals) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(literal.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}
	
	private Set<List<SecurityLevel>> generatePowerSetWithSortedLevels(Collection<Literal> literals) {
		Set<Set<SecurityLevel>> powerSetSecurityLevels = generatePowerSetOfSecurityLevels(literals);
		Set<List<SecurityLevel>> powerSetWithSortedLevels = new HashSet<List<SecurityLevel>>();

		for (Set<SecurityLevel> set : powerSetSecurityLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(CodeQLLabeledTaintFlowUtil.sortSecurityLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}

}
