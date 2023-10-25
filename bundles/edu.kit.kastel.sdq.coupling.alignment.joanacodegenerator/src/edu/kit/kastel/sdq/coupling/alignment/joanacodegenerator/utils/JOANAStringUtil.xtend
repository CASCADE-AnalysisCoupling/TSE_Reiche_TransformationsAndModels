package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils

import java.util.Collection
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint
import edu.kit.kastel.sdq.coupling.models.joana.Lattice
import edu.kit.kastel.sdq.coupling.models.joana.Level
import java.util.Map

class JOANAStringUtil {

	public static def String toCurlyArray(Collection<String> strings){
		return '''«FOR string : strings BEFORE '{' SEPARATOR ',' AFTER '}'»«string»«ENDFOR»'''
	}
	
	public static def String generateTags(Collection<String> tags){
		return '''«FOR tag: tags SEPARATOR ','»«tag»«ENDFOR»'''
	}
	
	public static def String FlowAnnotation_generateTagsEntry(Collection<String> tags){
		return '''tags = «toCurlyArray(tags)»'''
	}
	
	public static def String EntryPoint_generateTagEntry(String tag){
		return '''tag = "«tag»"'''
	}
	
	public static def String FlowAnnotation_generateLevelEntry(String level){
		return '''level = "«level»"'''
	}
	

	
	public static def String EntryPoint_generateLevelsEntry(Collection<Level> levels)'''
	levels = {
		«FOR level : levels SEPARATOR ''', «System.lineSeparator»'''»"«level.name»"«ENDFOR»
	}'''
	
	public static def String FlowAnnotation_generateSourcesAnnotation(Map<Level, Collection<String>> levelToTagsMappings)'''
		«FOR entry : levelToTagsMappings.entrySet SEPARATOR " "»«FlowAnnotation_generateSourceAnnotation(entry.key, entry.value)»«ENDFOR»
	'''
	
	public static def String FlowAnnotation_generateSourceAnnotation(Level level, Collection<String> tags)
	'''@Source(«FlowAnnotation_generateTagsEntry(tags)», «FlowAnnotation_generateLevelEntry(level.name)»)'''
	
	
	
	public static def String FlowAnnotation_generateSinkAnnotation(Map<Level, Collection<String>> levelToTagsMappings)'''
	«FOR entry : levelToTagsMappings.entrySet SEPARATOR " "»«FlowAnnotation_generateSinkAnnotation(entry.key, entry.value)»«ENDFOR»
	'''
	
	public static def String FlowAnnotation_generateSinkAnnotation(Level level, Collection<String> tags)
	'''@Sink(«FlowAnnotation_generateTagsEntry(tags)», «FlowAnnotation_generateLevelEntry(level.name)»)'''
	
	
	public static def String EntryPoint_generateMayFlow(MayFlow mayflow){
		return '''@MayFlow(from = "«mayflow.from.name»", to = "«mayflow.to.name»")'''
	}
	
	public static def String EntryPoint_generateLattice(Lattice lattice)'''
	lattice = {
		«FOR mayFlow : lattice.mayFlow SEPARATOR ''',«System.lineSeparator»'''»«EntryPoint_generateMayFlow(mayFlow)»«ENDFOR»
	}'''
	
	public static def String EntryPoint_generateEntryPoint(EntryPoint entryPoint)'''
	@EntryPoint(
		tag = "«entryPoint.id»"
		«EntryPoint_generateLevelsEntry(entryPoint.level)» 
		«EntryPoint_generateLattice(entryPoint.lattice)»
	)
	'''
	
	public static def String EntryPoint_generateEntryPoints(Collection<EntryPoint> entryPoints)'''
	«FOR entryPoint : entryPoints SEPARATOR System.lineSeparator»«EntryPoint_generateEntryPoint(entryPoint)»«ENDFOR»
	'''
}