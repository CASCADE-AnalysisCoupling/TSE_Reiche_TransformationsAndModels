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
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Models {
	
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String joanaResult;
	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;
	private final Correspondences_AccessAnalysisJOANA accessanalysisJOANACorrespondences;

	


	public Models(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			String joanaResult, Repository repository, ProfileApplication profile,
			ConfidentialitySpecification confidentiality, Correspondences_AccessAnalysisJOANA accessanalysisJOANACorrespondences) {
		super();
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.joanaResult = joanaResult;
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
		this.accessanalysisJOANACorrespondences = accessanalysisJOANACorrespondences;
	}
	
	//TODO: Make original storage path configurable
	public static Models createModelsFromFiles(String javaModelFilePath, String joanaModelFilePath, String pcmjavaCorrespondenceFilePath, String joanaResultFilePath, String repositoryFilePath, String confidentialitySpecFilePath, String originBackupDirectoryPath, String accessanalysisJOANACorrespondencesLocation) {
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
		
	

		URI repositoryJava = URI.createFileURI(Path.of(javaModelFilePath).toAbsolutePath().toString());
		URI joanaModelUri = URI.createFileURI(Path.of(joanaModelFilePath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());
		URI accessAnalysisJoanaCorrespondencesUri = URI.createFileURI(Path.of(accessanalysisJOANACorrespondencesLocation).toAbsolutePath().toString());

		
		Resource resourceJava = resSet.getResource(repositoryJava, true);
		Resource resourceJoana = resSet.getResource(joanaModelUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		Resource resourceAccessAnalysisJoanaCorrespondences = resSet.getResource(accessAnalysisJoanaCorrespondencesUri, true);
		
		try {
			resourceJava.load(null);
			resourceJoana.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceConfidentiality.load(null);
			resourceAccessAnalysisJoanaCorrespondences.load(null);
		
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
		Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences = (Correspondences_AccessAnalysisJOANA) resourceAccessAnalysisJoanaCorrespondences.getContents().get(0);
		String joanaResultContent = "";
		try {
			joanaResultContent = Files.readString(Paths.get(joanaResultFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Models(java, joanaRoot, pcmJavaCorrespondenceRoot, joanaResultContent, repository, profile, confidentiality, accessAnalysisJOANACorrespondences);
	}
	
	public void updateConfidentialityModel(String confidentialitySpecFilePath, ConfidentialitySpecification spec) {
		ResourceSetImpl resSet = new ResourceSetImpl();
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		
		try {
			resourceConfidentiality.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resourceConfidentiality.getContents().set(0, spec);
		
		
		try {
			resourceConfidentiality.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void persistCorrespondencesAndModels(String scarPath, SourceCodeAnalysisResult scar, String resultingValuesPath, JOANAResultingValues resultingValues, String scarCorrespondencePath, JOANASCARCorrespondences scarCorrespondences, String resultingValuesCorrespondencesPath, Correspondences_JOANAResultingValues resultingValuesCorrespondences) {
		Resource scarResource = new XMLResourceImpl(URI.createFileURI(scarPath));
		scarResource.getContents().add(scar);
		
		Resource resultingValuesResource = new XMLResourceImpl(URI.createFileURI(resultingValuesPath));
		resultingValuesResource.getContents().add(resultingValues);
		
		Resource scarCorrespondenceResource = new XMLResourceImpl(URI.createFileURI(scarCorrespondencePath));
		scarCorrespondenceResource.getContents().add(scarCorrespondences);
		
		Resource resultingValuesCorrespondenceResource = new XMLResourceImpl(URI.createFileURI(resultingValuesCorrespondencesPath));
		resultingValuesCorrespondenceResource.getContents().add(resultingValuesCorrespondences);
		
	
		try {
			resultingValuesResource.save(null);
			scarResource.save(null);
			scarCorrespondenceResource.save(null);
			resultingValuesCorrespondenceResource.save(null);
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
	
	public Correspondences_AccessAnalysisJOANA getAccessanalysisJOANACorrespondences() {
		return accessanalysisJOANACorrespondences;
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
