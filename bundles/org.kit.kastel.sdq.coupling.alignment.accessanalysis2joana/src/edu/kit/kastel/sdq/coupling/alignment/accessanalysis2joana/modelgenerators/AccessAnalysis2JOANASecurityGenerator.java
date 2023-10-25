package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;

import com.google.common.collect.Sets;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.elementidentifications.ProvidedSignature;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.AccessAnalysisResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.JOANAModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.Lattice;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.Sink;
import edu.kit.kastel.sdq.coupling.models.joana.Source;

public class AccessAnalysis2JOANASecurityGenerator {

	private final Correspondences correspondences;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final JOANARoot root;

	public AccessAnalysis2JOANASecurityGenerator(Correspondences correspondences,
			ConfidentialitySpecification accessAnalysisSpec) {
		super();
		this.correspondences = correspondences;
		this.accessAnalysisSpec = accessAnalysisSpec;
		this.root = JoanaFactory.eINSTANCE.createJOANARoot();
	}

	public JOANARoot generateJOANASpecification(ProfileApplication application) {
			root.getEntrypoint().addAll(generateConfigurations_EntryPoints(application));
			return root;
	}
	
	private Collection<EntryPoint> generateConfigurations_EntryPoints(ProfileApplication application) {
		Collection<EntryPoint> entrypoints = new ArrayList<EntryPoint>();
		Collection<StereotypeApplication> stereotypeApplications = application.getStereotypeApplications();
		Collection<StereotypeApplication> informationFlows = AccessAnalysisResolutionUtil
				.filterInformationFlowApplications(stereotypeApplications);

		for(StereotypeApplication informationflowStereo : informationFlows) {
			Object stereotypedObject = informationflowStereo.getAppliedTo();
			
			if(stereotypedObject instanceof OperationSignature) {
				OperationSignature stereotypedSig = (OperationSignature) stereotypedObject;
				
				for(ProvidedSignature provsig : correspondences.getMethodProvidedSignatureCorrespondences().keySet()) {
					if(provsig.getSignature().equals(stereotypedSig)) {
						entrypoints.add(generateConfiguration_EntryPoint(provsig, application));
					}
				}
			}	
		}
		
		return entrypoints;
	}

	private EntryPoint generateConfiguration_EntryPoint(ProvidedSignature targetMethod, ProfileApplication application) {
		Collection<Level> levels = generateLevels();
		Collection<MayFlow> mayflows = generateMayFlows(levels);
		Lattice lattice = JoanaFactory.eINSTANCE.createLattice();
		lattice.getMayFlow().addAll(mayflows);
		EntryPoint entrypoint = JoanaFactory.eINSTANCE.createEntryPoint();
		entrypoint.getLevel().addAll(levels);
		entrypoint.setLattice(lattice);
		MethodIdentifying method = JoanaFactory.eINSTANCE.createMethodIdentifying();
		method.setMethod(correspondences.getMethodProvidedSignatureCorrespondences().get(targetMethod));
		entrypoint.setMethodIdentification(method);

		
		Collection<StereotypeApplication> stereotypeApplications = application.getStereotypeApplications();
		Collection<StereotypeApplication> informationFlows = AccessAnalysisResolutionUtil
				.filterInformationFlowApplications(stereotypeApplications);
		
		for (StereotypeApplication stereotype : informationFlows) {
			Object stereotypedObject = stereotype.getAppliedTo();
			OperationSignature stereotypedSignature = null;
			if (stereotypedObject instanceof OperationSignature) {
				stereotypedSignature = (OperationSignature) stereotypedObject;
			} else {
				continue;
			}

			Collection<ParametersAndDataPair> paramtersanddatapairs = getParametersAndDataPairsForStereotype(
					stereotype);

			for (ParametersAndDataPair pair : paramtersanddatapairs) {
				Collection<String> paramsources = pair.getParameterSources();
				for (String paramsource : paramsources) {

					if (paramsource.toLowerCase().contains("return")) {

					} else if (paramsource.toLowerCase().contains("sizeof")) {

					} else if (paramsource.toLowerCase().contains("call")) {

					} else {
						ParameterIdentification pcmParameter = getParameterIdentification(stereotypedSignature, paramsource);
						Collection<DataSet> dataSets = AccessAnalysisResolutionUtil
								.filterDataSets(pair.getDataTargets());

						Parameter param = correspondences.getParameterToParameterCorrespondences().get(pcmParameter);
						Level level = getLevelForDataSets(dataSets, entrypoint.getLevel());
						ParametertIdentifying paramIdent = JOANAModelGenerationUtil.generateParameterIdentifying(param);

						if (stereotype.getAppliedTo().equals(targetMethod.getSignature())) {

							Source source = JOANAModelGenerationUtil.generateSource(level, paramIdent);
							entrypoint.getAnnotation().add(source);

						} else {
							Sink sink = JOANAModelGenerationUtil.generateSink(level, paramIdent);
							entrypoint.getAnnotation().add(sink);
						}
					}
				}
			}
		}
		
		return entrypoint;

	}

	private Collection<ParametersAndDataPair> getParametersAndDataPairsForStereotype(
			StereotypeApplication singleStereotype) {
		Collection<StereotypeApplication> appl = Collections.singletonList(singleStereotype);
		Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl,
				"parametersAndDataPairs", ParametersAndDataPair.class);
		return parametersAndDataPairs;
	}

	private Collection<Level> generateLevels() {

		Set<List<Level>> securityLevelPowerSet = generatePowerSetWithSortedLevels();

		Collection<Level> securityLevels = new HashSet<Level>();

		for (List<Level> securityLevelNames : securityLevelPowerSet) {

			String securityLevelName = combineLevelNames(securityLevelNames);
			Level level = JOANAModelGenerationUtil.generateLevel(securityLevelName);

			securityLevels.add(level);
		}

		return securityLevels;
	}

	private Collection<MayFlow> generateMayFlows(Collection<Level> availableLevels) {

		Collection<MayFlow> allowedFlows = new ArrayList<MayFlow>();
		Set<List<Level>> securityLevelPowerSet = generatePowerSetWithSortedLevels();

		for (List<Level> potentiallyFrom : securityLevelPowerSet) {
			for (List<Level> potentiallyTo : securityLevelPowerSet) {

				if (allowedFlowCondition(potentiallyFrom, potentiallyTo)) {
					Level from = findCombinedLevelForSeperateLevels(potentiallyFrom, availableLevels);
					Level to = findCombinedLevelForSeperateLevels(potentiallyTo, availableLevels);

					MayFlow allowed = JOANAModelGenerationUtil.generateMayFlow(from, to);
					allowedFlows.add(allowed);
				}
			}
		}
		return allowedFlows;
	}

	private String combineLevelNames(Collection<Level> securityLevels) {
		List<String> securityLevelNames = securityLevels.stream().map(securityLevel -> securityLevel.getName())
				.collect(Collectors.toList());

		return String.join("", securityLevelNames);
	}

	private Set<Set<Level>> generatePowerSetOfLevels() {
		Set<Level> basicLevels = new HashSet<Level>();

		// initial set
		for (DataSet dataSet : AccessAnalysisResolutionUtil.filterDataSets(accessAnalysisSpec.getDataIdentifier())) {
			Level level = JOANAModelGenerationUtil.generateLevel(dataSet.getName());
			basicLevels.add(level);
		}

		return Sets.powerSet(basicLevels);
	}

	private List<Level> sortLevels(Collection<Level> levels) {
		return levels.stream().sorted(Comparator.comparing(Level::getName)).collect(Collectors.toList());
	}

	private Set<List<Level>> generatePowerSetWithSortedLevels() {
		Set<Set<Level>> powerSetLevels = generatePowerSetOfLevels();
		Set<List<Level>> powerSetWithSortedLevels = new HashSet<List<Level>>();

		for (Set<Level> set : powerSetLevels) {
			if (!set.isEmpty()) {
				powerSetWithSortedLevels.add(sortLevels(set));
			}
		}

		return powerSetWithSortedLevels;
	}

	// Allowed Flow Condition according to H�ring
	private boolean allowedFlowCondition(Collection<Level> potentiallyFrom, Collection<Level> potentiallyTo) {
		return potentiallyFrom.size() == potentiallyTo.size() + 1 && potentiallyFrom.containsAll(potentiallyTo);
	}

	private Level findCombinedLevelForSeperateLevels(Collection<Level> seperateLevels,
			Collection<Level> combinedLevels) {
		for (Level combined : combinedLevels) {
			String combinedNameOfSeparateLevels = combineLevelNames(seperateLevels);

			if (combined.getName().equals(combinedNameOfSeparateLevels)) {
				return combined;
			}
		}

		return null;
	}

	private Level getLevelForDataSets(Collection<DataSet> datasets, Collection<Level> levels) {
		Collection<DataSet> sortedDataSets = datasets.stream().sorted(Comparator.comparing(DataSet::getName))
				.collect(Collectors.toList());
		List<String> dataSetsNames = sortedDataSets.stream().map(dataset -> dataset.getName())
				.collect(Collectors.toList());
		String combinedDataSetName = String.join("", dataSetsNames);

		for (Level level : levels) {
			if (level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}

	private ParameterIdentification getParameterIdentification(OperationSignature signature, String name) {
		Collection<ParameterIdentification> generatedParameterIdentifications = correspondences
				.getParameterToParameterCorrespondences().keySet();

		for (ParameterIdentification identification : generatedParameterIdentifications) {
			if (identification.getSignature().getSignature().equals(signature)
					&& identification.getParamerter().getParameterName().equals(name)) {
				return identification;
			}
		}
		return null;
	}

}
