package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;


public class Backprojector4HighLow extends Backprojector{

	public Backprojector4HighLow(
			ParameterAnnotations parameterAnnotations, CorrespondencesResolver resolver) {
		super(parameterAnnotations, resolver);
	}


	@Override
	protected void projectIntoSpecification(ParameterAnnotation parameterAnnotation,
			Entry<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> assignment) {
		//Assumption of annotating only one charactersitic. Otherwise, trace back to origin.
		Set<Literal> literalsToAdd = new HashSet<Literal>();
		
		
		for (ResolvedImplementationValue entry : assignment.getValue()) {

			Collection<Literal> literals = resolver.resolveLiterals(entry.getLevel(), entry.getConfiguration());
			
			if(literals.size() != 1) {
				throw new IllegalStateException("In High Low scenario, there should either be annoted high or low, no joined levels");
			}
			
			literalsToAdd.addAll(literals);
		}
		
		if(!literalsToAdd.isEmpty()) {
			parameterAnnotation.getCharacteristics().get(0).getValues().clear();
			parameterAnnotation.getCharacteristics().get(0).getValues().addAll(literalsToAdd);
		}
		
	}

}
