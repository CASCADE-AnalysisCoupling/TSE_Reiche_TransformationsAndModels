package edu.kit.kastel.sdq.coupling.models.joana.supporting.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.Sink;
import edu.kit.kastel.sdq.coupling.models.joana.Source;

public class JOANAResolutionUtil {

	private JOANAResolutionUtil() {
	}

	public static Collection<EntryPoint> getEntryPointsForMethod(JOANARoot joanaRoot, Method method) {
		return joanaRoot.getEntrypoint().stream()
				.filter(entrypoint -> entrypoint.getMethodIdentification().getMethod().equals(method))
				.collect(Collectors.toList());
	}

	public static Collection<Source> getSourcesForParameter(JOANARoot joanaRoot, Parameter parameter){
		 return getInformationFlowAnnotationsForParameter(joanaRoot, parameter).stream().filter(Source.class::isInstance).map(Source.class::cast).collect(Collectors.toList());
	}
	
	public static Collection<Sink> getSinksForParameter(JOANARoot joanaRoot, Parameter parameter){
		 return getInformationFlowAnnotationsForParameter(joanaRoot, parameter).stream().filter(Sink.class::isInstance).map(Sink.class::cast).collect(Collectors.toList());
	}

	public static EntryPoint getEntryPointForAnnotation(JOANARoot joanaRoot,
			InformationFlowAnnotation inforamtionFlowAnnotation) {
		return joanaRoot.getEntrypoint().stream()
				.filter(entrypoint -> entrypoint.getAnnotation().contains(inforamtionFlowAnnotation)).findFirst().get();
	}

	private static Collection<InformationFlowAnnotation> getInformationFlowAnnotationsForParameter(JOANARoot joanaRoot,
			Parameter parameter) {
		Collection<InformationFlowAnnotation> annotationsToParameter = new ArrayList<InformationFlowAnnotation>();

		for (EntryPoint entryPoint : joanaRoot.getEntrypoint()) {
			annotationsToParameter.addAll(entryPoint.getAnnotation().stream()
					.filter(annot -> doesAnnotationTargetParameter(annot, parameter)).collect(Collectors.toList()));
		}

		return annotationsToParameter;
	}

	private static boolean doesAnnotationTargetParameter(InformationFlowAnnotation annotation, Parameter p) {
		return (annotation.getSystemElementIdentification() instanceof ParametertIdentifying
				&& ((ParametertIdentifying) annotation.getSystemElementIdentification()).getParameter().equals(p));
	}
	
	public static Map<String, Collection<String>> generateLevelTagsMappingsForAnnotations(JOANARoot root, Collection<InformationFlowAnnotation> annotations){
		Map<String, Collection<String>> levelToTagsMappings = new HashMap<String, Collection<String>>();
		
		for(InformationFlowAnnotation annotation : annotations) {
			if(!levelToTagsMappings.containsKey(annotation.getLevel().getName())) {
				Collection<String> tags = new HashSet<String>();
				levelToTagsMappings.put(annotation.getLevel().getName(), tags);
			}
			
			levelToTagsMappings.get(annotation.getLevel().getName()).add(getEntryPointForAnnotation(root, annotation).getId());
		}
		
		return levelToTagsMappings;
	}
	
	public static boolean isClassOrInterfaceTargetedByJoana(ClassOrInterfaceType coi, JOANARoot root) {
		for(EntryPoint entryPoint : root.getEntrypoint()) {
			for(InformationFlowAnnotation annotation :entryPoint.getAnnotation()) {
				
				if(annotation.getSystemElementIdentification() instanceof MethodIdentifying) {
					MethodIdentifying identifying = (MethodIdentifying) annotation.getSystemElementIdentification();
					if(coi.getMethod().contains(identifying)) {
						return true;
					}
				}
				
				if(annotation.getSystemElementIdentification() instanceof ParametertIdentifying) {
					ParametertIdentifying identifying = (ParametertIdentifying) annotation.getSystemElementIdentification();
					
					if(coi.getMethod().stream().filter(method -> method.getParameter().contains(identifying.getParameter())).findAny().isPresent()) {
						return true;
					}
				}
			}
		}
			
			
		return false;
	}
}
