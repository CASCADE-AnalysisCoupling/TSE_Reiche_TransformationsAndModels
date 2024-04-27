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


import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
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
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.FieldIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntry;
import edu.kit.kastel.sdq.coupling.models.joanascar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.joanascar.utils.JOANASCARElementHandlingUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.utils.JOANASCARModelGenerationUtil;

public class JoanaResult2SCARParser {

	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private SourceCodeAnalysisResult scar;
	private final JOANASCARCorrespondences scarCorrespondences;
	
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
	private static final String FIELD_KIND = "edu.kit.joana.api.sdg.sdgattribute";
	private static final String PARAMETER_KIND = "edu.kit.joana.api.sdg.sdgformalparameter";
	private static final String KIND_KEY = "kind";
	private static final String FIELD_NAME_KEY = "name";
	private static final String METHOD_PARAMETERS_KEY = "parameters";
	private static final String METHOD_SELECTOR = "selector";
	private static final String PARAMETER_TYPE = "type";

	public JoanaResult2SCARParser(JavaRoot javaRoot, JOANARoot joanaRoot) {
		super();
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.scarCorrespondences = JOANASCARCorrespondenceUtil.createSCARCorrespondences();
	}

	public SourceCodeAnalysisResult readJOANAOutput(String resultFileContent) {

		Collection<String> entryPointsResults = splitResults(resultFileContent);

		scar = JOANASCARModelGenerationUtil.createSourceCodeAnalysisResult();

		for (String entryPointResultEntry : entryPointsResults) {
			Yaml yaml = new Yaml();
			Map<String, Object> content = yaml.load(entryPointResultEntry);

			Integer tag = (Integer) content.get(TAG_KEY);
			EntryPoint entryPoint = JOANAResolutionUtil.getEntryPointByTag(tag.toString(), joanaRoot);
			EntryPointIdentifying entryPointIdentifying = JOANASCARElementHandlingUtil.getOrCreateAndAddEntryPointByTag(tag.toString(), scar);

			JOANASCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(entryPoint, entryPointIdentifying, scarCorrespondences);
			
			Collection<Map<String, Object>> illegalFlows = (ArrayList<Map<String, Object>>) content
					.get(ILLEGAL_INFORMATION_FLOWS_KEY);

			for (Map<String, Object> illegalFlow : illegalFlows) {

				ResultEntry resultEntry = parseIllegalFlow(illegalFlow, entryPointIdentifying, entryPoint);

				scar.getResultEntries().add(resultEntry);
			}
		}

		return scar;

	}

	private ResultEntry parseIllegalFlow(Map<String, Object> illegalFlow, EntryPointIdentifying entryPointIdentyfying, EntryPoint entryPoint) {
		Map<String, Object> source = (Map<String, Object>) illegalFlow.get(SOURCE_KEY);
		Map<String, Object> sink = (Map<String, Object>) illegalFlow.get(SINK_KEY);

		String sourceLevelName = (String) illegalFlow.get(SOURCE_LEVEL_KEY);
		Level sourcelevel_JOANA = JOANAResolutionUtil.lookupLevel(sourceLevelName, entryPoint);
		Level_SCAR sourceLevel_SCAR = JOANASCARElementHandlingUtil.getOrCreateAndAddSecurityLevelByName(sourceLevelName, scar);
		JOANASCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(sourcelevel_JOANA, sourceLevel_SCAR, scarCorrespondences);
		
		
		String sinkLevelName = (String) illegalFlow.get(SINK_LEVEL_KEY);
		Level sinklevel_JOANA = JOANAResolutionUtil.lookupLevel(sinkLevelName, entryPoint);
		Level_SCAR sinkLevel_SCAR = JOANASCARElementHandlingUtil.getOrCreateAndAddSecurityLevelByName(sinkLevelName, scar);
		JOANASCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(sinklevel_JOANA, sinkLevel_SCAR, scarCorrespondences);
		
		

		ResultEntryElement<?> sourceElement = generateResultEntryElement(source, sourceLevel_SCAR);
		ResultEntryElement<?> sinkElement = generateResultEntryElement(sink, sinkLevel_SCAR);

		return JOANASCARModelGenerationUtil.createResultEntry(entryPointIdentyfying, sourceElement, sinkElement);
	}
	
	private ResultEntryElement<?> generateResultEntryElement(Map<String, Object> resultEntryElementRepresentation, Level_SCAR securityLevel) {
		String systemElementType = (String) resultEntryElementRepresentation.get(KIND_KEY);
		
		if (systemElementType.equals(PARAMETER_KIND)) {

			Parameter param_Java = retrieveParameter(resultEntryElementRepresentation);
			ParameterIdentifying param_SCAR = retrieveParameterIdentifying(resultEntryElementRepresentation);
			JOANASCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(param_Java, param_SCAR, scarCorrespondences);
			
			
			return JOANASCARModelGenerationUtil.createResultEntryElement(param_SCAR, securityLevel);

		} else if (systemElementType.equals(FIELD_KIND)) {
			Field field_Java = retrieveField(resultEntryElementRepresentation);
			FieldIdentifying field_SCAR = resolveFieldIdentification_SCAR(resultEntryElementRepresentation);
			JOANASCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(field_Java, field_SCAR, scarCorrespondences);
			
			return JOANASCARModelGenerationUtil.createResultEntryElement(field_SCAR, securityLevel);
		}
		
		return null;
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
	
	
	private ParameterIdentifying retrieveParameterIdentifying(Map<String, Object> systemElementRepresentation) {

		Map<String, Object> methodDetails = (Map<String, Object>) systemElementRepresentation.get(METHOD_KEY);

		String fullyQualifiedNameOfClass = (String) methodDetails.get(CLASS_KEY);
		String methodName = (String) methodDetails.get(METHOD_NAME_KEY);
		Integer relativeMethodParameterIndex = (Integer) systemElementRepresentation.get(PARAMETER_INDEX_KEY);
		List<String> parameters = (List<String>) methodDetails.get(METHOD_PARAMETERS_KEY);
		String parameterType = parameters.get(relativeMethodParameterIndex - 1);
		// JOANA identifies result with 0, parameter indices begin with 1. Substract 1
		// as Offset for normalizstion
		return JOANASCARElementHandlingUtil.getOrCreateAndAddParameter(relativeMethodParameterIndex -1, parameterType, methodName, fullyQualifiedNameOfClass, scar);
	}
	
	private String retrieveParameterType(List<String> parameters, Integer index) {
		return parameters.get(index);
	}
	

	private Field retrieveField(Map<String, Object> sourceSink) {
		String fullyQualifiedNameOfClass = (String) sourceSink.get(CLASS_KEY);
		String fieldName = (String) sourceSink.get(FIELD_NAME_KEY);
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
	
	private FieldIdentifying resolveFieldIdentification_SCAR(Map<String, Object> sourceSink) {
		String fullyQualifiedNameOfClass = (String) sourceSink.get(CLASS_KEY);
		String fieldName = (String) sourceSink.get(FIELD_NAME_KEY);
		
		return JOANASCARElementHandlingUtil.getOrCreateAndAddField(fieldName, fullyQualifiedNameOfClass, scar);
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

	public JOANASCARCorrespondences getScarCorrespondences() {
		return scarCorrespondences;
	}
}
