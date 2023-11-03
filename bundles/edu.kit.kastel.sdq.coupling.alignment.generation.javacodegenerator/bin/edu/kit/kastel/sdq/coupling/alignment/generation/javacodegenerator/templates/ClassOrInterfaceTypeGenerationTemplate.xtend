package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates

import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType

abstract class ClassOrInterfaceTypeGenerationTemplate{
	
	protected ClassOrInterfaceType currentClassOrInterface;
	
	def String generate() {
		return '''
		«generatePackageDeclaration»
		«generateImports»
		«generateDeclaration»{
			«generateFields»
			«generateConstructors»
			«generateMethods»
		}'''
	}

	protected def String generatePackageDeclaration();

	protected def String generateImports();

	protected def String generateDeclaration();

	protected def String generateConstructors();

	protected def String generateFields();

	protected def String generateMethods();
	
	public def setClassOrInterfaceType(ClassOrInterfaceType coi){
		this.currentClassOrInterface = coi;
	}
	
	public def ClassOrInterfaceType getClassOrInterfaceType(){
		return this.currentClassOrInterface;
	}
	
	
}
