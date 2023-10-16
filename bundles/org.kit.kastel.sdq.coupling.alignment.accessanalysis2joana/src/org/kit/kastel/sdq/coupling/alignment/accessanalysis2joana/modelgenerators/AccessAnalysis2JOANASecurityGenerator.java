package org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications.Correspondences;
import org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications.ProvidedSignature;
import org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.AccessAnalysisResolutionUtil;
import org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.JOANAModelGenerationUtil;
import org.palladiosimulator.pcm.repository.Repository;

import com.google.common.collect.Sets;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;


public class AccessAnalysis2JOANASecurityGenerator {
	
	private final Repository repository;
	private final Correspondences correspondences;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final JOANARoot root;
	
	
	public AccessAnalysis2JOANASecurityGenerator(Repository repository, Correspondences correspondences,
			ConfidentialitySpecification accessAnalysisSpec) {
		super();
		this.repository = repository;
		this.correspondences = correspondences;
		this.accessAnalysisSpec = accessAnalysisSpec;
		this.root = JoanaFactory.eINSTANCE.createJOANARoot();
	}
	
	public void generateJOANASpecification() {
		
	}
	
	public void generateConfiguration_EntryPoint(ProvidedSignature target) {
		
	}
	
	
	private Collection<Level> generateLevels() {
		
		
		Set<List<Level>> securityLevelPowerSet = generatePowerSetWithSortedLevels();
		
		
		Collection<Level> securityLevels = new HashSet<Level>();
		
		for(List<Level> securityLevelNames : securityLevelPowerSet) {
			
			String securityLevelName = combineLevelNames(securityLevelNames);
			Level level = JOANAModelGenerationUtil.generateLevel(securityLevelName);
			
			securityLevels.add(level);
		}
		
		return securityLevels;
	}

	private Collection<MayFlow> generateMayFlows(Collection<Level> availableLevels) {

		Collection<MayFlow> allowedFlows = new ArrayList<MayFlow>();
		Set<List<Level>> securityLevelPowerSet = generatePowerSetWithSortedLevels();
		
		for(List<Level> potentiallyFrom : securityLevelPowerSet) {
			for(List<Level> potentiallyTo: securityLevelPowerSet) {
				
				if(allowedFlowCondition(potentiallyFrom, potentiallyTo)) {
					Level from = findCombinedLevelForSeperateLevels(potentiallyFrom, availableLevels);
					Level to = findCombinedLevelForSeperateLevels(potentiallyTo, availableLevels);
					
					MayFlow allowed = JOANAModelGenerationUtil.generateMayFlow(from, to);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}

	private String combineLevelNames(Collection<Level> securityLevels) {
		List<String> securityLevelNames = securityLevels.stream().map(securityLevel -> securityLevel.getName()).collect(Collectors.toList());
		
		return String.join("", securityLevelNames);
	}

	private Set<Set<Level>> generatePowerSetOfLevels() {
		Set<Level> basicLevels = new HashSet<Level>();

		// initial set
		for (DataSet dataSet : AccessAnalysisResolutionUtil.filterDataSets(accessAnalysisSpec.getDataIdentifier())) {
			Level level = JOANAModelGenerationUtil.generateLevel(dataSet.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}

	private List<Level> sortLevels(Collection<Level> levels){
		return levels.stream().sorted(Comparator.comparing(Level::getName)).collect(Collectors.toList());
	}
	
	private Set<List<Level>> generatePowerSetWithSortedLevels(){
		Set<Set<Level>> powerSetLevels = generatePowerSetOfLevels();
		Set<List<Level>> powerSetWithSortedLevels = new HashSet<List<Level>>();
		
		for(Set<Level> set : powerSetLevels) {
			if(!set.isEmpty()) {
				powerSetWithSortedLevels.add(sortLevels(set));
			}
		}
		
		return powerSetWithSortedLevels;
	}
	
	//Allowed Flow Condition according to Häring
	private boolean allowedFlowCondition(Collection<Level> potentiallyFrom, Collection<Level> potentiallyTo) {
		return potentiallyFrom.size() == potentiallyTo.size() + 1 && potentiallyFrom.containsAll(potentiallyTo);	
	}
	
	private Level findCombinedLevelForSeperateLevels(Collection<Level> seperateLevels, Collection<Level> combinedLevels) {
		for(Level combined : combinedLevels) {
			String combinedNameOfSeparateLevels = combineLevelNames(seperateLevels);
			
			if(combined.getName().equals(combinedNameOfSeparateLevels)) {
				return combined;
			}
		}
		
		return null;
	}
	
	private Level getLevelForDataSets(Collection<DataSet> datasets, Collection<Level> levels) {
		Collection<DataSet> sortedDataSets = datasets.stream().sorted(Comparator.comparing(DataSet::getName)).collect(Collectors.toList());
		List<String> dataSetsNames = sortedDataSets.stream().map(dataset -> dataset.getName()).collect(Collectors.toList());
		String combinedDataSetName = String.join("", dataSetsNames);
		
		for(Level level : levels) {
			if(level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}
	
}
