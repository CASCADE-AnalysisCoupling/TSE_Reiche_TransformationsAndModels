package edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.templates



abstract class MethodGenerationTemplate{
	
	def generate() '''
		«generateComments()»
		«generateHeader()»{
			«generateBody()»
		}
	'''
	
	protected def String generateComments();
	protected def String generateHeader();
	protected def String generateBody();
	
}
