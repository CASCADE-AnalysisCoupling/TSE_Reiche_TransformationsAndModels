package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.dataflow.confidentiality.pcm.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;


public class InputModels {
	

	private static final String CODEQL_MODEL_FILE_ENDING = "codeql";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String CODEQL_RESULT_FILE_ENDING = "sarif";
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String EXTENSION_PARAMETER_ANNOTATION_MODEL_FILE_ENDING = "dataflowanalysisextension";
	private static final String DATA_DICTIONARY_FILE_ENDING = "pddc";
	
	
	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String codeQLResult;
	private final Repository repository;
	private final ExtensionRoot extensionRoot;
	private final PCMDataDictionary dictionary;

	//for testing
	private static final String REPOSITORY_FILE_NAME = "travelPlanner";
	private static final String EXTENSION_FILE_NAME = "My";
	private static final String CODEQL_RESULT_NAME = "output2";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "coupling_pcmjavacorrespondencemodel";
	private static final String JAVA_MODEL_NAME = "coupling_java";
	private static final String CODEQL_MODEL_NAME = "coupling_tainttracking";
	private static final String DATA_DICTIONARY_FILE_NAME = "travelPlanner";
	
	private static final String PATH_PATTERN = "%s/%s.%s";
	
	public static final String MODELS_BASE_PATH = "/home/frederik/Arbeitsplatz/git/tools/dataflowanalysis/DataFlowAnalysis/tests/org.palladiosimulator.dataflow.confidentiality.analysis.testmodels/models/TravelPlannerNew/";
	public static final String JAVA_MODEL_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CODEQL_MODEL_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, CODEQL_MODEL_NAME, CODEQL_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CODEQL_RESULT_FILE_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, CODEQL_RESULT_NAME, CODEQL_RESULT_FILE_ENDING)).toAbsolutePath().toString();
	public static final String REPOSITORY_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, REPOSITORY_FILE_NAME, REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
	public static final String EXTENSION_PARAMETER_ANNOTATION_MODEL_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, EXTENSION_FILE_NAME, EXTENSION_PARAMETER_ANNOTATION_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String DATA_DICTIONARY_MODEL_PATH = Paths.get(String.format(PATH_PATTERN, MODELS_BASE_PATH, DATA_DICTIONARY_FILE_NAME, DATA_DICTIONARY_FILE_ENDING)).toAbsolutePath().toString();
	
	public InputModels(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot,
			PCMJavaCorrespondenceRoot correspondenceRoot, String codeQLResult, Repository repository, ExtensionRoot extensionRoot, PCMDataDictionary dictionary) {
		super();
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.codeQLResult = codeQLResult;
		this.repository = repository;
		this.extensionRoot = extensionRoot;
		this.dictionary = dictionary;
	}
	
	public PCMDataDictionary getDataDictionary() {
		return dictionary;
	}

	public static InputModels createModelsFromFiles(String javaFilePath, String codeqlFilePath, String pcmjavaCorrespondenceFilePath, String codeQLResultFilePath, String repositoryFilePath, String extensionModelFilePath, String dataDictionaryModelFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

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
		Resource resourceExtension = resSet.getResource(extensionUri, true);
		Resource resourceDataDictionary = resSet.getResource(dataDictionaryURI, true);
		
		try {
			resourceJava.load(null);
			resourceCodeQL.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceExtension.load(null);
			resourceDataDictionary.load(null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		JavaRoot java = (JavaRoot) resourceJava.getContents().get(0);
		TainttrackingRoot tainttracking = (TainttrackingRoot) resourceCodeQL.getContents().get(0);
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence.getContents().get(0);
		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ExtensionRoot extensionRoot = (ExtensionRoot) resourceExtension.getContents().get(0);
		PCMDataDictionary dataDictionary = (PCMDataDictionary) resourceDataDictionary.getContents().get(0);
		
		String codeQLSarifContent = "";
		try {
			codeQLSarifContent = Files.readString(Paths.get(codeQLResultFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new InputModels(java, tainttracking, pcmJavaCorrespondenceRoot, codeQLSarifContent, repository, extensionRoot, dataDictionary);
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
		
		 resourceExtension.getContents().set(0, extensionRoot);
		
		
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

	public ExtensionRoot getExtensionRoot() {
		return extensionRoot;
	}
}
