package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.outputformatreader;

import java.util.LinkedList;
import java.util.Queue;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2accessanalysis.models.scar.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;

public class CodeQLSarifReader {


	private TainttrackingRoot tainttrackingRoot;
	private JavaRoot javaRoot;
	
	public SourceCodeAnalysisResult interpretCodeQLSarif(String content) {
		
		SourceCodeAnalysisResult localResult = new SourceCodeAnalysisResult();
		
		JsonObject root = new JsonParser().parse(content).getAsJsonObject();
		
		JsonArray runs = root.getAsJsonArray("runs");
		
		for(int runIndex = 0; runIndex < runs.size(); runIndex++) {
			JsonObject run = runs.get(runIndex).getAsJsonObject();
			JsonArray results = run.get("results").getAsJsonArray();
			
			for(int resultIndex = 0; resultIndex < results.size(); resultIndex++) {
				JsonObject result = results.get(resultIndex).getAsJsonObject();
				localResult.getResultEntries().add(parseResult(result));
			}
		}
		
		return localResult;
	}
	
	private ResultEntry parseResult(JsonObject result) {
		String resultText = result.getAsJsonObject("message").get("text").getAsString();
		
		String[] sourceSinkSplit = resultText.split(" -> ");
		
		String source = sourceSinkSplit[0].strip();
		String sink = sourceSinkSplit[1].strip();
		
		source = source.replaceAll("(|)", "");
		sink = sink.replaceAll("(|)", "");
		
		String[] sourceParamLevelSplit = source.split(",");
		String[] sinkParamLevelSplit = sink.split(",");
		
		Parameter sourceParameter = resolveParameter(sourceParamLevelSplit[0].strip());
		SecurityLevel sourceSecurityLevel = resolveSecurityLevel(sourceParamLevelSplit[1].strip());
		
		Parameter sinkParameter = resolveParameter(sinkParamLevelSplit[0].strip());
		SecurityLevel sinkSecurityLevel = resolveSecurityLevel(sinkParamLevelSplit[1].strip());
		
		ResultEntryElement sourceEntryElement = new ResultEntryElement(sourceParameter, sourceSecurityLevel);
		ResultEntryElement sinkEntryElement = new ResultEntryElement(sinkParameter, sinkSecurityLevel);
		
		return new ResultEntry(sourceEntryElement, sinkEntryElement);
	}

	private SecurityLevel resolveSecurityLevel(String levelName) {
		for(SecurityLevel level : tainttrackingRoot.getConfigurations().get(0).getAppliedSecurityLevel()) {
			if(level.getName().equals(levelName)) {
				return level;
			}
		}
		
		return null;
	}

	private Parameter resolveParameter(String parameterIdentification) {
		String[] classMethodSplit = parameterIdentification.split("::");
		String[] pathToClassSplit = classMethodSplit[0].split(".");
		
		int classNameLoc = pathToClassSplit.length -  1;
		
		String[] methodParameterSplit = classMethodSplit[1].split(":");
		
		Queue<String> pathComponents = new LinkedList<String>();
		for(int i = 0; i < pathToClassSplit.length - 1; i++) {
			pathComponents.add(pathToClassSplit[i]);
		}
		
		Class clazz = findClassRecursive(javaRoot.getPackage(), pathToClassSplit[classNameLoc], pathComponents);
		
		Method methodToFind = clazz.getMethod().stream().filter(method -> method.getName().equals(methodParameterSplit[0])).findFirst().get();
		return methodToFind.getParameter().stream().filter(param -> param.getName().equals(methodParameterSplit[1])).findFirst().get();
	}
	
	private Class findClassRecursive(Package currentPackage, String className, Queue<String> pathComponents) {
		
		Class clazz = null;
		
		for(ClassOrInterfaceType coit : currentPackage.getClassorinterface()) {
			if(coit instanceof Class && coit.getName().equals(className) && pathComponents.isEmpty()) {
				return (Class)coit;
			}
		}
		
		String nextSubpackageName = pathComponents.remove();
		
		for(Package subPackage : currentPackage.getSubpackage()) {
			
			if(subPackage.getName().equals(nextSubpackageName)) {
				clazz = findClassRecursive(subPackage, className, pathComponents);
				if(clazz != null) {
					return clazz;
				}
			}
		}
		
		return clazz;

	}
}
