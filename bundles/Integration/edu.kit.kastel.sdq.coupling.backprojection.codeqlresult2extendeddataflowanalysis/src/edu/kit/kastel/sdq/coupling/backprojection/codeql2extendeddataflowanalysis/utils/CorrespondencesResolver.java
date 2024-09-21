package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.utils;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.eclipse.emf.ecore.EObject;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.util.EDFACodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class CorrespondencesResolver {


	private final Correspondences_EDFACodeQL edfaCodeQLCorrespondences;
	private final Correspondences_ResolvedImplementationValues resultingValuesCorrespondences;
	private final Correspondences_CodeQLScar scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_EDFACodeQL edfaCodeQLCorrespondences,
			Correspondences_ResolvedImplementationValues resultingValuesCorrespondences,
			Correspondences_CodeQLScar scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.edfaCodeQLCorrespondences = edfaCodeQLCorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<Literal> resolveLiterals(SecurityLevel_ResolvedImplementationValues level, RuleId_ResolvedImplementationValue ruleId_RIV ){
		SecurityLevel level_CodeQL = CodeQLResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return EDFACodeQLCorrespondenceUtil.getCorresponding(level_CodeQL, edfaCodeQLCorrespondences);
	}
	
	public FullyImplicitConfiguration resolve(RuleId_ResolvedImplementationValue ruleId_RIV) {
		RuleId ruleId_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(ruleId_RIV, resultingValuesCorrespondences);
		HybridConfiguration config_CodeQL = CodeQLSCARCorrespondenceUtil.getCorresponding(ruleId_SCAR, scarCorrespondences);
		return EDFACodeQLCorrespondenceUtil.getCorresponding(config_CodeQL, edfaCodeQLCorrespondences);
	}
	
	public ParameterAnnotations resolveParameterAnnotations(RuleId_ResolvedImplementationValue ruleId_RIV) {
		FullyImplicitConfiguration config_EDFA = resolve(ruleId_RIV);
		
		for(EObject input : config_EDFA.getInputs()) {
			if(input instanceof ParameterAnnotations) {
				return (ParameterAnnotations) input;
			}
		}
		
		throw new RuntimeException("Expected parameter annotations spec but did not find");
	}
	
	public ProvidedParameterIdentification resolve(Parameter_ResolvedImplementationValues parameter) {
		Parameter_SCAR parameter_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = CodeQLSCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
