package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ConfigurationID_ResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ParameterIdentificiation_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ConfigurationID_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class CorrespondencesResolver {


	private final AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences;
	private final Correspondences_CodeQLResultingValues resultingValuesCorrespondences;
	private final CodeQLSCARCorrespondences scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences,
			Correspondences_CodeQLResultingValues resultingValuesCorrespondences,
			CodeQLSCARCorrespondences scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.accessAnalysisCodeQLCorrespondences = accessAnalysisCodeQLCorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<DataSet> resolveDataSets(SecurityLevel_ResultingValues level, ConfigurationID_ResultingValues configuration ){
		SecurityLevel level_CodeQL = CodeQLResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return AccessAnalysisCodeQLCorrespondenceUtil.getCorresponding(level_CodeQL, accessAnalysisCodeQLCorrespondences);
	}
	
	public ConfidentialitySpecification resolve(ConfigurationID_ResultingValues configurationID_ResultingValues) {
		ConfigurationID_SCAR configurationID_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(configurationID_ResultingValues, resultingValuesCorrespondences);
		Configuration configuration_CodeQL = CodeQLSCARCorrespondenceUtil.getCorresponding(configurationID_SCAR, scarCorrespondences);
		return AccessAnalysisCodeQLCorrespondenceUtil.getCorresponding(configuration_CodeQL, accessAnalysisCodeQLCorrespondences);
	}
	
	public ProvidedParameterIdentification resolve(ParameterIdentificiation_CodeQLResultingValues parameter) {
		ParameterIdentification parameter_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = CodeQLSCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
