package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;

import com.google.common.collect.Sets;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANASecurityGenerator;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;
import edu.kit.kastel.sdq.coupling.util.iterative.transitivereduction.LevelHandler;
import edu.kit.kastel.sdq.coupling.util.iterative.transitivereduction.ValidRelation;

public class AccessAnalysis2JOANATransitiveReductionSecurityGenerator extends AccessAnalysis2JOANASecurityGenerator {

	protected LevelHandler<String> levelHandler;
	protected HashMap<String, Level> levelInstancesRegistry;
	protected boolean shouldGenerateOnlyOccurringLevelsNotWholePowerset;

	public AccessAnalysis2JOANATransitiveReductionSecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec,
			boolean shouldGenerateOnlyOccurringLevelsNotWholePowerset) {
		super(correspondences, accessAnalysisSpec);
		this.levelHandler = new LevelHandler<String>();
		this.levelInstancesRegistry = new HashMap<String, Level>();
		this.shouldGenerateOnlyOccurringLevelsNotWholePowerset = shouldGenerateOnlyOccurringLevelsNotWholePowerset;
	}

	@Override
	protected Collection<Level> generateLevels(Collection<DataSet> dataSets) {
		this.resetLevelHandlerAndLevelInstancesRegistry();
		
		if(!shouldGenerateOnlyOccurringLevelsNotWholePowerset) {
			// e.g. if all levels are neccessary in backprojection
			generatePowersetLevels(dataSets);
		}
		
		// returns empty because the levels are inserted later on the fly in getLevelForDataSets()
		return new ArrayList<Level> ();
	}

	@Override
	protected Level getLevelForDataSets(Collection<DataSet> datasets, Collection<Level> levels) {
		// on the fly registration of only that combinedLevels that really occur
		Level combinedLevel = this.registerLevelOccurrenceAndGetLevelInstance(datasets);
		levels.add(combinedLevel);

		return combinedLevel;
	}

	/**
	 * Triggers the transitive reduction algorithm of the LevelHandler. Translates
	 * the resulting ValidRelations into Mayflows by lookups in the
	 * levelInstancesRegistry and returns these mayflows for lattice creation.
	 * 
	 * @return the resulting mayflows for the Lattice
	 */
	@Override
	protected Collection<MayFlow> generateMayFlows(EntryPoint currentEntryPoint) {
		List<ValidRelation<String>> validRelations = levelHandler.getTransitiveReduction(false);

		List<MayFlow> mayflows = validRelations.stream()
				.map(vr -> JOANAModelGenerationUtil.generateMayFlow(
						this.getLevelSingletonInstanceByName(this.combineLevelNames(vr.getFrom())),
						this.getLevelSingletonInstanceByName(this.combineLevelNames(vr.getTo()))))
				.collect(Collectors.toList());
		return mayflows;
	}

	/**
	 * Resets the LevelHandler and LevelInstancesRegistry with new Instances.
	 */
	private void resetLevelHandlerAndLevelInstancesRegistry() {
		this.levelHandler = new LevelHandler<String>();
		this.levelInstancesRegistry = new HashMap<String, Level>();
	}

	/**
	 * Registers the combined level and returns the singleton instance of the
	 * associated level object
	 * 
	 * @param dataSets the collection of single levels
	 * @return the Level instance
	 */

	private Level registerLevelOccurrenceAndGetLevelInstance(Collection<DataSet> dataSets) {
		List<String> allSingleLevels = dataSets.stream().map(ds -> ds.getName()).collect(Collectors.toList());
		levelHandler.insertCombinedLevel(allSingleLevels);
		return this.getLevelSingletonInstanceByName(this.combineLevelNames(allSingleLevels));
	}

	/**
	 * Combines the single SecurityLevels into one Name in which the single levels
	 * are sorted alphanumerical and separated by SUBLEVEL_DELIMETER.
	 * 
	 * @param securityLevels the single levels e.g. unordered: Creditcardinfo,
	 *                       Airlinedata, Userinfo
	 * @return the new name e.g. AirlinedataCreditcardinfoUserinfo
	 */

	private String combineLevelNames(Collection<String> securityLevels) {
		List<String> list = new ArrayList<String>(securityLevels);
		Collections.sort(list);

		return String.join(SUBLEVEL_DELIMITER, list);
	}

	/**
	 * Get the singleton object of JOANAs Level class for the exactly matching name.
	 * 
	 * @param levelName the name e.g. AirlinedataCreditcardinfoUserinfo
	 * @return the associated Level Object
	 */

	private Level getLevelSingletonInstanceByName(String levelName) {
		if (!levelInstancesRegistry.containsKey(levelName)) {
			levelInstancesRegistry.put(levelName, JOANAModelGenerationUtil.generateLevel(levelName));
		}
		return levelInstancesRegistry.get(levelName);
	}

	// Additional Powerset Calculation
	// -------------------------------------------------------------------------------------------
	private void generatePowersetLevels(Collection<DataSet> dataSets) {

		Set<List<Level>> securityLevelPowerSet = generatePowerSetWithSortedLevels(dataSets);

		for (List<Level> securityLevels : securityLevelPowerSet) {
			List<String> securityLevelNames = securityLevels.stream().map(level -> level.getName())
					.collect(Collectors.toList());
			String securityLevelName = combineLevelNames(securityLevelNames);

			if (!levelInstancesRegistry.containsKey(securityLevelName)) {
				levelInstancesRegistry.put(securityLevelName,
						JOANAModelGenerationUtil.generateLevel(securityLevelName));
			}
		}
	}

	private Set<List<Level>> generatePowerSetWithSortedLevels(Collection<DataSet> dataSets) {
		Set<Set<Level>> powerSetLevels = generatePowerSetOfLevels(dataSets);
		Set<List<Level>> powerSetWithSortedLevels = new HashSet<List<Level>>();

		for (Set<Level> set : powerSetLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(sortLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}

	private Set<Set<Level>> generatePowerSetOfLevels(Collection<DataSet> dataSets) {
		Set<Level> basicLevels = new HashSet<Level>();

		// initial set
		for (DataSet dataSet : dataSets) {
			Level level = JOANAModelGenerationUtil.generateLevel(dataSet.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}

	private List<Level> sortLevels(Collection<Level> levels) {
		return levels.stream().sorted(Comparator.comparing(Level::getName)).collect(Collectors.toList());
	}
}
