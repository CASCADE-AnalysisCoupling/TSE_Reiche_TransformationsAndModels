package edu.kit.kastel.sdq.coupling.backprojection.codeql2accessanalysis.models;

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
import edu.kit.kastel.sdq.coupling.codeqlresultingvalues.CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.codeqlscar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlresultingvaluescorrespondences.Correspondences_CodeQLResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.codeqlscarcorrespondences.CodeQLSCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class Models {

	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final String codeQLResult;
	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;
	private final AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences;

	public Models(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			String codeQLResult, Repository repository, ProfileApplication profile,
			ConfidentialitySpecification confidentiality,
			AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences) {
		super();
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.codeQLResult = codeQLResult;
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
		this.accessAnalysisCodeQLCorrespondences = accessAnalysisCodeQLCorrespondences;
	}

	public static Models createModelsFromFiles(String javaFilePath, String codeqlFilePath,
			String pcmjavaCorrespondenceFilePath, String codeQLResultFilePath, String repositoryFilePath,
			String confidentialitySpecFilePath, String originBackupDirectoryPath,
			String accessAnalysisCodeQLCorrespondencesPath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		File originalDirectory = Path.of(repositoryFilePath).toAbsolutePath().getParent().toFile();

		File originalBackupDirectory = Paths.get(originBackupDirectoryPath).toAbsolutePath().toFile();

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
		URI pcmjavaCorrespondenceUri = URI
				.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());
		URI accessAnalysisCodeQLCorrespondencesUri = URI
				.createFileURI(Path.of(accessAnalysisCodeQLCorrespondencesPath).toAbsolutePath().toString());

		Resource resourceJava = resSet.getResource(repositoryJava, true);
		Resource resourceCodeQL = resSet.getResource(codeQLUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		Resource resourceAccessAnalysisCodeQLCorrespondences = resSet
				.getResource(accessAnalysisCodeQLCorrespondencesUri, true);

		try {
			resourceJava.load(null);
			resourceCodeQL.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceRepository.load(null);
			resourceConfidentiality.load(null);
			resourceAccessAnalysisCodeQLCorrespondences.load(null);

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
		AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondences = (AccessAnalysisCodeQLCorrespondenceRoot) resourceAccessAnalysisCodeQLCorrespondences
				.getContents().get(0);

		String codeQLSarifContent = "";
		try {
			codeQLSarifContent = Files.readString(Paths.get(codeQLResultFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Models(java, tainttracking, pcmJavaCorrespondenceRoot, codeQLSarifContent, repository, profile,
				confidentiality, accessAnalysisCodeQLCorrespondences);
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

	public void persistCorrespondencesAndModels(String scarPath, SourceCodeAnalysisResult scar,
			String resultingValuesPath, CodeQLResultingValues resultingValues, String scarCorrespondencePath,
			CodeQLSCARCorrespondences scarCorrespondences, String resultingValuesCorrespondencesPath,
			Correspondences_CodeQLResultingValues resultingValuesCorrespondences) {
		Resource scarResource = new XMLResourceImpl(URI.createFileURI(scarPath));
		scarResource.getContents().add(scar);

		Resource resultingValuesResource = new XMLResourceImpl(URI.createFileURI(resultingValuesPath));
		resultingValuesResource.getContents().add(resultingValues);

		Resource scarCorrespondenceResource = new XMLResourceImpl(URI.createFileURI(scarCorrespondencePath));
		scarCorrespondenceResource.getContents().add(scarCorrespondences);

		Resource resultingValuesCorrespondenceResource = new XMLResourceImpl(
				URI.createFileURI(resultingValuesCorrespondencesPath));
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

	public AccessAnalysisCodeQLCorrespondenceRoot getAccessAnalysisCodeQLCorrespondences() {
		return accessAnalysisCodeQLCorrespondences;
	}
}
