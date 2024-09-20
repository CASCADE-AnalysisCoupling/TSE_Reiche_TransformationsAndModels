package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils.ConfigurationrepresentationUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.util.EDFAJOANACorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
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
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.supporting.util.PCMJavaCorrespondenceResolutionUtils;

public abstract class ExtendedDataFlowAnalysis2JOANASecurityGenerator {

	private final JOANARoot root;
	private final ParameterAnnotations parameterAnnotations;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final PCMDataDictionary dictionary;
	protected static final String SUBLEVEL_DELIMITER = ";";
	protected final Correspondences_EDFAJOANA edfaJoanaCorrespondences;
	private final Configurations joana_Configurations;

	private Integer tagCounter = 0;

	public ExtendedDataFlowAnalysis2JOANASecurityGenerator(ParameterAnnotations parameterAnnotations,
			PCMJavaCorrespondenceRoot correspondences, PCMDataDictionary dictionary) {
		this.parameterAnnotations = parameterAnnotations;
		this.correspondences = correspondences;
		this.dictionary = dictionary;
		this.root = JoanaFactory.eINSTANCE.createJOANARoot();
		this.edfaJoanaCorrespondences = EDFAJOANACorrespondenceUtil.createCorrespondences();
		this.joana_Configurations = ConfigurationrepresentationUtil.generateConfigurations();
	}

	public JOANARoot generateJOANASpecification(JavaRoot sourceCode, FullyImplicitConfiguration edfa_Configuration) {
		root.getEntrypoint().addAll(generateConfigurations_EntryPoints(sourceCode, edfa_Configuration));
		return root;
	}

	private Collection<EntryPoint> generateConfigurations_EntryPoints(JavaRoot sourceCode, FullyImplicitConfiguration edfa_Configuration) {
		Collection<EntryPoint> entrypoints = new ArrayList<EntryPoint>();
		Collection<ParameterAnnotation> annotations = parameterAnnotations.getAnnotations();

		for (ParameterAnnotation annotation : annotations) {

			Collection<ProvidedParameterIdentification> providedParameterIdents = getProvidedParameterIdentificationForParameterAnnotation(
					annotation);

			for (ProvidedParameterIdentification parameterIdentification : providedParameterIdents) {
				EntryPoint entryPoint = generateConfiguration_EntryPoint(parameterIdentification, annotation,
						annotations, sourceCode, edfa_Configuration);

				if (entryPoint != null) {
					entrypoints.add(entryPoint);
				}
			}

		}

		return entrypoints;
	}

	private EntryPoint generateConfiguration_EntryPoint(ProvidedParameterIdentification targetParameterIdentification,
			ParameterAnnotation targetAnnotation, Collection<ParameterAnnotation> allAnnotations, JavaRoot sourceCode, FullyImplicitConfiguration edfa_Configuration) {

		// TODO: Workaround necessary as EMF does not correctly resolve
		// EnumCharacteristicType, otherwise we would do this for target Annotation directly
		Collection<Literal> allEnumLiterals = dictionary.getCharacteristicEnumerations().get(0).getLiterals();

		Collection<Level> levels = generateLevels(allEnumLiterals);

		EntryPoint entryPoint = JoanaFactory.eINSTANCE.createEntryPoint();
		entryPoint.getLevel().addAll(levels);

		Collection<MayFlow> mayflows = generateMayFlows(entryPoint);

		Lattice lattice = JoanaFactory.eINSTANCE.createLattice();
		lattice.getMayFlow().addAll(mayflows);

		entryPoint.setLattice(lattice);
		MethodIdentifying method = JoanaFactory.eINSTANCE.createMethodIdentifying();
		method.setMethod(PCMJavaCorrespondenceResolutionUtils.getMethod(correspondences,
				targetParameterIdentification.getProvidedSignature()));
		entryPoint.setMethodIdentification(method);

		for (ParameterAnnotation parameterAnnotation : allAnnotations) {

			Collection<ProvidedParameterIdentification> parameterIdentifications = getProvidedParameterIdentificationForParameterAnnotation(
					parameterAnnotation);
			
			//Assumption: Only Annotate the levels to parameters. Should be identified by semantics.
			//However, due to EMF Issues, type cannot be targeted. 
			Level level = getLevelForLiterals(parameterAnnotation.getCharacteristics().get(0).getValues(),
					entryPoint.getLevel());
			
			for (ProvidedParameterIdentification parameterIdentification : parameterIdentifications) {
				
				Optional<Parameter> param = PCMJavaCorrespondenceResolutionUtils.getJavaParameters(correspondences,
						parameterIdentification);
				ParametertIdentifying paramIdent = JOANAModelGenerationUtil.generateParameterIdentifying(param.get());
				
				if (parameterIdentification.equals(targetParameterIdentification)) {
					Source source = JOANAModelGenerationUtil.generateSource(level, paramIdent);
					entryPoint.getAnnotation().add(source);
				}  else {
					Sink sink = JOANAModelGenerationUtil.generateSink(level, paramIdent);
					entryPoint.getAnnotation().add(sink);
				}
			}
		}
		
		if(!entryPoint.getAnnotation().isEmpty()) {
			entryPoint.setId(tagCounter.toString());
			tagCounter++;
			HybridConfiguration entryPointConfiguration = ConfigurationrepresentationUtil.generateHybridConfiguration(entryPoint);
			entryPointConfiguration.getAdditionalInputs().addAll(Collections.singletonList(sourceCode));
			
			this.joana_Configurations.getConfigurations().add(entryPointConfiguration);
			EDFAJOANACorrespondenceUtil.createAndAddIfCorrespondenceNotExists(edfa_Configuration, entryPointConfiguration, edfaJoanaCorrespondences);
			return entryPoint;
		} 

		return null;
	}

	private Collection<ProvidedParameterIdentification> getProvidedParameterIdentificationForParameterAnnotation(
			ParameterAnnotation annotation) {
		Collection<ProvidedParameterIdentification> providedParameterIdents = new ArrayList<>();

		if (annotation.getParameterIdentification() instanceof ProvidedOperationParameterIdentification) {
			ProvidedOperationParameterIdentification provParam = (ProvidedOperationParameterIdentification) annotation
					.getParameterIdentification();
			providedParameterIdents.add(PCMJavaCorrespondenceResolutionUtils.getParameterIdentification(correspondences,
					provParam.getProvidedRole(), provParam.getOperationSignature(),
					provParam.getParameter().getParameterName()));

		} else if (annotation.getParameterIdentification() instanceof GeneralOperationParameterIdentification) {
			GeneralOperationParameterIdentification generalParameterIdent = (GeneralOperationParameterIdentification) annotation
					.getParameterIdentification();

			Collection<BasicComponent> correspondingBasicComponents = correspondences.getBasiccomponent2class().stream()
					.map(entry -> entry.getComponent()).collect(Collectors.toList());

			for (BasicComponent component : correspondingBasicComponents) {
				Collection<OperationProvidedRole> operationProvidedRoles = component
						.getProvidedRoles_InterfaceProvidingEntity().stream()
						.filter(OperationProvidedRole.class::isInstance).map(OperationProvidedRole.class::cast)
						.collect(Collectors.toList());

				for (OperationProvidedRole role : operationProvidedRoles) {
					if (role.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()
							.contains(generalParameterIdent.getOperationSignature())) {

						ProvidedParameterIdentification correspondenceParameterIdent = PCMJavaCorrespondenceResolutionUtils
								.getParameterIdentification(correspondences, role,
										generalParameterIdent.getOperationSignature(),
										generalParameterIdent.getParameter().getParameterName());

						providedParameterIdents.add(correspondenceParameterIdent);
					}
				}
			}
		}

		return providedParameterIdents;
	}

	protected abstract Collection<Level> generateLevels(Collection<Literal> literals);

	protected abstract Collection<MayFlow> generateMayFlows(EntryPoint currentEntryPoint);


	protected Level getLevelForLiterals(Collection<Literal> literals, Collection<Level> levels) {
		Collection<Literal> sortedLiterals = literals.stream().sorted(Comparator.comparing(Literal::getName))
				.collect(Collectors.toList());
		List<String> dataSetsNames = sortedLiterals.stream().map(Literal::getName).collect(Collectors.toList());
		String combinedLiteralName = String.join(SUBLEVEL_DELIMITER, dataSetsNames);

		for (Level level : levels) {
			if (level.getName().equals(combinedLiteralName)) {
				return level;
			}
		}
		return null;
	}

	public Correspondences_EDFAJOANA getEdfaJoanaCorrespondences() {
		return edfaJoanaCorrespondences;
	}
	
	public Configurations getJoana_Configurations() {
		return joana_Configurations;
	}

}
