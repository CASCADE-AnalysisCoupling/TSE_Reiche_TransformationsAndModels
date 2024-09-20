package edu.kit.kastel.sdq.coupling.backprojection.codeql2extendeddataflowanalysis.utils;

import java.util.Collection;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
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
	private final Correspondences_CodeQLResultingValues resultingValuesCorrespondences;
	private final CodeQLSCARCorrespondences scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_EDFACodeQL edfaCodeQLCorrespondences,
			Correspondences_CodeQLResultingValues resultingValuesCorrespondences,
			CodeQLSCARCorrespondences scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.edfaCodeQLCorrespondences = edfaCodeQLCorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<Literal> resolveLiterals(SecurityLevel_ResultingValues level, ConfigurationID_ResultingValues configuration ){
		SecurityLevel level_CodeQL = CodeQLResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return EDFACodeQLCorrespondenceUtil.getCorresponding(level_CodeQL, edfaCodeQLCorrespondences);
	}
	
	public ParameterAnnotations resolve(ConfigurationID_ResultingValues configurationID_ResultingValues) {
		ConfigurationID_SCAR configurationID_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(configurationID_ResultingValues, resultingValuesCorrespondences);
		Configuration configuration_CodeQL = CodeQLSCARCorrespondenceUtil.getCorresponding(configurationID_SCAR, scarCorrespondences);
		return EDFACodeQLCorrespondenceUtil.getCorresponding(configuration_CodeQL, edfaCodeQLCorrespondences);
	}
	
	public ProvidedParameterIdentification resolve(ParameterIdentificiation_CodeQLResultingValues parameter) {
		ParameterIdentification parameter_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = CodeQLSCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
