package edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.templates


abstract class ClassGenerationTemplate{
	
	def String generate() {
		return '''
		«generatePackage»
		«generateImports»
		«generateDeclaration»{
			«generateFields»
			«generateConstructors»
			«generateMethods»
		}'''
	}

	protected def String generatePackage();

	protected def String generateImports();

	protected def String generateDeclaration();

	protected def String generateConstructors();

	protected def String generateFields();

	protected def String generateMethods();
	
	
}
