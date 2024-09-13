package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util.CollectionUtil;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;

public class Backprojector4AccessAnalysis extends Backprojector {

	public Backprojector4AccessAnalysis(ProfileApplication profileApplication, CorrespondencesResolver correspondenceResolver) {
		super(profileApplication, correspondenceResolver);
	}

	@Override
	protected void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair,
			Entry<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> assignment) {
		
		Collection<DataSet> originalDataSets = parametersAndDataPair.getDataTargets().stream()
				.filter(DataSet.class::isInstance).map(DataSet.class::cast).collect(Collectors.toSet());
		
		boolean notCleared = true;

		for (ResolvedImplementationValue entry : assignment.getValue()) {

			Collection<DataSet> dataSets = correspondenceResolver.resolveDataSets(entry.getLevel(), entry.getConfiguration());
			if (isSecurityLevelValidWRTAccessAnalysis(originalDataSets, dataSets)) {
				if(notCleared) {
					parametersAndDataPair.getDataTargets().clear();
					notCleared = false;
				}
				
				parametersAndDataPair.getDataTargets().addAll(dataSets);
			}
		}
	}

	
	private boolean isSecurityLevelValidWRTAccessAnalysis(Collection<DataSet> originalSet,
			Collection<DataSet> dataSetsForSecurityLevel) {

		return !(dataSetsForSecurityLevel.size() >= originalSet.size()
				&& CollectionUtil.containsAny(dataSetsForSecurityLevel, originalSet));
	}
}
