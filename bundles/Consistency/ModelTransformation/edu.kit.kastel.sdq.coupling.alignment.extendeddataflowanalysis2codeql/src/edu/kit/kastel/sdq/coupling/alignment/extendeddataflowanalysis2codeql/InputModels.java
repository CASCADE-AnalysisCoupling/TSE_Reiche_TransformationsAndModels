package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import java.io.IOException;
import java.nio.file.Path;
import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;



public class InputModels {

	private final Repository repository;
	private final ParameterAnnotations parameterAnnotations;
	private final PCMDataDictionary dictionary;
	
	public InputModels(Repository repository, ParameterAnnotations extensionRoot, PCMDataDictionary dictionary) {
		super();
		this.repository = repository;
		this.parameterAnnotations = extensionRoot;
		this.dictionary = dictionary;
	}
	
	
	public Repository getRepository() {
		return repository;
	}
	public ParameterAnnotations getExtensionRoot() {
		return parameterAnnotations;
	}
	
	public PCMDataDictionary getDataDictionary() {
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
		ParameterAnnotations extensionRoot = (ParameterAnnotations) resourceExtension.getContents().get(0);
		
		PCMDataDictionary dataDictionary = (PCMDataDictionary) resourceDataDictionary.getContents().get(0);

		return new InputModels(repository, extensionRoot, dataDictionary);
	}
}
