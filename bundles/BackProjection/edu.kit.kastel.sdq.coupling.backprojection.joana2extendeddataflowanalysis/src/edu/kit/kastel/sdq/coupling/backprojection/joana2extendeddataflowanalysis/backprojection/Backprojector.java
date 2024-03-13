package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;

public abstract class Backprojector implements Backproject {

	private final PCMJavaCorrespondenceRoot correspondences;
	private final ParameterAnnotations parameterAnnotations;
	private static final String SUBLEVEL_DELIMITER = ";";

	public Backprojector(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ParameterAnnotations parameterAnnotations) {
		super();
		this.correspondences = correspondences;
		this.parameterAnnotations = parameterAnnotations;
	}

	@Override
	public void project(ResultingSpecification resultingSpec) {

		HashMap<Parameter, Set<ResultingSpecEntry>> specEntryParameterAssignments = calculateSpecEntriesForParametersImplicitlyMapConfiguration(
				resultingSpec);

		for (Entry<Parameter, Set<ResultingSpecEntry>> assignment : specEntryParameterAssignments.entrySet()) {
			PCMParameter2JavaParameter parameterCorrespondence = getParameterCorrespondence(assignment.getKey());

			ParameterAnnotation targetParameterAnnotation = resolveParameterAnnotation(
					parameterCorrespondence.getPcmParameterIdentification());
			
			projectIntoSpecification(targetParameterAnnotation, assignment);

		}
	}

	protected abstract void projectIntoSpecification(ParameterAnnotation parameterAnnotation,
			Entry<Parameter, Set<ResultingSpecEntry>> assignment);

	protected Collection<Literal> resolveLiteralsForLevel(EnumCharacteristic specifiedCharacteristic,
			Level securityProperty, EntryPoint entryPoint) {
		Collection<Literal> resolvedLiterals = new HashSet<Literal>();

		Collection<Level> basicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(securityProperty, entryPoint,
				SUBLEVEL_DELIMITER);

		for (Level basicLevel : basicLevels) {
			// this could be replaced by correspondence relationships between literals and
			// basic levels ( 1 - 1)
			Collection<Literal> literals = specifiedCharacteristic.getEnumCharacteristicType().getType().getLiterals()
					.stream().filter(Literal.class::isInstance).map(Literal.class::cast).collect(Collectors.toList());

			for (Literal literal : literals) {
				if (literal.getName().equals(basicLevel.getName())) {
					resolvedLiterals.add(literal);
				}
			}
		}

		return resolvedLiterals;
	}

	private PCMParameter2JavaParameter getParameterCorrespondence(Parameter parameter) {
		return correspondences.getPcmparameter2javaparameter().stream()
				.filter(corr -> corr.getJavaParameter().equals(parameter)).findFirst().get();
	}

	private HashMap<Parameter, Set<ResultingSpecEntry>> calculateSpecEntriesForParametersImplicitlyMapConfiguration(
			ResultingSpecification resultingSpec) {

		HashMap<Parameter, Set<ResultingSpecEntry>> parameterSpecEntryAssignments = new HashMap<Parameter, Set<ResultingSpecEntry>>();

		for (ResultingSpecEntry entry : resultingSpec.getEntries()) {
			if (!parameterSpecEntryAssignments.containsKey(entry.getSystemElement())) {
				Set<ResultingSpecEntry> specEntriesForParameter = new HashSet<ResultingSpecEntry>();
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
