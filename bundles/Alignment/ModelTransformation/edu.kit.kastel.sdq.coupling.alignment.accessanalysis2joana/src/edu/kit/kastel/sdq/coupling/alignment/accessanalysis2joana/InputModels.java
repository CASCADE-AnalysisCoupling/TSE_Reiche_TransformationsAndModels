package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;

public class InputModels {
	
	private static final String REPOSITORY_FILE_ENDING = "repository";
	private static final String CONFIDENTIALITY_SPECIFICATION_FILE_ENDING = "confidentiality";
	
	//for testing
	public static final String REPOSITORY_PATH = Paths.get("/home/frederik/Arbeitsplatz/eclipse/accessanalysis/runtime-EclipseApplication/joanaTestModel/default.repository").toAbsolutePath().toString();
	public static final String CONFIDENTIALITY_SPECIFICATION_PATH = Paths.get("/home/frederik/Arbeitsplatz/eclipse/accessanalysis/runtime-EclipseApplication/joanaTestModel/default.confidentiality").toAbsolutePath().toString();
	
	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;
	
	public InputModels(Repository repository, ProfileApplication profile, ConfidentialitySpecification confidentiality) {
		super();
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
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
	
	public static InputModels createModelsFromFiles(String repositoryFilePath, String confidentialitySpecFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		URI repositoryUri = URI.createFileURI(Path.of(repositoryFilePath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialitySpecFilePath).toAbsolutePath().toString());

		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);

		try {
			resourceRepository.load(null);
			resourceConfidentiality.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ProfileApplication profile = (ProfileApplication) resourceRepository.getContents().get(1);
		ConfidentialitySpecification confidentiality = (ConfidentialitySpecification) resourceConfidentiality
				.getContents().get(0);

		return new InputModels(repository, profile, confidentiality);
	}
	
}
