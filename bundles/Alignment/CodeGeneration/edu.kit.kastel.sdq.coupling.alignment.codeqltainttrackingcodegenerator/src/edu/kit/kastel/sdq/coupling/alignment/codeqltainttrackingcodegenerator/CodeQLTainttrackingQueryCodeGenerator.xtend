package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator

import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate

class CodeQLTainttrackingQueryCodeGenerator extends CodeQLQueryTemplate{
	public static val String SOURCE_NAME = "source"
	public static val String SINK_NAME = "sink"
	
	
	override generateSelectClause() '''«SINK_NAME».getNode(), «SOURCE_NAME», «SINK_NAME», «generateMessage»'''
	override generateWhereClause() '''«generateFlowPath» and «SOURCE_NAME» != «SINK_NAME» and «generateNotAllowedFlow()» and «generateNotEqualElementsCheck()»'''
	
	
	
	override generateFromClause()  '''«CodeQLTainttrackingCodeGenerator.MODULE_NAME»::PathNode «SOURCE_NAME», «CodeQLTainttrackingCodeGenerator.MODULE_NAME»::PathNode «SINK_NAME»'''
	
	
	def String generateHasLabelCheck(String element) '''«CodeQLTainttrackingCodeGenerator.HAS_LABEL_CHECK_NAME»(«element»)'''
	def String generateNotAllowedFlow() '''not isFlowAllowed(«SOURCE_NAME».getNode(), «SINK_NAME».getNode())'''
	def String generateFlowPath() '''«CodeQLTainttrackingCodeGenerator.MODULE_NAME»::flowPath(«SOURCE_NAME», «SINK_NAME»)'''
	def String generateMessage() '''«CodeQLTainttrackingCodeGenerator.PRINT_RESULT_NAME»(source, sink)'''
	def String generateNotEqualElementsCheck()'''notEqualElements(source.getNode(), sink.getNode())'''
}
