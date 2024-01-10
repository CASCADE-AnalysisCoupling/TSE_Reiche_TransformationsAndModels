package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.adapter;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.analysiscouplingframework.adapter.ExecutableProcessingStepAdapter;
import edu.kit.kastel.sdq.analysiscouplingframework.results.NotOKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.OKResult;
import edu.kit.kastel.sdq.analysiscouplingframework.results.Result;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.InputModels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAClassOrInterfaceTypeCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class AccessAnalysis2JoanaAdapter implements ExecutableProcessingStepAdapter {
	
	// Input Model
	final String REPOSITORY_FILE_ENDING = "repository";
	final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	final String REPOSITORY_MODEL_NAME = "default";
	final String CONFIDENTIALITY_SPEC_MODEL_NAME = "default";
	final String PATH_PATTERN = "%s/%s.%s";

	String USER_SPECIFIC_REPO_PATH = Path.of("C:\\Users\\legua\\eclipse\\eclipse-modeling-2023-03-R-win32-x86_64\\RepoNew\\CaseStudies_CouplingSpecificationBasedAnalyses_TSE\\CaseStudies").toAbsolutePath().toString();
	String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
	String TRAVELPLANNER_PCM_MODEL_BASE_PATH = "Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.accessanalysis";
	final String BASE_PATH = Paths.get(String.format("%s/%s/%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,TRAVELPLANNER_PCM_MODEL_BASE_PATH)).toAbsolutePath().toString();
	final String REPOSITORY_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
	final String CONFIDENTIALITY_SPECIFICATION_PATH = Paths.get(String.format(PATH_PATTERN, BASE_PATH,CONFIDENTIALITY_SPEC_MODEL_NAME, CONFIDENTIALITY_SPECIFICATION_FILE_ENDING)).toAbsolutePath().toString();

	// Output Model
	final String JOANA_MODEL_FILE_ENDING = "joana";
	final String JAVA_MODEL_FILE_ENDING = "java";
	final String JAVA_MODEL_NAME = "joanajava4accessanalysis";
	final String JOANA_MODEL_NAME = "joana4accessanalysis";
	final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	final String PCMJAVACORRESPONDENCE_MODEL_NAME = "joanajava4accessanalysis";

	String TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.joana4accessanalysis";
	final String JAVA_MODEL_PATH = Paths.get(String.format("%s/%s/Models/%s/%s.%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	final String JOANA_MODEL_PATH = Paths.get(String.format("%s/%s/Modes/%s/%s.%s", USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, JOANA_MODEL_NAME, JOANA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format("%s/%s/Models/%s/%s.%s",USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER,PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();

	// AccessAnalysis2JOANAHandler
	final String JAVA_CODE_FILE_ENDING = "java";
	final String ENTRY_POINT_ID_FILE_NAME = "entryPointIDs";
	final String ENTRY_POINT_ID_FILE_ENDING = "txt";
	String JOANA_EVAL_CODE_FOLDER_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.code.joana4accessanalysis";
	final String JAVA_CODE_BASE_PATH = Paths.get(String.format("%s/%s/Code/%s/", USER_SPECIFIC_REPO_PATH,EVAL_REPO_SPECIFIC_PATH, JOANA_EVAL_CODE_FOLDER_NAME)).toAbsolutePath().toString();

	@Override
	public Result executeAdapter(String[] args) {

		Result result = new OKResult(args[0]);
		JOANA_EVAL_CODE_FOLDER_NAME = args[2];
		USER_SPECIFIC_REPO_PATH = args[3];
		EVAL_REPO_SPECIFIC_PATH = args[4];
		TRAVELPLANNER_PCM_MODEL_BASE_PATH = args[5];
		TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER = args[6];

		//TODO update all String fields that rely on the 5 new input paths
		
		try {
			this.generate();
		} catch (Exception e) {
			result = new NotOKResult(args[1] + "\n" + e.getMessage());
		}
		
		return result;
	}

	public Object generate() {
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE
				.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(REPOSITORY_PATH, CONFIDENTIALITY_SPECIFICATION_PATH);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();

		AccessAnalysis2JOANAModelGenerator modelGenerator = new AccessAnalysis2JOANAModelGenerator();
		OutputModels output = modelGenerator.generateJOANAModels(correspondences, repo, profile, spec);
		output.writeModelsToFiles(JAVA_MODEL_PATH, JOANA_MODEL_PATH, PCMJAVACORRESPONDENCE_MODE_PATH);
		generateAndPrintSourceCode(output.getJavaRoot(), output.getJoanaRoot());
		generateAndPrintEntryPointIDFile(modelGenerator);

		return true;
	}

	private void generateAndPrintSourceCode(JavaRoot javaRoot, JOANARoot joanaRoot) {
		JOANAClassOrInterfaceTypeCodeGenerator codeGenerator = new JOANAClassOrInterfaceTypeCodeGenerator(javaRoot,
				joanaRoot);

		Collection<ClassOrInterfaceType> classOrInterfaceTypes = JavaResolutionUtil
				.getAllClassOrInterfaceTypes(javaRoot);

		for (ClassOrInterfaceType type : classOrInterfaceTypes) {
			codeGenerator.setClassOrInterfaceType(type);
			String content = codeGenerator.generate();
			List<Package> packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(javaRoot, type);
			List<String> packagePathPartNames = packagePath.stream().map(pkg -> pkg.getName())
					.collect(Collectors.toList());

			List<String> realPathParts = new ArrayList<>();
			realPathParts.add("src");
			for (String packagePathPart : packagePathPartNames) {
				String[] split = packagePathPart.split("\\.");

				if (split.length != 0) {
					Arrays.asList(split).forEach(element -> realPathParts.add(element));
				} else {
					realPathParts.add(packagePathPart);
				}
			}

			String[] pathPartsGettable = realPathParts.toArray(new String[0]);
			String path = Paths.get(JAVA_CODE_BASE_PATH, pathPartsGettable).toAbsolutePath().toString();

			FileToGenerate file = new FileToGenerate(content, path, type.getName(), JAVA_CODE_FILE_ENDING);
			file.write();
		}
	}

	private void generateAndPrintEntryPointIDFile(AccessAnalysis2JOANAModelGenerator modelGenerator) {
		String entryPointIDFileContent = modelGenerator.generateEntryPointIDsAsString();

		FileToGenerate file = new FileToGenerate(entryPointIDFileContent, JAVA_CODE_BASE_PATH, ENTRY_POINT_ID_FILE_NAME,
				ENTRY_POINT_ID_FILE_ENDING);
		file.write();
	}
}
