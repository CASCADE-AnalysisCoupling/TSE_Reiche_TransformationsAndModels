package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.backprojection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.CollectionUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Backprojector4AccessAnalysis extends Backprojector {

	public Backprojector4AccessAnalysis(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ParameterAnnotations parameterAnnotations) {
		super(repository, correspondences, parameterAnnotations);
	}

	@Override
	protected void projectIntoSpecification(ParameterAnnotation parameterAnnotation, Entry<Parameter, Set<ResultingSpecEntry>> assignment) {
		//Assumption of annotating only one charactersitic. Otherwise, trace back to origin.
		Collection<Literal> originalLiterals = parameterAnnotation.getCharacteristics().get(0).getValues();
		
		Collection<Literal> literalsForReplacement = new HashSet<Literal>(); 
		
		for (ResultingSpecEntry entry : assignment.getValue()) {

			Collection<Literal> potentialLiterals = resolveLiteralsForLevel(parameterAnnotation.getCharacteristics().get(0), entry.getSecurityProperty(),
					entry.getEntryPoint());

			if (isSecurityLevelValidWRTAccessAnalysis(originalLiterals, potentialLiterals)) {
				
				literalsForReplacement.addAll(potentialLiterals);
			}
		}
		
		if(!literalsForReplacement.isEmpty()) {
			parameterAnnotation.getCharacteristics().get(0).getValues().clear();
			parameterAnnotation.getCharacteristics().get(0).getValues().addAll(literalsForReplacement);
		}
		
	}

	
	private boolean isSecurityLevelValidWRTAccessAnalysis(Collection<Literal> originalSet,
			Collection<Literal> dataSetsForSecurityLevel) {
		return !(dataSetsForSecurityLevel.size() >= originalSet.size()
				&& CollectionUtil.containsAny(dataSetsForSecurityLevel, originalSet));
	}
}
