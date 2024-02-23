package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.dataflowanalysis.analysis.DataFlowAnalysisBuilder;
import org.dataflowanalysis.analysis.DataFlowConfidentialityAnalysis;
import org.dataflowanalysis.analysis.core.AbstractActionSequenceElement;
import org.dataflowanalysis.analysis.core.ActionSequence;
import org.dataflowanalysis.analysis.core.CharacteristicValue;
import org.dataflowanalysis.analysis.core.DataFlowVariable;
import org.dataflowanalysis.analysis.pcm.PCMDataFlowConfidentialityAnalysis;
import org.dataflowanalysis.analysis.pcm.PCMDataFlowConfidentialityAnalysisBuilder;
import org.dataflowanalysis.analysis.pcm.core.seff.SEFFActionSequenceElement;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.StartAction;

import edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.Activator;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;

public class BasicParameterExtensionAnalysis {
	public static String MODEL_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extension.dataflowanalysis.parameterannotation/models";
	
	private static final String BASE_PATH = Paths.get("/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow/models").toAbsolutePath().toString(); 
	private static final String USAGE_MODEL_PATH = Paths.get(BASE_PATH, "travelplanner.usagemodel").toAbsolutePath().toString();
	private static final String ALLOCATION_MODEL_PATH = Paths.get(BASE_PATH, "travelplanner.allocation").toAbsolutePath().toString();
	private static final String NODECHARACTERISTICS_MODEL_PATH = Paths.get(BASE_PATH, "travelplanner.nodecharacteristics").toAbsolutePath().toString();
	private static final String PARAMETER_ANNOTATION_EXTENSION_MODEL_PATH = Paths.get(BASE_PATH, "travelplanner.parameterannotation").toAbsolutePath().toString();
	
	@Test
	public void basicExtensionAnalysisTest() {
		final var usageModelURI = URI.createFileURI(USAGE_MODEL_PATH);
		final var allocationURI = URI.createFileURI(ALLOCATION_MODEL_PATH);
		final var nodeCharacteristicsURI = URI.createFileURI(NODECHARACTERISTICS_MODEL_PATH);
		final var extensionModelURI = URI.createFileURI(PARAMETER_ANNOTATION_EXTENSION_MODEL_PATH);

		PCMDataFlowConfidentialityAnalysis travelPlannerAnalysis = new PCMDataFlowConfidentialityAnalysisBuilder()
				.standalone().modelProjectName(MODEL_PROJECT_NAME).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		travelPlannerAnalysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
															// propagation Information
		travelPlannerAnalysis.initializeAnalysis();

		List<ActionSequence> actionSequences = travelPlannerAnalysis.findAllSequences();

		List<ActionSequence> propagationResult = travelPlannerAnalysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) travelPlannerAnalysis
				.getResourceProvider()).getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = travelPlannerAnalysis.queryDataFlow(actionSequence,
					it -> extensionCondition(it, config, travelPlannerAnalysis));

			assertTrue(violations.isEmpty());

		}
	}

	private boolean extensionCondition(AbstractActionSequenceElement<?> node, ParameterAnnotations parameterAnnotations,
			PCMDataFlowConfidentialityAnalysis analysis) {

		boolean parameterAnnotationAndResourceCharacteristicsFit = false;
		boolean propagationAndNodeCharacteristicsFit = false;
		boolean propagationCharacteristicsAndParameterAnnotationsFit = false;

		if (node instanceof SEFFActionSequenceElement<?>) {
			SEFFActionSequenceElement<?> seffNode = (SEFFActionSequenceElement<?>) node;
			if (seffNode.getElement() instanceof StartAction) {

				// Determines, whether annotated parameter characteristics violate annotated
				// resource characteristics
				parameterAnnotationAndResourceCharacteristicsFit = nodeCharacteristicsAndParameterCharacteristicsViolated(
						seffNode, parameterAnnotations, analysis);

				// Determines, whether propagated data characteristics violate the annotated
				// parameter characteristics
				propagationCharacteristicsAndParameterAnnotationsFit = propagationResultsAndParameterAnnotationsViolated(
						seffNode, parameterAnnotations, analysis);

				// Determines whether propagated data characteristics and calculated node
				// characteristics fit;
				// propagationAndNodeCharacteristicsFit =
				// propagationResultAndNodeCharacteristicsViolated(seffNode,
				// analysis);

			}

		}

		return parameterAnnotationAndResourceCharacteristicsFit | propagationCharacteristicsAndParameterAnnotationsFit
				| propagationAndNodeCharacteristicsFit;

	}

	private boolean propagationResultAndNodeCharacteristicsViolated(SEFFActionSequenceElement<?> seffNode,
			PCMDataFlowConfidentialityAnalysis analysis) {
		Collection<DataFlowVariable> dataFlowVariables = seffNode.getAllDataFlowVariables();
		var nodeCharacteristics = seffNode.getAllNodeCharacteristics();

		for (DataFlowVariable dfVar : dataFlowVariables) {

			var dataFlowVaribleCharacteristics = calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
					dfVar.characteristics());

			for (CharacteristicValue dfValue : dfVar.getAllCharacteristics()) {
				boolean anyMatch = false;
				for (CharacteristicValue nodeValue : nodeCharacteristics) {
					if (characteristicValueTypeMatch(dfValue, nodeValue) && characteristicValueLiteralMatch(dfValue, nodeValue)) {
						anyMatch = true;
						break;
					}
				}

				if (!anyMatch) {
					return true;
				}
			}
		}

		return false;
	}
	
	private boolean characteristicValueTypeMatch(CharacteristicValue first, CharacteristicValue second) {
		return first.getTypeName().equals(second.getTypeName());
	}
	
	private boolean characteristicValueLiteralMatch(CharacteristicValue first, CharacteristicValue second) {
		return first.getValueId().equals(second.getValueId());
	}

	private boolean propagationResultsAndParameterAnnotationsViolated(SEFFActionSequenceElement<?> seffNode,
			ParameterAnnotations paramterAnnotations, PCMDataFlowConfidentialityAnalysis analysis) {

		Collection<ParameterAnnotation> seffParameterAnnotations = getAllParameterAnnotationsForSeff(
				seffNode, paramterAnnotations, analysis);
	
		for (DataFlowVariable dfVar : seffNode.getAllDataFlowVariables()) {
			Collection<ParameterAnnotation> parameterAnnotationsForDataFlowVariable = seffParameterAnnotations.stream()
					.filter(annot -> annot.getParameterIdentification().getParameter().getParameterName()
							.equals(dfVar.variableName()))
					.toList();

			Map<String, Collection<LiteralStringRepresentation>> dataFlowCharacteristicTypesAndLiterals = calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
					dfVar.characteristics());

			if (characteristicsLiteralsViolateParameterAnnotations("Data Flows to Parameter", parameterAnnotationsForDataFlowVariable,
					dataFlowCharacteristicTypesAndLiterals)) {
				return true;
			}

		}

		return false;
	}

	private boolean nodeCharacteristicsAndParameterCharacteristicsViolated(SEFFActionSequenceElement<?> seffNode,
			ParameterAnnotations parameterAnnotations, PCMDataFlowConfidentialityAnalysis analysis) {

		Map<String, Collection<LiteralStringRepresentation>> mappedNodeCharacteristics = calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
				seffNode.getAllNodeCharacteristics());

		Collection<ParameterAnnotation> parameterAnnotationsForSeff = getAllParameterAnnotationsForSeff(
				seffNode, parameterAnnotations, analysis);

		return characteristicsLiteralsViolateParameterAnnotations("Annotations Deployed On Node", parameterAnnotationsForSeff, mappedNodeCharacteristics);

	}

	private boolean characteristicsLiteralsViolateParameterAnnotations(
			String purpose,
			Collection<ParameterAnnotation> parameterAnnotations,
			Map<String, Collection<LiteralStringRepresentation>> typesAndLiterals) {

		for (ParameterAnnotation annot : parameterAnnotations) {
			Map<String, Collection<LiteralStringRepresentation>> mappedParameterAnnotationCharacteristics = calculateAllLiteralsForEnumCharacteristicsForParameterAnnotation(
					annot);

			for (Entry<String, Collection<LiteralStringRepresentation>> entry : mappedParameterAnnotationCharacteristics
					.entrySet()) {
				Optional<Entry<String, Collection<LiteralStringRepresentation>>> potentialNodeCharacteristicEntry = retrieveMappingEntryByID(
						typesAndLiterals, entry.getKey());

				if (potentialNodeCharacteristicEntry.isPresent()) {
					
					Collection<LiteralStringRepresentation> parameterLiterals = entry.getValue();
					Collection<LiteralStringRepresentation> nodeLiterals = potentialNodeCharacteristicEntry.get().getValue();
					
					if (!isAllowed(parameterLiterals, nodeLiterals )) {
						
						printLiteralRelations(purpose, nodeLiterals, parameterLiterals);
						
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private void printLiteralRelations(String checkPurpose, Collection<LiteralStringRepresentation> dataLiterals, Collection<LiteralStringRepresentation> checkAgainst){
		String unifiedDataLiteralNames = dataLiterals.stream().map(LiteralStringRepresentation::name).sorted().collect(Collectors.joining(";"));
		String unifiedCheckAgainstNames = checkAgainst.stream().map(LiteralStringRepresentation::name).sorted().collect(Collectors.joining(";"));
		
		System.out.println(String.format("%s: %s ->  %s", checkPurpose ,unifiedDataLiteralNames, unifiedCheckAgainstNames));
		
	}

	private boolean isAllowed(Collection<LiteralStringRepresentation> dataLiterals, Collection<LiteralStringRepresentation> checkAgainst) {
		
		List<String> dataLiteralNames = dataLiterals.stream().map(LiteralStringRepresentation::name).collect(Collectors.toList());
		List<String> checkAgainstNames = checkAgainst.stream().map(LiteralStringRepresentation::name).collect(Collectors.toList());
		
		
		return isAllowed(dataLiteralNames, checkAgainstNames);
	}
	
	private boolean isAllowed(List<String> dataLiterals, List<String> checkAgainst) {
		
		return literalsAreEqual(dataLiterals, checkAgainst) 
				//following conditions results in the "may know" semantics
				|| dataLiterals.stream().anyMatch(lit -> checkAgainst.contains(lit))
				|| (literalNamesContains(dataLiterals, "TravelAgency", "Airline", "User") && literalNamesContains(checkAgainst, "Airline", "User")) 
				|| (literalNamesContains(dataLiterals, "Airline", "User") && literalNamesContains(checkAgainst, "User"));
	}
	

	private boolean literalNamesContains(List<String> literals, String... targets) {
		
		List<String> targetLiterals = Arrays.asList(targets);
		
		Collections.sort(literals);
		Collections.sort(targetLiterals);
		
		
		return literals.equals(targetLiterals);
	}
	
	private boolean literalsAreEqual(List<String> dataLiterals, List<String> checkAgainst) {
		Collections.sort(dataLiterals);
		Collections.sort(checkAgainst);
		
		return dataLiterals.size() == checkAgainst.size() && dataLiterals.containsAll(checkAgainst);
	}

	private Map<String, Collection<LiteralStringRepresentation>> calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
			Collection<CharacteristicValue> values) {
		Map<String, Collection<LiteralStringRepresentation>> mapping = new HashMap<>();

		for (CharacteristicValue value : values) {
			if (!mapping.containsKey(value.getTypeName())) {
				Collection<LiteralStringRepresentation> literals = new HashSet<LiteralStringRepresentation>();

				mapping.put(value.getTypeName(), literals);
			}

			mapping.get(value.getTypeName()).add(new LiteralStringRepresentation(value.getValueName(), value.getValueId(), value.getTypeName()));

		}

		return mapping;
	}

	// Use design choice that all enum characteristic literals are annotated in one
	// parameterannotation.
	// If multiple parameterannotations with different types (!!!see paper!!!) are
	// used, collect the enum characteristic literals per enum characteristic type
	// over all annotations;
	private Map<String, Collection<LiteralStringRepresentation>> calculateAllLiteralsForEnumCharacteristicsForParameterAnnotation(
			ParameterAnnotation annotation) {

		var mapping = new HashMap<String, Collection<LiteralStringRepresentation>>();

		for (EnumCharacteristic characteristic : annotation.getCharacteristics()) {

			if (!mapping.containsKey(characteristic.getEnumCharacteristicType().getName())) {
				Collection<LiteralStringRepresentation> literals = new HashSet<LiteralStringRepresentation>();
				mapping.put(characteristic.getEnumCharacteristicType().getName(), literals);
			}

			mapping.get(characteristic.getEnumCharacteristicType().getName()).addAll(characteristic.getValues().stream().map(literal -> new LiteralStringRepresentation(literal.getName(), literal.getId(), characteristic.getType().getName())).collect(Collectors.toList()));
		}

		return mapping;
	}

	private Optional<Entry<String, Collection<LiteralStringRepresentation>>> retrieveMappingEntryByID(
			Map<String, Collection<LiteralStringRepresentation>> mapping, String nameToSearch) {
		return mapping.entrySet().stream().filter(entry -> entry.getKey().equals(nameToSearch)).findFirst();
	}

	private Collection<ParameterAnnotation> getAllParameterAnnotationsForSeff(SEFFActionSequenceElement<?> seffNode,
			ParameterAnnotations parameterAnnotations, PCMDataFlowConfidentialityAnalysis analysis) {

		final var parameterAnnotationsForSeff = new HashSet<ParameterAnnotation>();

		for (RepositoryComponent component : seffNode.getContext().stream()
				.map(context -> context.getEncapsulatedComponent__AssemblyContext()).collect(Collectors.toList())) {

			if (component instanceof BasicComponent) {

				Optional<ResourceDemandingSEFF> seff = ((BasicComponent) component)
						.getServiceEffectSpecifications__BasicComponent().stream()
						.filter(ResourceDemandingSEFF.class::isInstance).map(ResourceDemandingSEFF.class::cast)
						.filter(rdSeff -> rdSeff.getSteps_Behaviour().contains(seffNode.getElement())).findFirst();

				if (seff.isPresent()) {

					Collection<OperationProvidedRole> possibleProvidedRoles = component
							.getProvidedRoles_InterfaceProvidingEntity().stream()
							.filter(OperationProvidedRole.class::isInstance).map(OperationProvidedRole.class::cast)
							.collect(Collectors.toList());

					var possibleParameterAnnotations = new HashSet<ParameterAnnotation>();

					Signature targetSeffSignature = seff.get().getDescribedService__SEFF();

					if (targetSeffSignature instanceof OperationSignature) {
						OperationSignature seffOpSig = (OperationSignature) targetSeffSignature;

						for (ParameterAnnotation paramAnnotation : parameterAnnotations.getAnnotations()) {
							if (paramAnnotation
									.getParameterIdentification() instanceof ProvidedOperationParameterIdentification) {
								for (OperationProvidedRole provRole : possibleProvidedRoles) {
									if (providedOperationParameterIdentificationFits(
											(ProvidedOperationParameterIdentification) paramAnnotation
													.getParameterIdentification(),
											provRole, seffOpSig)) {
										possibleParameterAnnotations.add(paramAnnotation);
									}
								}
							} else if (generalParameterIdentificationFits(paramAnnotation.getParameterIdentification(),
									seffOpSig)) {
								possibleParameterAnnotations.add(paramAnnotation);
							}

						}

						for (Parameter param : seffOpSig.getParameters__OperationSignature()) {
							for (ParameterAnnotation paramAnnotation : possibleParameterAnnotations) {
								if (paramAnnotation.getParameterIdentification().getOperationSignature().getId()
										.equals(seffOpSig.getId())
										&& paramAnnotation.getParameterIdentification().getParameter()
												.getParameterName().equals(param.getParameterName())) {
									parameterAnnotationsForSeff.add(paramAnnotation);
								}
							}

						}
					}
				}
			}
		}
		return parameterAnnotationsForSeff;
	}

	private boolean generalParameterIdentificationFits(GeneralOperationParameterIdentification parameterIdent,
			OperationSignature toCheckAgainst) {
		return parameterIdent.getOperationSignature().getId().equals(toCheckAgainst.getId());
	}

	private boolean providedOperationParameterIdentificationFits(
			ProvidedOperationParameterIdentification parameterIdent, OperationProvidedRole providedRoleToCheck,
			OperationSignature operationSignaturetoCheck) {
		return providedRoleToCheck.getId().equals(parameterIdent.getProvidedRole().getId())
				&& providedRoleToCheck.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()
						.contains(operationSignaturetoCheck)
				&& generalParameterIdentificationFits(parameterIdent, operationSignaturetoCheck);
	}

}
