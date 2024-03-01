package edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import org.yaml.snakeyaml.Yaml;

import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

public class JoanaResult2SCARParser {

	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private static final String NEW_ENTRY_POINT_IDENTIFICATION = "entry_point_method";
	private static final String TAG_KEY = "tag";
	private static final String ILLEGAL_INFORMATION_FLOWS_KEY = "flow";
	private static final String SOURCE_KEY = "source";
	private static final String METHOD_KEY = "method";
	private static final String CLASS_KEY = "class";
	private static final String METHOD_NAME_KEY = "name";
	private static final String SOURCE_LEVEL_KEY = "source_level";
	private static final String PARAMETER_INDEX_KEY = "index";
	private static final String SINK_KEY = "sink";
	private static final String SINK_LEVEL_KEY = "sink_level";
	private static final String STATE_VARIABLE_KIND = "edu.kit.joana.api.sdg.sdgattribute";
	private static final String PARAMETER_KIND = "edu.kit.joana.api.sdg.sdgformalparameter";
	private static final String KIND_KEY = "kind";
	private static final String STATE_VARIABLE_NAME_KEY = "name";
	private static final String METHOD_PARAMETERS_KEY = "parameters";
	private static final String METHOD_SELECTOR = "selector";

	public JoanaResult2SCARParser(JavaRoot javaRoot, JOANARoot joanaRoot) {
		super();
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
	}

	public SourceCodeAnalysisResult readJOANAOutput(String resultFileContent) {

		Collection<String> entryPointsResults = splitResults(resultFileContent);

		SourceCodeAnalysisResult result = new SourceCodeAnalysisResult();

		for (String entryPointResultEntry : entryPointsResults) {
			Yaml yaml = new Yaml();
			Map<String, Object> content = yaml.load(entryPointResultEntry);

			Integer tag = (Integer) content.get(TAG_KEY);
			EntryPoint entryPoint = JOANAResolutionUtil.getEntryPointByTag(tag.toString(), joanaRoot);

			Collection<Map<String, Object>> illegalFlows = (ArrayList<Map<String, Object>>) content
					.get(ILLEGAL_INFORMATION_FLOWS_KEY);

			for (Map<String, Object> illegalFlow : illegalFlows) {

				ResultEntry resultEntry = parseIllegalFlow(illegalFlow, entryPoint);

				result.addResultEntry(resultEntry);
			}
		}

		return result;

	}

	private ResultEntry parseIllegalFlow(Map<String, Object> illegalFlow, EntryPoint entryPoint) {
		Map<String, Object> source = (Map<String, Object>) illegalFlow.get(SOURCE_KEY);
		Map<String, Object> sink = (Map<String, Object>) illegalFlow.get(SINK_KEY);

		String sourceLevelName = (String) illegalFlow.get(SOURCE_LEVEL_KEY);
		Level sourcelevel = JOANAResolutionUtil.lookupLevel(sourceLevelName, entryPoint);
		String sinkLevelName = (String) illegalFlow.get(SINK_LEVEL_KEY);
		Level sinklevel = JOANAResolutionUtil.lookupLevel(sinkLevelName, entryPoint);

		String sourceSystemElementType = (String) source.get(KIND_KEY);
		String sinkSystemElementType = (String) sink.get(KIND_KEY);

		ResultEntryElement<?> sourceElement = null;
		ResultEntryElement<?> sinkElement = null;

		if (sourceSystemElementType.equals(PARAMETER_KIND)) {

			Parameter sourceParam = retrieveParameter(source);
			sourceElement = new ResultEntryElement<Parameter>(sourceParam, sourcelevel);

		} else if (sourceSystemElementType.equals(STATE_VARIABLE_KIND)) {
			Field sourceField = retrieveField(source);
			sourceElement = new ResultEntryElement<Field>(sourceField, sourcelevel);
		}

		if (sinkSystemElementType.equals(PARAMETER_KIND)) {

			Parameter sinkParam = retrieveParameter(sink);
			sinkElement = new ResultEntryElement<Parameter>(sinkParam, sinklevel);

		} else if (sinkSystemElementType.equals(STATE_VARIABLE_KIND)) {
			Field sinkField = retrieveField(sink);
			sinkElement = new ResultEntryElement<Field>(sinkField, sinklevel);
		}

		return new ResultEntry(sourceElement, sinkElement, entryPoint);
	}

	private Parameter retrieveParameter(Map<String, Object> sourceSinkDetails) {

		Map<String, Object> methodDetails = (Map<String, Object>) sourceSinkDetails.get(METHOD_KEY);

		String fullyQualifiedNameOfClass = (String) methodDetails.get(CLASS_KEY);

		Class clazz = JavaResolutionUtil.findClassByFullyQualifiedPath(fullyQualifiedNameOfClass, javaRoot);
		String methodSelector = (String) methodDetails.get(METHOD_SELECTOR);

	
		Method method = getMethodOfClassBySelector(methodSelector, clazz);

		// Method method = JavaResolutionUtil.resolveMethodFromClassByName(clazz,
		// methodName);
		Integer relativeMethodParameterIndex = (Integer) sourceSinkDetails.get(PARAMETER_INDEX_KEY);

		// JOANA identifies result with 0, parameter indices begin with 1. Substract 1
		// as Offset for normalizstion
		return method.getParameter().get(relativeMethodParameterIndex - 1);

	}

	private Field retrieveField(Map<String, Object> sourceSink) {
		String fullyQualifiedNameOfClass = (String) sourceSink.get(CLASS_KEY);
		String fieldName = (String) sourceSink.get(STATE_VARIABLE_NAME_KEY);
		Class clazz = JavaResolutionUtil.findClassByFullyQualifiedPath(fullyQualifiedNameOfClass, javaRoot);

		// Workaround for Eval: Working with java model and source code requires
		// consistency between them
		// which is not given right now due to manual additions in Code (Fields) but not
		// in model.
		// Could be performed automatically, for instance with Vitruv
		// For now, just generate field if not present and add it to Java model in
		// memory
		Optional<Field> potentialField = clazz.getField().stream().filter(field -> field.getName().equals(fieldName))
				.findFirst();

		if (potentialField.isPresent()) {
			return potentialField.get();
		} else {
			Field newField = JavaModelGenerationUtil.generateField(fieldName);
			clazz.getField().add(newField);
			return newField;
		}

	}

	private Collection<String> splitResults(String resultFileContent) {
		Collection<String> entryPointResults = new ArrayList<String>();

		Scanner scanner = new Scanner(resultFileContent);
		StringBuilder builder = new StringBuilder();
		if (scanner.hasNextLine()) {
			builder.append(String.format("%s %s", scanner.nextLine(), System.lineSeparator()));
		} else {
			scanner.close();
			return entryPointResults;
		}

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();

			if (line.contains(NEW_ENTRY_POINT_IDENTIFICATION)) {
				entryPointResults.add(builder.toString());
				builder = new StringBuilder();
			}

			builder.append(String.format("%s %s", line, System.lineSeparator()));

		}

		entryPointResults.add(builder.toString());

		scanner.close();

		return entryPointResults;

	}
	
	private Method getMethodOfClassBySelector(String selector, Class clazz) {
		String[] methodNameParameterSplit = selector.split("\\(");
		String methodName = methodNameParameterSplit[0];
		String[] parameterTypes = methodNameParameterSplit[1].split("\\)")[0].split("L|;");
		List<String> clearedParameterTypes = new ArrayList<String>(Arrays.asList(parameterTypes));
		clearedParameterTypes.removeAll(Collections.singleton(""));
		
		for(Method method : clazz.getMethod()) {
			boolean isTargetMethod = true;
			if(methodName.equals(method.getName()) && method.getParameter().size() == clearedParameterTypes.size()) {
				for(int i = 0; i < clearedParameterTypes.size(); i++) {
					
					Parameter methodParameter = method.getParameter().get(i);
					
					if(clearedParameterTypes.get(i).equals("I")) {
						isTargetMethod &= methodParameter.getType().getName().equals("int");
					} else {
					
					String[] parameterTypeParts = clearedParameterTypes.get(i).split("/");
					String parameterType = parameterTypeParts[parameterTypeParts.length - 1];
					
					isTargetMethod &= parameterType.equals(method.getParameter().get(i).getType().getName());
					}
				}
				
				if(isTargetMethod) {
					return method;
				}
			}
		}
	
		
		return null;
	}
}
