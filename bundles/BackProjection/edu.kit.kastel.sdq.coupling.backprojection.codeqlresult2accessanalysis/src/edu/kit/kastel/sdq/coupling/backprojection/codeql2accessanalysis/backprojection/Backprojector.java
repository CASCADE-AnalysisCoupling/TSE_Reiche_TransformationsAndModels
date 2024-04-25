package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.backprojection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysiscodeqlcorrespondence.utils.AccessAnalysisCodeQLCorrespondenceLookupUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.utils.CodeQLResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class Backprojector implements Backproject{
	
//	private final Repository repository;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final ConfidentialitySpecification confidentialitySpec;
	private final ProfileApplication profileApplication;
//	private final Configuration config;
	private static final String DELIMITER = ";";
	private final CodeQLSCARCorrespondences scarCorrespondences;
	private final Correspondences_CodeQLResultingValues resultingValueCorrespondences;
	private final AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences;
	
	
	public Backprojector(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication, CodeQLSCARCorrespondences scarCorrespondences, Correspondences_CodeQLResultingValues resultingValuesCorrespondences,  AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences) {
		super();
//		this.repository = repository;
		this.correspondences = correspondences;
		this.confidentialitySpec = confidentialitySpec;
		this.profileApplication = profileApplication;
//		this.config = config;
		this.scarCorrespondences = scarCorrespondences;
		this.resultingValueCorrespondences = resultingValuesCorrespondences;
		this.accessAnalysisCodeQLCorrespondences = accessAnalysisCodeQLCorrespondences;
	}

	@Override
	public void project(CodeQLResultingValues resultingValues) {
		for(ResultingValue resultingValue : resultingValues.getResultingValues()) {
			
			
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

//	private Collection<DataSet> resolveDataSetsForLevel(SecurityLevel securityProperty) {
//		Collection<DataSet> resolvedDataSets = new HashSet<DataSet>();
//		
//		Collection<SecurityLevel> basicLevels = CodeQLResolutionUtil.resolveBasicLevels(securityProperty, config, DELIMITER);
//		
//	
//		for(SecurityLevel basicLevel : basicLevels) {
//			//this could be replaced by correspondence relationships between dataset and basic levels ( 1 - 1) 
//			//or datasets and all levels (m - 1)
//			Collection<DataSet> dataSets = confidentialitySpec.getDataIdentifier().stream().filter(ident -> ident instanceof DataSet).map(ident -> (DataSet) ident).collect(Collectors.toList());
//			
//			for(DataSet dataSet : dataSets) {
//				if(dataSet.getName().equals(basicLevel.getName())) {
//					resolvedDataSets.add(dataSet);
//				}
//			}
//		}
//		
//		return resolvedDataSets;
//	}

	private static Collection<StereotypeApplication> filterInformationFlowApplications(Collection<StereotypeApplication> applications){
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow")).collect(Collectors.toList()); 
	}
	
	private ProvidedParameterIdentification resolvePCMParameter(ResultingValue resultingValue) {
		ParameterIdentification parameter_SCAR = CodeQLResultingValueCorrespondencesUtil.getCorresponding(resultingValue.getParameter(), resultingValueCorrespondences);
		Parameter parameter_Java = CodeQLSCARCorrespondenceUtil.getCorresponding(parameter_SCAR, scarCorrespondences);
		
		return PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(correspondences, parameter_Java).getPcmParameterIdentification();	
	}
	
	private Collection<DataSet> resolveDataSets(ResultingValue resultingValue){
		//Could also first correspond here
		SecurityLevel securityLevel = CodeQLResultingValueCorrespondencesUtil.getCorresponding(resultingValue.getResultingSecurityLevel(), resultingValueCorrespondences);
		return AccessAnalysisCodeQLCorrespondenceLookupUtil.getCorresponding(securityLevel, accessAnalysisCodeQLCorrespondences);
	}
}
