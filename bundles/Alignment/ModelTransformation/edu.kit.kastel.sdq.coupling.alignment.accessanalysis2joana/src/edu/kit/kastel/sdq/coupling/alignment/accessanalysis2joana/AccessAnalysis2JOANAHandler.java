package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAClassOrInterfaceTypeCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAClassOrInterfaceTypeCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class AccessAnalysis2JOANAHandler extends AbstractHandler{
	
	protected final static String JAVA_CODE_FILE_ENDING = "java";
	protected final static String ENTRY_POINT_ID_FILE_NAME = "entryPointIDs";
	protected final static String ENTRY_POINT_ID_FILE_ENDING = "txt";
	
//	// For Testing
//	private final static String JOANA_EVAL_CODE_FOLDER_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.code.joana4accessanalysis";
//	private final static String USER_SPECIFIC_REPO_PATH = Path.of("C:\\Users\\Frederik\\Documents\\Arbeitsplatz\\git\\Paper\\CaseStudies").toAbsolutePath().toString();
//	private final static String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
//	private final static String PCM_MODEL_BASE_PATH = "Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.accessanalysis";
//	private final static String JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.joana4accessanalysis";
//	private final static String BASE_PACKAGE_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner";
	
	// For Testing
		private final static String JOANA_EVAL_CODE_FOLDER_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.code.joana4accessanalysis";
		private final static String USER_SPECIFIC_REPO_PATH = Path.of("C:/Users/legua/eclipse/modeling-2020-12/Repos").toAbsolutePath().toString();
		private final static String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
		private final static String PCM_MODEL_BASE_PATH = "Models/edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.accessanalysis";
		private final static String JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.joana4accessanalysis";
		private final static String BASE_PACKAGE_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return this.generate(JOANA_EVAL_CODE_FOLDER_NAME, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, PCM_MODEL_BASE_PATH, JOANA_MODELS_BASEFOLDER, BASE_PACKAGE_NAME);
	}
	
	public Object generate(String joanaEvalCodeFolderName, String userSpecificRepoPath, String evalRepoSpecificPath,
			String pcmModelBasePath, String joanaModelsBasefolder, String basePackageName) {
		
		userSpecificRepoPath = Path.of(userSpecificRepoPath).toAbsolutePath().toString();
		String basePath = Paths.get(String.format("%s/%s/%s", userSpecificRepoPath, evalRepoSpecificPath,pcmModelBasePath)).toAbsolutePath().toString();
		String repositoryPath = Paths.get(String.format(InputModels.PATH_PATTERN, basePath, InputModels.REPOSITORY_MODEL_NAME, InputModels.REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
		String confidentialitySpecificationPath = Paths.get(String.format(InputModels.PATH_PATTERN, basePath,InputModels.CONFIDENTIALITY_SPEC_MODEL_NAME, InputModels.CONFIDENTIALITY_SPECIFICATION_FILE_ENDING)).toAbsolutePath().toString();

		String javaModelPath = Paths.get(String.format("%s/%s/Models/%s/%s.%s", userSpecificRepoPath, evalRepoSpecificPath,joanaModelsBasefolder, OutputModels.JAVA_MODEL_NAME, OutputModels.JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
		String joanaModelPath = Paths.get(String.format("%s/%s/Models/%s/%s.%s", userSpecificRepoPath, evalRepoSpecificPath,joanaModelsBasefolder, OutputModels.JOANA_MODEL_NAME, OutputModels.JOANA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
		String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format("%s/%s/Models/%s/%s.%s",userSpecificRepoPath, evalRepoSpecificPath, joanaModelsBasefolder, OutputModels.PCMJAVACORRESPONDENCE_MODEL_NAME, OutputModels.PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();

		String javaCodeBasePath = Paths.get(String.format("%s/%s/Code/%s/", userSpecificRepoPath, evalRepoSpecificPath, joanaEvalCodeFolderName)).toAbsolutePath().toString();

		
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE
				.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(repositoryPath, confidentialitySpecificationPath);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();

		AccessAnalysis2JOANAModelGenerator modelGenerator = this.createAccessAnalysis2JOANAModelGenerator();
		OutputModels output = modelGenerator.generateJOANAModels(correspondences, repo, profile, spec, basePackageName);
		output.writeModelsToFiles(javaModelPath, joanaModelPath, PCMJAVACORRESPONDENCE_MODE_PATH);
		generateAndPrintSourceCode(output.getJavaRoot(), output.getJoanaRoot(), javaCodeBasePath);
		generateAndPrintEntryPointIDFile(modelGenerator, javaCodeBasePath);

		return true;
	}
	
	protected AccessAnalysis2JOANAModelGenerator createAccessAnalysis2JOANAModelGenerator() {
		return new AccessAnalysis2JOANAModelGenerator();
	}
	
	private void generateAndPrintSourceCode(JavaRoot javaRoot, JOANARoot joanaRoot, String javaCodeBasePath) {
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
			String path = Paths.get(javaCodeBasePath, pathPartsGettable).toAbsolutePath().toString();

			FileToGenerate file = new FileToGenerate(content, path, type.getName(), JAVA_CODE_FILE_ENDING);
			file.write();
		}
	}

	private void generateAndPrintEntryPointIDFile(AccessAnalysis2JOANAModelGenerator modelGenerator, String javaCodeBasePath) {
		String entryPointIDFileContent = modelGenerator.generateEntryPointIDsAsString();

		FileToGenerate file = new FileToGenerate(entryPointIDFileContent, javaCodeBasePath, ENTRY_POINT_ID_FILE_NAME,
				ENTRY_POINT_ID_FILE_ENDING);
		file.write();
	}
}
