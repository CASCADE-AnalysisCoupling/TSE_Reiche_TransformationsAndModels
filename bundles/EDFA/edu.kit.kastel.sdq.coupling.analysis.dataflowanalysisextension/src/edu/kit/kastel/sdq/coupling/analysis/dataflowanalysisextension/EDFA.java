package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.apache.log4j.Level;

import org.dataflowanalysis.analysis.core.AbstractActionSequenceElement;
import org.dataflowanalysis.analysis.core.ActionSequence;

import org.dataflowanalysis.analysis.pcm.PCMDataFlowConfidentialityAnalysis;
import org.dataflowanalysis.analysis.pcm.PCMDataFlowConfidentialityAnalysisBuilder;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Test;

import edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions.AllowedConditionsProvider;
import edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions.AllowedConditionsProviderFactory;
import edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.codeql.Activator;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

public class EDFA {



	@Test
	public void travelPlannerCodeQLTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.DISJUNCTIVE.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.codeql/models/travelplanner.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.codeql/models/travelplanner.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.codeql/models/travelplanner.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.codeql/models/travelplanner.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.codeql";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}

	}

	@Test
	public void travelPlannerJOANATest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.DISJUNCTIVE.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.joana/models/travelplanner.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.joana/models/travelplanner.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.joana/models/travelplanner.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.joana/models/travelplanner.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow.joana";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}

	@Test
	public void travelPlannerStandardTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.DISJUNCTIVE.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow/models/travelplanner.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow/models/travelplanner.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow/models/travelplanner.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/TravelPlanner/Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow/models/travelplanner.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}

	@Test
	public void JPMailCodeQLTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.HIGHLOW.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.codeql/models/jpmail.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.codeql/models/jpmail.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.codeql/models/jpmail.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.codeql/models/jpmail.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.codeql";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}

	@Test
	public void JPMailJOANATest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.HIGHLOW.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.joana/models/jpmail.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.joana/models/jpmail.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.joana/models/jpmail.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.joana/models/jpmail.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow.joana";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}

	@Test
	public void JPMailStandardTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.HIGHLOW.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow/models/jpmail.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow/models/jpmail.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow/models/jpmail.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/JPMail/Models/edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow/models/jpmail.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.jpmail.model.extendeddataflow";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}

	}
	
	@Test void CoCoMEStandardTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.DISJUNCTIVE.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow/models/cocome.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow/models/cocome.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow/models/cocome.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow/models/cocome.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}
	
	@Test void CoCoMECodeQLTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.DISJUNCTIVE.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.codeql/models/cocome.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.codeql/models/cocome.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.codeql/models/cocome.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.codeql/models/cocome.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.codeql";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}
	
	@Test void CoCoMEJOANATest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.DISJUNCTIVE.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.joana/models/cocome.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.joana/models/cocome.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.joana/models/cocome.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/CoCoMe/Models/edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.joana/models/cocome.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.cocome.model.extendeddataflow.joana";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}
	}
	
	@Test
	public void EclipseSecureStorageStandardTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.HIGHLOW.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow/models/eclipsesecurestorage.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow/models/eclipsesecurestorage.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow/models/eclipsesecurestorage.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow/models/eclipsesecurestorage.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}

	}
	
	@Test
	public void EclipseSecureStorageCodeQLTest() {
		AllowedConditionsProvider provider = AllowedConditionsProviderFactory
				.create(AllowedConditionsProviderFactory.POLICY.HIGHLOW.label);
		Evaluator evaluator = new Evaluator(provider);

		String usageModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow.codeql/models/eclipsesecurestorage.usagemodel";
		String allocationModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow.codeql/models/eclipsesecurestorage.allocation";
		String nodeCharacteristicsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow.codeql/models/eclipsesecurestorage.nodecharacteristics";
		String parameterAnnotationsModelPath = "/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/Cases/Systems/EclipseSecureStorage/Models/edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow.codeql/models/eclipsesecurestorage.parameterannotation";
		String modelProjectName = "edu.kit.kastel.sdq.coupling.casestudy.eclipsesecurestorage.model.extendeddataflow";

		final var usageModelURI = URI.createFileURI(usageModelPath);
		final var allocationURI = URI.createFileURI(allocationModelPath);
		final var nodeCharacteristicsURI = URI.createFileURI(nodeCharacteristicsModelPath);
		final var extensionModelURI = URI.createFileURI(parameterAnnotationsModelPath);

		PCMDataFlowConfidentialityAnalysis analysis = new PCMDataFlowConfidentialityAnalysisBuilder().standalone()
				.modelProjectName(modelProjectName).usePluginActivator(Activator.class)
				.useCustomResourceProvider(new ParameterAnnotationExtensionResourceProvider(usageModelURI,
						allocationURI, nodeCharacteristicsURI, extensionModelURI))
				.build();

		analysis.setLoggerLevel(Level.TRACE); // Set desired logger level. Level.TRACE provides additional
		// propagation Information

		List<ActionSequence> actionSequences = analysis.findAllSequences();

		List<ActionSequence> propagationResult = analysis.evaluateDataFlows(actionSequences);

		ParameterAnnotations config = ((ParameterAnnotationExtensionResourceProvider) analysis.getResourceProvider())
				.getParameterAnnotations();

		for (ActionSequence actionSequence : propagationResult) {
			List<AbstractActionSequenceElement<?>> violations = analysis.queryDataFlow(actionSequence,
					it -> !evaluator.allowedState(it, config, analysis));

			assertTrue(violations.isEmpty());
		}

	}
}
