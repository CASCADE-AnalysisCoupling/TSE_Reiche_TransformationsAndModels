package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils

import java.util.Collection

class JOANAStringUtil {
	def String concatLevels(Collection<String> levels){
		return '''«FOR level: levels SEPARATOR ''»«level.toFirstUpper»«ENDFOR»'''
	}
	
	def String toCurlyArray(Collection<String> strings){
		return '''«FOR string : strings BEFORE '{' SEPARATOR ',' AFTER '}'»«string»«ENDFOR»'''
	}
	
	def String generateTags(Collection<String> tags){
		return '''«FOR tag: tags SEPARATOR ','»«tag»«ENDFOR»'''
	}
	
	def String FlowAnnotation_generateTagsEntry(Collection<String> tags){
		return '''tags = «toCurlyArray(tags)»'''
	}
	
	def String EntryPoint_generateTagEntry(String tag){
		return '''tag = "«tag»"'''
	}
	
	def String FlowAnnotation_generateLevelEntry(Collection<String> levels){
		return '''level = "«concatLevels(levels)»"'''
	}
	
	def String FlowAnnotation_generateLevelEntry(String level){
		return '''level = "«level»"'''
	}
	
	def String EntryPoint_generateLevelEntry(Collection<String> levels){
		return '''levels = «toCurlyArray(levels)»'''
	}
	
	def String FlowAnnotation_generateSourceAnnotation(Collection<String> tags, Collection<String> levels){
		val level = concatLevels(levels);
		return FlowAnnotation_generateSourceAnnotation(tags, level);
	}
	
	def String FlowAnnotation_generateSourceAnnotation(Collection<String> tags, String level){
		return '''@Source(«FlowAnnotation_generateTagsEntry(tags)», «FlowAnnotation_generateLevelEntry(level)»)'''
	}
	
		
	def String FlowAnnotation_generateSinkAnnotation(Collection<String> tags, Collection<String> levels){
		val level = concatLevels(levels);
		return FlowAnnotation_generateSinkAnnotation(tags, level);
	}
	
	def String FlowAnnotation_generateSinkAnnotation(Collection<String> tags, String level){
		return '''@Sink(«FlowAnnotation_generateTagsEntry(tags)», «FlowAnnotation_generateLevelEntry(level)»)'''
	}
	
	def String EntryPoint_generateMayFlow(String from, String to){
		return '''@MayFlow(from = "«from»", to = "«to»")'''
	}
	
	def String EntryPoint_generateMayFlow(Collection<String> from, Collection<String> to){
		val conFrom = concatLevels(from);
		val conTo = concatLevels(to);
		
		return EntryPoint_generateMayFlow(conFrom, conTo);
	}
	
	def String EntryPoint_generateLattice(Collection<String> mayFlows){
		return '''lattice = «toCurlyArray(mayFlows)»'''
	}
}