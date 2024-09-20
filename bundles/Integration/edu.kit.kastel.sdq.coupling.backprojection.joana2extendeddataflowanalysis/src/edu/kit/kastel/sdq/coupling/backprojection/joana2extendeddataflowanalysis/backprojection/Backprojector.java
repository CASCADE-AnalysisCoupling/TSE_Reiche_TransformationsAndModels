package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;

public abstract class Backprojector implements Backproject {

	private final ParameterAnnotations parameterAnnotations;
	protected final CorrespondencesResolver resolver;

	public Backprojector(ParameterAnnotations parameterAnnotations, CorrespondencesResolver resolver) {
		super();
		this.parameterAnnotations = parameterAnnotations;
		this.resolver = resolver;
	}

	@Override
	public void project(JOANAResultingValues resultingSpec) {

		HashMap<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> specEntryParameterAssignments = calculateSpecEntriesForParametersImplicitlyMapConfiguration(
				resultingSpec);

		for (Entry<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> assignment : specEntryParameterAssignments.entrySet()) {

			ParameterAnnotation targetParameterAnnotation = resolveParameterAnnotation(resolver.resolve(assignment.getKey()));
			
			projectIntoSpecification(targetParameterAnnotation, assignment);

		}
	}

	protected abstract void projectIntoSpecification(ParameterAnnotation parameterAnnotation,
			Entry<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> assignment);


	private HashMap<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> calculateSpecEntriesForParametersImplicitlyMapConfiguration(
			JOANAResultingValues resultingSpec) {

		HashMap<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> parameterSpecEntryAssignments = new HashMap<>();

		for (ResultingValue entry : resultingSpec.getResultingValues()) {
			if (!parameterSpecEntryAssignments.containsKey(entry.getSystemElement())) {
				Set<ResultingValue> specEntriesForParameter = new HashSet<ResultingValue>();
				parameterSpecEntryAssignments.put(entry.getSystemElement(), specEntriesForParameter);
			}

			parameterSpecEntryAssignments.get(entry.getSystemElement()).add(entry);
		}

		return parameterSpecEntryAssignments;
	}

	private boolean areParameterIdentificationsEqual(
			ProvidedOperationParameterIdentification annotationProvidedParameterIdent,
			edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification correspondenceIdentification) {
		// Object Based
		return annotationProvidedParameterIdent.getOperationSignature()
				.equals(correspondenceIdentification.getProvidedSignature().getProvidedSignature())
				&& annotationProvidedParameterIdent.getProvidedRole()
						.equals(correspondenceIdentification.getProvidedSignature().getProvidedRole())
				&& annotationProvidedParameterIdent.getParameter().equals(correspondenceIdentification.getParameter());
	}

	private boolean areParameterIdentificationsEqual(
			GeneralOperationParameterIdentification annotationProvidedParameterIdent,
			edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification correspondenceIdentification) {
		// Object Based
		return annotationProvidedParameterIdent.getOperationSignature()
				.equals(correspondenceIdentification.getProvidedSignature().getProvidedSignature())
				&& annotationProvidedParameterIdent.getParameter().getParameterName().equals(correspondenceIdentification.getParameter().getParameterName());
	}

	private ParameterAnnotation resolveParameterAnnotation(ProvidedParameterIdentification pcmParameterIdentification) {

		for (ParameterAnnotation potentialAnnotation : parameterAnnotations.getAnnotations()) {

			if (potentialAnnotation.getParameterIdentification() instanceof ProvidedOperationParameterIdentification) {
				ProvidedOperationParameterIdentification providedParamIdent = (ProvidedOperationParameterIdentification) potentialAnnotation
						.getParameterIdentification();

				if (areParameterIdentificationsEqual(providedParamIdent, pcmParameterIdentification)) {
					return potentialAnnotation;
				}

			} else if (potentialAnnotation
					.getParameterIdentification() instanceof GeneralOperationParameterIdentification) {
				GeneralOperationParameterIdentification generalParamIdent = (GeneralOperationParameterIdentification) potentialAnnotation
						.getParameterIdentification();

				if (areParameterIdentificationsEqual(generalParamIdent, pcmParameterIdentification)) {
					return potentialAnnotation;
				}
			}
		}
		throw new IllegalStateException(String.format("Did not find annotation for Identification %s.%s", pcmParameterIdentification.getProvidedSignature().getProvidedSignature().getEntityName(), pcmParameterIdentification.getParameter().getParameterName()));
	}

}
