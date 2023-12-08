package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates

import edu.kit.kastel.sdq.coupling.models.java.members.Method
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType
import edu.kit.kastel.sdq.coupling.models.java.types.Class

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
	'''«generateAnnotations(parameter)»«parameter.type.name» «parameter.name»'''
	
	protected def String generateAnnotations(Parameter parameter)''''''
	
	protected def String generateBody() '''//TODO: auto-generated method stub'''
	
	public def void setCurrentMethod(Method newMethod){
		this.currentMethod = newMethod;
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
