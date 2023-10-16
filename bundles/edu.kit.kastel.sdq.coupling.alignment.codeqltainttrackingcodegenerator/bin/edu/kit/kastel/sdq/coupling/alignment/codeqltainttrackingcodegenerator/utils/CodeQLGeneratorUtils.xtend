package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.utils


import java.util.Collection
import org.kit.kastel.sdq.coupling.models.java.JavaRoot
import org.kit.kastel.sdq.coupling.models.java.members.Parameter
import org.kit.kastel.sdq.coupling.models.java.types.Class
import org.kit.kastel.sdq.coupling.models.java.members.Method

class CodeQLGeneratorUtils {
		static def Class getClassForParameter(JavaRoot root, Parameter p){
		var classes = root.types.filter(Class).toList;
		
		var clazz = classes.findFirst[c | getMethodContainingParameter(c.methods, p) !== null]
		return clazz
		
	}
	
	static def Method getMethodContainingParameter(Collection<Method> methods, Parameter toSearch){
		return methods.findFirst[m | m.parameters.contains(toSearch)]
	}
	
	static def Method getMethodContainingParameter(JavaRoot root, Parameter p){
		var classes = root.types.filter(Class).toList;
		for (clazz : classes) {
			var method = getMethodContainingParameter(clazz.methods, p);
			if(method !== null){
				return method; 
			}
		}
		
		return null;
	}
}
