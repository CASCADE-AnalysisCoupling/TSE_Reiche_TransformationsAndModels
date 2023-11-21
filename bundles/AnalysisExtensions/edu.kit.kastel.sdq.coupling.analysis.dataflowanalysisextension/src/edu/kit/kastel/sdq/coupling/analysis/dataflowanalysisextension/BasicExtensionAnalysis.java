package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.log4j.Level;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.palladiosimulator.dataflow.confidentiality.analysis.builder.DataFlowAnalysisBuilder;
import org.palladiosimulator.dataflow.confidentiality.analysis.builder.pcm.PCMDataFlowConfidentialityAnalysisBuilder;
import org.palladiosimulator.dataflow.confidentiality.analysis.characteristics.CharacteristicValue;
import org.palladiosimulator.dataflow.confidentiality.analysis.characteristics.DataFlowVariable;
import org.palladiosimulator.dataflow.confidentiality.analysis.core.StandalonePCMDataFlowConfidentialityAnalysis;
import org.palladiosimulator.dataflow.confidentiality.analysis.entity.pcm.seff.SEFFActionSequenceElement;
import org.palladiosimulator.dataflow.confidentiality.analysis.entity.sequence.AbstractActionSequenceElement;
import org.palladiosimulator.dataflow.confidentiality.analysis.entity.sequence.ActionSequence;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristicType;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.StartAction;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterIdentification;

public class BasicExtensionAnalysis {
	public static String TEST_MODEL_PROJECT_NAME = "org.palladiosimulator.dataflow.confidentiality.analysis.testmodels";
	private static final String TRAVELPLANNER_EXTENSION_MODEL_PATH = Paths.get(
			"/home/frederik/Arbeitsplatz/git/tools/dataflowanalysis/DataFlowAnalysis/tests/org.palladiosimulator.dataflow.confidentiality.analysis.testmodels/models/TravelPlannerNew/My.dataflowanalysisextension")
			.toString();

	@Test
	public void basicExtensionAnalysisTest() {
		final var usageModelPath = Paths.get("models", "TravelPlannerNew", "travelPlanner.usagemodel").toString();
		final var allocationPath = Paths.get("models", "TravelPlannerNew", "travelPlanner.allocation").toString();
		final var nodeCharacteristicsPath = Paths.get("models", "TravelPlannerNew",
				"travelPlanner.nodecharacteristics");

		StandalonePCMDataFlowConfidentialityAnalysis travelPlannerAnalysis = (StandalonePCMDataFlowConfidentialityAnalysis) new DataFlowAnalysisBuilder()
				.standalone().modelProjectName(TEST_MODEL_PROJECT_NAME)
				.useBuilder(new PCMDataFlowConfidentialityAnalysisBuilder()).usePluginActivator(Activator.class)
				.useUsageModel(usageModelPath.toString()).useAllocationModel(allocationPath.toString())
				.useNodeCharacteristicsModel(nodeCharacteristicsPath.toString()).build();

		travelPlannerAnalysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
															// propagation Information
		travelPlannerAnalysis.initializeAnalysis();

		ResourceSet resSet = travelPlannerAnalysis.getResourceProvider().getResources().iterator().next()
				.getResourceSet();

		URI extensionModelUri = URI.createFileURI(TRAVELPLANNER_EXTENSION_MODEL_PATH);
		Resource resourceExtensionModel = resSet.getResource(extensionModelUri, true);
		EcoreUtil.resolveAll(resourceExtensionModel);

		List<ActionSequence> actionSequences = travelPlannerAnalysis.findAllSequences();

		List<ActionSequence> propagationResult = travelPlannerAnalysis.evaluateDataFlows(actionSequences);

		ExtensionRoot config = (ExtensionRoot) resourceExtensionModel.getContents().get(0);

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = travelPlannerAnalysis.queryDataFlow(actionSequence,
					it -> extensionCondition(it, config, travelPlannerAnalysis));

			assertTrue(violations.isEmpty());

		}
	}

	private boolean extensionCondition(AbstractActionSequenceElement<?> node, ExtensionRoot extensionRoot,
			StandalonePCMDataFlowConfidentialityAnalysis analysis) {

		boolean annotationsFit = false;
		boolean propagationAndNodeCharacteristicsFit = false;
		boolean propagationCharacteristicsAndParameterAnnotationsFit = false;

		if (node instanceof SEFFActionSequenceElement<?>) {
			SEFFActionSequenceElement<?> seffNode = (SEFFActionSequenceElement<?>) node;
			if (seffNode.getElement() instanceof StartAction) {

				// Determines, whether annotated parameter characteristics violate annotated
				// resource characteristics
				annotationsFit = nodeCharacteristicsAndParameterCharacteristicsViolated(seffNode, extensionRoot, analysis);

				// Determines, whether propagated data characteristics violate the annotated
				// parameter characteristics
				propagationCharacteristicsAndParameterAnnotationsFit = propagationResultsAndParameterAnnotationsViolated(
						seffNode, extensionRoot, analysis);

				// Determines whether propagated data characteristics and calculated node
				// characteristics fit;
				//propagationAndNodeCharacteristicsFit = propagationResultAndNodeCharacteristicsViolated(seffNode,
						//analysis);

			}

		}

		return annotationsFit | propagationCharacteristicsAndParameterAnnotationsFit
				| propagationAndNodeCharacteristicsFit;

	}

	private boolean propagationResultAndNodeCharacteristicsViolated(SEFFActionSequenceElement<?> seffNode,
			StandalonePCMDataFlowConfidentialityAnalysis analysis) {
		Collection<DataFlowVariable> dataFlowVariables = seffNode.getAllDataFlowVariables();
		var nodeCharacteristics = seffNode.getAllNodeCharacteristics();

		for (DataFlowVariable dfVar : dataFlowVariables) {
			
			var dataFlowVaribleCharacteristics = calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(dfVar.characteristics());
			
			for (Entry<EnumCharacteristicType, Collection<Literal>> entry : dataFlowVaribleCharacteristics
					.entrySet()) {
				
				
				
			}
			
			
			for (CharacteristicValue dfValue : dfVar.getAllCharacteristics()) {
				boolean anyMatch = false;
				for (CharacteristicValue nodeValue : nodeCharacteristics) {
					if (dfValue.characteristicType().getId().equals(nodeValue.characteristicType().getId()) && dfValue
							.characteristicLiteral().getId().equals(nodeValue.characteristicLiteral().getId())) {
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

	private boolean propagationResultsAndParameterAnnotationsViolated(SEFFActionSequenceElement<?> seffNode,
			ExtensionRoot extensionRoot, StandalonePCMDataFlowConfidentialityAnalysis analysis) {

		Collection<ProvidedParameterIdentification> seffProvidedParameterIdentificatons = getAllAnnotatedParametersForSeff(
				seffNode, extensionRoot, analysis);
		Collection<ProvidedParameterCharacteristicAnnotation> seffParameterAnnotations = extensionRoot
				.getParameterAnnotations().stream()
				.filter(annotation -> seffProvidedParameterIdentificatons.contains(annotation.getProvidedParameter()))
				.toList();

		for (DataFlowVariable dfVar : seffNode.getAllDataFlowVariables()) {
			Collection<ProvidedParameterCharacteristicAnnotation> parameterAnnotationsForDataFlowVariable = seffParameterAnnotations
					.stream().filter(annot -> annot.getProvidedParameter().getParameter().getParameterName()
							.equals(dfVar.variableName()))
					.toList();

			Map<EnumCharacteristicType, Collection<Literal>> dataFlowCharacteristicTypesAndLiterals = calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
					dfVar.characteristics());

			if (characteristicsLiteralsViolateParameterAnnotations(parameterAnnotationsForDataFlowVariable,
					dataFlowCharacteristicTypesAndLiterals)) {
				return true;
			}

		}

		return false;
	}

	private boolean nodeCharacteristicsAndParameterCharacteristicsViolated(SEFFActionSequenceElement<?> seffNode,
			ExtensionRoot extensionRoot, StandalonePCMDataFlowConfidentialityAnalysis analysis) {

		Map<EnumCharacteristicType, Collection<Literal>> mappedNodeCharacteristics = calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
				seffNode.getAllNodeCharacteristics());

		Collection<ProvidedParameterIdentification> providedParameters = getAllAnnotatedParametersForSeff(seffNode,
				extensionRoot, analysis);
		Collection<ProvidedParameterCharacteristicAnnotation> parameterAnnotations = extensionRoot.getParameterAnnotations()
				.stream().filter(annotation -> providedParameters.contains(annotation.getProvidedParameter())).toList();

		return characteristicsLiteralsViolateParameterAnnotations(parameterAnnotations, mappedNodeCharacteristics);

	}

	private boolean characteristicsLiteralsViolateParameterAnnotations(
			Collection<ProvidedParameterCharacteristicAnnotation> parameterAnnotations,
			Map<EnumCharacteristicType, Collection<Literal>> typesAndLiterals) {

		for (ProvidedParameterCharacteristicAnnotation annot : parameterAnnotations) {
			Map<EnumCharacteristicType, Collection<Literal>> mappedParameterAnnotationCharacteristics = calculateAllLiteralsForEnumCharacteristicsForParameterAnnotation(
					annot);

			for (Entry<EnumCharacteristicType, Collection<Literal>> entry : mappedParameterAnnotationCharacteristics
					.entrySet()) {
				Optional<Entry<EnumCharacteristicType, Collection<Literal>>> potentialNodeCharacteristicEntry = retrieveMappingEntryByID(
						typesAndLiterals, entry.getKey().getId());

				if (potentialNodeCharacteristicEntry.isPresent()) {
					if (isNotAllowed(potentialNodeCharacteristicEntry.get().getValue(), entry.getValue())) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean isNotAllowed(Literal dataLiteral, Literal checkAgainst) {
		return isNotAllowed(dataLiteral.getName(), checkAgainst.getName());
	}

	
	private boolean isNotAllowed(String dataLiteral, String checkAgainst) {
		return dataLiteral.equals("Airline") && checkAgainst.equals("User");
	}

	private boolean isNotAllowed(Collection<Literal> toCheck, Collection<Literal> toCheckAgainst) {

		if(toCheck.size() > toCheckAgainst.size()) {
			return true;
		}
		
		for (Literal literalToCheck : toCheck) {
			boolean match = false;
			for (Literal literalToCheckAgainst : toCheckAgainst) {
				match |= literalToCheck.getId().equals(literalToCheckAgainst.getId());
				
				match |= !isNotAllowed(literalToCheck, literalToCheckAgainst);
			}

			if (!match) {
				return true;
			}
		}
		return false;
	}

	private Map<EnumCharacteristicType, Collection<Literal>> calculateCharacteristicTypeLiteralMappingFromCharacteristicValues(
			Collection<CharacteristicValue> values) {
		Map<EnumCharacteristicType, Collection<Literal>> mapping = new HashMap<>();

		for (CharacteristicValue value : values) {

			if (!mapping.containsKey(value.characteristicType())) {
				Collection<Literal> literals = new HashSet<Literal>();

				mapping.put(value.characteristicType(), literals);
			}

			mapping.get(value.characteristicType()).add(value.characteristicLiteral());

		}

		return mapping;
	}

	// Use design choice that all enum characteristic literals are annotated in one
	// parameterannotation.
	// If multiple parameterannotations with different types (!!!see paper!!!) are
	// used, collect the enum characteristic literals per enum characteristic type
	// over all annotations;
	private Map<EnumCharacteristicType, Collection<Literal>> calculateAllLiteralsForEnumCharacteristicsForParameterAnnotation(
			ProvidedParameterCharacteristicAnnotation annotation) {

		var mapping = new HashMap<EnumCharacteristicType, Collection<Literal>>();

		for (EnumCharacteristic characteristic : annotation.getCharacteristics()) {

			if (!mapping.containsKey(characteristic.getEnumCharacteristicType())) {
				Collection<Literal> literals = new HashSet<Literal>();
				mapping.put(characteristic.getEnumCharacteristicType(), literals);
			}

			mapping.get(characteristic.getEnumCharacteristicType()).addAll(characteristic.getValues());

		}

		return mapping;
	}

	private Optional<Entry<EnumCharacteristicType, Collection<Literal>>> retrieveMappingEntryByID(
			Map<EnumCharacteristicType, Collection<Literal>> mapping, String idToSearch) {
		return mapping.entrySet().stream().filter(entry -> entry.getKey().getId().equals(idToSearch)).findFirst();
	}

	private Collection<ProvidedParameterIdentification> getAllAnnotatedParametersForSeff(
			SEFFActionSequenceElement<?> seffNode, ExtensionRoot extensionRoot,
			StandalonePCMDataFlowConfidentialityAnalysis analysis) {

		Collection<ProvidedParameterIdentification> providedParameters = new HashSet<ProvidedParameterIdentification>();

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

					var possibleProvidedParameterIdentifications = new HashSet<ProvidedParameterIdentification>();

					Signature targetSeffSignature = seff.get().getDescribedService__SEFF();

					if (targetSeffSignature instanceof OperationSignature) {
						OperationSignature seffOpSig = (OperationSignature) targetSeffSignature;

						for (OperationProvidedRole provRole : possibleProvidedRoles) {
							for (ProvidedParameterIdentification paramIdent : extensionRoot
									.getProvidedParameterIdentification()) {
								if (provRole.getId().equals(paramIdent.getProvidedOperation().getProvidedRole().getId())
										&& provRole.getProvidedInterface__OperationProvidedRole()
												.getSignatures__OperationInterface().contains(seffOpSig)
										&& paramIdent.getProvidedOperation().getOperationSignature().getId()
												.equals(seffOpSig.getId())) {
									possibleProvidedParameterIdentifications.add(paramIdent);
								}
							}
						}

						for (Parameter param : seffOpSig.getParameters__OperationSignature()) {
							for (ProvidedParameterIdentification paramIdent : possibleProvidedParameterIdentifications) {
								if (paramIdent.getProvidedOperation().getOperationSignature().getId()
										.equals(seffOpSig.getId())
										&& paramIdent.getParameter().getParameterName()
												.equals(param.getParameterName())) {
									providedParameters.add(paramIdent);
								}
							}

						}
					}
				}
			}
		}
		return providedParameters;
	}

}
