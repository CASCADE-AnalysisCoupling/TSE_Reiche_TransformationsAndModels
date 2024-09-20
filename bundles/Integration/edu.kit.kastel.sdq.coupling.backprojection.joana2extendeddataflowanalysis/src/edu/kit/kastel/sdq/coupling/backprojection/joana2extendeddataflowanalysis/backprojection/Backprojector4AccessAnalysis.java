package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.CollectionUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;


public class Backprojector4AccessAnalysis extends Backprojector {

	public Backprojector4AccessAnalysis(ParameterAnnotations parameterAnnotations, CorrespondencesResolver resolver) {
		super(parameterAnnotations, resolver);
	}

	

	
	private boolean isSecurityLevelValidWRTAccessAnalysis(Collection<Literal> originalSet,
			Collection<Literal> dataSetsForSecurityLevel) {
		return !(dataSetsForSecurityLevel.size() >= originalSet.size()
				&& CollectionUtil.containsAny(dataSetsForSecurityLevel, originalSet));
	}

	@Override
	protected void projectIntoSpecification(ParameterAnnotation parameterAnnotation,
			Entry<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> assignment) {
		//Assumption of annotating only one charactersitic. Otherwise, trace back to origin.
		Collection<Literal> originalLiterals = parameterAnnotation.getCharacteristics().get(0).getValues();
		
		Collection<Literal> literalsForReplacement = new HashSet<Literal>(); 
		
		for (ResultingValue entry : assignment.getValue()) {

			Collection<Literal> potentialLiterals = resolver.resolveLiterals(entry.getLevel(), entry.getConfiguration());

			if (isSecurityLevelValidWRTAccessAnalysis(originalLiterals, potentialLiterals)) {
				
				literalsForReplacement.addAll(potentialLiterals);
			}
		}
		
		if(!literalsForReplacement.isEmpty()) {
			parameterAnnotation.getCharacteristics().get(0).getValues().clear();
			parameterAnnotation.getCharacteristics().get(0).getValues().addAll(literalsForReplacement);
		}
	}
}
