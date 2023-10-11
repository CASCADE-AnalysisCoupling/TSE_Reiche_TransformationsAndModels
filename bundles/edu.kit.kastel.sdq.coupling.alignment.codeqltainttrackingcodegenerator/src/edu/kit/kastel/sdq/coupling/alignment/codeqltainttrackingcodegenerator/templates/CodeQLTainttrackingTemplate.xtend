package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates

abstract class CodeQLTainttrackingTemplate {
	def String generate() '''
		«generateMetaData»
		«generateSecurityLevels()»
		«generateLabelFunction()»
		«generateAvailableLabelCheck()»
		«generateAllowedFlows()»
		«generateConfiguration()»
		«generateInformationFlowModuleUsage()»
		«generateQuery()»
	'''
	
	protected def String generateMetaData()
	
	protected def String generateAvailableLabelCheck()
	
	protected def String generateInformationFlowModuleUsage()
	
	protected def String generateConfiguration()
	
	protected def String generateAllowedFlows()
	
	protected def String generateLabelFunction()
	
	protected def String generateSecurityLevels()
	
	protected def String generateQuery()
	
}
