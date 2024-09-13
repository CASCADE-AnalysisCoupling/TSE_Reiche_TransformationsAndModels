package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.scarparser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.CodeQLTainttrackingCodeGenerator;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2scar.util.Tuple;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Field_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.Result;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.RuleId;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SecurityLevel_SCAR;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.utils.CodeQLSCARElementHandlingUtils;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.utils.CodeQLSCARModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Utils.CodeQLSCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.Correspondences_CodeQLScar;

public class CodeQLSarifOutput2SCARParser {

	private final TainttrackingRoot tainttrackingRoot;
	private final Correspondences_CodeQLScar scarCorrespondences;
	private final Configurations codeQL_configurations;

	public Correspondences_CodeQLScar getScarCorrespondences() {
		return scarCorrespondences;
	}

	private SourceCodeAnalysisResult scar;
	private final JavaRoot javaRoot;

	public CodeQLSarifOutput2SCARParser(TainttrackingRoot tainttrackingRoot, JavaRoot javaRoot,
			Configurations codeQL_configurations) {
		super();
		this.tainttrackingRoot = tainttrackingRoot;
		this.javaRoot = javaRoot;
		this.scarCorrespondences = CodeQLSCARCorrespondenceUtil.createCodeQLSCARCorrespondences();
		this.codeQL_configurations = codeQL_configurations;
	}

	public SourceCodeAnalysisResult interpretCodeQLSarif(String content) {

		scar = CodeQLSCARModelGenerationUtil.createSourceCodeAnalysisResult();

		// TODO: Parsing etc. happens under assumption, that only one query is
		// generated. Could be improved by using the query ID/ rule ID, as in real
		// codeQL.
		RuleId configID = CodeQLSCARModelGenerationUtil.createRuleId(tainttrackingRoot.getQueries().get(0).getId());

		CodeQLSCARElementHandlingUtils.addConfigById(configID, scar);

		CodeQLSCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(
				(HybridConfiguration) codeQL_configurations.getConfigurations().get(0), configID, scarCorrespondences);

		JsonObject root = new JsonParser().parse(content).getAsJsonObject();

		JsonArray runs = root.getAsJsonArray("runs");

		for (int runIndex = 0; runIndex < runs.size(); runIndex++) {
			JsonObject run = runs.get(runIndex).getAsJsonObject();
			JsonArray results = run.get("results").getAsJsonArray();

			for (int resultIndex = 0; resultIndex < results.size(); resultIndex++) {
				JsonObject result = results.get(resultIndex).getAsJsonObject();

				scar.getResultEntries().addAll(parseResult(result, configID));
			}
		}

		return scar;
	}

	// Return collection, as there may be multiple illegal flows in one result
	// (reason unclear)
	private Collection<Result> parseResult(JsonObject result, RuleId configId) {
		Collection<Result> resultEntries = new ArrayList<Result>();

		String resultText = result.getAsJsonObject("message").get("text").getAsString();
		String[] multipleFlows = resultText.split(System.lineSeparator());

		for (int i = 0; i < multipleFlows.length; i++) {
			String singleFlow = multipleFlows[i];
			Tuple<String, String> sourceSinkSplit = splitAndCleanSourceAndSinks(singleFlow);

			String source = sourceSinkSplit.getFirst();
			String sink = sourceSinkSplit.getSecond();

			resultEntries.add(calculateResultEntryForSourceAndSinkRepresentation(source, sink, configId));
		}

		return resultEntries;
	}

	private Result calculateResultEntryForSourceAndSinkRepresentation(String sourceRepresentation,
			String sinkRepresentation, RuleId configId) {
		Tuple<String, String> sourceSystemElementLevelSplit = splitandCleanSourceSinkInSystemElementIdentificationAndSecurityLevel(
				sourceRepresentation);
		Tuple<String, String> sinkSystemElementLevelSplit = splitandCleanSourceSinkInSystemElementIdentificationAndSecurityLevel(
				sinkRepresentation);

		SecurityLevel sourceSecurityLevel = resolveSecurityLevel(sourceSystemElementLevelSplit.getSecond());
		SecurityLevel sinkSecurityLevel = resolveSecurityLevel(sinkSystemElementLevelSplit.getSecond());

		SecurityLevel_SCAR sourceScarSecurityLevel = CodeQLSCARElementHandlingUtils
				.getOrCreateAndAddSecurityLevelByName(sourceSystemElementLevelSplit.getSecond(), scar);
		SecurityLevel_SCAR sinkScarSecurityLevel = CodeQLSCARElementHandlingUtils
				.getOrCreateAndAddSecurityLevelByName(sinkSystemElementLevelSplit.getSecond(), scar);

		CodeQLSCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(sourceSecurityLevel, sourceScarSecurityLevel,
				scarCorrespondences);
		CodeQLSCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(sinkSecurityLevel, sinkScarSecurityLevel,
				scarCorrespondences);

		ResultEntryElement<?> sourceEntryElement = generateResultEntryElement(sourceSystemElementLevelSplit.getFirst(),
				sourceScarSecurityLevel);
		ResultEntryElement<?> sinkEntryElement = generateResultEntryElement(sinkSystemElementLevelSplit.getFirst(),
				sinkScarSecurityLevel);

		return CodeQLSCARModelGenerationUtil.createResultEntry(configId, sourceEntryElement, sinkEntryElement);
	}

	private ResultEntryElement<?> generateResultEntryElement(String systemElementidentification,
			SecurityLevel_SCAR securityLevel) {
		if (isField(systemElementidentification)) {
			Field field = resolveField(systemElementidentification);
			Field_SCAR fieldScar = resolveFieldIdentification_SCAR(systemElementidentification);

			CodeQLSCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(field, fieldScar, scarCorrespondences);
			return CodeQLSCARModelGenerationUtil.createResultEntryElement(fieldScar, securityLevel);
		} else {
			Parameter parameter = resolveParameter(systemElementidentification);
			Parameter_SCAR parameterScar = resolveParameterIdentification(systemElementidentification);

			CodeQLSCARCorrespondenceUtil.createAndAddIfCorrespondenceNotExists(parameter, parameterScar,
					scarCorrespondences);

			return CodeQLSCARModelGenerationUtil.createResultEntryElement(parameterScar, securityLevel);
		}
	}

	private boolean isField(String systemElementRepresentation) {
		return systemElementRepresentation.contains(CodeQLTainttrackingCodeGenerator.CLASS_FIELD_DELIMITER);
	}

	private Field resolveField(String fieldIdentification) {
		Tuple<String, String> classAndField = splitClassAndFieldIdentification(fieldIdentification);
		Class clazz = JavaResolutionUtil.findClassByFullyQualifiedPath(classAndField.getFirst(), javaRoot);

		Tuple<String, String> fieldNameAndType = splitSystemElementAndType(classAndField.getSecond());

		// Workaround for Eval: Working with java model and source code requires
		// consistency between them
		// which is not given right now due to manual additions in Code but not in
		// model.
		// Could be performed automatically, for instance with Vitruv
		// For now, just generate field if not present and add it to Java model in
		// memory
		Optional<Field> potentialField = clazz.getField().stream()
				.filter(field -> field.getName().equals(fieldNameAndType.getFirst())
						&& field.getType().getName().equals(fieldNameAndType.getSecond()))
				.findFirst();

		if (potentialField.isPresent()) {
			return potentialField.get();
		} else {
			Field newField = JavaModelGenerationUtil.generateField(fieldNameAndType.getFirst(),
					fieldNameAndType.getSecond(), javaRoot);
			clazz.getField().add(newField);
			return newField;
		}
	}

	private Field_SCAR resolveFieldIdentification_SCAR(String fieldIdentification) {
		Tuple<String, String> classAndField = splitClassAndFieldIdentification(fieldIdentification);
		Tuple<String, String> fieldNameAndType = splitSystemElementAndType(classAndField.getSecond());

		return CodeQLSCARElementHandlingUtils.getOrCreateAndAddField(fieldNameAndType.getFirst(),
				fieldNameAndType.getSecond(), classAndField.getFirst(), scar);

	}

	private Tuple<String, String> splitAndCleanSourceAndSinks(String singleFlow) {
		String[] sourceSinkSplit = singleFlow.split(CodeQLTainttrackingCodeGenerator.SOURCE_SINK_DELIMITER);

		String source = sourceSinkSplit[0].strip();
		String sink = sourceSinkSplit[1].strip();

		source = source.replaceAll("\\(", "").replaceAll("\\)", "");
		sink = sink.replaceAll("\\(", "").replaceAll("\\)", "");

		return new Tuple<String, String>(source, sink);
	}

	private Tuple<String, String> splitandCleanSourceSinkInSystemElementIdentificationAndSecurityLevel(
			String sourceSink) {
		String[] split = sourceSink.split(CodeQLTainttrackingCodeGenerator.SYSTEMELEMENT_SECURITYELEMENT_DELIMITER);
		return new Tuple<String, String>(split[0].strip(), split[1].strip());
	}

	private SecurityLevel resolveSecurityLevel(String levelName) {
		for (SecurityLevel level : tainttrackingRoot.getQueries().get(0).getAppliedSecurityLevel()) {
			if (level.getName().toLowerCase().equals(levelName.toLowerCase())) {
				return level;
			}
		}

		return null;
	}

	private Parameter_SCAR resolveParameterIdentification(String parameterIdentification) {
		Tuple<String, String> classMethodSplit = splitClassAndParameterIdentification(parameterIdentification);
		Tuple<String, Tuple<String, String>> methodNameAndParameterAndType = resolveMethodNameAndParameterNameAndParameterType(
				classMethodSplit.getSecond());

		String fullyQualifiedClassName = classMethodSplit.getFirst();
		String methodName = methodNameAndParameterAndType.getFirst();
		String parameterName = methodNameAndParameterAndType.getSecond().getFirst();
		String parameterType = methodNameAndParameterAndType.getSecond().getSecond();

		return CodeQLSCARElementHandlingUtils.getOrCreateAndAddParameter(parameterName, parameterType, methodName,
				fullyQualifiedClassName, scar);
	}

	private Parameter resolveParameter(String parameterIdentification) {
		Tuple<String, String> classMethodSplit = splitClassAndParameterIdentification(parameterIdentification);

		Class clazz = JavaResolutionUtil.findClassByFullyQualifiedPath(classMethodSplit.getFirst(), javaRoot);

		Tuple<String, Tuple<String, String>> methodNameAndParameterAndType = resolveMethodNameAndParameterNameAndParameterType(
				classMethodSplit.getSecond());

		return JavaResolutionUtil.resolveParameterWithTypeForClass(clazz, methodNameAndParameterAndType.getFirst(),
				methodNameAndParameterAndType.getSecond().getFirst(),
				methodNameAndParameterAndType.getSecond().getSecond());
	}

	private Tuple<String, String> splitClassAndParameterIdentification(String parameterIdentfication) {
		String[] split = parameterIdentfication.split(CodeQLTainttrackingCodeGenerator.CLASS_METHOD_DELIMITER);
		return new Tuple<String, String>(split[0], split[1]);
	}

	private Tuple<String, String> splitClassAndFieldIdentification(String fieldIdentification) {
		String[] split = fieldIdentification.split(CodeQLTainttrackingCodeGenerator.CLASS_FIELD_DELIMITER);
		return new Tuple<String, String>(split[0], split[1]);
	}

	private Tuple<String, Tuple<String, String>> resolveMethodNameAndParameterNameAndParameterType(
			String systemElementIdentifiyingAndType) {
		String[] split = systemElementIdentifiyingAndType
				.split(prependSlashesForRegex(CodeQLTainttrackingCodeGenerator.METHOD_PARAMETER_DELIMITER));
		Tuple<String, String> parameterAndType = splitSystemElementAndType(split[1]);
		return new Tuple<String, Tuple<String, String>>(split[0], parameterAndType);
	}

	private Tuple<String, String> splitSystemElementAndType(String systemElementTypeDescription) {
		String[] split = systemElementTypeDescription
				.split(CodeQLTainttrackingCodeGenerator.SYSTEMELEMENT_TYPE_DELIMITER);

		return new Tuple<String, String>(split[0], split[1]);
	}

	private String prependSlashesForRegex(String target) {
		return String.format("\\%s", target);
	}
}
