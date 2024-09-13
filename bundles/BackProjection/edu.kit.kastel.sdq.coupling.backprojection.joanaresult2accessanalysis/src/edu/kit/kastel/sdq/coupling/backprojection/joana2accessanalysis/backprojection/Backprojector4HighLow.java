package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.Set;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.util.CorrespondencesResolver;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValue;


public class Backprojector4HighLow extends Backprojector{

	public Backprojector4HighLow(ProfileApplication profileApplication, CorrespondencesResolver correspondenceResolver) {
		super(profileApplication, correspondenceResolver);
	}

	@Override
	protected void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair,
			Entry<Parameter_ResolvedImplementationValues, Set<ResolvedImplementationValue>> assignment) {
		
		for (ResolvedImplementationValue entry : assignment.getValue()) {

			Collection<DataSet> dataSets = correspondenceResolver.resolveDataSets(entry.getLevel(), entry.getConfiguration());
			
			if(dataSets.size() != 1) {
				throw new IllegalStateException("In High Low scenario, there should either be annoted high or low, no joined levels");
			}
			
			parametersAndDataPair.getDataTargets().clear();
			parametersAndDataPair.getDataTargets().addAll(dataSets);
			
		}
	}

}
