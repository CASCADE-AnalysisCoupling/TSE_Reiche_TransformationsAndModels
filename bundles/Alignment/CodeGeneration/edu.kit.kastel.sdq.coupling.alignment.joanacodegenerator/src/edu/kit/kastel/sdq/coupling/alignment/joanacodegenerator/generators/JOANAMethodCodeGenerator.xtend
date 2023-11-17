package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot

import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils.JOANAStringUtil
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils.JOANAResolutionUtil
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate

class JOANAMethodCodeGenerator extends MethodGenerationTemplate{
	
	private final JOANARoot joanaRoot; 

	new (JavaRoot javaRoot, JOANARoot joanaRoot){
		this.joanaRoot = joanaRoot;
	}
	
	override protected generateAnnotationsAndComments() {
		return JOANAStringUtil.EntryPoint_generateEntryPoints(JOANAResolutionUtil.getEntryPointsForMethod(joanaRoot, currentMethod))
	}
	
	override protected generateAnnotations(Parameter parameter){
		val sources = JOANAResolutionUtil.getSourcesForParameter(joanaRoot, parameter);
		val sinks = JOANAResolutionUtil.getSinksForParameter(joanaRoot, parameter);
		
		val annotSources = sources.map[source | source as InformationFlowAnnotation].toList;
		val annotSinks = sinks.map[sink | sink as InformationFlowAnnotation].toList;
		
		val levelToTagMappingsForSources = JOANAResolutionUtil.generateLevelTagsMappingsForAnnotations(joanaRoot, annotSources);
		val levelToTagMappingsForSinks = JOANAResolutionUtil.generateLevelTagsMappingsForAnnotations(joanaRoot, annotSinks);
		
		val generatedSourceAnnotations = JOANAStringUtil.FlowAnnotation_generateSourcesAnnotation(levelToTagMappingsForSources);
		val generatedSinkAnnotations = JOANAStringUtil.FlowAnnotation_generateSinkAnnotation(levelToTagMappingsForSinks);
		
		return '''«generatedSourceAnnotations»«generatedSinkAnnotations»'''
	}
	
	
}