package edu.kit.kastel.sdq.coupling.casestudy.framework.processingsteps.edfajoana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.exceptions.MissingPathIdentifierException;
import edu.kit.kastel.sdq.analysiscouplingframework.parser.Registry;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.steps.AnalysisPS;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.workflows.DefaultWorkflow;
import edu.kit.kastel.sdq.analysiscouplingframework.processing.workflows.Workflow;
import edu.kit.kastel.sdq.coupling.sourcecodeanalysis.joanaexecution.iterative.*;

public class EDFAJOANASourceCodeAnalysisPS extends AnalysisPS{

	protected static final String USER_SPECIFIC_PATH = "USER_SPECIFIC_PATH";
	protected static final String[] ARG_IDS = { "ANALYSIS_PROJECT_CODE_PATH", "JOANA_SOURCECODE_BASE_PACKAGE_PATH",
			"ENTRYPOINTS_FILE_PATH", "JOANA_RESULT_FILE_PATH", "JAVA8_COMPILER_LOCATION", "JAVA8_RUNTIME_LOCATION",
			"JOANA_CLI_LOCATION", "INTERFACE_FLOWS" };

	
	public EDFAJOANASourceCodeAnalysisPS(Registry registry) throws MissingPathIdentifierException {
		super(registry);
	}


	@Override
	protected String[] getArgsForExecution() {
		String pathPrefix = super.registry.getFileForID(USER_SPECIFIC_PATH).getPath();

		List<String> args = new ArrayList<String>();
		
		args.addAll(Arrays.stream(Arrays.copyOfRange(ARG_IDS, 0, 4))
						.map(e -> pathPrefix + super.registry.getFileForID(e).getPath()).collect(Collectors.toList()));
		
		args.addAll(Arrays.stream(Arrays.copyOfRange(ARG_IDS, 4, 7)).map(e -> super.registry.getFileForID(e).getPath())
		.map(p -> (System.getProperty("os.name").toLowerCase().contains("win"))
				? p.replaceAll(Pattern.quote("/"), Matcher.quoteReplacement("\\\\"))
				: p).collect(Collectors.toList()));
		
		args.addAll(Arrays.stream(Arrays.copyOfRange(ARG_IDS, 7, 8))
				.map(e -> pathPrefix + super.registry.getFileForID(e).getPath()).collect(Collectors.toList()));

		// args[0] = success message, args[1] = failure message
		// all other ordered args are the paths of the IDs taken from the registry
		return Stream.concat(Arrays.stream(new String[] { "JoanaAnalysisPS: execution successful.",
				"JoanaAnalysisPS: execution not successful: " }), args.stream()).toArray(String[]::new);
	}
	
	@Override
	public Workflow getWorkflow() {
		return new DefaultWorkflow(this);
	}

	@Override
	protected ExecutableProcessingStepAdapter getDefinedExecutableProcessingStepAdapter() {
		return new JoanaExecutionAdapter();
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
