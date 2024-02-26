package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.pcm.repository.Repository;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;


public class Models {
	

	private static final String CODEQL_MODEL_FILE_ENDING = "codeql";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String CODEQL_RESULT_FILE_ENDING = "sarif";
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String PARAMETER_ANNOTATION_MODEL_FILE_ENDING = "parameterannotation";
	private static final String DATA_DICTIONARY_FILE_ENDING = "pddc";
	
	
	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String codeQLResult;
	private final Repository repository;
	private final ParameterAnnotations parameterAnnotations;
	private final PCMDataDictionary dictionary;

	//for testing
	private static final String REPOSITORY_MODEL_NAME = "travelplanner";
	private static final String PARAMETER_ANNOTATION_MODEL_NAME = "travelplanner";
	private static final String CODEQL_RESULT_NAME = "codeQLExtendedDataflowAnalysisOutput";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "coupling_pcmjavacorrespondencemodel";
	private static final String JAVA_MODEL_NAME = "coupling_java";
	private static final String CODEQL_MODEL_NAME = "coupling_tainttracking";
	private static final String DATA_DICTIONARY_FILE_NAME = "travelplanner";
	

	private static final String MODEL_FILE_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String SCAR_PATH_TEMPLATE = "%s/%s/SCAR/CodeQL/%s.%s";
	
	public static final String USER_SPECIFIC_REPO_PATH = Path.of("/home/frederik/Arbeitsplatz/git/Diss/casestudies")
			.toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
	
	
	private static final String TRAVEL_PLANNER_CODEQL_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.codeql4extendeddataflowanalysis";
	
	public static final String JAVA_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					TRAVEL_PLANNER_CODEQL_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String CODEQL_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					TRAVEL_PLANNER_CODEQL_MODELS_BASEFOLDER, CODEQL_MODEL_NAME, CODEQL_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_FILE_PATH_TEMPLATE,
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, TRAVEL_PLANNER_CODEQL_MODELS_BASEFOLDER,
			PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CODEQL_RESULT_FILE_PATH = Paths.get(String.format(SCAR_PATH_TEMPLATE,
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, CODEQL_RESULT_NAME, CODEQL_RESULT_FILE_ENDING))
			.toAbsolutePath().toString();

	public static final String TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.extendeddataflow";
	public static final String TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_PROJECT_FOLDER = String.format("%s/%s/Models/%s",
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_PROJECT_NAME);
	public static final String TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER = String.format("%s/models/",
			TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_PROJECT_FOLDER);
	
	public static final String REPOSITORY_MODEL_PATH = Paths
			.get(String.format("%s/%s.%s", TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING))
			.toAbsolutePath().toString();
	
	
	public static final String PARAMETER_ANNOTATION_MODEL_PATH = Paths
			.get(String.format("%s/%s.%s", TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER, PARAMETER_ANNOTATION_MODEL_NAME, PARAMETER_ANNOTATION_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String DATA_DICTIONARY_MODEL_PATH = Paths
			.get(String.format("%s/%s.%s", TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_MODELS_FOLDER, DATA_DICTIONARY_FILE_NAME, DATA_DICTIONARY_FILE_ENDING))
			.toAbsolutePath().toString();

	public static final String ORIGIN_BACKUP_PATH = Paths.get(String.format("%s%s", TRAVELPLANNER_EXTENDEDDATAFLOW_ANALYSIS_PROJECT_FOLDER, ".origin")).toAbsolutePath().toString();
	
	public Models(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot,
			PCMJavaCorrespondenceRoot correspondenceRoot, String codeQLResult, Repository repository, ParameterAnnotations parameterAnnotations, PCMDataDictionary dictionary) {
		super();
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.codeQLResult = codeQLResult;
		this.repository = repository;
		this.parameterAnnotations = parameterAnnotations;
		this.dictionary = dictionary;
	}
	
	public PCMDataDictionary getDataDictionary() {
		return dictionary;
	}

	public static Models createModelsFromFiles(String javaFilePath, String codeqlFilePath, String pcmjavaCorrespondenceFilePath, String codeQLResultFilePath, String repositoryFilePath, String extensionModelFilePath, String dataDictionaryModelFilePath, String originBackupDirectoryPath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		
		File originalDirectory = Path.of(repositoryFilePath).toAbsolutePath().getParent().toFile();

		File originalBackupDirectory = Paths.get(originBackupDirectoryPath).toAbsolutePath()
				.toFile();
		
		if (!originalBackupDirectory.exists()) {
			try {
				Files.createDirectory(originalBackupDirectory.toPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			copyAllFilesBetweenDirectories(originalDirectory, originalBackupDirectory);
		}
		
		URI repositoryJava = URI.createFileURI(Path.of(javaFilePath).toAbsolutePath().toString());
		URI codeQLUri = URI.createFileURI(Path.of(codeqlFilePath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI extensionUri = URI.createFileURI(Path.of(extensionModelFilePath).toAbsolutePath().toString());
		URI dataDictionaryURI = URI.createFileURI(Path.of(dataDictionaryModelFilePath).toString());
		
		Resource resourceJava = resSet.getResource(repositoryJava, true);
		Resource resourceCodeQL = resSet.getResource(codeQLUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceParameterAnnotations = resSet.getResource(extensionUri, true);
		Resource resourceDataDictionary = resSet.getResource(dataDictionaryURI, true);
		
		try {
			resourceJava.load(null);
			resourceCodeQL.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceParameterAnnotations.load(null);
			resourceDataDictionary.load(null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		JavaRoot java = (JavaRoot) resourceJava.getContents().get(0);
		TainttrackingRoot tainttracking = (TainttrackingRoot) resourceCodeQL.getContents().get(0);
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence.getContents().get(0);
		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ParameterAnnotations parameterAnnotations = (ParameterAnnotations) resourceParameterAnnotations.getContents().get(0);
		PCMDataDictionary dataDictionary = (PCMDataDictionary) resourceDataDictionary.getContents().get(0);
		
		String codeQLSarifContent = "";
		try {
			codeQLSarifContent = Files.readString(Paths.get(codeQLResultFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Models(java, tainttracking, pcmJavaCorrespondenceRoot, codeQLSarifContent, repository, parameterAnnotations, dataDictionary);
	}
	
	public void updateExtensionModel(String extensionModelFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();
		URI extensionUri = URI.createFileURI(Path.of(extensionModelFilePath).toAbsolutePath().toString());
		Resource resourceExtension = resSet.getResource(extensionUri, true);
		
		try {
			resourceExtension.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 resourceExtension.getContents().set(0, parameterAnnotations);
		
		
		try {
			resourceExtension.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}

	public PCMJavaCorrespondenceRoot getCorrespondenceRoot() {
		return correspondenceRoot;
	}

	public String getCodeQLResult() {
		return codeQLResult;
	}

	public Repository getRepository() {
		return repository;
	}

	public ParameterAnnotations getParameterAnnotations() {
		return parameterAnnotations;
	}
	
	private static void copyAllFilesBetweenDirectories(File fromDirectory, File toDirectory) {
		
		try (Stream<Path> stream = Files.walk(fromDirectory.toPath(), 1)) {
			stream.map(path -> path.toFile()).forEach(fromFile -> {
				File toFile = Paths.get(toDirectory.getAbsolutePath(), fromFile.getName()).toAbsolutePath().toFile();
				
				try {
					Files.copy(fromFile.toPath(), toFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
