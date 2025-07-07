package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates

import edu.kit.kastel.sdq.coupling.models.java.members.Method
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType
import edu.kit.kastel.sdq.coupling.models.java.types.Class
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.Filter

abstract class MethodGenerationTemplate{
	
	protected Method currentMethod;
	protected ClassOrInterfaceType parent;
	
	def String generate() '''
		«generateAnnotationsAndComments()»
		«generateHeader()»«IF parent instanceof Class»{
			«generateBody()»
		}«ELSE»;«ENDIF»
	'''
	
	protected def String generateAnnotationsAndComments() ''''''
	
	protected def String generateHeader() '''public «IF currentMethod.returntype !== null»«currentMethod.returntype.name»«ELSE»void«ENDIF» «currentMethod.name» («generateParameters()»)'''
	
	protected def String generateParameters()'''«FOR parameter : currentMethod.parameter SEPARATOR ", "»«generateParameter(parameter)»«ENDFOR»'''
	
	protected def String generateParameter(Parameter parameter)
	'''«generateAnnotations(parameter)»«generateParameterTypeName(parameter)» «parameter.name»'''
	
	protected def String generateAnnotations(Parameter parameter)''''''
	
	protected def String generateBody() '''//TODO: auto-generated method stub'''
	
	public def void setCurrentMethod(Method newMethod){
		this.currentMethod = newMethod;
	} 
	
	protected def String generateParameterTypeName(Parameter parameter){
		
		if(parameter.type.name.contains(Filter.ARRAY_MARKER)){
			var parts = parameter.type.name.split("Array",-1);
			
			val count = parts.length - 1;
			
			var name = parameter.type.name.split("_").get(0);
			
			for(var i = 0; i < count; i++){
				name = name + "[]";
			}
			
			return name;
		} else if (parameter.type.name.contains(Filter.INTERFACE_MARKER) ||
			parameter.type.name.contains(Filter.CLASS_MARKER) || parameter.type.name.contains(Filter.PRIMITIVE_MARKER) || parameter.type.name.contains(Filter.REMOTE_CLASS_MARKER)) {
				return parameter.type.name.split("_").get(0);
		} else {
			return parameter.type.name;
		}
	}
	
	public def Method getCurrentMethod(){
		return this.currentMethod;
	}
	
	public def void setParent(ClassOrInterfaceType parent){
		this.parent = parent;
	} 
	
	public def ClassOrInterfaceType getParent(){
		return this.parent;
	}
	
}
