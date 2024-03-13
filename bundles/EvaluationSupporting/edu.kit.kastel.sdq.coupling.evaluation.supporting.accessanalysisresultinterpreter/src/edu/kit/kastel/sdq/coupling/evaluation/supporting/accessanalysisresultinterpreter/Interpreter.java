package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;

public class Interpreter {

	public void interpret(String repositoryPath, String idMappingTablePath, String accessAnalysisResultPath,
			String adversariesPath, String confidentialityModelPath) {

		Models models = Models.readModels(repositoryPath, idMappingTablePath, accessAnalysisResultPath, adversariesPath,
				confidentialityModelPath);

		IdMapper mapper = new IdMapper();

		Map<String, String> idMappings = mapper.parseMapFile(models.getIdMappingTableContent());
		Map<String, RepositoryComponent> idToComponentMappings = mapper.generateIdComponentMap(idMappings,
				models.getRepository());
		Map<String, OperationSignature> idToSignatureMappings = mapper.generateIdSignatureMap(idMappings,
				models.getRepository());
		Map<String, Adversary> idToAdversaryMappings = mapper.generateIdAdversaryMap(idMappings,
				models.getAdversaries().getAdversaries());
		Map<String, DataSet> idToDataSetMappings = mapper.generateIdDataSetMap(idMappings,
				models.getSpecification().getDataIdentifier().stream().filter(DataSet.class::isInstance)
						.map(DataSet.class::cast).collect(Collectors.toList()));
		
		AccessAnalysisResultParser parser = new AccessAnalysisResultParser();
		Collection<String> singleViolations = parser.splitIntoSingleViolations(models.getAccessAnalysisResultContent());
		Collection<Result> results = parser.calculateResultsFromAccessAnalysisResult(idMappings, idToSignatureMappings, idToComponentMappings, idToAdversaryMappings, idToDataSetMappings, singleViolations);
		
		results.forEach(result -> System.out.println(result.toString()));
	}
}
