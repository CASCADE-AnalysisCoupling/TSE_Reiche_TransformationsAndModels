package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.backprojection;

import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.utils.CollectionUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Backprojector4AccessAnalysis extends Backprojector {

	public Backprojector4AccessAnalysis(Repository repository, PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification confidentialitySpec, ProfileApplication profileApplication) {
		super(repository, correspondences, confidentialitySpec, profileApplication);
	}

	@Override
	protected void projectIntoParameterAndDataPair(ParametersAndDataPair parametersAndDataPair, Entry<Parameter, Set<ResultingSpecEntry>> assignment) {
		Collection<DataSet> originalDataSets = parametersAndDataPair.getDataTargets().stream()
				.filter(DataSet.class::isInstance).map(DataSet.class::cast).collect(Collectors.toSet());
		
		parametersAndDataPair.getDataTargets().clear();

		for (ResultingSpecEntry entry : assignment.getValue()) {

			Collection<DataSet> dataSets = resolveDataSetsForLevel(entry.getSecurityProperty(),
					entry.getEntryPoint());

			if (isSecurityLevelValidWRTAccessAnalysis(originalDataSets, dataSets)) {
				
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
