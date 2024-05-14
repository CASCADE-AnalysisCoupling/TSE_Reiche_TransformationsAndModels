package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.iterative;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection.Backprojector4AccessAnalysis;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class IterativeBackprojector4AccessAnalysis extends Backprojector4AccessAnalysis {
	
	public IterativeBackprojector4AccessAnalysis(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication) {
		super(repository, correspondences, confidentialitySpec, profileApplication);
	}

	@Override
	protected void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair, Entry<Parameter, Set<ResultingSpecEntry>> assignment) {
		Collection<DataSet> originalDataSets = parametersAndDataPair.getDataTargets().stream()
				.filter(DataSet.class::isInstance).map(DataSet.class::cast).collect(Collectors.toSet());
		
		boolean notCleared = true;

		for (ResultingSpecEntry entry : assignment.getValue()) {

			// split auf mehrere backprojections, wenn mehrere entries auf gleiches paramanddatapair zeigen 
			Collection<DataSet> dataSets = resolveDataSetsForLevel(entry.getSecurityProperty(),
					entry.getEntryPoint());

			// immer true, ich benutze alle illegalen flows
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
		// immer true
		return true;
	}
}
