package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot
import java.util.ArrayList
import edu.kit.kastel.sdq.coupling.models.java.types.Class
import edu.kit.kastel.sdq.coupling.models.java.types.Interface
import edu.kit.kastel.sdq.coupling.models.java.members.Field
import edu.kit.kastel.sdq.coupling.models.java.members.Method
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.ClassOrInterfaceTypeGenerationTemplate
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.JavaResolutionUtil

class JOANAClassOrInterfaceTypeCodeGenerator extends ClassOrInterfaceTypeGenerationTemplate{
	
	
	
	private final JavaRoot javaRoot;
	private final MethodGenerationTemplate methodGenerator;

	new (JavaRoot javaRoot, JOANARoot joanaRoot){
		this.javaRoot = javaRoot;
		this.methodGenerator = new JOANAMethodCodeGenerator(javaRoot, joanaRoot);
	}
	
	override protected generatePackageDeclaration() {
		val packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(javaRoot, currentClassOrInterface);
		return JavaResolutionUtil.createFullyQualifiedPath(packagePath, currentClassOrInterface);
	}
	
	override protected generateImports() {
		
		var collectionImport = "";
		val joanaUIImports = "import edu.kit.joana.ui.annotations.*;"
		
		val types = JavaResolutionUtil.getAllNonPrimitiveTypes(currentClassOrInterface);
		
		if(!types.filter(CollectionType).empty){
			collectionImport = "import java.util.Collection;";
		}
		
		//Not nice, but aside from primitive types and collection types, only ClassOrInterfaceTypes, i.e., Reference Types exist
		val classOrInterfaceTypes = types.filter(ClassOrInterfaceType).toList;
		
		return '''
			«joanaUIImports» 
			«collectionImport» 
			«FOR classOrInterfaceType : classOrInterfaceTypes SEPARATOR System.lineSeparator»import «JavaResolutionUtil.createFullyQualifiedPath(javaRoot, classOrInterfaceType)»;«ENDFOR»
		'''
	}
	override protected generateDeclaration() {

		if(currentClassOrInterface instanceof Interface){
			return generateInterfaceDeclaration(currentClassOrInterface as Interface);
		} else if (currentClassOrInterface instanceof Class){
			return generateClassDeclaration(currentClassOrInterface as Class);
		}
		
		return "";
	}
	
	private def String generateInterfaceDeclaration(Interface interf)'''public interface «interf.name»'''
	
	private def String generateClassDeclaration(Class clazz){
		val extendsRelations = new ArrayList<ClassOrInterfaceType>();
		return '''public class «clazz.name»«IF extendsRelations.size > 0» extends «extendsRelations.get(0).name»«ENDIF»«IF clazz.implements.size > 0» implements «FOR interf : clazz.implements SEPARATOR "' "»«interf.name»«ENDFOR»«ENDIF»''';
	}
	
	override protected generateConstructors() {
		if(currentClassOrInterface instanceof Interface){
			return "";
		}
		
		val clazz = currentClassOrInterface as Class;
		
		return '''
		public «currentClassOrInterface.name»(«generateConstructorParameters(clazz)»){
			«generateConstructorBody(clazz)»
		}
		'''
	}
	
	private def String generateConstructorParameters(Class clazz)'''«FOR field : clazz.field SEPARATOR ", "»«field.type.name» «field.name»«ENDFOR»'''
	
	private def String generateConstructorBody(Class clazz)'''
	«FOR field : clazz.field SEPARATOR System.lineSeparator»this.«field.name» = «field.name»;«ENDFOR»
	'''	
	override protected generateFields() {
		if (currentClassOrInterface instanceof Interface){
			return ""
		}
		
		val castedClass = currentClassOrInterface as Class;
		return '''«FOR field : castedClass.field SEPARATOR System.lineSeparator»«generateField(field)»«ENDFOR»'''
	}
	
	override protected generateMethods() {
		return '''«FOR method : currentClassOrInterface.method SEPARATOR System.lineSeparator»«generateMethod(method)»«ENDFOR»'''
	}
	
	private def String generateField(Field field) '''public «field.type.name» «field.name»;'''
	
	private def String generateMethod(Method method) {
		methodGenerator.currentMethod = method;
		
		return methodGenerator.generate();
	}
}