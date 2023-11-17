package edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.analysisoutputreader;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

import org.yaml.snakeyaml.Yaml;

import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.ResultEntryElement;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.models.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.backprojection.joanaresult2accessanalysis.utils.BackprojectionUtil;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class JOANAOutputReader {
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private static final String NEW_ENTRY_POINT_IDENTIFICATION = "entry_point_method";
	private static final String TAG_KEY = "tag";
	private static final String ILLEGAL_INFORMATION_FLOWS_KEY = "flow";
	private static final String SOURCE_KEY = "source";
	private static final String METHOD_KEY = "method";
	private static final String CLASS_KEY = "class";
	private static final String METHOD_NAME_KEY = "name";
	private static final String SOURCE_LEVEL_KEY = "source_level";
	private static final String PARAMETER_INDEX_KEY = "index";
	private static final String SINK_KEY = "sink";
	private static final String SINK_LEVEL_KEY = "sink_level";
	
	private enum SourceSink {
			SOURCE,
			SINK
	}
	
	public JOANAOutputReader(JavaRoot javaRoot, JOANARoot joanaRoot) {
		super();
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
	}
	
	public SourceCodeAnalysisResult readJOANAOutput(String resultFileContent) {
		
		Collection<String> entryPointsResults = splitResults(resultFileContent);
		
		SourceCodeAnalysisResult result = new SourceCodeAnalysisResult();
		
		for(String entryPointResultEntry : entryPointsResults) {
			Yaml yaml = new Yaml();
			Map<String, Object> content = yaml.load(entryPointResultEntry);
			
			Integer tag = (Integer) content.get(TAG_KEY);
			EntryPoint entryPoint = joanaRoot.getEntrypoint().stream().filter(ep -> ep.getId().equals(tag.toString())).findFirst().get();
			
			Collection<Map<String, Object>> illegalFlows = (ArrayList<Map<String, Object>>) content.get(ILLEGAL_INFORMATION_FLOWS_KEY);
			
			for(Map<String, Object> illegalFlow : illegalFlows) {
				
				ResultEntry resultEntry = parseIllegalFlow(illegalFlow, entryPoint);
						
				result.addResultEntry(resultEntry);
			}
		}
		
		return result;
		
	}
	

	
	private ResultEntry parseIllegalFlow(Map<String, Object> illegalFlow, EntryPoint entryPoint) {
		Map<String, Object> source = (Map<String, Object>) illegalFlow.get(SOURCE_KEY);
		Parameter sourceParam = retrieveParameter(source);
		String sourceLevelName = (String) illegalFlow.get(SOURCE_LEVEL_KEY);
		Level sourcelevel = BackprojectionUtil.lookupLevel(sourceLevelName, entryPoint);
		ResultEntryElement sourceElement = new ResultEntryElement(sourceParam, sourcelevel);
		
		
		Map<String, Object> sink = (Map<String, Object>) illegalFlow.get(SINK_KEY);
		Parameter sinkParam = retrieveParameter(sink);
		String sinkLevelName = (String) illegalFlow.get(SINK_LEVEL_KEY);
		Level sinklevel = BackprojectionUtil.lookupLevel(sinkLevelName, entryPoint);
		ResultEntryElement sinkElement = new ResultEntryElement(sinkParam, sinklevel);
		
		return new ResultEntry(sourceElement, sinkElement, entryPoint);
	}
	
	private Parameter retrieveParameter(Map<String, Object> sourceSinkDetails) {
		
		Map<String, Object> methodDetails = (Map<String, Object>)sourceSinkDetails.get(METHOD_KEY); 
		
		String fullyQualifiedNameOfClass = (String) methodDetails.get(CLASS_KEY);
		
		Class clazz = resolveClassFromFullyQualifiedName(fullyQualifiedNameOfClass);
		String methodName = (String) methodDetails.get(METHOD_NAME_KEY);
		
		Method method = resolveMethodFromClassByName(clazz, methodName);
		Integer relativeMethodParameterIndex = (Integer) sourceSinkDetails.get(PARAMETER_INDEX_KEY);
		
		//JOANA identifies result with 0, parameter indices begin with 1. Substract 1 as Offset for normalizstion
		return method.getParameter().get(relativeMethodParameterIndex - 1);
		
	}


	private Method resolveMethodFromClassByName(Class clazz, String methodName) {
		return clazz.getMethod().stream().filter(method -> method.getName().equals(methodName)).findFirst().get();
	}

	private Class resolveClassFromFullyQualifiedName(String fullyQualifiedNameOfClass) {

		String[] fullyQualifiedNameSplit = fullyQualifiedNameOfClass.split("\\.");
		
		int classNameLoc = fullyQualifiedNameSplit.length -  1;
		
		Queue<String> pathComponents = new LinkedList<String>();
		for(int i = 0; i < fullyQualifiedNameSplit.length - 1; i++) {
			pathComponents.add(fullyQualifiedNameSplit[i]);
		}
		
		String rootPackageName = pathComponents.remove(); 
		String className = fullyQualifiedNameSplit[classNameLoc];
		
		if(javaRoot.getPackage().getName().equals(rootPackageName)) {
			return findClassRecursive(javaRoot.getPackage(), className, pathComponents);
		}
		
		return null;
		
	}
	
	private Class findClassRecursive(Package currentPackage, String className, Queue<String> pathComponents) {
		
		
		
		for(ClassOrInterfaceType coit : currentPackage.getClassorinterface()) {
			if(coit instanceof Class && coit.getName().equals(className) && pathComponents.isEmpty()) {
				return (Class)coit;
			}
		}
		
		String nextSubpackageName = pathComponents.remove();
		
		for(Package subPackage : currentPackage.getSubpackage()) {
			
			if(subPackage.getName().equals(nextSubpackageName)) {
				Class clazz = findClassRecursive(subPackage, className, pathComponents);
				if(clazz != null) {
					return clazz;
				}
			}
		}
		
		return null;

	}

	private Collection<String> splitResults(String resultFileContent){
		Collection<String> entryPointResults = new ArrayList<String>();
		
		Scanner scanner = new Scanner(resultFileContent);
		StringBuilder builder = new StringBuilder();
		if(scanner.hasNextLine()) {
			builder.append(String.format("%s %s", scanner.nextLine(), System.lineSeparator()));
		} else {
			scanner.close();
			return entryPointResults;
		}
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			
			if(line.contains(NEW_ENTRY_POINT_IDENTIFICATION)) {
				entryPointResults.add(builder.toString());
				builder = new StringBuilder(line);
			}
			
			builder.append(String.format("%s %s", line, System.lineSeparator()));
			
		}
		
		entryPointResults.add(builder.toString());
		
		scanner.close();
		
		return entryPointResults;
		
	}
	

}
