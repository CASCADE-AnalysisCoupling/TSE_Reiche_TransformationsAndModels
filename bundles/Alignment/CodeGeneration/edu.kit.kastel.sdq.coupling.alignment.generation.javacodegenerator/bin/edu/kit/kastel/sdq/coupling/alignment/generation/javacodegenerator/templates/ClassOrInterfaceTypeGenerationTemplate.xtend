package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates

import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.java.types.Interface
import java.util.ArrayList
import edu.kit.kastel.sdq.coupling.models.java.members.Field

abstract class ClassOrInterfaceTypeGenerationTemplate{
	
	protected ClassOrInterfaceType currentClassOrInterface;
	protected JavaRoot javaRoot;
	
	def String generate() '''
		«generatePackageDeclaration»
		
		«generateImports»
		
		«generateDeclaration» {
		«IF currentClassOrInterface instanceof Class»	
			«generateFields»
			
			«generateConstructors»
		«ENDIF»
			«generateMethods»
		}'''
	

	protected def String generatePackageDeclaration(){
		val packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(javaRoot, currentClassOrInterface);
		return String.format("package %s;", JavaResolutionUtil.creatyFullPackagePathFromParts(packagePath));
	}

	protected def String generateImports();

	protected def String generateDeclaration(){
		if(currentClassOrInterface instanceof Interface){
			return generateInterfaceDeclaration(currentClassOrInterface as Interface);
		} else if (currentClassOrInterface instanceof Class){
			return generateClassDeclaration(currentClassOrInterface as Class);
		}
		
		return "";
	}

	protected def String generateConstructors(){
		
		val clazz = currentClassOrInterface as Class;
		
		return '''
		public «currentClassOrInterface.name»(«generateConstructorParameters(clazz)»){
			«generateConstructorBody(clazz)»
		}
		'''
	}

	protected def String generateFields(){
		val castedClass = currentClassOrInterface as Class;
		return '''«FOR field : castedClass.field SEPARATOR System.lineSeparator»«generateField(field)»«ENDFOR»'''
	}

	protected def String generateMethods();
	
	public def setClassOrInterfaceType(ClassOrInterfaceType coi){
		this.currentClassOrInterface = coi;
	}
	
	public def ClassOrInterfaceType getClassOrInterfaceType(){
		return this.currentClassOrInterface;
	}
	
	public def setJavaRoot(JavaRoot javaRoot){
		this.javaRoot = javaRoot;
	}
	
	public def JavaRoot getJavaRoot(){
		return this.javaRoot;
	}
	
	private def String generateInterfaceDeclaration(Interface interf)'''public interface «interf.name»'''
	
	private def String generateClassDeclaration(Class clazz){
		val extendsRelations = new ArrayList<ClassOrInterfaceType>();
		return '''public class «clazz.name»«IF extendsRelations.size > 0» extends «extendsRelations.get(0).name»«ENDIF»«IF clazz.implements.size > 0» implements «FOR interf : clazz.implements SEPARATOR ", "»«interf.name»«ENDFOR»«ENDIF»''';
	}
	
	private def String generateConstructorParameters(Class clazz)'''«FOR field : clazz.field SEPARATOR ", "»«field.type.name» «field.name»«ENDFOR»'''
	
	private def String generateConstructorBody(Class clazz)'''
	«FOR field : clazz.field SEPARATOR System.lineSeparator»this.«field.name» = «field.name»;«ENDFOR»
	//TODO: Complete constructor
	'''	
	
	protected def String generateField(Field field) '''public «field.type.name» «field.name»;'''
}
