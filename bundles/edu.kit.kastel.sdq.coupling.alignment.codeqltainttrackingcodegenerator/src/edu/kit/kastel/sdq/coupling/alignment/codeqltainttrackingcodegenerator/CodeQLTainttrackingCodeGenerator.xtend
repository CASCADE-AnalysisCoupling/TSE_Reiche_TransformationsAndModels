package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.utils.CodeQLGeneratorUtils

class CodeQLTainttrackingCodeGenerator extends CodeQLTainttrackingTemplate{
	public static val String HAS_LABEL_CHECK_NAME = "hasLabel";
	public static val String LABEL_FUNCTION_NAME = "getLabel";
	public static val  String MODULE_NAME = "MyTaintFlow";
	public static val  String CONFIG_NAME = "MyFlowConfiguration";
	public static val String ID = "labeledtaint";
	val CodeQLQueryTemplate query;
	
	val Configuration config;
	val CodeRoot root;
	
	new(CodeRoot root, Configuration config){
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
		predicate isAllowedFlow(DataFlow::Node source, DataFlow::Node sink){
			«FOR allowedFlow : config.allowedFlows SEPARATOR "or \n"»«singleAllowedFlow(allowedFlow)»«ENDFOR»
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
		newtype SecurityLevel = 
		«FOR level : config.appliedSecurityLevel SEPARATOR "or "»
			«level.entityName.toFirstUpper»()
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
		SecurityLevel «LABEL_FUNCTION_NAME»(DataFlow::Node node){
			«FOR annotation : config.securityLevelAnnotations SEPARATOR "\n or \n"»
				«generateSingleLabelling(annotation)»
			«ENDFOR»
			or result = None()
		}
	'''
	
	
	private def String singleAllowedFlow(AllowedFlow flow)'''
		getLabel(source) = «flow.from.entityName.toFirstUpper»() and getLabel(sink) = «flow.to.entityName.toFirstUpper»()
	'''
	
	private def String generateSingleLabelling(SecurityLevelAnnotation anno){
		
		if(anno instanceof ParameterAnnotation){
		val levelString = anno.securityLevel.entityName
		val className = CodeQLGeneratorUtils.getClassForParameter(root, anno.parameter).entityName
		val methodName = CodeQLGeneratorUtils.getMethodContainingParameter(root, anno.parameter).entityName
		val parameterName = anno.parameter.entityName;
			return generateSingleLabelling(className, methodName, parameterName, levelString)
		}
		
		return null
	}
	
	private def String generateSingleLabelling(String className, String methodName, String parameterName, String label)'''
		labelParameter("«className»", "«methodName»", "«parameterName»", node) and result = «label.toFirstUpper»() 
	'''
	
	override protected generateMetaData() '''
	/**
	* @kind path-problem
	* @problem.severity warnining
	* @id «ID»
	*/
	'''
	
}
