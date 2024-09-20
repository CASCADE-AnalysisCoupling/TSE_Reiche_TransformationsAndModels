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

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;
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
	public void project(ResolvedImplementationValues resultingSpec) {

		HashMap<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> specEntryParameterAssignments = calculateSpecEntriesForParametersImplicitlyMapConfiguration(
				resultingSpec);

		for (Entry<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> assignment : specEntryParameterAssignments.entrySet()) {
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
	
	protected abstract void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair, Entry<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> assignment );
	
	
	private static Collection<StereotypeApplication> filterInformationFlowApplications(
			Collection<StereotypeApplication> applications) {
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow"))
				.collect(Collectors.toList());
	}

	private HashMap<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> calculateSpecEntriesForParametersImplicitlyMapConfiguration(
			ResolvedImplementationValues resultingSpec) {

		HashMap<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> parameterSpecEntryAssignments = new HashMap<>();

		for (ResolvedImplementationValue entry : resultingSpec.getResultingValues()) {
			if (!parameterSpecEntryAssignments.containsKey(entry.getSystemElement())) {
				Set<ResolvedImplementationValue> specEntriesForParameter = new HashSet<ResolvedImplementationValue>();
				parameterSpecEntryAssignments.put(entry.getSystemElement(), specEntriesForParameter);
			}

			parameterSpecEntryAssignments.get(entry.getSystemElement()).add(entry);
		}

		return parameterSpecEntryAssignments;
	}

	
}
