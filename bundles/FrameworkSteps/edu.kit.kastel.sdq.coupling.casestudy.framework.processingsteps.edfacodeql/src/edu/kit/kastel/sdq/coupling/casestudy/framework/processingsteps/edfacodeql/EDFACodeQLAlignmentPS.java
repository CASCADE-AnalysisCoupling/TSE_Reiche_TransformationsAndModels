package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfacodeql;

import java.util.ArrayList;
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
import edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfacodeql.adapter.EDFA2CodeQLAdapter;

public class EDFACodeQLAlignmentPS extends AlignmentPS {

	protected static final String USER_SPECIFIC_PATH = "USER_SPECIFIC_PATH";
	protected static final String[] ARG_IDS = { "REPOSITORY_PATH", "SPECIFICATION_MODEL_PATH", "DATADICTIONARY_PATH",
			"EDFA_CONFIGURATIONS_PATH", "CODE_BASE_PACKAGE_NAME", "JAVA_MODEL_PATH", "CODEQL_MODEL_PATH",
			"CODEQL_CONFIGURATIONS_PATH", "PCM_JAVA_CORRESPONDENCE_MODEL_PATH", "CODEQL_FOLDER_PATH",
			"EDFA_CODEQL_CORRESPONDENCE_PATH", "POLICY_STYLE" };

	public EDFACodeQLAlignmentPS(Registry registry) throws MissingPathIdentifierException {
		super(registry);
	}

	@Override
	protected ExecutableProcessingStepAdapter getDefinedExecutableProcessingStepAdapter() {
		return new EDFA2CodeQLAdapter();
	}

	@Override
	protected String[] getArgsForExecution() {
		String pathPrefix = super.registry.getFileForID(USER_SPECIFIC_PATH).getPath();

		
		List<String> paths = new ArrayList<String>();
		
		
		// Create absolut and relative paths
		List<String> relPaths1 = Arrays.stream(Arrays.copyOfRange(ARG_IDS, 0, 4))
				.map(e -> pathPrefix + super.registry.getFileForID(e).getPath()).collect(Collectors.toList());
		String absPath1 = super.registry.getFileForID(ARG_IDS[4]).getPath();
		List<String> relPaths2 = Arrays.stream(Arrays.copyOfRange(ARG_IDS, 5, 11))
				.map(e -> pathPrefix + super.registry.getFileForID(e).getPath()).collect(Collectors.toList());
		String absPath2 = super.registry.getFileForID(ARG_IDS[11]).getPath();

		paths.addAll(relPaths1);
		paths.add(absPath1);
		paths.addAll(relPaths2);
		paths.add(absPath2);


		// args[0] = success message, args[1] = failure message
		// all other ordered args are the paths of the IDs taken from the registry
		return Stream.concat(Arrays.stream(new String[] { "CodeQLAlignmentPS: execution successful.",
				"CodeQLAlignmentPS: execution not successful: " }), paths.stream()).toArray(String[]::new);
	}

	@Override
	public Workflow getWorkflow() {
		return new DefaultWorkflow(this);
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
}
