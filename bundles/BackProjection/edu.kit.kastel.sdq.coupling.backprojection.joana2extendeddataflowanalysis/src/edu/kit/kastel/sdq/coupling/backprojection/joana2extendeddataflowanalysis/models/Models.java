package edu.kit.kastel.sdq.coupling.backprojection.joana2extendeddataflowanalysis.models;

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

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;


public class Models {
	
	
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String joanaResult;
	private final Repository repository;
	private final ParameterAnnotations parameterAnnotations;
	private final PCMDataDictionary dictionary;
	
	
	public Models(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			String joanaResult, Repository repository, ParameterAnnotations parameterAnnotations,
			PCMDataDictionary dictionary) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.joanaResult = joanaResult;
		this.repository = repository;
		this.parameterAnnotations = parameterAnnotations;
		this.dictionary = dictionary;
	}

	public static Models createModelsFromFiles(String javaFilePath, String joanaPath, String pcmjavaCorrespondenceFilePath, String joanaResultPath, String repositoryFilePath, String parameterAnnotationModelPath, String dataDictionaryModelPath, String originBackupDirectoryPath) {
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
		URI joanaUri = URI.createFileURI(Path.of(joanaPath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI annotationUri = URI.createFileURI(Path.of(parameterAnnotationModelPath).toAbsolutePath().toString());
		URI dataDictionaryURI = URI.createFileURI(Path.of(dataDictionaryModelPath).toString());
		
		Resource resourceJava = resSet.getResource(repositoryJava, true);
		Resource resourceJoana = resSet.getResource(joanaUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceParameterAnnotations = resSet.getResource(annotationUri, true);
		Resource resourceDataDictionary = resSet.getResource(dataDictionaryURI, true);
		
		try {
			resourceJava.load(null);
			resourceJoana.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceParameterAnnotations.load(null);
			resourceDataDictionary.load(null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		JavaRoot java = (JavaRoot) resourceJava.getContents().get(0);
		JOANARoot joanaRoot = (JOANARoot) resourceJoana.getContents().get(0);
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence.getContents().get(0);
		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ParameterAnnotations parameterAnnotations = (ParameterAnnotations) resourceParameterAnnotations.getContents().get(0);
		PCMDataDictionary dataDictionary = (PCMDataDictionary) resourceDataDictionary.getContents().get(0);
		
		String codeQLSarifContent = "";
		try {
			codeQLSarifContent = Files.readString(Paths.get(joanaResultPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Models(java, joanaRoot, pcmJavaCorrespondenceRoot, codeQLSarifContent, repository, parameterAnnotations, dataDictionary);
	}
	
	public void updateArchitecturalSpecification(String specificationPath) {
		ResourceSetImpl resSet = new ResourceSetImpl();
		URI specificationUri = URI.createFileURI(Path.of(specificationPath).toAbsolutePath().toString());
		Resource resourceSpecification = resSet.getResource(specificationUri, true);
		
		try {
			resourceSpecification.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 resourceSpecification.getContents().set(0, parameterAnnotations);
		
		
		try {
			resourceSpecification.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public JOANARoot getJoanaRoot() {
		return joanaRoot;
	}

	public PCMJavaCorrespondenceRoot getCorrespondenceRoot() {
		return correspondenceRoot;
	}

	public String getJoanaResult() {
		return joanaResult;
	}

	public Repository getRepository() {
		return repository;
	}


	public ParameterAnnotations getParameterAnnotations() {
		return parameterAnnotations;
	}
	
	public PCMDataDictionary getDataDictionary() {
		return dictionary;
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
