package edu.kit.kastel.sdq.coupling.backprojection.joana2accessanalysis.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Models {
	
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String joanaResult;
	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;
	

	
	public Models(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			String joanaResult, Repository repository, ProfileApplication profile,
			ConfidentialitySpecification confidentiality) {
		super();
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.joanaResult = joanaResult;
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
	}
	
	//TODO: Make original storage path configurable
	public static Models createModelsFromFiles(String javaModelFilePath, String joanaModelFilePath, String pcmjavaCorrespondenceFilePath, String joanaResultFilePath, String repositoryFilePath, String confidentialitySpecFilePath, String originBackupDirectoryPath) {
		ResourceSetImpl resSet = new ResourceSetImpl();
		
		File originalDirectory = Path.of(repositoryFilePath).toAbsolutePath().getParent().toFile();
		String originalDirectoryParentPath = originalDirectory.getParentFile().getAbsolutePath();
		
		
		File originalBackupDirectory = Paths.get(originalDirectoryParentPath, originBackupDirectoryPath).toAbsolutePath()
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
		
	

		URI repositoryJava = URI.createFileURI(Path.of(javaModelFilePath).toAbsolutePath().toString());
		URI joanaModelUri = URI.createFileURI(Path.of(joanaModelFilePath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());

		Resource resourceJava = resSet.getResource(repositoryJava, true);
		Resource resourceJoana = resSet.getResource(joanaModelUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		
		try {
			resourceJava.load(null);
			resourceJoana.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceConfidentiality.load(null);
		
		} catch (IOException e) {
			e.printStackTrace();
		}

		JavaRoot java = (JavaRoot) resourceJava.getContents().get(0);
		JOANARoot joanaRoot = (JOANARoot) resourceJoana.getContents().get(0);
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence.getContents().get(0);
		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ProfileApplication profile = (ProfileApplication) resourceRepository.getContents().get(1);
		ConfidentialitySpecification confidentiality = (ConfidentialitySpecification) resourceConfidentiality
				.getContents().get(0);
		String joanaResultContent = "";
		try {
			joanaResultContent = Files.readString(Paths.get(joanaResultFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Models(java, joanaRoot, pcmJavaCorrespondenceRoot, joanaResultContent, repository, profile, confidentiality);
	}
	
	public void updateConfidentialityModel(String confidentialitySpecFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		
		try {
			resourceConfidentiality.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resourceConfidentiality.getContents().set(0, confidentiality);
		
		
		try {
			resourceConfidentiality.save(null);
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

	public ProfileApplication getProfile() {
		return profile;
	}

	public ConfidentialitySpecification getConfidentiality() {
		return confidentiality;
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
