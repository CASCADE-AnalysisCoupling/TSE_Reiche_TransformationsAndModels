package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResultingValue;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;

public abstract class Backprojector implements Backproject {

	protected final ProfileApplication profileApplication;
	protected final CorrespondencesResolver correspondenceResolver;
	protected final Set<ConfidentialitySpecification> updatedSpecifications;

	public Backprojector(ProfileApplication profileApplication, CorrespondencesResolver correspondenceResolver) {
		super();
		this.profileApplication = profileApplication;
		this.correspondenceResolver = correspondenceResolver;
		this.updatedSpecifications = new HashSet<ConfidentialitySpecification>();
	}

	@Override
	public void project(JOANAResultingValues resultingSpec) {

		HashMap<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> specEntryParameterAssignments = calculateSpecEntriesForParametersImplicitlyMapConfiguration(
				resultingSpec);

		for (Entry<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> assignment : specEntryParameterAssignments.entrySet()) {
			ProvidedParameterIdentification providedParameterIdentification = correspondenceResolver.resolve(assignment.getKey());
			OperationSignature targetOperationSignature = providedParameterIdentification.getProvidedSignature().getProvidedSignature();

			Collection<StereotypeApplication> appliedStereotypes = profileApplication
					.getStereotypeApplications(targetOperationSignature);
			Collection<StereotypeApplication> appliedInformationFlowStereotypes = filterInformationFlowApplications(
					appliedStereotypes);

			for (StereotypeApplication informationFlowApplication : appliedInformationFlowStereotypes) {
				Collection<StereotypeApplication> appl = Collections.singletonList(informationFlowApplication);
				Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl,
						"parametersAndDataPairs", ParametersAndDataPair.class);

				for (ParametersAndDataPair parameterAndDataPair : parametersAndDataPairs) {
					if (parameterAndDataPair.getParameterSources().contains(providedParameterIdentification.getParameter().getParameterName())) {

						// Assumption: for each annotation exists its own parameter and datapair.
						// If not valid, the security level of other interfaces would change due to a
						// flow to only one parameter:
						// Solution: create individual parameterAndDataPair to replace existing entry

						// For the Case Study We have the knowledge that every entryPoint maps to the
						// same annotated architectural model ==> Omit Backtracking of Configurations,
						// i.e., entry points.
						projectIntoParameterAndDataPair(parameterAndDataPair, assignment);
						
					
					}
				}
			}
		}
	}
	
	protected abstract void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair, Entry<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> assignment );
	
	
//	protected Collection<DataSet> resolveDataSetsForLevel(Level securityProperty, EntryPoint entryPoint) {
//		Collection<DataSet> resolvedDataSets = new HashSet<DataSet>();
//
//		Collection<Level> basicLevels = JOANAResolutionUtil.splitLevelIntoBasicLevels(securityProperty, entryPoint,
//				SUBLEVEL_DELIMITER);
//
//		ConfidentialitySpecification confidentialitySpec = correspondenceResolver.resolve(null)
//		
//		for (Level basicLevel : basicLevels) {
//			// this could be replaced by correspondence relationships between dataset and
//			// basic levels ( 1 - 1)
//			// or datasets and all levels (m - 1)
//			Collection<DataSet> dataSets = confidentialitySpec.getDataIdentifier().stream()
//					.filter(DataSet.class::isInstance).map(DataSet.class::cast).collect(Collectors.toList());
//
//			for (DataSet dataSet : dataSets) {
//				if (dataSet.getName().equals(basicLevel.getName())) {
//					resolvedDataSets.add(dataSet);
//				}
//			}
//		}
//
//		return resolvedDataSets;
//	}

	private static Collection<StereotypeApplication> filterInformationFlowApplications(
			Collection<StereotypeApplication> applications) {
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow"))
				.collect(Collectors.toList());
	}

	// For the Case Study we make two assumptions:
	// 1.) We have the knowledge that every entryPoint maps to the same annotated
	// architectural model ==> Omit Backtracking of Configurations, i.e., entry
	// points.
	// 2.) We know that the configurations contain currently only powerset lattices
	// and datasets are defined separately ==> With 1.) omit check whether level
	// exists in entrypoint.
	// If these assumptions do not hold: Implement respective checks
//	private HashMap<Parameter, Set<DataSet>> calculateDataSetsForParametersForConfiguration(
//			JOANAResultingValues resultingSpec) {
//
//		HashMap<Parameter, Set<DataSet>> parameterDataSetAssignments = new HashMap<Parameter, Set<DataSet>>();
//
//		for (ResultingValue entry : resultingSpec.getResultingValues()) {
//			Collection<DataSet> dataSets = correspondenceResolver.resolveDataSets(entry.getLevel());
//
//			if (!parameterDataSetAssignments.containsKey(entry.getSystemElement())) {
//				Set<DataSet> dataSetsForParameter = new HashSet<DataSet>();
//				parameterDataSetAssignments.put(entry.getSystemElement(), dataSetsForParameter);
//			}
//
//			parameterDataSetAssignments.get(entry.getSystemElement()).addAll(dataSets);
//		}
//
//		return parameterDataSetAssignments;
//	}

	private HashMap<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> calculateSpecEntriesForParametersImplicitlyMapConfiguration(
			JOANAResultingValues resultingSpec) {

		HashMap<ParameterIdentification_JOANAResultingValues, Set<ResultingValue>> parameterSpecEntryAssignments = new HashMap<>();

		for (ResultingValue entry : resultingSpec.getResultingValues()) {
			if (!parameterSpecEntryAssignments.containsKey(entry.getSystemElement())) {
				Set<ResultingValue> specEntriesForParameter = new HashSet<ResultingValue>();
				parameterSpecEntryAssignments.put(entry.getSystemElement(), specEntriesForParameter);
			}

			parameterSpecEntryAssignments.get(entry.getSystemElement()).add(entry);
		}

		return parameterSpecEntryAssignments;
	}

	
}
