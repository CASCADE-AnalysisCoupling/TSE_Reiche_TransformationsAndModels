package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
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
		 return getInformationFlowAnnotationsForParameter(joanaRoot, parameter).stream().filter(annot -> annot instanceof Source).map(annot -> (Source) annot).collect(Collectors.toList());
	}
	
	public static Collection<Sink> getSinksForParameter(JOANARoot joanaRoot, Parameter parameter){
		 return getInformationFlowAnnotationsForParameter(joanaRoot, parameter).stream().filter(annot -> annot instanceof Sink).map(annot -> (Sink) annot).collect(Collectors.toList());
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
	
	public static Map<Level, Collection<String>> generateLevelTagsMappingsForAnnotations(JOANARoot root, Collection<InformationFlowAnnotation> annotations){
		Map<Level, Collection<String>> levelToTagsMappings = new HashMap<Level, Collection<String>>();
		
		for(InformationFlowAnnotation annotation : annotations) {
			if(!levelToTagsMappings.containsKey(annotation.getLevel())) {
				Collection<String> tags = new HashSet<String>();
				levelToTagsMappings.put(annotation.getLevel(), tags);
			}
			
			levelToTagsMappings.get(annotation.getLevel()).add(getEntryPointForAnnotation(root, annotation).getId());
		}
		
		return levelToTagsMappings;
	}
}
