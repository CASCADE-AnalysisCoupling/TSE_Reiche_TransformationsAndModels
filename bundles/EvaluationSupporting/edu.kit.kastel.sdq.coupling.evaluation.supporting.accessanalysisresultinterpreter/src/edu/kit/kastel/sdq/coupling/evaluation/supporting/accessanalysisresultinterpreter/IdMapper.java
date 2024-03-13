package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;

public class IdMapper {

	
	public Map<String, String> parseMapFile(String mappingsFileContent){
		
		Map<String, String> elementToIdAssignments = new HashMap<String, String>(); 
		
		
		Scanner scanner = new Scanner(mappingsFileContent);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] elementIdContent = line.split(":");
			
			elementToIdAssignments.put(elementIdContent[1].trim(), elementIdContent[0].trim());
		}
		
		scanner.close();
		
		return elementToIdAssignments;
		
	}
	
	public Map<String, OperationSignature> generateIdSignatureMap(Map<String, String> elementToIdAssignments, Repository repository){
		
		Map<String, OperationSignature> idToSignatureAssignments = new HashMap<String, OperationSignature>();
		
		Collection<OperationSignature> allAvailableSignatures = new HashSet<OperationSignature>();
		
		repository.getInterfaces__Repository().stream().filter(OperationInterface.class::isInstance).map(OperationInterface.class::cast).map(opInt -> opInt.getSignatures__OperationInterface()).forEach(signatures -> allAvailableSignatures.addAll(signatures));

		for(Entry<String, String> idToElementAssignment : elementToIdAssignments.entrySet()) {
			
			Optional<OperationSignature> potentialSignature = allAvailableSignatures.stream().filter(sig -> sig.getId().equals(idToElementAssignment.getValue())).findFirst();
			
			if(potentialSignature.isPresent()) {
				idToSignatureAssignments.put(idToElementAssignment.getKey(), potentialSignature.get());
			}
		}
		
		return idToSignatureAssignments;
	}
	
	public Map<String, RepositoryComponent> generateIdComponentMap(Map<String, String> elementToIdAssignments, Repository repository){
		
		Map<String, RepositoryComponent> idToComponentAssignments = new HashMap<String, RepositoryComponent>();
			
		for(Entry<String, String> idToElementAssignment : elementToIdAssignments.entrySet()) {
			
			Optional<RepositoryComponent> potentialComponent = repository.getComponents__Repository().stream().filter(comp -> comp.getId().equals(idToElementAssignment.getValue())).findFirst();
			
			if(potentialComponent.isPresent()) {
				idToComponentAssignments.put(idToElementAssignment.getKey(), potentialComponent.get());
			}
		}
		
		return idToComponentAssignments;
	}
	
	public Map<String, Adversary> generateIdAdversaryMap(Map<String, String> elementToIdAssignments, Collection<Adversary> adversaries){
		
		Map<String, Adversary> idToAdversaryAssignments = new HashMap<String, Adversary>();
			
		for(Entry<String, String> idToElementAssignment : elementToIdAssignments.entrySet()) {
			
			Optional<Adversary> potentialAdversary = adversaries.stream().filter(comp -> comp.getId().equals(idToElementAssignment.getValue())).findFirst();
			
			if(potentialAdversary.isPresent()) {
				idToAdversaryAssignments.put(idToElementAssignment.getKey(), potentialAdversary.get());
			}
		}
		
		return idToAdversaryAssignments;
	}
	
	
	public Map<String, DataSet> generateIdDataSetMap(Map<String, String> elementToIdAssignments, Collection<DataSet> dataSets){
		
		Map<String, DataSet> idToDataSetAssignments = new HashMap<String, DataSet>();
			
		for(Entry<String, String> idToElementAssignment : elementToIdAssignments.entrySet()) {
			
			Optional<DataSet> potentialDataSet = dataSets.stream().filter(comp -> comp.getId().equals(idToElementAssignment.getValue())).findFirst();
			
			if(potentialDataSet.isPresent()) {
				idToDataSetAssignments.put(idToElementAssignment.getKey(), potentialDataSet.get());
			}
		}
		
		return idToDataSetAssignments;
	}
}
