package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils;


import org.kit.kastel.sdq.coupling.models.java.members.Parameter;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlFactory;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;

public class CodeQLModelgenerationUtil {


	
	public static SecurityLevel generateSecurityLevel(String name) {
		SecurityLevel level = TainttrackingFactory.eINSTANCE.createSecurityLevel();
		level.setName(name);
		return level;
	}
	
	public static AllowedFlow generateAllowedFlow(SecurityLevel from, SecurityLevel to) {
		AllowedFlow flow = TainttrackingFactory.eINSTANCE.createAllowedFlow();
		flow.setFrom(from);
		flow.setTo(to);
		
		return flow;
	}
	
	public static ParameterAnnotation generateParameterAnnotation(Parameter parameter, SecurityLevel securityLevel) {
		ParameterAnnotation annotation = TainttrackingFactory.eINSTANCE.createParameterAnnotation();
		annotation.setParameter(parameter);
		annotation.setSecurityLevel(securityLevel);
		return annotation;
	}
	
	public static Configuration generateConfiguration() {
		return TainttrackingFactory.eINSTANCE.createConfiguration();
	}
	
	
	public static TainttrackingRoot generateDataFlowRoot() {
		return TainttrackingFactory.eINSTANCE.createTainttrackingRoot();
	}
	
	public static CodeQLRoot generateCodeQLRoot() {
		return CodeqlFactory.eINSTANCE.createCodeQLRoot();
	}
}
