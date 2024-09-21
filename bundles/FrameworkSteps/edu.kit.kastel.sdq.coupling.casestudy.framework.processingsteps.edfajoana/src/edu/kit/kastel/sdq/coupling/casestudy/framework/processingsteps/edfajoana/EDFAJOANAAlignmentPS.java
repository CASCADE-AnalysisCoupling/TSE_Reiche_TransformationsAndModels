package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfajoana;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.exceptions.MissingPathIdentifierException;
import edu.kit.kastel.sdq.analysiscouplingframework.parser.Registry;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.steps.AlignmentPS;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.workflows.DefaultWorkflow;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.workflows.Workflow;
import edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfajoana.adapter.EDFA2JOANAAdapter;

public class EDFAJOANAAlignmentPS extends AlignmentPS {

	protected static final String USER_SPECIFIC_PATH = "USER_SPECIFIC_PATH";
	protected static final String[] ARG_IDS = { "REPOSITORY_PATH", "SPECIFICATION_MODEL_PATH", "DATADICTIONARY_PATH",
			"EDFA_CONFIGURATIONS_PATH", "JAVA_CODE_BASE_PATH", "CODE_BASE_PACKAGE_NAME", "JAVA_MODEL_PATH",
			"JOANA_MODEL_PATH", "JOANA_CONFIGURATIONS_PATH", "PCM_JAVA_CORRESPONDENCE_MODEL_PATH",
			"EDFA_JOANA_CORRESPONDENCE_PATH", "POLICY_STYLE" };

	public EDFAJOANAAlignmentPS(Registry registry) throws MissingPathIdentifierException {
		super(registry);
	}

	@Override
	protected String[] getArgsForExecution() {
		String pathPrefix = super.registry.getFileForID(USER_SPECIFIC_PATH).getPath();

		// Create absolut and relative paths
		List<String> relPaths1 = Arrays.stream(Arrays.copyOfRange(ARG_IDS, 0, 5))
				.map(e -> pathPrefix + super.registry.getFileForID(e).getPath()).collect(Collectors.toList());
		String absPath1 = super.registry.getFileForID(ARG_IDS[5]).getPath();
		List<String> relPaths2 = Arrays.stream(Arrays.copyOfRange(ARG_IDS, 6, 11))
				.map(e -> pathPrefix + super.registry.getFileForID(e).getPath()).collect(Collectors.toList());
		String absPath2 = super.registry.getFileForID(ARG_IDS[11]).getPath();

		relPaths1.add(absPath1);
		relPaths1.addAll(relPaths2);
		relPaths1.add(absPath2);


		// args[0] = success message, args[1] = failure message
		// all other ordered args are the paths of the IDs taken from the registry
		return Stream.concat(Arrays.stream(new String[] { "CodeQLAlignmentPS: execution successful.",
				"CodeQLAlignmentPS: execution not successful: " }), relPaths1.stream()).toArray(String[]::new);
	}

	@Override
	protected String[] getFilesForImport() {
		return new String[] {};
	}

	@Override
	protected String[] getFilesForExecution() {
		return new String[] {};
	}

	@Override
	protected String[] getFilesForExport() {
		return new String[] {};
	}

	@Override
	protected ExecutableProcessingStepAdapter getDefinedExecutableProcessingStepAdapter() {
		return new EDFA2JOANAAdapter();
	}

	@Override
	public Workflow getWorkflow() {
		return new DefaultWorkflow(this);
	}
}
