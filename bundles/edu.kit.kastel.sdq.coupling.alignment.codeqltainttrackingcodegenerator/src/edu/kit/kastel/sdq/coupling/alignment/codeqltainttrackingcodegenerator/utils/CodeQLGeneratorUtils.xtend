package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.utils

import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot
import edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter
import java.util.Collection
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method

class CodeQLGeneratorUtils {
		static def edu.kit.kastel.sdq.coupling.models.codeql.code.Class getClassForParameter(CodeRoot root, Parameter p){
		var classes = root.types.filter(edu.kit.kastel.sdq.coupling.models.codeql.code.Class).toList;
		
		var clazz = classes.findFirst[c | getMethodContainingParameter(c.methods, p) !== null]
		return clazz
		
	}
	
	static def Method getMethodContainingParameter(Collection<Method> methods, Parameter toSearch){
		return methods.findFirst[m | m.parameters.contains(toSearch)]
	}
	
	static def Method getMethodContainingParameter(CodeRoot root, Parameter p){
		var classes = root.types.filter(edu.kit.kastel.sdq.coupling.models.codeql.code.Class).toList;
		for (clazz : classes) {
			var method = getMethodContainingParameter(clazz.methods, p);
			if(method !== null){
				return method; 
			}
		}
		
		return null;
	}
}
