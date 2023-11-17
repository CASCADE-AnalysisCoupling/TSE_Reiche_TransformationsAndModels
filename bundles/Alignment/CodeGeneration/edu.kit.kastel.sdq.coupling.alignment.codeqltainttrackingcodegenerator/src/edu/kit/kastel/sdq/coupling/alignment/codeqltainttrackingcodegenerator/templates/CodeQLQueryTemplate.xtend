package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates

abstract class CodeQLQueryTemplate {
	
	def String generate() 
'''
from «generateFromClause»
where «generateWhereClause»
select «generateSelectClause»
'''
	
	
	protected def String generateSelectClause()
	
	protected def String generateWhereClause()
	
	protected def String generateFromClause()
	
}
