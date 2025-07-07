package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.utils.AccessAnalysisJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
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


	private final Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences;
	private final Correspondences_ResolvedImplementationValues resultingValuesCorrespondences;
	private final JOANASCARCorrespondences scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences,
			Correspondences_ResolvedImplementationValues resultingValuesCorrespondences,
			JOANASCARCorrespondences scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.accessAnalysisJOANACorrespondences = accessAnalysisJOANACorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<DataSet> resolveDataSets(Level_ResolvedImplementationValues level, EntryPoint_ResolvedImplementationValues entryPoint_ResultingValues){
		Level level_JOANA = JOANAResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return AccessAnalysisJOANACorrespondenceUtil.getCorresponding(level_JOANA, accessAnalysisJOANACorrespondences);
	}
	
	public FullyImplicitConfiguration resolve(EntryPoint_ResolvedImplementationValues entryPoint_ResultingValues) {
		EntryPoint_SCAR entryPoint_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(entryPoint_ResultingValues, resultingValuesCorrespondences);
		HybridConfiguration entryPoint_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(entryPoint_SCAR, scarCorrespondences);
		return AccessAnalysisJOANACorrespondenceUtil.getCorresponding(entryPoint_JOANA, accessAnalysisJOANACorrespondences);
	}
	
	public ConfidentialitySpecification resolveConfidentialitySpecification(EntryPoint_ResolvedImplementationValues entryPoint_ResultingValues) {
		FullyImplicitConfiguration accessAnalysis_Configuration = resolve(entryPoint_ResultingValues);
		
		for(EObject input : accessAnalysis_Configuration.getInputs()) {
			if(input instanceof ConfidentialitySpecification) {
				return (ConfidentialitySpecification) input;
			}
		}
		
		throw new RuntimeException("Expected confidentiality spec but did not find");
	}
	
	public ProvidedParameterIdentification resolve(Parameter_ResolvedImplementationValues parameter) {
		Parameter_SCAR parameter_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = JOANASCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
