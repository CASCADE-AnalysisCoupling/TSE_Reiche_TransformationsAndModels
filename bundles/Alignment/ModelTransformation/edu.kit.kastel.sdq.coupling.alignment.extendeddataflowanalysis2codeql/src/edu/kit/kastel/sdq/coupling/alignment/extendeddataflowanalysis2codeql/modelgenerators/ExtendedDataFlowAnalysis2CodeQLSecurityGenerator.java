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

import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Enumeration;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.OperationSignature;

import com.google.common.collect.Sets;

import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;

public class ExtendedDataFlowAnalysis2CodeQLSecurityGenerator {

	private final TainttrackingRoot root;
	private final ExtensionRoot extensionRoot;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final DataDictionaryCharacterized dictionary;
	private static final String SUBLEVEL_DELIMITER = ";";

	public ExtendedDataFlowAnalysis2CodeQLSecurityGenerator(ExtensionRoot extensionRoot,
			PCMJavaCorrespondenceRoot correspondences, DataDictionaryCharacterized dictionary) {
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

		for (ProvidedParameterCharacteristicAnnotation annotation : extensionRoot.getParameterAnnotations()) {
			OperationSignature signature = (OperationSignature) annotation.getProvidedParameter().getProvidedOperation()
					.getOperationSignature();

			//Assume for test purposes that only one characteristic is annotated which contains the 
			//elements from which the security levels are calculated from.
			for (EnumCharacteristic characteristic : annotation.getCharacteristics()) {

				ProvidedParameterIdentification pcmParameter = getParameterIdentification(signature,
						annotation.getProvidedParameter().getParameter().getParameterName());
				Parameter param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, pcmParameter);
				SecurityLevel level = getSecurityLevelForLiterals(characteristic.getValues(), codeQLSecurityLevels);
				ParameterAnnotation codeqlAnnotation = CodeQLModelgenerationUtil.generateParameterAnnotation(param,
						level);

				annotations.add(codeqlAnnotation);
			}
		}
		return annotations;
	}

	private Collection<SecurityLevel> generateSecurityLevels() {

		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels();

		Collection<SecurityLevel> securityLevels = new HashSet<SecurityLevel>();

		for (List<SecurityLevel> securityLevelNames : securityLevelPowerSet) {

			String securityLevelName = combineSecurityLevelNames(securityLevelNames);
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(securityLevelName);

			securityLevels.add(level);
		}

		return securityLevels;
	}

	private Collection<AllowedFlow> generateAllowedFlows(Collection<SecurityLevel> availableLevels) {

		Collection<AllowedFlow> allowedFlows = new ArrayList<AllowedFlow>();
		Set<List<SecurityLevel>> securityLevelPowerSet = generatePowerSetWithSortedLevels();

		for (List<SecurityLevel> potentiallyFrom : securityLevelPowerSet) {
			for (List<SecurityLevel> potentiallyTo : securityLevelPowerSet) {

				if (allowedFlowCondition(potentiallyFrom, potentiallyTo)) {
					SecurityLevel from = findCombinedLevelForSeperateLevels(potentiallyFrom, availableLevels);
					SecurityLevel to = findCombinedLevelForSeperateLevels(potentiallyTo, availableLevels);

					AllowedFlow allowed = CodeQLModelgenerationUtil.generateAllowedFlow(from, to);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}

	private String combineSecurityLevelNames(Collection<SecurityLevel> securityLevels) {
		List<String> securityLevelNames = securityLevels.stream().map(securityLevel -> securityLevel.getName())
				.collect(Collectors.toList());

		return String.join(SUBLEVEL_DELIMITER, securityLevelNames);
	}

	private Set<Set<SecurityLevel>> generatePowerSetOfSecurityLevels() {
		Set<SecurityLevel> basicLevels = new HashSet<SecurityLevel>();

		/*
		 * TODO: This is fitted that only one enumeration exists (e.g., in
		 * Travelplanner). Remark that a generation of a fitting lattice and joined
		 * levels has to be provided if multiple Enumerations exist (work of Felix?) -
		 * however, not necessary for TSE Eval.
		 */
		Enumeration targetEnum = dictionary.getEnumerations().get(0);

		// initial set
		for (Literal literal : targetEnum.getLiterals()) {
			SecurityLevel level = CodeQLModelgenerationUtil.generateSecurityLevel(literal.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}

	private List<SecurityLevel> sortSecurityLevels(Collection<SecurityLevel> levels) {
		return levels.stream().sorted(Comparator.comparing(SecurityLevel::getName)).collect(Collectors.toList());
	}

	private Set<List<SecurityLevel>> generatePowerSetWithSortedLevels() {
		Set<Set<SecurityLevel>> powerSetSecurityLevels = generatePowerSetOfSecurityLevels();
		Set<List<SecurityLevel>> powerSetWithSortedLevels = new HashSet<List<SecurityLevel>>();

		for (Set<SecurityLevel> set : powerSetSecurityLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(sortSecurityLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}

	// Allowed Flow Condition according to Häring
	private boolean allowedFlowCondition(Collection<SecurityLevel> potentiallyFrom,
			Collection<SecurityLevel> potentiallyTo) {
		return potentiallyFrom.size() == potentiallyTo.size() + 1 && potentiallyFrom.containsAll(potentiallyTo);
	}

	private SecurityLevel findCombinedLevelForSeperateLevels(Collection<SecurityLevel> seperateLevels,
			Collection<SecurityLevel> combinedLevels) {
		for (SecurityLevel combined : combinedLevels) {
			String combinedNameOfSeparateLevels = combineSecurityLevelNames(seperateLevels);

			if (combined.getName().equals(combinedNameOfSeparateLevels)) {
				return combined;
			}
		}

		return null;
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

	private ProvidedParameterIdentification getParameterIdentification(OperationSignature signature, String name) {
		Collection<ProvidedParameterIdentification> generatedParameterIdentifications = PCMJavaCorrespondenceResolutionUtils
				.getProvidedParameters(correspondences);

		for (ProvidedParameterIdentification identification : generatedParameterIdentifications) {
			if (identification.getProvidedSignature().getProvidedSignature().equals(signature)
					&& identification.getParameter().getParameterName().equals(name)) {
				return identification;
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
