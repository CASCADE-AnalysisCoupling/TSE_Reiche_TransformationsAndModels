package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.dataflow.dictionary.DataDictionary.DataDictionary;
import org.palladiosimulator.dataflow.dictionary.characterized.DataDictionaryCharacterized.DataDictionaryCharacterized;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ExtensionRoot;



public class InputModels {


	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String EXTENSION_PARAMETER_ANNOTATION_MODEL_FILE_ENDING = "dataflowanalysisextension";
	private static final String DATA_DICTIONARY_FILE_ENDING = "pddc";

	
	//for testing
	private static final String REPOSITORY_FILE_NAME = "travelPlanner";
	private static final String EXTENSION_FILE_NAME = "My";
	private static final String DATA_DICTIONARY_FILE_NAME = "travelPlanner";
	public static final String MODELS_BASE_PATH = "/home/frederik/Arbeitsplatz/git/tools/dataflowanalysis/DataFlowAnalysis/tests/org.palladiosimulator.dataflow.confidentiality.analysis.testmodels/models/TravelPlannerNew/";
	public static final String REPOSITORY_PATH = Paths.get(String.format("%s/%s.%s", MODELS_BASE_PATH, REPOSITORY_FILE_NAME, REPOSITORY_FILE_ENDING)).toAbsolutePath().toString();
	public static final String EXTENSION_PARAMETER_ANNOTATION_MODEL_PATH = Paths.get(String.format("%s/%s.%s", MODELS_BASE_PATH, EXTENSION_FILE_NAME, EXTENSION_PARAMETER_ANNOTATION_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String DATA_DICTIONARY_MODEL_PATH = Paths.get(String.format("%s/%s.%s", MODELS_BASE_PATH, DATA_DICTIONARY_FILE_NAME, DATA_DICTIONARY_FILE_ENDING)).toAbsolutePath().toString();
	private final Repository repository;
	private final ExtensionRoot extensionRoot;
	private final DataDictionaryCharacterized dictionary;
	
	public InputModels(Repository repository, ExtensionRoot extensionRoot, DataDictionaryCharacterized dictionary) {
		super();
		this.repository = repository;
		this.extensionRoot = extensionRoot;
		this.dictionary = dictionary;
	}
	
	
	public Repository getRepository() {
		return repository;
	}
	public ExtensionRoot getExtensionRoot() {
		return extensionRoot;
	}
	
	public DataDictionaryCharacterized getDataDictionary() {
		return dictionary;
	}
	
	public static InputModels createModelsFromFiles(String repositoryFilePath, String extensionModelFilePath, String dataDictionaryModelFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI extensionUri = URI.createFileURI(Path.of(extensionModelFilePath).toAbsolutePath().toString());
		URI dataDictionaryURI = URI.createFileURI(Path.of(dataDictionaryModelFilePath).toString());

		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceExtension = resSet.getResource(extensionUri, true);
		Resource resourceDataDictionary = resSet.getResource(dataDictionaryURI, true);

		try {
			resourceRepository.load(null);
			resourceExtension.load(null);
			resourceDataDictionary.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ExtensionRoot extensionRoot = (ExtensionRoot) resourceExtension.getContents().get(0);
		DataDictionaryCharacterized dataDictionary = (DataDictionaryCharacterized) resourceDataDictionary.getContents().get(0);

		return new InputModels(repository, extensionRoot, dataDictionary);
	}
}
