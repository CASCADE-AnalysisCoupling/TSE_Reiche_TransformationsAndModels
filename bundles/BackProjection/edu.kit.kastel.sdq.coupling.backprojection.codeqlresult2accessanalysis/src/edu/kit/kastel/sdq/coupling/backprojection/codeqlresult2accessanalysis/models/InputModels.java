package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

public class InputModels {
	

	private static final String CODEQL_MODEL_FILE_ENDING = "codeql";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String JAVA_MODEL_NAME = "coupling_java";
	private static final String CODEQL_MODEL_NAME = "coupling_tainttracking";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "coupling_pcmjavacorrespondencemodel";
	private static final String CODEQL_RESULT_NAME = "output2";
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
	
	//for testing
	public static final String JAVA_MODEL_PATH = Paths.get(String.format("/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/ArchitecturalModels/AccessAnalysis/edu.kit.kastel.scbs.iflowexampleUnadapted/%s.%s", JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CODEQL_MODEL_PATH = Paths.get(String.format("/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/ArchitecturalModels/AccessAnalysis/edu.kit.kastel.scbs.iflowexampleUnadapted/%s.%s", CODEQL_MODEL_NAME, CODEQL_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format("/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/ArchitecturalModels/AccessAnalysis/edu.kit.kastel.scbs.iflowexampleUnadapted/%s.%s", PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String CODEQL_RESULT_FILE_PATH = Paths.get(String.format("/home/frederik/CodingLocation/CodeQL/java/%s.%s", CODEQL_RESULT_NAME, CODEQL_RESULT_FILE_ENDING)).toAbsolutePath().toString();
	public static final String REPOSITORY_PATH = Paths.get("/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/ArchitecturalModels/AccessAnalysis/edu.kit.kastel.scbs.iflowexampleUnadapted/default.repository").toAbsolutePath().toString();
	public static final String CONFIDENTIALITY_SPECIFICATION_PATH = Paths.get("/home/frederik/Arbeitsplatz/git/Diss/casestudies/CaseStudies_CouplingSpecificationBasedAnalyses_TSE/CaseStudies/Systems/TravelPlanner/ArchitecturalModels/AccessAnalysis/edu.kit.kastel.scbs.iflowexampleUnadapted/default.confidentiality").toAbsolutePath().toString();
	
	public InputModels(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot,
			PCMJavaCorrespondenceRoot correspondenceRoot, String codeQLResult, Repository repository,
			ProfileApplication profile, ConfidentialitySpecification confidentiality) {
		super();
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.codeQLResult = codeQLResult;
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
	}

	public static InputModels createModelsFromFiles(String javaFilePath, String codeqlFilePath, String pcmjavaCorrespondenceFilePath, String codeQLResultFilePath, String repositoryFilePath, String confidentialitySpecFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		URI repositoryJava = URI.createFileURI(Path.of(javaFilePath).toAbsolutePath().toString());
		URI codeQLUri = URI.createFileURI(Path.of(codeqlFilePath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
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
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence.getContents().get(0);
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
		
		return new InputModels(java, tainttracking, pcmJavaCorrespondenceRoot, codeQLSarifContent, repository, profile, confidentiality);
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
}
