package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models;

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
	
	//Input Model File Endings
	
	public static final String JOANA_MODEL_FILE_ENDING = "joana";
	public static final String JAVA_MODEL_FILE_ENDING = "java";
	public static final String JAVA_MODEL_NAME = "joanajava4accessanalysis";
	public static final String JOANA_MODEL_NAME = "joana4accessanalysis";
	public static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	public static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "joanajava4accessanalysis";
	public static final String REPOSITORY_FILE_ENDING = "repository";
	public static final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	public static final String JOANA_RESULT_FILE_NAME = "AccessAnalysisResult";
	public static final String JOANA_RESULT_FILE_ENDING = "txt";
	


	
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String joanaResult;
	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;
	
	//Input Models Names For Testing
	
	//private static final String JAVA_MODEL_NAME = "joanajava4accessanalysis";
	//private static final String JOANA_MODEL_NAME = "joana4accessanalysis";
	//private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "joanajava4accessanalysis";
	//private static final String JOANA_RESULT_FILE_NAME = "AccessAnalysisResult";
	public static final String REPOSITORY_MODEL_NAME = "default";
	public static final String CONFIDENTIALITY_SPEC_MODEL_NAME = "default";
	
	//Paths for testing
	public static final String ARCHITECUTRAL_MODEL_ORIGIN_SAVE_DIRECTORY_ENDING = ".origin";

	
	public static final String USER_SPECIFIC_REPO_PATH = Path.of("C:/Users/legua/eclipse/modeling-2020-12/Repos")
			.toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
	private static final String MODEL_FILE_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String SCAR_PATH_TEMPLATE = "%s/%s/SCAR/JOANA/%s.%s";
	
	private static final String TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.joana4accessanalysis";
	public static final String TRAVELPLANNER_ACCESS_ANALYSIS_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.accessanalysis";
	public static final String JAVA_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String JOANA_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, JOANA_MODEL_NAME, JOANA_MODEL_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_FILE_PATH_TEMPLATE,
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER,
			PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String JOANA_RESULT_FILE_PATH = Paths.get(String.format(SCAR_PATH_TEMPLATE,
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, JOANA_RESULT_FILE_NAME, JOANA_RESULT_FILE_ENDING))
			.toAbsolutePath().toString();

	
	public static final String TRAVELPLANNER_ACCESS_ANALYSIS_PROJECT_FOLDER = String.format("%s/%s/Models/%s",
			USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH, TRAVELPLANNER_ACCESS_ANALYSIS_PROJECT_NAME);
	public static final String REPOSITORY_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					TRAVELPLANNER_ACCESS_ANALYSIS_PROJECT_NAME, REPOSITORY_MODEL_NAME, REPOSITORY_FILE_ENDING))
			.toAbsolutePath().toString();
	public static final String CONFIDENTIALITY_SPECIFICATION_MODEL_PATH = Paths
			.get(String.format(MODEL_FILE_PATH_TEMPLATE, USER_SPECIFIC_REPO_PATH, EVAL_REPO_SPECIFIC_PATH,
					TRAVELPLANNER_ACCESS_ANALYSIS_PROJECT_NAME, CONFIDENTIALITY_SPEC_MODEL_NAME,
					CONFIDENTIALITY_SPECIFICATION_FILE_ENDING))
			.toAbsolutePath().toString();
		
	
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
	public static Models createModelsFromFiles(String javaModelFilePath, String joanaModelFilePath, String pcmjavaCorrespondenceFilePath, String joanaResultFilePath, String repositoryFilePath, String confidentialitySpecFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();
		
		File originalDirectory = Path.of(repositoryFilePath).toAbsolutePath().getParent().toFile();
		String originalDirectoryName = originalDirectory.getName();
		String originalDirectoryParentPath = originalDirectory.getParentFile().getAbsolutePath();
		
		File originalBackupDirectory = Paths.get(originalDirectoryParentPath, originalDirectoryName + ARCHITECUTRAL_MODEL_ORIGIN_SAVE_DIRECTORY_ENDING).toAbsolutePath()
				.toFile();
		
		copyAllFilesBetweenDirectories(originalDirectory, originalBackupDirectory);

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
		if (!toDirectory.exists()) {
			try {
				Files.createDirectory(toDirectory.toPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
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
