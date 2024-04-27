package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.utils.AccessAnalysisJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
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


	private final Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences;
	private final Correspondences_JOANAResultingValues resultingValuesCorrespondences;
	private final JOANASCARCorrespondences scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences,
			Correspondences_JOANAResultingValues resultingValuesCorrespondences,
			JOANASCARCorrespondences scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.accessAnalysisJOANACorrespondences = accessAnalysisJOANACorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<DataSet> resolveDataSets(Level_ResultingValues level, EntryPointIdentification_ResultingValues entryPoint_ResultingValues){
		Level level_JOANA = JOANAResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return AccessAnalysisJOANACorrespondenceUtil.getCorresponding(level_JOANA, accessAnalysisJOANACorrespondences);
	}
	
	public ConfidentialitySpecification resolve(EntryPointIdentification_ResultingValues entryPoint_ResultingValues) {
		EntryPointIdentifying entryPoint_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(entryPoint_ResultingValues, resultingValuesCorrespondences);
		EntryPoint entryPoint_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(entryPoint_SCAR, scarCorrespondences);
		return AccessAnalysisJOANACorrespondenceUtil.getCorresponding(entryPoint_JOANA, accessAnalysisJOANACorrespondences);
	}
	
	public ProvidedParameterIdentification resolve(ParameterIdentification_JOANAResultingValues parameter) {
		ParameterIdentifying parameter_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = JOANASCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
