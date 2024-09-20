package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator


import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation

class CodeQLTainttrackingCodeGenerator extends CodeQLTainttrackingTemplate{
	public static val String HAS_LABEL_CHECK_NAME = "hasLabel";
	public static val String LABEL_FUNCTION_NAME = "getLabel";
	public static val  String MODULE_NAME = "MyTaintFlow";
	public static val  String CONFIG_NAME = "MyFlowConfiguration";
	public static val String ID = "labeledtaint";
	public static val String LABEL_TYPE_NAME = "SecurityLevel"
	private static val String SUBLEVEL_DELIMINATOR = ";";
	public static val String PRINT_RESULT_NAME = "printResult";
	public static val String CONSIDER_NOT_EQUAL_ELEMENTS = "notEqualElements";
	public static val String CLASS_FIELD_DELIMITER = "!";
	public static val String SYSTEMELEMENT_TYPE_DELIMITER = ":";
	public static val String METHOD_PARAMETER_DELIMITER = ".";
	public static val String CLASS_METHOD_DELIMITER = "::";
	public static val String SOURCE_SINK_DELIMITER = "->";
	public static val String SYSTEMELEMENT_SECURITYELEMENT_DELIMITER = ",";
	
	val CodeQLQueryTemplate query;
	
	val Query config;
	val JavaRoot root;
	
	new(JavaRoot root, Query config){
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
			«FOR allowedFlow : config.allowedFlows.allowedFlows SEPARATOR " or"»«singleAllowedFlow(allowedFlow)»«ENDFOR»
			or getLevelAsString(source) = getLevelAsString(sink) 
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
	«generateLabelingSupportFunctionForParameter»
	
	«generateLabelingSupportFunctionForField»
	'''
	
	private def String generateLabelingSupportFunctionForParameter()'''
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
	
	private def String generateLabelingSupportFunctionForField()'''
			predicate labelField(string className, string fieldName, DataFlow::Node node){
				exists(Class c, Field f  | 
					c.hasName(className) and 
					c.contains(f) and
					f.hasName(fieldName) and 
					node.asExpr().(FieldAccess).getField() = f
				)
			}
	'''
	
	protected def String generateLabelingFunction()'''
		«LABEL_TYPE_NAME» «LABEL_FUNCTION_NAME»(DataFlow::Node node){
			«FOR annotation : config.securityLevelAnnotations SEPARATOR " or"»
				«generateSingleParameterLabeling(annotation)»
			«ENDFOR»
			or result = None()
		}
	'''
	
	
	private def String singleAllowedFlow(AllowedFlow flow)'''
		source = «generateSecurityLevelType(flow.from)» and sink = «generateSecurityLevelType(flow.to)»
	'''
	
	private def String generateSingleParameterLabeling(SecurityLevelAnnotation anno){
		
		if(anno instanceof ParameterAnnotation){
		val levelString = anno.securityLevel.name
		val className = JavaResolutionUtil.getClassForParameter(root, anno.parameter).name
		val methodName = JavaResolutionUtil.getMethodContainingParameter(root, anno.parameter).name
		val parameterName = anno.parameter.name;
			return generateSingleParameterLabeling(className, methodName, parameterName, anno.securityLevel)
		}
		
		if(anno instanceof FieldAnnotation){
		val levelString = anno.securityLevel.name
		val className = JavaResolutionUtil.getClassForField(root, anno.field).name
		val fieldName = anno.field.name;
			return generateSingleFieldLabeling(className, fieldName, anno.securityLevel)
		}
		
		return null
	}
	
	private def String generateSingleParameterLabeling(String className, String methodName, String parameterName, SecurityLevel label)'''
		labelParameter("«className»", "«methodName»", "«parameterName»", node) and result = «generateSecurityLevelType(label)» 
	'''
	
	private def String generateSingleFieldLabeling(String className, String fieldName, SecurityLevel label)'''
		labelField("«className»", "«fieldName»", node) and result = «generateSecurityLevelType(label)» 
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
				level = «generateSecurityLevelType(level)» and result = "«level.name»"
			«ENDFOR»
		}
	'''
	
	private def String generateNodeToLevelString()'''
		string getNodeLevelAsString(DataFlow::Node node){
	    	result = getLevelAsString(getLabel(node))
		}
	'''
	
	private def String generateSecurityLevelType(SecurityLevel level)'''«level.name.replace(SUBLEVEL_DELIMINATOR, "").toFirstUpper»()'''
	
	override protected String generateFunctionCatchingEquality() '''
	predicate «CONSIDER_NOT_EQUAL_ELEMENTS»(DataFlow::Node node1, DataFlow::Node node2){
	    node1.getEnclosingCallable().getDeclaringType().getPackage() != node2.getEnclosingCallable().getDeclaringType().getPackage() 
	    or
	    node1.getEnclosingCallable().getDeclaringType().getName() != node2.getEnclosingCallable().getDeclaringType().getName() 
	    or 
	    node1.asExpr().(FieldAccess).getField().getName() != node2.asExpr().(FieldAccess).getField().getName()
	    or 
	    node1.getEnclosingCallable().getName() != node2.getEnclosingCallable().getName()
	    or node1.asParameter().getName() != node2.asParameter().getName()
	}
	'''
	
	override protected String generateResultPrinting() '''
	«generatePrintResult»
	
	«generatePrintResultForNode»
	
	«generatePrintResultForParameter»
	
	«generatePrintResultForField»
	'''
	
	private def String generatePrintResult() '''
	string «PRINT_RESULT_NAME»(«MODULE_NAME»::PathNode source, «MODULE_NAME»::PathNode sink){
	    result = 
	    "(" 
	    + «PRINT_RESULT_NAME»(source.getNode()) 
	    +"«SYSTEMELEMENT_SECURITYELEMENT_DELIMITER»" 
	    + getNodeLevelAsString(source.getNode()) 
	    + ")" 
	    + "«SOURCE_SINK_DELIMITER» (" 
	    + «PRINT_RESULT_NAME»(sink.getNode()) 
	    + "«SYSTEMELEMENT_SECURITYELEMENT_DELIMITER»" 
	    + getNodeLevelAsString(sink.getNode()) 
	    +")"
	}
	'''
	
	private def String generatePrintResultForParameter()'''
	string printParameter(DataFlow::Node node){
	    result = node.getEnclosingCallable().getDeclaringType().getPackage() + "." 
	        + node.getEnclosingCallable().getDeclaringType().getName() + "«CLASS_METHOD_DELIMITER»" 
	        + node.getEnclosingCallable().getName()
	        + "«METHOD_PARAMETER_DELIMITER»"
	        + node.asParameter().getName() + "«SYSTEMELEMENT_TYPE_DELIMITER»"
	    	+ node.asParameter().getType().getName()
	}
	'''
	
	private def String generatePrintResultForField()'''
	string printField(DataFlow::Node node){
	     result = node.getEnclosingCallable().getDeclaringType().getPackage() + "." 
	        + node.getEnclosingCallable().getDeclaringType().getName() + "«CLASS_FIELD_DELIMITER»" 
	        + node.asExpr().(FieldAccess).getField().getName() + "«SYSTEMELEMENT_TYPE_DELIMITER»" 
	    	+ node.asExpr().(FieldAccess).getField().getType().getName()
	}
	'''
	
	private def String generatePrintResultForNode()'''
	string «PRINT_RESULT_NAME»(DataFlow::Node node){
	    result = printField(node) or
	    result = printParameter(node)
	}
	'''
	
}
