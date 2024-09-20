package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.utils;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.util.EDFAJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class CorrespondencesResolver {


	private final Correspondences_EDFAJOANA edfaJOANACorrespondences;
	private final Correspondences_JOANAResultingValues resultingValuesCorrespondences;
	private final JOANASCARCorrespondences scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_EDFAJOANA edfaJOANACorrespondences,
			Correspondences_JOANAResultingValues resultingValuesCorrespondences,
			JOANASCARCorrespondences scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.edfaJOANACorrespondences = edfaJOANACorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<Literal> resolveLiterals(Level_ResultingValues level, EntryPointIdentification_ResultingValues configuration ){
		Level level_JOANA = JOANAResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return EDFAJOANACorrespondenceUtil.getCorresponding(level_JOANA, edfaJOANACorrespondences);
	}
	
	public ParameterAnnotations resolve(EntryPointIdentification_ResultingValues configuration) {
		EntryPointIdentifying configuration_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(configuration, resultingValuesCorrespondences);
		EntryPoint configuration_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(configuration_SCAR, scarCorrespondences);
		return EDFAJOANACorrespondenceUtil.getCorresponding(configuration_JOANA, edfaJOANACorrespondences);
	}
	
	public ProvidedParameterIdentification resolve(ParameterIdentification_JOANAResultingValues parameter) {
		ParameterIdentifying parameter_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = JOANASCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
