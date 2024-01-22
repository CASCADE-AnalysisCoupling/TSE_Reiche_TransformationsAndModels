package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative.modelgenerators.transitivereduction.LevelHandler;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative.modelgenerators.transitivereduction.ValidRelation;
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
import edu.kit.kastel.sdq.partitioner.blackboard.PartitionerBlackboard;

public class IterativeAccessAnalysis2JOANASecurityGenerator {

	private final PCMJavaCorrespondenceRoot correspondences;
	private final JOANARoot root;
	private static final String SUBLEVEL_DELIMITER = ";";
	//TODO: Do this for ease of debug. Later just generate file with entrypoint IDs to execute JOANA
	private Integer tagCounter = 0;
	
	private LevelHandler<String> levelHandler;
	private HashMap<String, Level> levelInstancesRegistry;
	
	PartitionerBlackboard blackboard;

	public IterativeAccessAnalysis2JOANASecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec, PartitionerBlackboard blackboard) {
		super();
		this.correspondences = correspondences;
		this.root = JoanaFactory.eINSTANCE.createJOANARoot();
		this.levelHandler = new LevelHandler<String>();
		this.levelInstancesRegistry = new HashMap<String, Level>();
		this.blackboard = blackboard;
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

	private EntryPoint generateConfiguration_EntryPoint(ProvidedSignature targetMethod,
			ProfileApplication application) {

		EntryPoint entrypoint = JoanaFactory.eINSTANCE.createEntryPoint();

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
						ProvidedParameterIdentification pcmParameter = getParameterIdentification(stereotypedSignature,
								paramsource);
						Collection<DataSet> dataSets = AccessAnalysisResolutionUtil
								.filterDataSets(pair.getDataTargets());

						Parameter param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences,
								pcmParameter);

						// on the fly registration of only that combinedLevels that really occur
						Level level = this.registerLevelOccurrenceAndGetLevelInstance(dataSets);

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

		// Execute TransitiveReduction Algorithm and get Lattice as a result
		Lattice lattice = createResultingLatticeByTransitiveReduction();

		// Add Lattice and all occurring levels to the entrypoint
		entrypoint.setLattice(lattice);
		entrypoint.getLevel().addAll(levelInstancesRegistry.values());

		// Reset the Handler and Registry for the next Entrpoint
		this.resetLevelHandlerAndLevelInstancesRegistry();

		if(entrypoint.getAnnotation().isEmpty()) {
			entrypoint.setId(null);
		} else {
			entrypoint.setId(tagCounter.toString());
			tagCounter++;
		}
		
		return entrypoint;

	}

	private void resetLevelHandlerAndLevelInstancesRegistry() {
		this.levelHandler = new LevelHandler<String>();
		this.levelInstancesRegistry = new HashMap<String, Level>();
	}

	/**
	 * Registers the combined level and returns the singleton instance of the
	 * associated level object
	 * 
	 * @param dataSets the collection of single levels
	 * @return the Level instance
	 */

	private Level registerLevelOccurrenceAndGetLevelInstance(Collection<DataSet> dataSets) {
		List<String> allSingleLevels = dataSets.stream().map(ds -> ds.getName()).collect(Collectors.toList());
		levelHandler.insertCombinedLevel(allSingleLevels);
		return this.getLevelSingletonInstanceByName(this.combineLevelNames(allSingleLevels));
	}

	/**
	 * Combines the single SecurityLevels into one Name in which the
	 * single levels are sorted alphanumerical and separated by SUBLEVEL_DELIMETER.
	 * 
	 * @param securityLevels the single levels e.g. unordered: Creditcardinfo,
	 *                       Airlinedata, Userinfo
	 * @return the new name e.g. AirlinedataCreditcardinfoUserinfo
	 */

	private String combineLevelNames(Collection<String> securityLevels) {
		List<String> list = new ArrayList<String>(securityLevels);
		Collections.sort(list);

		// next line forces camelcase if not out commented
//		list = list.stream().map(e -> (e.substring(0, 1).toUpperCase() + e.substring(1).toLowerCase()))
//				.collect(Collectors.toList());

		return String.join(SUBLEVEL_DELIMITER, list);
	}

	/**
	 * Get the singleton object of JOANAs Level class for the exactly matching name.
	 * 
	 * @param levelName the name e.g. AirlinedataCreditcardinfoUserinfo
	 * @return the associated Level Object
	 */

	private Level getLevelSingletonInstanceByName(String levelName) {
		if (!levelInstancesRegistry.containsKey(levelName)) {
			levelInstancesRegistry.put(levelName, JOANAModelGenerationUtil.generateLevel(levelName));
		}
		return levelInstancesRegistry.get(levelName);
	}

	/**
	 * Triggers the transitive reduction algorithm of the LevelHandler. Translates
	 * the resulting ValidRelations into Mayflows by lookups in the
	 * levelInstancesRegistry and creates a Lattice consisting of these mayflows.
	 * 
	 * @return the resulting Lattice
	 */
	private Lattice createResultingLatticeByTransitiveReduction() {

		List<ValidRelation<String>> validRelations = levelHandler.getTransitiveReduction();

		List<MayFlow> mayflows = validRelations.stream()
				.map(vr -> JOANAModelGenerationUtil.generateMayFlow(
						this.getLevelSingletonInstanceByName(this.combineLevelNames(vr.getFrom())),
						this.getLevelSingletonInstanceByName(this.combineLevelNames(vr.getTo()))))
				.collect(Collectors.toList());

		Lattice lattice = JoanaFactory.eINSTANCE.createLattice();
		lattice.getMayFlow().addAll(mayflows);
		return lattice;
	}

	// adopted from the original Generator:
	// ---------------------------------------------------------------------------------------------------------------------

	private Collection<ParametersAndDataPair> getParametersAndDataPairsForStereotype(
			StereotypeApplication singleStereotype) {
		Collection<StereotypeApplication> appl = Collections.singletonList(singleStereotype);
		Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl,
				"parametersAndDataPairs", ParametersAndDataPair.class);
		return parametersAndDataPairs;
	}

	private ProvidedParameterIdentification getParameterIdentification(OperationSignature signature, String name) {
		Collection<ProvidedParameterIdentification> generatedParameterIdentifications = PCMJavaCorrespondenceResolutionUtils
				.getProvidedParameters(correspondences);

		for (ProvidedParameterIdentification identification : generatedParameterIdentifications) {
			if (identification.getProvidedSignature().getProvidedSignature().equals(signature)
					&& identification.getParameter().getParameterName().equals(name)) {
				return identification;
			}
		}
		return null;
	}
}