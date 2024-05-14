package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;

import com.google.common.collect.Sets;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.AccessAnalysisResolutionUtil;
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
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public abstract class AccessAnalysis2JOANASecurityGenerator {

	private final PCMJavaCorrespondenceRoot correspondences;
	private final ConfidentialitySpecification accessAnalysisSpec;
	protected final JOANARoot root;
	protected static final String SUBLEVEL_DELIMITER = ";";
	// TODO: Do this for ease of debug. Later just generate file with entrypoint IDs
	// to execute JOANA
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

	protected Collection<EntryPoint> generateConfigurations_EntryPoints(ProfileApplication application) {
		Collection<EntryPoint> entrypoints = new ArrayList<EntryPoint>();
		Collection<StereotypeApplication> stereotypeApplications = application.getStereotypeApplications();
		Collection<StereotypeApplication> informationFlows = AccessAnalysisResolutionUtil
				.filterInformationFlowApplications(stereotypeApplications);

		for (StereotypeApplication informationflowStereo : informationFlows) {
			Object stereotypedObject = informationflowStereo.getAppliedTo();

			if (stereotypedObject instanceof OperationSignature) {
				OperationSignature stereotypedSig = (OperationSignature) stereotypedObject;

				for (ProvidedOperationSignature2JavaMethod provsig : correspondences
						.getProvidedoperationsignature2javamethod()) {
					if (provsig.getPcmMethod().getProvidedSignature().equals(stereotypedSig)) {

						entrypoints.addAll(generateConfigurations_EntryPoint(provsig.getPcmMethod(), application));
					}
				}
			}
		}

		return entrypoints;
	}

	private Collection<EntryPoint> generateConfigurations_EntryPoint(ProvidedSignature targetMethod,
			ProfileApplication application) {

		Collection<EntryPoint> entrypoints = new ArrayList<EntryPoint>();

		for (org.palladiosimulator.pcm.repository.Parameter parameter : targetMethod.getProvidedSignature()
				.getParameters__OperationSignature()) {
			Collection<Level> levels = generateLevels(
					AccessAnalysisResolutionUtil.filterDataSets(accessAnalysisSpec.getDataIdentifier()));
			EntryPoint entrypoint = JoanaFactory.eINSTANCE.createEntryPoint();
			entrypoint.getLevel().addAll(levels);

			// Lattice generation moved to the end of the for loop of processing one entrypoint
			// (To enable level collecting of srces and sinks on the fly, during processing)
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

					for (String paramsource : filterParametersFromParameterSources(pair.getParameterSources())) {

						ProvidedParameterIdentification pcmParameter = PCMJavaCorrespondenceResolutionUtils
								.getParameterIdentification(correspondences, targetMethod.getProvidedRole(),
										stereotypedSignature, paramsource);
						Collection<DataSet> dataSets = AccessAnalysisResolutionUtil
								.filterDataSets(pair.getDataTargets());
						// on the fly registration of levels into entrypoint possible
						Level level = getLevelForDataSets(dataSets, entrypoint.getLevel());

						Optional<Parameter> param = PCMJavaCorrespondenceResolutionUtils
								.getJavaParameters(correspondences, pcmParameter);

						// Source Case
						if (param.isPresent()) {
							ParametertIdentifying paramIdent = JOANAModelGenerationUtil
									.generateParameterIdentifying(param.get());
							if (stereotype.getAppliedTo().equals(targetMethod.getProvidedSignature())
									&& paramsource.equals(parameter.getParameterName())) {
								Source source = JOANAModelGenerationUtil.generateSource(level, paramIdent);
								entrypoint.getAnnotation().add(source);
							} else {
								// Sink case if available in same provided role but different signature
								Sink sink = JOANAModelGenerationUtil.generateSink(level, paramIdent);
								entrypoint.getAnnotation().add(sink);
							}
						}
						// Sink Case if not in same provided role but same signature

						Collection<ProvidedParameterIdentification> potentialPCMParameters = PCMJavaCorrespondenceResolutionUtils
								.getParameterIdentification(correspondences, stereotypedSignature, paramsource);

						
						for(ProvidedParameterIdentification pcmParam : potentialPCMParameters) {
							if(pcmParam.equals(pcmParameter)) {
								continue;
							}
							
							Optional<Parameter> sinkParam = PCMJavaCorrespondenceResolutionUtils
									.getJavaParameters(correspondences, pcmParam);

							ParametertIdentifying paramIdent = JOANAModelGenerationUtil
									.generateParameterIdentifying(sinkParam.get());
							Sink sink = JOANAModelGenerationUtil.generateSink(level, paramIdent);
							entrypoint.getAnnotation().add(sink);
						}
					}
				}

			}
			
			// Lattice generation
			Collection<MayFlow> mayflows = generateMayFlows(entrypoint);
			Lattice lattice = JoanaFactory.eINSTANCE.createLattice();
			lattice.getMayFlow().addAll(mayflows);
			entrypoint.setLattice(lattice);
			

			if (!entrypoint.getAnnotation().stream().anyMatch(annotation -> annotation instanceof Source)
					|| entrypoint.getAnnotation().isEmpty()) {
				entrypoint.setId(null);
			} else {
				entrypoint.setId(tagCounter.toString());
				tagCounter++;
				entrypoints.add(entrypoint);
			}
		}
		return entrypoints;
	}

	private Collection<String> getParametersOfParameterAndDataPairs(
			Collection<ParametersAndDataPair> paramtersanddatapairs) {
		Collection<String> parameters = new HashSet<String>();

		for (ParametersAndDataPair pair : paramtersanddatapairs) {
			parameters.addAll(pair.getParameterSources().stream()
					.filter(source -> !source.toLowerCase().contains("return")
							&& !source.toLowerCase().contains("sizeof") && !source.toLowerCase().contains("call"))
					.collect(Collectors.toList()));
		}

		return parameters;
	}

	private Collection<String> filterParametersFromParameterSources(Collection<String> parameterSources) {
		return parameterSources
				.stream().filter(source -> !source.toLowerCase().contains("return")
						&& !source.toLowerCase().contains("sizeof") && !source.toLowerCase().contains("call"))
				.collect(Collectors.toList());
	}

	private Collection<ParametersAndDataPair> getParametersAndDataPairsForStereotype(
			StereotypeApplication singleStereotype) {
		Collection<StereotypeApplication> appl = Collections.singletonList(singleStereotype);
		Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl,
				"parametersAndDataPairs", ParametersAndDataPair.class);
		return parametersAndDataPairs;
	}

	protected abstract Collection<Level> generateLevels(Collection<DataSet> dataSets);

	protected abstract Collection<MayFlow> generateMayFlows(EntryPoint currentEntryPoint);

	protected Level getLevelForDataSets(Collection<DataSet> datasets, Collection<Level> levels) {
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
