package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;

import com.google.common.collect.Sets;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAFlowUtil;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANANamingUtil;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class ExtendedDataFlowAnalysis2JOANASecurityGenerator4FullDynamicLevels extends ExtendedDataFlowAnalysis2JOANASecurityGenerator{
	private static final boolean HIGH_CONJUNCTIVE = false;
	
	public ExtendedDataFlowAnalysis2JOANASecurityGenerator4FullDynamicLevels(ParameterAnnotations parameterAnnotations,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super(parameterAnnotations, correspondences, dictionary);
	}

	@Override
	protected Collection<Level> generateLevels(Collection<Literal> literals) {

		Set<List<Level>> securityLevelPowerSet = generatePowerSetWithSortedLevels(literals);

		Collection<Level> securityLevels = new HashSet<Level>();

		for (List<Level> securityLevelNames : securityLevelPowerSet) {

			String securityLevelName = JOANANamingUtil.combineLevelNames(securityLevelNames, SUBLEVEL_DELIMITER);
			Level level = JOANAModelGenerationUtil.generateLevel(securityLevelName);

			securityLevels.add(level);
		}

		return securityLevels;
	}
	
	private Set<Set<Level>> generatePowerSetOfLevels(Collection<Literal> literals) {
		Set<Level> basicLevels = new HashSet<Level>();

		// initial set
		for (Literal literal : literals) {
			Level level = JOANAModelGenerationUtil.generateLevel(literal.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}
	
	private Set<List<Level>> generatePowerSetWithSortedLevels(Collection<Literal> literals) {
		Set<Set<Level>> powerSetLevels = generatePowerSetOfLevels(literals);
		Set<List<Level>> powerSetWithSortedLevels = new HashSet<List<Level>>();

		for (Set<Level> set : powerSetLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(JOANANamingUtil.sortLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}
	
	@Override
	protected Collection<MayFlow> generateMayFlows(EntryPoint currentEntryPoint) {

		Collection<MayFlow> allowedFlows = new ArrayList<MayFlow>();

		for (Level potentiallyFrom : currentEntryPoint.getLevel()) {
			for (Level potentiallyTo : currentEntryPoint.getLevel()) {

				if (potentiallyFrom.equals(potentiallyTo)) {
					continue;
				}

				Collection<Level> potentiallyFromSplit = JOANAResolutionUtil.resolveBasicLevels(potentiallyFrom,
						currentEntryPoint, SUBLEVEL_DELIMITER);
				Collection<Level> potentiallyToSplit = JOANAResolutionUtil.resolveBasicLevels(potentiallyTo,
						currentEntryPoint, SUBLEVEL_DELIMITER);

				if (allowedFlowCondition(potentiallyFromSplit, potentiallyToSplit)) {

					MayFlow allowed = JOANAModelGenerationUtil.generateMayFlow(potentiallyFrom, potentiallyTo);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}
	
	// Allowed Flow Condition according to H�ring
		private boolean allowedFlowCondition(Collection<Level> potentiallyFrom, Collection<Level> potentiallyTo) {
			return JOANAFlowUtil.allowedFlowConditionConjunctive(HIGH_CONJUNCTIVE, potentiallyFrom, potentiallyTo);
		}
}
