package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.JavaResolutionUtil
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel

class CodeQLTainttrackingCodeGenerator extends CodeQLTainttrackingTemplate{
	public static val String HAS_LABEL_CHECK_NAME = "hasLabel";
	public static val String LABEL_FUNCTION_NAME = "getLabel";
	public static val  String MODULE_NAME = "MyTaintFlow";
	public static val  String CONFIG_NAME = "MyFlowConfiguration";
	public static val String ID = "labeledtaint";
	public static val String LABEL_TYPE_NAME = "SecurityLevel"
	private static val String SUBLEVEL_DELIMINATOR = ";";
	val CodeQLQueryTemplate query;
	
	val Configuration config;
	val JavaRoot root;
	
	new(JavaRoot root, Configuration config){
		this.config = config;
		this.root = root;
		this.query = new CodeQLTainttrackingQueryCodeGenerator();
	}
	
	protected override generateInformationFlowModuleUsage() 
'''
		module «MODULE_NAME» = TaintTracking::Global<«CONFIG_NAME»>;
		import «MODULE_NAME»::PathGraph
	'''
	
	protected override generateConfiguration() 
'''module «CONFIG_NAME» implements DataFlow::ConfigSig {
		
		    predicate isSource(DataFlow::Node source){
		        «HAS_LABEL_CHECK_NAME»(source)
		    }
		
		    predicate isSink(DataFlow::Node sink) {
		        «HAS_LABEL_CHECK_NAME»(sink)
		    }
	}
'''
	
	protected override generateAllowedFlows() '''
		«generateallowedFlowsSecurityLevel»
		
		«generateIsFlowAllowedNodes»
	'''
	
	private def String generateallowedFlowsSecurityLevel()'''
		predicate allowedFlows(«LABEL_TYPE_NAME» source, «LABEL_TYPE_NAME» sink){
			«FOR allowedFlow : config.allowedFlows SEPARATOR " or"»«singleAllowedFlow(allowedFlow)»«ENDFOR»
			or exists(SecurityLevel l | allowedFlows(source, l) and allowedFlows(l, sink)) 
			or none()
		}
	'''
	
	private def String generateIsFlowAllowedNodes()'''
		predicate isFlowAllowed(DataFlow::Node source, DataFlow::Node sink){
		   allowedFlows(getLabel(source), getLabel(sink))
		}   
	'''

	
	protected override generateAvailableLabelCheck() '''
		predicate hasLabel(DataFlow::Node node){
		    getLabel(node) != None()
		}
	'''

	protected override generateQuery() {
		return query.generate
	}
	
	protected override generateLabelFunction() '''
		«generateLabellingSupportFunction»
		
		«generateLabelingFunction»
	'''
	
	protected override generateSecurityLevels() '''
		newtype «LABEL_TYPE_NAME» = 
		«FOR level : config.appliedSecurityLevel SEPARATOR " or"»
			«level.name.replace(";", "").toFirstUpper»()
		«ENDFOR»
		or None()
	'''
	
	protected def String generateLabellingSupportFunction()'''
		bindingset[className, methodName, parameterName]
		predicate labelParameter(string className, string methodName, string parameterName, DataFlow::Node node){
		    
		    exists (Class c, Method m, Parameter p | 
		        c.contains(m) and 
		        c.hasName(className) and 
		        m.contains(p) and 
		        m.hasName(methodName) and 
		        p.hasName(parameterName) 
		        and p = node.asParameter()
		    ) 
		}
	'''
	
	protected def String generateLabelingFunction()'''
		«LABEL_TYPE_NAME» «LABEL_FUNCTION_NAME»(DataFlow::Node node){
			«FOR annotation : config.securityLevelAnnotations SEPARATOR " or"»
				«generateSingleLabelling(annotation)»
			«ENDFOR»
			or result = None()
		}
	'''
	
	
	private def String singleAllowedFlow(AllowedFlow flow)'''
		source = «generateSecurityLevelType(flow.from)» and sink = «generateSecurityLevelType(flow.to)»
	'''
	
	private def String generateSingleLabelling(SecurityLevelAnnotation anno){
		
		if(anno instanceof ParameterAnnotation){
		val levelString = anno.securityLevel.name
		val className = JavaResolutionUtil.getClassForParameter(root, anno.parameter).name
		val methodName = JavaResolutionUtil.getMethodContainingParameter(root, anno.parameter).name
		val parameterName = anno.parameter.name;
			return generateSingleLabelling(className, methodName, parameterName, anno.securityLevel)
		}
		
		return null
	}
	
	private def String generateSingleLabelling(String className, String methodName, String parameterName, SecurityLevel label)'''
		labelParameter("«className»", "«methodName»", "«parameterName»", node) and result = «generateSecurityLevelType(label)» 
	'''
	
	override protected generateMetaData() '''
	/**
	* @kind path-problem
	* @problem.severity warning
	* @id «ID»
	*/
	'''
	
	override protected generatePackageImports() '''
	import java
	import semmle.code.java.dataflow.TaintTracking
	'''
	
	override protected generateLevelToStringFunction() '''
	«generateLevelToString»
	
	«generateNodeToLevelString»
	'''
	
	private def String generateLevelToString() '''
	string getLevelAsString(«LABEL_TYPE_NAME» level){
			«FOR level : config.appliedSecurityLevel SEPARATOR " or"»
				level = «generateSecurityLevelType(level)» and result = "«level.name.toFirstUpper»"
			«ENDFOR»
		}
	'''
	
	private def String generateNodeToLevelString()'''
		string getNodeLevelAsString(DataFlow::Node node){
	    	result = getLevelAsString(getLabel(node))
		}
	'''
	
	private def String generateSecurityLevelType(SecurityLevel level)'''«level.name.replace(SUBLEVEL_DELIMINATOR, "").toFirstUpper»()'''
}
