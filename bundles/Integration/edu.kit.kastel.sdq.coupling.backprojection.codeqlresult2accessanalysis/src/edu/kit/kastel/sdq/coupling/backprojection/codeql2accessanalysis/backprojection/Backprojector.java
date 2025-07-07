package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.Correspondences_AccessAnalysisCodeQL;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class Backprojector implements Backproject{
	
	private final PCMJavaCorrespondenceRoot correspondences;
	private final ProfileApplication profileApplication;
	private final Correspondences_CodeQLScar scarCorrespondences;
	private final Correspondences_ResolvedImplementationValues resultingValueCorrespondences;
	private final Correspondences_AccessAnalysisCodeQL accessAnalysisCodeQLCorrespondences;
	
	
	public Backprojector(PCMJavaCorrespondenceRoot correspondences,
			ProfileApplication profileApplication, Correspondences_CodeQLScar scarCorrespondences, Correspondences_ResolvedImplementationValues resultingValuesCorrespondences,  Correspondences_AccessAnalysisCodeQL accessAnalysisCodeQLCorrespondences) {
		super();
		this.correspondences = correspondences;
		this.profileApplication = profileApplication;
		this.scarCorrespondences = scarCorrespondences;
		this.resultingValueCorrespondences = resultingValuesCorrespondences;
		this.accessAnalysisCodeQLCorrespondences = accessAnalysisCodeQLCorrespondences;
	}

	@Override
	public void project(ResolvedImplementationValues resultingValues) {
		for(ResolvedImplementationValue resultingValue : resultingValues.getResultingValues()) {
			
			
			ProvidedParameterIdentification parameter = resolvePCMParameter(resultingValue);
			OperationSignature targetOperationSignature = parameter.getProvidedSignature().getProvidedSignature();
			
			Collection<StereotypeApplication> appliedStereotypes = profileApplication.getStereotypeApplications(targetOperationSignature);
			Collection<StereotypeApplication> appliedInformationFlowStereotypes = filterInformationFlowApplications(appliedStereotypes);
			
			for(StereotypeApplication informationFlowApplication : appliedInformationFlowStereotypes) {
				Collection<StereotypeApplication> appl = Collections.singletonList(informationFlowApplication);
				Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl, "parametersAndDataPairs", ParametersAndDataPair.class);
				
				for(ParametersAndDataPair parameterAndDataPair : parametersAndDataPairs) {
					if(parameterAndDataPair.getParameterSources().contains(parameter.getParameter().getParameterName())) {
						Collection<DataSet> resolvedDataSets = resolveDataSets(resultingValue);
						//Assumption: for each annotation exists its own parameter and datapair. 
						//If not valid, the security level of other interfaces would change due to a flow to only one parameter:
						// Solution if necessary: create individual parameterAndDataPair to replace existing entry
						parameterAndDataPair.getDataTargets().clear();
						parameterAndDataPair.getDataTargets().addAll(resolvedDataSets);
					}
				}
			}
		}
	}

	private static Collection<StereotypeApplication> filterInformationFlowApplications(Collection<StereotypeApplication> applications){
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow")).collect(Collectors.toList()); 
	}
	
	private ProvidedParameterIdentification resolvePCMParameter(ResolvedImplementationValue resultingValue) {
		Parameter_SCAR parameter_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(resultingValue.getParameter(), resultingValueCorrespondences);
		Parameter parameter_Java = CodeQLSCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		
		return PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(correspondences, parameter_Java).getPcmParameterIdentification();	
	}
	
	private Collection<DataSet> resolveDataSets(ResolvedImplementationValue resultingValue){
		//Could also first correspond here
		SecurityLevel securityLevel = CodeQLResultingValueCorrespondencesUtil.getCorresponding(resultingValue.getResultingSecurityLevel(), resultingValueCorrespondences);
		return AccessAnalysisCodeQLCorrespondenceUtil.getCorresponding(securityLevel, accessAnalysisCodeQLCorrespondences);
	}
}
