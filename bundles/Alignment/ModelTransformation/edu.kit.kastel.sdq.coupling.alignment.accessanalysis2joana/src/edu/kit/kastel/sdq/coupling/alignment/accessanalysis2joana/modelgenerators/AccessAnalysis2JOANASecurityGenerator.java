package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;

import com.google.common.collect.Sets;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.AccessAnalysisResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
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
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public class AccessAnalysis2JOANASecurityGenerator {

	private final PCMJavaCorrespondenceRoot correspondences;
	private final ConfidentialitySpecification accessAnalysisSpec;
	private final JOANARoot root;
	private static final String SUBLEVEL_DELIMITER = ";";
	//TODO: Do this for ease of debug. Later just generate file with entrypoint IDs to execute JOANA
	private Integer tagCounter = 0;

	public AccessAnalysis2JOANASecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
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
				
				for(ProvidedOperationSignature2JavaMethod provsig : correspondences.getProvidedoperationsignature2javamethod()) {
					if(provsig.getPcmMethod().getProvidedSignature().equals(stereotypedSig)) {
						//TODO: Check why there is two times the same operationsignature
						EntryPoint entryPoint = generateConfiguration_EntryPoint(provsig.getPcmMethod(), application);
						
						if(entryPoint.getId() != null) {
							entrypoints.add(entryPoint);
						}
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
		method.setMethod(PCMJavaCorrespondenceResolutionUtils.getMethod(correspondences, targetMethod));
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
						ProvidedParameterIdentification pcmParameter = getParameterIdentification(stereotypedSignature, paramsource);
						Collection<DataSet> dataSets = AccessAnalysisResolutionUtil
								.filterDataSets(pair.getDataTargets());

						Parameter param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences, pcmParameter);
						Level level = getLevelForDataSets(dataSets, entrypoint.getLevel());
						ParametertIdentifying paramIdent = JOANAModelGenerationUtil.generateParameterIdentifying(param);

						if (stereotype.getAppliedTo().equals(targetMethod.getProvidedSignature())) {

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
		
		if(entrypoint.getAnnotation().isEmpty()) {
			entrypoint.setId(null);
		} else {
			entrypoint.setId(tagCounter.toString());
			tagCounter++;
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

		return String.join(SUBLEVEL_DELIMITER, securityLevelNames);
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
		String combinedDataSetName = String.join(SUBLEVEL_DELIMITER, dataSetsNames);

		for (Level level : levels) {
			if (level.getName().equals(combinedDataSetName)) {
				return level;
			}
		}
		return null;
	}

	private ProvidedParameterIdentification getParameterIdentification(OperationSignature signature, String name) {
		Collection<ProvidedParameterIdentification> generatedParameterIdentifications = PCMJavaCorrespondenceResolutionUtils.getProvidedParameters(correspondences);

		for (ProvidedParameterIdentification identification : generatedParameterIdentifications) {
			if (identification.getProvidedSignature().getProvidedSignature().equals(signature)
					&& identification.getParameter().getParameterName().equals(name)) {
				return identification;
			}
		}
		return null;
	}

}
