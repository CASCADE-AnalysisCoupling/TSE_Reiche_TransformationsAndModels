package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.backprojection;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class Backprojector implements Backproject {

	private final Repository repository;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final ParameterAnnotations parameterAnnotations;
	private final Configuration config;
	private final PCMDataDictionary dictionary;
	private final CorrespondencesResolver resolver;

	public Backprojector(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ParameterAnnotations parameterAnnotations, Configuration config, PCMDataDictionary dictionary, CorrespondencesResolver resolver) {
		super();
		this.repository = repository;
		this.correspondences = correspondences;
		this.parameterAnnotations = parameterAnnotations;
		this.config = config;
		this.dictionary = dictionary;
		this.resolver = resolver;
	}

	@Override
	public void project(CodeQLResultingValues resultingValues) {
		for (ResultingValue resultingValue : resultingValues.getResultingValues()) {

			// Assumption: One annotation for one system element. If multiple: find the one
			// with the corresponding security property - value pair.
			ParameterAnnotation annot = resolveParameterAnnotation(resultingValue);

			for (EnumCharacteristic characteristic : annot.getCharacteristics()) {
				// Normally, check with additional info, if types assigned to securityLevel is
				// equal, best with correspondence models. --> Resolve Security Property and
				// fitting annotation
				
				Collection<Literal> resolvedLiterals = resolver.resolveLiterals(resultingValue.getResultingSecurityLevel(), resultingValue.getConfiguration());

				if (!resolvedLiterals.isEmpty()) {
					characteristic.getValues().clear();
					characteristic.getValues().addAll(resolvedLiterals);
				}
			}
		}
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
				&& annotationProvidedParameterIdent.getParameter().equals(correspondenceIdentification.getParameter());
	}

	private ParameterAnnotation resolveParameterAnnotation(ResultingValue resultingValue) {
		// Resolve System Element
		PCMParameter2JavaParameter parameterCorrespondence = PCMJavaCorrespondenceResolutionUtils
				.getParameterCorrespondence(correspondences, resolver.resolve(resultingValue.getParameter()));

		for (ParameterAnnotation potentialAnnotation : parameterAnnotations.getAnnotations()) {

			if (potentialAnnotation.getParameterIdentification() instanceof ProvidedOperationParameterIdentification) {
				ProvidedOperationParameterIdentification providedParamIdent = (ProvidedOperationParameterIdentification) potentialAnnotation
						.getParameterIdentification();

				if (areParameterIdentificationsEqual(providedParamIdent,
						parameterCorrespondence.getPcmParameterIdentification())) {
					return potentialAnnotation;
				}

			} else if (potentialAnnotation
					.getParameterIdentification() instanceof GeneralOperationParameterIdentification) {
				GeneralOperationParameterIdentification generalParamIdent = (GeneralOperationParameterIdentification) potentialAnnotation
						.getParameterIdentification();

				if (areParameterIdentificationsEqual(generalParamIdent,
						parameterCorrespondence.getPcmParameterIdentification())) {
					return potentialAnnotation;
				}
			}
		}

		return null;
	}
}
