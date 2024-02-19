package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Enumeration;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.OperationSignature;

import com.google.common.collect.Sets;

import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.labeledtaintflow.CodeQLLabeledTaintFlowUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public class ExtendedDataFlowAnalysis2CodeQLSecurityGenerator {

	private final TainttrackingRoot root;
	private final ParameterAnnotations extensionRoot;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final PCMDataDictionary dictionary;
	private static final String SUBLEVEL_DELIMITER = ";";
	private static final boolean HIGH_CONJUNCTIVE = false;
	
	
	public ExtendedDataFlowAnalysis2CodeQLSecurityGenerator(ParameterAnnotations extensionRoot,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		super();
		this.root = CodeQLModelgenerationUtil.generateDataFlowRoot();
		this.extensionRoot = extensionRoot;
		this.correspondences = correspondences;
		this.dictionary = dictionary;
	}

	public void generateCodeQLConfiguration() {
		Configuration config = CodeQLModelgenerationUtil.generateConfiguration();

		Collection<SecurityLevel> appliedSecurityLevels = generateSecurityLevels();
		Collection<AllowedFlow> allowedFlows = generateAllowedFlows(appliedSecurityLevels);
		Collection<SecurityLevelAnnotation> annotations = generateSecurityLevelAnnotations(appliedSecurityLevels);

		config.getAppliedSecurityLevel().addAll(appliedSecurityLevels);
		config.getAllowedFlows().addAll(allowedFlows);
		config.getSecurityLevelAnnotations().addAll(annotations);

		root.getConfigurations().add(config);

	}

	private Collection<SecurityLevelAnnotation> generateSecurityLevelAnnotations(
			Collection<SecurityLevel> codeQLSecurityLevels) {

		Collection<SecurityLevelAnnotation> annotations = new ArrayList<SecurityLevelAnnotation>();

		for(edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation annotation : extensionRoot.getAnnotations()) {
			
			if(annotation.getParameterIdentification() instanceof ProvidedParameterIdentification) {
				ProvidedParameterIdentification provParam = (ProvidedParameterIdentification) annotation.getParameterIdentification();
				OperationSignature signature = (OperationSignature) provParam.getProvidedSignature().getProvidedSignature();
				

				//Assume for eval purposes that only one characteristic is annotated which contains the 
				//elements from which the security levels are calculated from.
				for (EnumCharacteristic characteristic : annotation.getCharacteristics()) {

					ProvidedParameterIdentification pcmParameter = PCMJavaCorrespondenceResolutionUtils.getParameterIdentification(correspondences, signature,
							provParam.getParameter().getParameterName());
					Parameter param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, pcmParameter);
					SecurityLevel level = getSecurityLevelForLiterals(characteristic.getValues(), codeQLSecurityLevels);
					ParameterAnnotation codeqlAnnotation = CodeQLModelgenerationUtil.generateParameterAnnotation(param,
							level);

					annotations.add(codeqlAnnotation);
				}
			} 
			
			//TODO: Add Case when General Identification is used.
			
			
		}
	
		return annotations;
	}

	private Collection<SecurityLevel> generateSecurityLevels() {

		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels();

		Collection<SecurityLevel> securityLevels = new HashSet<SecurityLevel>();

		for (List<SecurityLevel> securityLevelNames : securityLevelPowerSet) {

			String securityLevelName =  CodeQLLabeledTaintFlowUtil.combineSecurityLevelNames(SUBLEVEL_DELIMITER, securityLevelNames);
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(securityLevelName);

			securityLevels.add(level);
		}

		return securityLevels;
	}

	/* 
	 * TODO The current lattice is a superset lattice. However, it would also be possible to use the allowed flows specified in the data flow analysis
	 * as information source.  
	 */
	private Collection<AllowedFlow> generateAllowedFlows(Collection<SecurityLevel> availableLevels) {

		Collection<AllowedFlow> allowedFlows = new ArrayList<AllowedFlow>();
		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels();

		for (List<SecurityLevel> potentiallyFrom : securityLevelPowerSet) {
			for (List<SecurityLevel> potentiallyTo : securityLevelPowerSet) {

				if (CodeQLLabeledTaintFlowUtil.allowedFlowConditionConjunctive(HIGH_CONJUNCTIVE, potentiallyFrom, potentiallyTo)) {
					SecurityLevel from = CodeQLLabeledTaintFlowUtil.findCombinedLevelForSeperateLevels(SUBLEVEL_DELIMITER, potentiallyFrom, availableLevels);
					SecurityLevel to = CodeQLLabeledTaintFlowUtil.findCombinedLevelForSeperateLevels(SUBLEVEL_DELIMITER, potentiallyTo, availableLevels);

					AllowedFlow allowed = CodeQLModelgenerationUtil.generateAllowedFlow(from, to);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}


	private Set<Set<SecurityLevel>> generatePowerSetOfSecurityLevels() {
		Set<SecurityLevel> basicLevels = new HashSet<SecurityLevel>();

		/*
		 * TODO: This is fitted that only one enumeration exists (e.g., in
		 * Travelplanner). 
		 * Remark: Generation of a fitting lattice and joined
		 * levels has to be provided if multiple Enumerations exist -
		 * however, not necessary for TSE Eval.
		 */
		Enumeration targetEnum = dictionary.getCharacteristicEnumerations().get(0);

		// initial set
		for (Literal literal : targetEnum.getLiterals()) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(literal.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}

	private Set<List<SecurityLevel>> generatePowerSetWithSortedLevels() {
		Set<Set<SecurityLevel>> powerSetSecurityLevels = generatePowerSetOfSecurityLevels();
		Set<List<SecurityLevel>> powerSetWithSortedLevels = new HashSet<List<SecurityLevel>>();

		for (Set<SecurityLevel> set : powerSetSecurityLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(CodeQLLabeledTaintFlowUtil.sortSecurityLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}

	private SecurityLevel getSecurityLevelForLiterals(Collection<Literal> literals,
			Collection<SecurityLevel> securityLevels) {
		Collection<Literal> sortedDataSets = literals.stream().sorted(Comparator.comparing(Literal::getName))
				.collect(Collectors.toList());
		List<String> dataSetsNames = sortedDataSets.stream().map(dataset -> dataset.getName())
				.collect(Collectors.toList());
		String combinedDataSetName = String.join(SUBLEVEL_DELIMITER, dataSetsNames);

		for (SecurityLevel level : securityLevels) {
			if (level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}

	public TainttrackingRoot getRoot() {
		return root;
	}

	public PCMJavaCorrespondenceRoot getCorrespondences() {
		return correspondences;
	}
}
