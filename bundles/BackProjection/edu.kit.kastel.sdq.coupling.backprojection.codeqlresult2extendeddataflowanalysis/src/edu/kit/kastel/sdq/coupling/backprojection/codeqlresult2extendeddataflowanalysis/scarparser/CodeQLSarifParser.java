package edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.scarparser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.backprojection.codeqlresult2extendeddataflowanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;

public class CodeQLSarifParser {


	private final TainttrackingRoot tainttrackingRoot;
	private final JavaRoot javaRoot;

	public CodeQLSarifParser(TainttrackingRoot tainttrackingRoot, JavaRoot javaRoot) {
		super();
		this.tainttrackingRoot = tainttrackingRoot;
		this.javaRoot = javaRoot;
	}

	public SourceCodeAnalysisResult interpretCodeQLSarif(String content) {
		
		SourceCodeAnalysisResult localResult = new SourceCodeAnalysisResult();
		
		JsonObject root = new JsonParser().parse(content).getAsJsonObject();
		
		JsonArray runs = root.getAsJsonArray("runs");
		
		for(int runIndex = 0; runIndex < runs.size(); runIndex++) {
			JsonObject run = runs.get(runIndex).getAsJsonObject();
			JsonArray results = run.get("results").getAsJsonArray();
			
			for(int resultIndex = 0; resultIndex < results.size(); resultIndex++) {
				JsonObject result = results.get(resultIndex).getAsJsonObject();

				localResult.getResultEntries().addAll(parseResult(result));
			}
		}
		
		return localResult;
	}
	
	//Create collection, as there may be multiple illegal flows in one result (reason unclear)
	private Collection<ResultEntry> parseResult(JsonObject result) {
		Collection<ResultEntry> resultEntries = new ArrayList<ResultEntry>();
		
		String resultText = result.getAsJsonObject("message").get("text").getAsString();
		String[] multipleFlows = resultText.split(System.lineSeparator());
		
		for(int i = 0; i < multipleFlows.length; i++) {
			String singleFlow = multipleFlows[i];
			String[] sourceSinkSplit = singleFlow.split(" -> ");
			
			String source = sourceSinkSplit[0].strip();
			String sink = sourceSinkSplit[1].strip();
			
			source = source.replaceAll("\\(", "").replaceAll("\\)", "");
			sink = sink.replaceAll("\\(", "").replaceAll("\\)", "");
			
			String[] sourceParamLevelSplit = source.split(",");
			String[] sinkParamLevelSplit = sink.split(",");
			
			Parameter sourceParameter = resolveParameter(sourceParamLevelSplit[0].strip());
			SecurityLevel sourceSecurityLevel = resolveSecurityLevel(sourceParamLevelSplit[1].strip());
			
			Parameter sinkParameter = resolveParameter(sinkParamLevelSplit[0].strip());
			SecurityLevel sinkSecurityLevel = resolveSecurityLevel(sinkParamLevelSplit[1].strip());
			
			ResultEntryElement sourceEntryElement = new ResultEntryElement(sourceParameter, sourceSecurityLevel);
			ResultEntryElement sinkEntryElement = new ResultEntryElement(sinkParameter, sinkSecurityLevel);
			
			resultEntries.add(new ResultEntry(sourceEntryElement, sinkEntryElement));
		}
		
		
		
		
		return resultEntries;
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
		String[] pathToClassSplit = classMethodSplit[0].split("\\.");
		
		int classNameLoc = pathToClassSplit.length -  1;
		
		String[] methodParameterSplit = classMethodSplit[1].split(":");
		
		Queue<String> pathComponents = new LinkedList<String>();
		for(int i = 0; i < pathToClassSplit.length - 1; i++) {
			pathComponents.add(pathToClassSplit[i]);
		}
		
		
		
		Class clazz = findClassRecursive(pathToClassSplit[classNameLoc], pathComponents);
		
		Method methodToFind = clazz.getMethod().stream().filter(method -> method.getName().equals(methodParameterSplit[0])).findFirst().get();
		return methodToFind.getParameter().stream().filter(param -> param.getName().equals(methodParameterSplit[1])).findFirst().get();
	}
	
	
	
	private Class findClassRecursive(String className, Queue<String> pathComponents) {
		
		String rootPackageName = pathComponents.remove(); 
		
		if(javaRoot.getPackage().getName().equals(rootPackageName)) {
			return findClassRecursive(javaRoot.getPackage(), className, pathComponents);
		}
		
		return null;
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
