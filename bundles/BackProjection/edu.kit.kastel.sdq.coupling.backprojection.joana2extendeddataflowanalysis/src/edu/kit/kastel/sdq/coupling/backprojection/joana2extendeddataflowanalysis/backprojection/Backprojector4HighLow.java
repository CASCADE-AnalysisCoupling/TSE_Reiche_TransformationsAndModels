package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Backprojector4HighLow extends Backprojector{

	public Backprojector4HighLow(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ParameterAnnotations parameterAnnotations) {
		super(repository, correspondences, parameterAnnotations);
	}

	@Override
	protected void projectIntoSpecification(ParameterAnnotation parameterAnnotation, Entry<Parameter, Set<ResultingSpecEntry>> assignment) {
		//Assumption of annotating only one charactersitic. Otherwise, trace back to origin.
		Set<Literal> literalsToAdd = new HashSet<Literal>();
		
		
		for (ResultingSpecEntry entry : assignment.getValue()) {

			Collection<Literal> literals = resolveLiteralsForLevel(parameterAnnotation.getCharacteristics().get(0), entry.getSecurityProperty(),
					entry.getEntryPoint());
			
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
