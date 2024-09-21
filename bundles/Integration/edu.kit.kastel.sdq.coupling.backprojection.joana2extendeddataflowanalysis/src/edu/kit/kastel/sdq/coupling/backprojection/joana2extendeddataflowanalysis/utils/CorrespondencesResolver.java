package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.eclipse.emf.ecore.EObject;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.util.EDFAJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class CorrespondencesResolver {


	private final Correspondences_EDFAJOANA edfaJOANACorrespondences;
	private final Correspondences_ResolvedImplementationValues resultingValuesCorrespondences;
	private final JOANASCARCorrespondences scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_EDFAJOANA edfaJOANACorrespondences,
			Correspondences_ResolvedImplementationValues resultingValuesCorrespondences,
			JOANASCARCorrespondences scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.edfaJOANACorrespondences = edfaJOANACorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<Literal> resolveLiterals(Level_ResolvedImplementationValues level, EntryPoint_ResolvedImplementationValues configuration ){
		Level level_JOANA = JOANAResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return EDFAJOANACorrespondenceUtil.getCorresponding(level_JOANA, edfaJOANACorrespondences);
	}
	
	public FullyImplicitConfiguration resolve(EntryPoint_ResolvedImplementationValues configuration) {
		EntryPoint_SCAR entryPoint_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(configuration, resultingValuesCorrespondences);
		HybridConfiguration config_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(entryPoint_SCAR, scarCorrespondences);
		
		return EDFAJOANACorrespondenceUtil.getCorresponding(config_JOANA, edfaJOANACorrespondences);
	}
	
	public ParameterAnnotations resolveAnnotations(EntryPoint_ResolvedImplementationValues entryPoint_RIV) {
		FullyImplicitConfiguration config_EDFA = resolve(entryPoint_RIV);
		
		for(EObject input : config_EDFA.getInputs()) {
			if(input instanceof ParameterAnnotations) {
				return (ParameterAnnotations) input;
			}
		}
		
		throw new RuntimeException("Expected parameter annotations but did not find");
	}
	
	public ProvidedParameterIdentification resolve(Parameter_ResolvedImplementationValues parameter) {
		Parameter_SCAR parameter_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = JOANASCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
