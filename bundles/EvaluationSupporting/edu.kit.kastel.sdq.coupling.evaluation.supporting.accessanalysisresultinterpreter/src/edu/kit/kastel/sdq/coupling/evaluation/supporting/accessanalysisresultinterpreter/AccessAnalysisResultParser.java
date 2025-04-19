package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;

public class AccessAnalysisResultParser {
	
	private final static String NEW_RESULT_INDICATOR = "adversary(";
	private final static String ADVERSARY_INFORMATION = "adversary(";
	private final static String COMPONENTIDENTIFICATION = "basicComponent(";
	private final static String PROVIDES_IDENTIFICATION = "provides(";
	//Unique String
	private final static String SIGNATURE_AND_PARAMETER_IDENTIFICATION = "parametersOf";
	private final static String NOT_MAY_KNOW_IDENTIFICATION = "not mayknow(";
	
	public Collection<String> splitIntoSingleViolations(String accessAnalysisResultContent){
		
		
		Collection<String> singleViolations = new ArrayList<String>();
		
		Scanner scanner = new Scanner(accessAnalysisResultContent);
		StringBuilder builder = new StringBuilder();
		//drop WORLD: keyWord;
		scanner.nextLine();
			
		if(scanner.hasNextLine()) {
			builder.append(String.format("%s%s", scanner.nextLine(), System.lineSeparator()));
		}
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			if(line.startsWith(NEW_RESULT_INDICATOR)) {
				singleViolations.add(builder.toString());
				builder = new StringBuilder();
			}
			
			line = removeTreeSymbols(line);
			line = line.trim();
			if(!line.isBlank()) {
				builder.append(String.format("%s %s", line, System.lineSeparator()));
			}
		}
		singleViolations.add(builder.toString());
		scanner.close();
		
		return singleViolations;
	}
	
	public Collection<Result> calculateResultsFromAccessAnalysisResult(Map<String, String> allIdMappings, Map<String, OperationSignature> idToSignatureMappings, Map<String, RepositoryComponent> idToComponentMappings, Map<String, Adversary> idToAdversaryMappings, Map<String, DataSet> idToDataSetMappings, Collection<String> singleViolations) {
		
		Collection<Result> parsedResults = new ArrayList<Result>();
		
		for(String violation : singleViolations) {
			Scanner scanner = new Scanner(violation);
			Result result = new Result();
			while(scanner.hasNextLine()) {
				
				String line = scanner.nextLine();
				
				if(line.startsWith(ADVERSARY_INFORMATION)) {
					parseAdversary(line, result, idToAdversaryMappings);
				}
				
				if(line.contains(COMPONENTIDENTIFICATION)) {
					parseBasicComponent(line, result, idToComponentMappings);
				}
				
				if(line.startsWith(SIGNATURE_AND_PARAMETER_IDENTIFICATION)) {
					parseSignatureAndParameter(line, result, allIdMappings, idToSignatureMappings);
				}
				
				if(line.startsWith(PROVIDES_IDENTIFICATION)) {
					parseBasicComponentByProvidesMarker(line, result, idToComponentMappings);
				}
				
				if(line.startsWith(NOT_MAY_KNOW_IDENTIFICATION)) {
					parseNotMayKnowToDataSet(line, result, idToDataSetMappings);
				}
			}
			
			parsedResults.add(result);
			scanner.close();
		}
		
		return parsedResults;
	}
	
	private void parseNotMayKnowToDataSet(String line, Result result, Map<String, DataSet> idToDataSetMappings) {
		int lastIndexOfOpenBracket = line.lastIndexOf("(");
		
		String dataSetInformation = line.substring(lastIndexOfOpenBracket).replace("(", "").replace(")", "");
		
		String[] dataSetInformationSplit = dataSetInformation.split(",");
		
		DataSet ds = idToDataSetMappings.get(dataSetInformationSplit[0]);
		
		result.addDataSet(ds);
	}

	private void parseSignatureAndParameter(String line, Result result, Map<String, String> allIdMappings,
		Map<String, OperationSignature> idToSignatureMappings) {
		//Origin parametersOf(ID,parm(ID,ID)) -> ID,parm(ID,ID));
		String signatureIdAndParameter = line.replace(SIGNATURE_AND_PARAMETER_IDENTIFICATION, "");
		
		//ID,parm(ID,ID)) -> ID,parm(ID,ID
		signatureIdAndParameter = signatureIdAndParameter.replace(")", "").replace("(", "");
		
		//[0] = ID, [1] = parm(ID , [2] = ID
		String[] split = signatureIdAndParameter.split(",");
		
		
		String operationSignatureId = split[0].trim();
		
		if(operationSignatureId.startsWith("operationSignature")) {
			operationSignatureId = operationSignatureId.replace("operationSignature", "");
		}
		
		OperationSignature sig = idToSignatureMappings.get(operationSignatureId);
		String parameterId = split[split.length-1].trim();
		String parameterName = allIdMappings.get(parameterId);
		
		if(parameterName == null) {
			for(int i = 0; i < split.length; i++) {
				if(split[i].contains("parameter")){
					parameterId = split[i].replace("parameter", "");
				}
			}
			
			parameterName = allIdMappings.get(parameterId);
		}
		
		for(Parameter parameter : sig.getParameters__OperationSignature()) {
			if(parameter.getParameterName().equals(parameterName)) {
				result.setParameter(parameter);
			}
		}
		
		result.setSignature(sig);
		
		
	}

	private void parseBasicComponent(String line, Result result,
			Map<String, RepositoryComponent> idToComponentMappings) {
		
		int lastIndexOfBracket = line.lastIndexOf("basicComponent");
		
		String basicComponentPart = line.substring(lastIndexOfBracket, line.length()).replace("(", "");
		
		String[] idRestSplit = basicComponentPart.split(",");
		
		String componentId = idRestSplit[0].replace("basicComponent", "").trim();
		
		RepositoryComponent component = idToComponentMappings.get(componentId);
		
		if(line.contains("requires")) {
			result.setRequired("required");
		} else if (line.contains("provides")) {
			result.setRequired("provided");
		} else {
			throw new IllegalStateException();
		}
		
		result.setComponent(component);
	}
	
	private void parseBasicComponentByProvidesMarker(String line, Result result,
			Map<String, RepositoryComponent> idToComponentMappings) {
		
		line = line.replace("provides", "");
		line = line.replace("(", "");
		line = line.replace(")", "");
		
		if(line.contains("basicComponent")) {
			line = line.replace("basicComponent", "");
		}
		
		String[] componentInterfaceSplit = line.split(",");
		
		String componentId = componentInterfaceSplit[0];
		
		RepositoryComponent component = idToComponentMappings.get(componentId);
		
		if(result.getComponent() != null && result.getComponent() != component) {
			throw new RuntimeException("Components do not match");
		}
		
		result.setRequired("provided");
		
		result.setComponent(component);
	}

	private void parseAdversary(String line, Result result, Map<String, Adversary> idToAdversaryMappings) {
		line = line.replace(ADVERSARY_INFORMATION, "");
		String[] idnameSplit = line.split(",");
		
		Adversary adversary = idToAdversaryMappings.get(idnameSplit[0]);
		
		result.setAdversary(adversary);
	}

	public String removeTreeSymbols(String line) {
		
		String cleaned = line.replace("`-", "");
		cleaned = cleaned.replace("+-", "");
		cleaned = cleaned.replace("|", "");
		
		return cleaned;
	}
	
}
