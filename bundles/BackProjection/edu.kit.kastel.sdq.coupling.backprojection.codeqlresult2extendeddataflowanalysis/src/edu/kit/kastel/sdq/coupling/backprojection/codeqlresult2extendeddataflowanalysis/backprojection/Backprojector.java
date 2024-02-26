package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.backprojection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.EnumCharacteristic;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
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
	private static final String DELIMITER = ";";

	public Backprojector(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ParameterAnnotations parameterAnnotations, Configuration config, PCMDataDictionary dictionary) {
		super();
		this.repository = repository;
		this.correspondences = correspondences;
		this.parameterAnnotations = parameterAnnotations;
		this.config = config;
		this.dictionary = dictionary;
	}

	@Override
	public void project(ResultingSpecification resultingSpec) {
		for (ResultingSpecEntry resultingSpecEntry : resultingSpec.getEntries()) {

			// Assumption: One annotation for one system element. If multiple: find the one
			// with the corresponding security property - value pair.
			ParameterAnnotation annot = resolveParameterAnnotation(resultingSpecEntry);

			for (EnumCharacteristic characteristic : annot.getCharacteristics()) {
				// Normally, check with additional info, if types assigned to securityLevel is
				// equal, best with correspondence models. --> Resolve Security Property and
				// fitting annotation

				// TODO: Workaround for getting security levels for EnumCharacteristic as EMF
				// does not work (again) when resolving enum characteristics
				// Use evaluation scenario to select first enumeration. In normal case, resolve levels for characteristic.
				
				var allLiterals = dictionary.getCharacteristicEnumerations().get(0).getLiterals();
				
				Collection<Literal> resolvedLiterals = resolveLiteralsForLevel(resultingSpecEntry.getSecurityProperty(),
						allLiterals);

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

	private Collection<Literal> resolveLiteralsForLevel(SecurityLevel securityProperty,
			Collection<Literal> literalsForFittingAnnotation) {
		Collection<Literal> resolvedLiterals = new HashSet<Literal>();

		Collection<SecurityLevel> basicLevels = CodeQLResolutionUtil.resolveBasicLevels(securityProperty, config,
				DELIMITER);

		for (SecurityLevel basicLevel : basicLevels) {
			// this could be replaced by correspondence relationships between the levels of
			// an enum and basic levels

			for (Literal literal : literalsForFittingAnnotation) {
				if (literal.getName().equals(basicLevel.getName())) {
					resolvedLiterals.add(literal);
				}
			}
		}

		return resolvedLiterals;
	}

	private ParameterAnnotation resolveParameterAnnotation(ResultingSpecEntry specEntry) {
		// Resolve System Element
		PCMParameter2JavaParameter parameterCorrespondence = PCMJavaCorrespondenceResolutionUtils
				.getParameterCorrespondence(correspondences, specEntry.getSystemElement());

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
