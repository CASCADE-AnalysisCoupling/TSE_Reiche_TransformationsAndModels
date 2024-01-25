package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis;

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
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.codeqlscar2resultingspecification.model.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.supporting.util.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class Backprojector implements Backproject{
	
	private final Repository repository;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final ConfidentialitySpecification confidentialitySpec;
	private final ProfileApplication profileApplication;
	private final Configuration config;
	private static final String DELIMITER = ";";
	
	public Backprojector(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication, Configuration config) {
		super();
		this.repository = repository;
		this.correspondences = correspondences;
		this.confidentialitySpec = confidentialitySpec;
		this.profileApplication = profileApplication;
		this.config = config;
	}

	@Override
	public void project(ResultingSpecification resultingSpec) {
		for(ResultingSpecEntry resultingSpecEntry : resultingSpec.getEntries()) {
			
			PCMParameter2JavaParameter parameterCorrespondence = PCMJavaCorrespondenceResolutionUtils.getParameterCorrespondence(correspondences,resultingSpecEntry.getSystemElement());
			OperationSignature targetOperationSignature = parameterCorrespondence.getPcmParameterIdentification().getProvidedSignature().getProvidedSignature();
			
			Collection<StereotypeApplication> appliedStereotypes = profileApplication.getStereotypeApplications(targetOperationSignature);
			Collection<StereotypeApplication> appliedInformationFlowStereotypes = filterInformationFlowApplications(appliedStereotypes);
			
			for(StereotypeApplication informationFlowApplication : appliedInformationFlowStereotypes) {
				Collection<StereotypeApplication> appl = Collections.singletonList(informationFlowApplication);
				Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl, "parametersAndDataPairs", ParametersAndDataPair.class);
				
				for(ParametersAndDataPair parameterAndDataPair : parametersAndDataPairs) {
					if(parameterAndDataPair.getParameterSources().contains(parameterCorrespondence.getPcmParameterIdentification().getParameter().getParameterName())) {
						Collection<DataSet> resolvedDataSets = resolveDataSetsForLevel(resultingSpecEntry.getSecurityProperty());
						//Assumption: for each annotation exists its own parameter and datapair. 
						//If not valid, the security level of other interfaces would change due to a flow to only one parameter:
						// Solution: create individual parameterAndDataPair to replace existing entry
						parameterAndDataPair.getDataTargets().clear();
						parameterAndDataPair.getDataTargets().addAll(resolvedDataSets);
					}
				}
			}
		}
	}

	private Collection<DataSet> resolveDataSetsForLevel(SecurityLevel securityProperty) {
		Collection<DataSet> resolvedDataSets = new HashSet<DataSet>();
		
		Collection<SecurityLevel> basicLevels = CodeQLResolutionUtil.resolveBasicLevels(securityProperty, config, DELIMITER);
		
	
		for(SecurityLevel basicLevel : basicLevels) {
			//this could be replaced by correspondence relationships between dataset and basic levels ( 1 - 1) 
			//or datasets and all levels (m - 1)
			Collection<DataSet> dataSets = confidentialitySpec.getDataIdentifier().stream().filter(ident -> ident instanceof DataSet).map(ident -> (DataSet) ident).collect(Collectors.toList());
			
			for(DataSet dataSet : dataSets) {
				if(dataSet.getName().equals(basicLevel.getName())) {
					resolvedDataSets.add(dataSet);
				}
			}
		}
		
		return resolvedDataSets;
	}

	private static Collection<StereotypeApplication> filterInformationFlowApplications(Collection<StereotypeApplication> applications){
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow")).collect(Collectors.toList()); 
	}
	
	
}
