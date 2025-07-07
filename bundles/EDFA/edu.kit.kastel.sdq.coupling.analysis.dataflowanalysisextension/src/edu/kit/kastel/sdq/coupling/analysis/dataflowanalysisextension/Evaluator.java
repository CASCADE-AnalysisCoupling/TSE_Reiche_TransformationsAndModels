package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dataflowanalysis.analysis.core.AbstractActionSequenceElement;
import org.dataflowanalysis.analysis.core.CharacteristicValue;
import org.dataflowanalysis.analysis.core.DataFlowVariable;
import org.dataflowanalysis.analysis.pcm.PCMDataFlowConfidentialityAnalysis;
import org.dataflowanalysis.analysis.pcm.core.seff.SEFFActionSequenceElement;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.StartAction;

import edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions.AllowedConditionsProvider;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.util.ParameterAnnotationResolutionUtil;

public class Evaluator {
	
	private AllowedConditionsProvider allowedConditionsProvider;
	
	public Evaluator(AllowedConditionsProvider allowedConditionsProvider) {
		this.allowedConditionsProvider = allowedConditionsProvider;
	}

	
	public boolean allowedState(AbstractActionSequenceElement<?> node, ParameterAnnotations parameterAnnotations,
			PCMDataFlowConfidentialityAnalysis analysis) {

		boolean parameterAnnotationAndResourceCharacteristicsFit = true;
		boolean propagationAndNodeCharacteristicsFit = true;
		boolean propagationCharacteristicsAndParameterAnnotationsFit = true;

		if (node instanceof SEFFActionSequenceElement<?>) {
			SEFFActionSequenceElement<?> seffNode = (SEFFActionSequenceElement<?>) node;
			if (seffNode.getElement() instanceof StartAction) {

				// Determines, whether annotated parameter characteristics violate annotated
				// resource characteristics
				parameterAnnotationAndResourceCharacteristicsFit |= parameterAnnotationsAllowedForNodeCharacteristics(
						seffNode, parameterAnnotations, analysis);

				// Determines, whether propagated data characteristics violate the annotated
				// parameter characteristics
				propagationCharacteristicsAndParameterAnnotationsFit |= propagatedDataValuesAndParameterAnnotationsAllowed(seffNode, parameterAnnotations, analysis);

				// Determines whether propagated data characteristics and calculated node
				// characteristics fit;
				propagationAndNodeCharacteristicsFit = propagationResultAndNodeCharacteristicsViolated(seffNode, analysis);

			}

		}

		return parameterAnnotationAndResourceCharacteristicsFit | propagationCharacteristicsAndParameterAnnotationsFit
				| propagationAndNodeCharacteristicsFit;

	}

	private boolean propagationResultAndNodeCharacteristicsViolated(SEFFActionSequenceElement<?> seffNode,
			PCMDataFlowConfidentialityAnalysis analysis) {
		List<DataFlowVariable> dataFlowVariables = seffNode.getAllDataFlowVariables();
		List<CharacteristicValue> nodeCharacteristics = seffNode.getAllNodeCharacteristics();
		
		boolean allowed = true;
		for(DataFlowVariable dataFlowVariable : dataFlowVariables) {
			if(!allowedConditionsProvider.isDataFlowToNodeAllowed(dataFlowVariable.getAllCharacteristics(), nodeCharacteristics)){
				String unifiedDataLevel = dataFlowVariable.getAllCharacteristics().stream().map(CharacteristicValue::getValueName).sorted().collect(Collectors.joining(";"));
				String unifiedNodeLevel = nodeCharacteristics.stream().map(CharacteristicValue::getValueName).sorted().collect(Collectors.joining(";"));
								
				//System.out.println(
				//		String.format("Illegal Data to Node: %s (Data: %s) ->  %s (Component on Node: %s)", unifiedDataLevel, dataFlowVariable.variableName(), unifiedNodeLevel, seffNode.getContext().peek().getEncapsulatedComponent__AssemblyContext().getEntityName()));
				
				allowed = false;
			}
		}
		return allowed;
	}

	private boolean propagatedDataValuesAndParameterAnnotationsAllowed(SEFFActionSequenceElement<?> seffNode, ParameterAnnotations parameterAnnotations,
			PCMDataFlowConfidentialityAnalysis analysis) {
		Collection<DataFlowVariable> dataFlowVariables = seffNode.getAllDataFlowVariables();
		Collection<ParameterAnnotation> parameterAnnotationsForSeff = getAllParameterAnnotationsForSeff(seffNode, parameterAnnotations, analysis); 

		
		boolean allowed = true;
		for (DataFlowVariable dfVar : dataFlowVariables) {
			for(ParameterAnnotation annotation : parameterAnnotationsForSeff) {
				
				if(dfVar.variableName().equals(annotation.getParameterIdentification().getParameter().getParameterName())) {
					List<Literal> parameterLiterals = annotation.getCharacteristics().get(0).getValues();
					
					if(!allowedConditionsProvider.isDataFlowToParameterAllowed(dfVar.getAllCharacteristics(), parameterLiterals)) {
						
						
						String unifiedParameterLevel = parameterLiterals.stream().map(Literal::getName).sorted().collect(Collectors.joining(";"));
						String unifiedDataLevel = dfVar.getAllCharacteristics().stream().map(CharacteristicValue::getValueName).sorted().collect(Collectors.joining(";"));

						//System.out.println(
						//		String.format("Illegal Data to Parameter: %s (Data: %s) ->  %s (Parameter: %s)", unifiedDataLevel, dfVar.variableName(), unifiedParameterLevel, String.format("%s:%s.%s", seffNode.getContext().peek().getEntityName(), annotation.getParameterIdentification().getParameter().getOperationSignature__Parameter().getEntityName(), annotation.getParameterIdentification().getParameter().getParameterName())));
						
						
						allowed = false;
					}
				}
			}		
		}

		return allowed;
	}


	private boolean parameterAnnotationsAllowedForNodeCharacteristics(SEFFActionSequenceElement<?> seffNode,
			ParameterAnnotations parameterAnnotations, PCMDataFlowConfidentialityAnalysis analysis) {

		Collection<ParameterAnnotation> parameterAnnotationsForSeff = getAllParameterAnnotationsForSeff(seffNode,
				parameterAnnotations, analysis);
		Collection<CharacteristicValue> nodeCharacteristics = seffNode.getAllNodeCharacteristics();
		boolean allowed = true;
		for (ParameterAnnotation annot : parameterAnnotationsForSeff) {

			// TODO: Workarround for Eval due to EMF Problems (Resolution of Enum Types)
			// Assume only one characteristic (data levels) annotated with parameter
			// annotations, when resolved, use characteristics instead.
			List<Literal> parameterLiterals = annot.getCharacteristics().get(0).getValues();
	
			if (!allowedConditionsProvider.isParameterAllocationOnNodeAllowed(parameterLiterals, nodeCharacteristics)) {

				
				String unifiedDataLiteralNames = parameterLiterals.stream().map(Literal::getName).sorted().collect(Collectors.joining(";"));
				String unifiedCheckAgainstNames = nodeCharacteristics.stream().map(CharacteristicValue::getValueName).sorted().collect(Collectors.joining(";"));

				System.out.println(
						String.format("Illegal Parameter on Node:  (Parameter: %s) (Level: %s) ->  (Component on Node: %s) (Level: %s)", String.format("%s:%s.%s", seffNode.getContext().peek().getEntityName(), annot.getParameterIdentification().getParameter().getOperationSignature__Parameter().getEntityName(), annot.getParameterIdentification().getParameter().getParameterName()), unifiedDataLiteralNames, seffNode.getContext().peek().getEncapsulatedComponent__AssemblyContext().getEntityName(), unifiedCheckAgainstNames));
				
			
				allowed = false;
			}

		}
		return allowed;

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
									if (ParameterAnnotationResolutionUtil.providedOperationParameterIdentificationFits(
											(ProvidedOperationParameterIdentification) paramAnnotation
													.getParameterIdentification(),
											provRole, seffOpSig)) {
										possibleParameterAnnotations.add(paramAnnotation);
									}
								}
							} else if (ParameterAnnotationResolutionUtil.generalParameterIdentificationFits(
									paramAnnotation.getParameterIdentification(), seffOpSig)) {
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
}
