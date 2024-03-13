package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.Set;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Backprojector4HighLow extends Backprojector{

	public Backprojector4HighLow(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication) {
		super(repository, correspondences, confidentialitySpec, profileApplication);
	}

	@Override
	protected void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair,
			Entry<Parameter, Set<ResultingSpecEntry>> assignment) {
		
		for (ResultingSpecEntry entry : assignment.getValue()) {

			Collection<DataSet> dataSets = resolveDataSetsForLevel(entry.getSecurityProperty(),
					entry.getEntryPoint());
			
			if(dataSets.size() != 1) {
				throw new IllegalStateException("In High Low scenario, there should either be annoted high or low, no joined levels");
			}
			
			parametersAndDataPair.getDataTargets().clear();
			parametersAndDataPair.getDataTargets().addAll(dataSets);
			
		}
	}

}
