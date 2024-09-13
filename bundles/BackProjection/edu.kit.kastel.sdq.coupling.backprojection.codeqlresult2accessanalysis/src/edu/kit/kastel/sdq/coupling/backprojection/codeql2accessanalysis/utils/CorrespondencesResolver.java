package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.utils;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.RuleId_ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.SecurityLevel_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.Correspondences_AccessAnalysisCodeQL;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class CorrespondencesResolver {


	private final Correspondences_AccessAnalysisCodeQL accessAnalysisCodeQLCorrespondences;
	private final Correspondences_ResolvedImplementationValues resultingValuesCorrespondences;
	private final Correspondences_CodeQLScar scarCorrespondences;
	private final PCMJavaCorrespondenceRoot pcmJavaCorrespondences;
	
	
	public CorrespondencesResolver(Correspondences_AccessAnalysisCodeQL accessAnalysisCodeQLCorrespondences,
			Correspondences_ResolvedImplementationValues resultingValuesCorrespondences,
			Correspondences_CodeQLScar scarCorrespondences, PCMJavaCorrespondenceRoot pcmJavaCorrespondences) {
		super();
		this.accessAnalysisCodeQLCorrespondences = accessAnalysisCodeQLCorrespondences;
		this.resultingValuesCorrespondences = resultingValuesCorrespondences;
		this.scarCorrespondences = scarCorrespondences;
		this.pcmJavaCorrespondences = pcmJavaCorrespondences;
	}
	
	
	
	public Collection<DataSet> resolveDataSets(SecurityLevel_ResolvedImplementationValues level, RuleId_ResolvedImplementationValue configuration ){
		SecurityLevel level_CodeQL = CodeQLResultingValueCorrespondencesUtil.getCorresponding(level, resultingValuesCorrespondences);
		return AccessAnalysisCodeQLCorrespondenceUtil.getCorresponding(level_CodeQL, accessAnalysisCodeQLCorrespondences);
	}
	
	public FullyImplicitConfiguration resolve(RuleId_ResolvedImplementationValue ruleId_ResultingValues) {
		RuleId ruleId = CodeQLResultingValueCorrespondencesUtil.getCorresponding(ruleId_ResultingValues, resultingValuesCorrespondences);
		HybridConfiguration query_CodeQL = CodeQLSCARCorrespondenceUtil.getCorresponding(ruleId, scarCorrespondences);
		return AccessAnalysisCodeQLCorrespondenceUtil.getCorresponding(query_CodeQL, accessAnalysisCodeQLCorrespondences);
	}
	
	public ConfidentialitySpecification resolveConfidentialitySpec(RuleId_ResolvedImplementationValue ruleId_ResultingValues) {
		FullyImplicitConfiguration accessAnalysis_Config =  resolve(ruleId_ResultingValues);
		
		for(EObject root : accessAnalysis_Config.getInputs()) {
			if(root instanceof ConfidentialitySpecification) {
				return (ConfidentialitySpecification) root;
			}
		}
		
		throw new RuntimeException("Did not find a confidentiality specification");
	}
	
	public ProvidedParameterIdentification resolve(Parameter_ResolvedImplementationValues parameter) {
		Parameter_SCAR parameter_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(parameter, resultingValuesCorrespondences);
		edu.kit.kastel.sdq.coupling.models.java.members.Parameter parameter_JAVA = CodeQLSCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		PCMParameter2JavaParameter parameter_Correspondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(pcmJavaCorrespondences, parameter_JAVA);
		return parameter_Correspondence.getPcmParameterIdentification();
		
	}
}
