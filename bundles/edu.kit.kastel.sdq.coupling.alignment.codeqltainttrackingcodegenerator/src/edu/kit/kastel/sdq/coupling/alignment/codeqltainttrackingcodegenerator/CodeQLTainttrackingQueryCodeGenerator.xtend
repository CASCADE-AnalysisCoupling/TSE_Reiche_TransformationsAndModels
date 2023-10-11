package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator

import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate

class CodeQLTainttrackingQueryCodeGenerator extends CodeQLQueryTemplate{
	val String SOURCE_NAME = "source"
	val String SINK_NAME = "sink"
	
	
	override generateSelectClause() '''«CodeQLTainttrackingCodeGenerator.MODULE_NAME»::PathNode «SOURCE_NAME», «CodeQLTainttrackingCodeGenerator.MODULE_NAME»::PathNode «SINK_NAME»'''
	override generateWhereClause() '''«generateFlowPath» and «SOURCE_NAME» != «SINK_NAME» and «generateHasLabelCheck(SOURCE_NAME)» and «generateHasLabelCheck(SINK_NAME)» and «generateNotAllowedFlow()»'''
	override generateFromClause() '''«SINK_NAME».getNode(), «SOURCE_NAME», «SINK_NAME», "Found Flow"'''
	
	
	def String generateHasLabelCheck(String element) '''«CodeQLTainttrackingCodeGenerator.HAS_LABEL_CHECK_NAME»(«element»)'''
	def String generateNotAllowedFlow() '''not allowedFlow(«CodeQLTainttrackingCodeGenerator.LABEL_FUNCTION_NAME»(«SOURCE_NAME».getNode()), «CodeQLTainttrackingCodeGenerator.LABEL_FUNCTION_NAME»(«SINK_NAME».getNode()))'''
	def String generateFlowPath() '''«CodeQLTainttrackingCodeGenerator.MODULE_NAME»::flowPath(«SOURCE_NAME», «SINK_NAME»)'''
}
