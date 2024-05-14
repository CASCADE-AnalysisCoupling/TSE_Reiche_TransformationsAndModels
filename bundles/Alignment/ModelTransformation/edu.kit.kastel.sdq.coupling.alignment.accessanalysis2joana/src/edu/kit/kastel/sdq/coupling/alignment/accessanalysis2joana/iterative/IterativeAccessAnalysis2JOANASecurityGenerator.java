package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.iterative;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.Sink;
import edu.kit.kastel.sdq.coupling.models.joana.Source;
import edu.kit.kastel.sdq.coupling.models.joana.SystemElementIdentifying;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.util.iterative.transitivereduction.LevelHandler;
import edu.kit.kastel.sdq.partitioner.Partitioner;
import edu.kit.kastel.sdq.partitioner.blackboard.PartitionerBlackboard;

public class IterativeAccessAnalysis2JOANASecurityGenerator
		extends AccessAnalysis2JOANATransitiveReductionSecurityGenerator {

	protected LevelHandler<String> levelHandler;
	protected HashMap<String, Level> levelInstancesRegistry;

	protected PartitionerBlackboard blackboard;

	public IterativeAccessAnalysis2JOANASecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec, PartitionerBlackboard blackboard,
			boolean shouldGenerateOnlyOccurringLevelsNotWholePowerset) {
		super(correspondences, accessAnalysisSpec, shouldGenerateOnlyOccurringLevelsNotWholePowerset);
		this.levelHandler = new LevelHandler<String>();
		this.levelInstancesRegistry = new HashMap<String, Level>();
		this.blackboard = blackboard;
	}

	public IterativeAccessAnalysis2JOANASecurityGenerator(PCMJavaCorrespondenceRoot correspondences,
			ConfidentialitySpecification accessAnalysisSpec, PartitionerBlackboard blackboard) {
		this(correspondences, accessAnalysisSpec, blackboard, false);
	}

	@Override
	public JOANARoot generateJOANASpecification(ProfileApplication application) {
		Collection<EntryPoint> entrypoints = generateConfigurations_EntryPoints(application);

		// Additional step for Iterative approach:
		this.postprocessEntrypointsForIterations(entrypoints);

		root.getEntrypoint().addAll(entrypoints);
		return root;
	}

	private void postprocessEntrypointsForIterations(Collection<EntryPoint> entrypoints) {
		// this.selectEntrypointsForCurrentIteration(entrypoints);
		// this.selectSinksForCurrentIteration(entrypoints);
		// this.selectSourcesForCurrentIteration(entrypoints);
		this.selectSourcesWithCertainSecurityLevelForCurrentIteration(entrypoints);
	}

	/**
	 * Removes all EntryPoints, which are not in the currentPartition.
	 * 
	 * @param entrypoints the List of entrypoints to manipulate
	 */
	private void selectEntrypointsForCurrentIteration(Collection<EntryPoint> entrypoints) {
		Partitioner entrypointPartitioner = this.blackboard.getPartitionerByID("partitioner_entrypoints");
		if (entrypointPartitioner == null) {
			return;
		}

		if (!entrypointPartitioner.isInitialized()) {
			List<String> allIDs = entrypoints.stream().map(e -> e.getId()).collect(Collectors.toList());
			entrypointPartitioner.init(allIDs);
		}

		List<String> currentIDs = entrypointPartitioner.currentPartition();
		entrypoints.removeIf(e -> !currentIDs.contains(e.getId()));
	}

	/**
	 * Removes all Sink Annotations from each EntryPoint, which are not in the
	 * currentPartition.
	 * 
	 * @param entrypoints the List of entrypoints to manipulate
	 */
	private void selectSinksForCurrentIteration(Collection<EntryPoint> entrypoints) {
		Partitioner sinkPartitioner = this.blackboard.getPartitionerByID("partitioner_sinks");
		if (sinkPartitioner == null) {
			return;
		}

		if (!sinkPartitioner.isInitialized()) {
			List<String> allIDs = entrypoints.stream()
					.map(e -> e.getAnnotation().stream().filter(a -> a instanceof Sink)
							.map(s -> this.getFullyQualifiedIdentifierForSourceOrSink(s)))
					.flatMap(s -> s).distinct().collect(Collectors.toList());

			sinkPartitioner.init(allIDs);
		}

		List<String> currentIDs = sinkPartitioner.currentPartition();
		for (EntryPoint e : entrypoints) {
			e.getAnnotation().removeIf(a -> ((a instanceof Sink)
					&& !currentIDs.contains(this.getFullyQualifiedIdentifierForSourceOrSink(a))));
		}
		// If no sinks belong to this entrypoint, we can remove it.
		entrypoints.removeIf(e -> e.getAnnotation().stream().filter(a -> a instanceof Sink).count() == 0);
	}

	/**
	 * Removes all Source Annotations from each EntryPoint, which are not in the
	 * currentPartition.
	 * 
	 * @param entrypoints the List of entrypoints to manipulate
	 */
	private void selectSourcesForCurrentIteration(Collection<EntryPoint> entrypoints) {
		Partitioner sourcePartitioner = this.blackboard.getPartitionerByID("partitioner_sources");
		if (sourcePartitioner == null) {
			return;
		}

		// 1. Iteration --> notInitialized yet --> initialize with all possible IDs
		if (!sourcePartitioner.isInitialized()) {
			List<String> allIDs = entrypoints.stream()
					.map(e -> e.getAnnotation().stream().filter(a -> a instanceof Source)
							.map(s -> this.getFullyQualifiedIdentifierForSourceOrSink(s)))
					.flatMap(s -> s).distinct().collect(Collectors.toList());

			sourcePartitioner.init(allIDs);
		}

		// Every Iteration --> get current Partition of IDs and remove all sources which
		// are not included
		List<String> currentIDs = sourcePartitioner.currentPartition();
		for (EntryPoint e : entrypoints) {
			e.getAnnotation().removeIf(a -> ((a instanceof Source)
					&& !currentIDs.contains(this.getFullyQualifiedIdentifierForSourceOrSink(a))));
		}
		// If no sources belong to this entrypoint, we can remove it.
		System.out.println(
				entrypoints.stream().map(e -> e.getAnnotation().stream().filter(a -> a instanceof Source).count())
						.collect(Collectors.toList()));
		entrypoints.removeIf(e -> (e.getAnnotation().stream().filter(a -> a instanceof Source).count() == 0));
		System.out.println(
				entrypoints.stream().map(e -> e.getAnnotation().stream().filter(a -> a instanceof Source).count())
						.collect(Collectors.toList()));

	}

	private void selectSourcesWithCertainSecurityLevelForCurrentIteration(Collection<EntryPoint> entrypoints) {
		Partitioner levelPartitioner = this.blackboard.getPartitionerByID("partitioner_levels");
		if (levelPartitioner == null) {
			return;
		}

		if (!levelPartitioner.isInitialized()) {
			List<String> allIDs = entrypoints.stream().map(e -> e.getLevel().stream().map(l -> l.getName()))
					.flatMap(s -> s).distinct().collect(Collectors.toList());

			levelPartitioner.init(allIDs);
		}

		List<String> currentIDs = levelPartitioner.currentPartition();
		System.out.println("");
		System.out.println("          Starting Next Iteration");
		System.out.println(
				"------------------------------> Source Level for the current iteration is: " + currentIDs.get(0));
		
		
		
		// ------> Following lines works with entrypoint removing... does the same as original.

		
//		// Remove all entrypoints e, which have no source with level out of the current iterations levels
//		// To do so look at the Sources in e: As soon as a Source in e exists with a correct level, e is not removed.
//		entrypoints.removeIf(e -> !e.getAnnotation().stream()
//				.anyMatch(a -> a instanceof Source && currentIDs.contains(a.getLevel().getName())));
		
		for (EntryPoint e : entrypoints) {
			e.getAnnotation().removeIf(a -> ((a instanceof Source) && !currentIDs.contains(a.getLevel().getName())));
		}
		//If no sources belong to an entrypoint, we can remove it.
		entrypoints.removeIf(e -> e.getAnnotation().stream().filter(a -> a instanceof Source).count() == 0);
	}

	/**
	 * Builds a fully qualified ID for annotations. e.g.:<br>
	 * <br>
	 * Class.method(parameter:Type) //in case of a parameter<br>
	 * Class.method() //in case of a method
	 * 
	 * @param sourceOrSink the Source or Sink represented as
	 *                     InformationFlowAnnotation
	 * @return the fully qualified ID
	 */
	private String getFullyQualifiedIdentifierForSourceOrSink(InformationFlowAnnotation sourceOrSink) {

		SystemElementIdentifying systemElementIdentification = sourceOrSink.getSystemElementIdentification();
		String fullyQualifiedName = "";

		if (systemElementIdentification instanceof ParametertIdentifying) {
			Parameter p = ((ParametertIdentifying) systemElementIdentification).getParameter();
			Type t = p.getType();
			Method m = (Method) p.eContainer();
			Class c = (Class) m.eContainer();
			fullyQualifiedName = c.getName() + "." + m.getName() + "(" + p.getName() + " : " + t.getName() + ")";
		} else if (systemElementIdentification instanceof MethodIdentifying) {
			Method m = ((MethodIdentifying) systemElementIdentification).getMethod();
			Class c = (Class) m.eContainer();
			fullyQualifiedName = c.getName() + "." + m.getName() + "()";
		}
		return fullyQualifiedName;
	}
}
