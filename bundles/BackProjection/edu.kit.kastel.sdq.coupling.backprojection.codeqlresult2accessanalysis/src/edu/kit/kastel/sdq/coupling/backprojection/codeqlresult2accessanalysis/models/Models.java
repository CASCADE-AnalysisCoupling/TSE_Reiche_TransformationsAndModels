package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.StandardCopyOption;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Models {

	private static final String CODEQL_MODEL_FILE_ENDING = "codeql";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String JAVA_MODEL_NAME = "codeqljava4accessanalysis";
	private static final String CODEQL_MODEL_NAME = "codeql4accessanalysis";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "codeqljava4accessanalysis";

	private static final String CODEQL_RESULT_NAME = "codeQLAccessAnalysisOutput";
	private static final String CODEQL_RESULT_FILE_ENDING = "sarif";
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	



	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String codeQLResult;
	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;

	// for testing

	private static final String REPOSITORY_MODEL_NAME = "default";
	private static final String CONFIDENTIALITY_SPEC_MODEL_NAME = "default";

	public static final String USER_SPECIFIC_REPO_PATH = Path.of("/home/frederik/Arbeitsplatz/git/Diss/casestudies")
			.toAbsolutePath().toString();
	public static final String EVAL_REPO_SPECIFIC_PATH = "CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner";
	
	private static final String ARCHITECUTRAL_MODEL_ORIGIN_SAVE_DIRECTORY_ENDING = ".origin";
	
	private static final String MODEL_FILE_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String SCAR_PATH_TEMPLATE = "%s/%s/SCAR/CodeQL/%s.%s";
	private static final String TRAVEL_PLANNER_CODEQL_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.codeql4accessanalysis";
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

	public static final String TRAVELPLANNER_ACCESS_ANALYSIS_PROJECT_NAME = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.accessanalysis";
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

	public Models(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			String codeQLResult, Repository repository, ProfileApplication profile,
			ConfidentialitySpecification confidentiality) {
		super();
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.codeQLResult = codeQLResult;
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
	}

	public static Models createModelsFromFiles(String javaFilePath, String codeqlFilePath,
			String pcmjavaCorrespondenceFilePath, String codeQLResultFilePath, String repositoryFilePath, String confidentialitySpecFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		
		File originalDirectory = Path.of(repositoryFilePath).toAbsolutePath().getParent().toFile();
		String originalDirectoryName = originalDirectory.getName();
		String originalDirectoryParentPath = originalDirectory.getParentFile().getAbsolutePath();
		
		File originalBackupDirectory = Paths.get(originalDirectoryParentPath, originalDirectoryName + ARCHITECUTRAL_MODEL_ORIGIN_SAVE_DIRECTORY_ENDING).toAbsolutePath()
				.toFile();
		
		copyAllFilesBetweenDirectories(originalDirectory, originalBackupDirectory);
		

		URI repositoryJava = URI.createFileURI(Path.of(javaFilePath).toAbsolutePath().toString());
		URI codeQLUri = URI.createFileURI(Path.of(codeqlFilePath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI
				.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());

		Resource resourceJava = resSet.getResource(repositoryJava, true);
		Resource resourceCodeQL = resSet.getResource(codeQLUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);

		try {
			resourceJava.load(null);
			resourceCodeQL.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceConfidentiality.load(null);

		} catch (IOException e) {
			e.printStackTrace();
		}

		JavaRoot java = (JavaRoot) resourceJava.getContents().get(0);
		TainttrackingRoot tainttracking = (TainttrackingRoot) resourceCodeQL.getContents().get(0);
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence
				.getContents().get(0);
		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ProfileApplication profile = (ProfileApplication) resourceRepository.getContents().get(1);
		ConfidentialitySpecification confidentiality = (ConfidentialitySpecification) resourceConfidentiality
				.getContents().get(0);
		String codeQLSarifContent = "";
		try {
			codeQLSarifContent = Files.readString(Paths.get(codeQLResultFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Models(java, tainttracking, pcmJavaCorrespondenceRoot, codeQLSarifContent, repository, profile,
				confidentiality);
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
