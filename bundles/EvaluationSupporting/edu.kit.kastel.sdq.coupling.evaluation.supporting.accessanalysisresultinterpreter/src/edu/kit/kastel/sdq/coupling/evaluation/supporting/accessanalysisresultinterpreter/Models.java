package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversaries;

public class Models {

	public Models(Repository repository, ConfidentialitySpecification specification, Adversaries adversaries,
			String idMappingTableContent, String accessAnalysisResultContent) {
		super();
		this.repository = repository;
		this.specification = specification;
		this.adversaries = adversaries;
		this.idMappingTableContent = idMappingTableContent;
		this.accessAnalysisResultContent = accessAnalysisResultContent;
	}


	private final Repository repository;
	private final ConfidentialitySpecification specification;
	private final Adversaries adversaries;
	private final String idMappingTableContent;
	private final String accessAnalysisResultContent;
	
	
	public static Models readModels(String repositoryPath, String idMappingTablePath, String accessAnalysisResultPath, String adversariesPath, String confidentialityModelPath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		URI repositoryUri = URI.createFileURI(Path.of(repositoryPath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(confidentialityModelPath).toAbsolutePath().toString());
		URI adversariesUri = URI.createFileURI(Path.of(adversariesPath).toAbsolutePath().toString());
		
		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		Resource resourceAdversaries = resSet.getResource(adversariesUri, true);
		
		try {
			resourceRepository.load(null);
			resourceConfidentiality.load(null);
			resourceAdversaries.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ConfidentialitySpecification confidentiality = (ConfidentialitySpecification) resourceConfidentiality
				.getContents().get(0);
		Adversaries adversaries = (Adversaries) resourceAdversaries.getContents().get(0);

		String accessAnalysisResultContent = "";
		try {
			accessAnalysisResultContent = Files.readString(Paths.get(accessAnalysisResultPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String mappingTableContent = "";
		try {
			mappingTableContent = Files.readString(Paths.get(idMappingTablePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new Models(repository, confidentiality, adversaries, mappingTableContent, accessAnalysisResultContent);
	}


	public Repository getRepository() {
		return repository;
	}


	public ConfidentialitySpecification getSpecification() {
		return specification;
	}


	public Adversaries getAdversaries() {
		return adversaries;
	}


	public String getIdMappingTableContent() {
		return idMappingTableContent;
	}


	public String getAccessAnalysisResultContent() {
		return accessAnalysisResultContent;
	}
	
}
