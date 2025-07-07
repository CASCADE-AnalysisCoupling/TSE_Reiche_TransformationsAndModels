package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot
import java.util.ArrayList
import edu.kit.kastel.sdq.coupling.models.java.types.Class
import edu.kit.kastel.sdq.coupling.models.java.types.Interface
import edu.kit.kastel.sdq.coupling.models.java.members.Field
import edu.kit.kastel.sdq.coupling.models.java.members.Method
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.ClassOrInterfaceTypeGenerationTemplate
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil
import edu.kit.kastel.sdq.coupling.models.joana.Source
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.Filter

class JOANAClassOrInterfaceTypeCodeGenerator extends ClassOrInterfaceTypeGenerationTemplate {

	private final MethodGenerationTemplate methodGenerator;
	private JOANARoot joanaRoot;

	new(JavaRoot javaRoot, JOANARoot joanaRoot) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.methodGenerator = new JOANAMethodCodeGenerator(javaRoot, joanaRoot);
	}

	override protected generateImports() {

		var collectionImport = "";

		var joanaUIImports = "";

		val entryPointsWithSourceAnnotations = joanaRoot.entrypoint.filter [ ep |
			super.currentClassOrInterface.method.contains(ep.methodIdentification.method)
		].filter[ep|ep.annotation.size != 0].filter[ep|ep.annotation.exists[an|an instanceof Source]]

		val targetedByJOANA = !entryPointsWithSourceAnnotations.isEmpty;

		if (currentClassOrInterface instanceof Class && targetedByJOANA) {
			joanaUIImports = "import edu.kit.joana.ui.annotations.*;";
		}

		val types = JavaResolutionUtil.getAllNonPrimitiveTypes(currentClassOrInterface);
		if (!types.filter(CollectionType).empty) {
			collectionImport = "import java.util.Collection;";
		}

		// Not nice, but aside from primitive types and collection types, only ClassOrInterfaceTypes, i.e., Reference Types exist
		val classOrInterfaceTypes = types.filter(ClassOrInterfaceType).filter[coi | coi.name.contains(Filter.ARRAY_MARKER) || coi.name.contains(Filter.OBJECT_MARKER) || coi.name.contains(Filter.PRIMITIVE_MARKER) || coi.name.contains(Filter.REMOTE_CLASS_MARKER)].toList;

		return '''
			«joanaUIImports» 
			«collectionImport» 
			«FOR classOrInterfaceType : classOrInterfaceTypes SEPARATOR System.lineSeparator»«generateSingleImport(classOrInterfaceType)»«ENDFOR»
		'''
	}
	
	private def String generateSingleImport(ClassOrInterfaceType type){
			return '''import «JavaResolutionUtil.createFullyQualifiedPath(javaRoot, classOrInterfaceType)»;''' 
	}

	override protected generateMethods() {
		return '''«FOR method : currentClassOrInterface.method SEPARATOR System.lineSeparator»«generateMethod(method, currentClassOrInterface)»«ENDFOR»'''
	}

	private def String generateMethod(Method method, ClassOrInterfaceType parent) {
		methodGenerator.currentMethod = method;
		methodGenerator.parent = parent;

		return methodGenerator.generate();
	}
}
