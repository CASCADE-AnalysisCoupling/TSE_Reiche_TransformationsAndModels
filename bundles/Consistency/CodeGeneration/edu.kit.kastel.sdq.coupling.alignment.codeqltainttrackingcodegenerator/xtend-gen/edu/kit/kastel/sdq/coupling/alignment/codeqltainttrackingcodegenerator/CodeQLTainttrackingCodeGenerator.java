package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator;

import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Query;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CodeQLTainttrackingCodeGenerator extends CodeQLTainttrackingTemplate {
  public static final String HAS_LABEL_CHECK_NAME = "hasLabel";

  public static final String LABEL_FUNCTION_NAME = "getLabel";

  public static final String MODULE_NAME = "MyTaintFlow";

  public static final String CONFIG_NAME = "MyFlowConfiguration";

  public static final String ID = "labeledtaint";

  public static final String LABEL_TYPE_NAME = "SecurityLevel";

  private static final String SUBLEVEL_DELIMINATOR = ";";

  public static final String PRINT_RESULT_NAME = "printResult";

  public static final String CONSIDER_NOT_EQUAL_ELEMENTS = "notEqualElements";

  public static final String CLASS_FIELD_DELIMITER = "!";

  public static final String SYSTEMELEMENT_TYPE_DELIMITER = ":";

  public static final String METHOD_PARAMETER_DELIMITER = ".";

  public static final String CLASS_METHOD_DELIMITER = "::";

  public static final String SOURCE_SINK_DELIMITER = "->";

  public static final String SYSTEMELEMENT_SECURITYELEMENT_DELIMITER = ",";

  private final CodeQLQueryTemplate query;

  private final Query config;

  private final JavaRoot root;

  public CodeQLTainttrackingCodeGenerator(final JavaRoot root, final Query config) {
    this.config = config;
    this.root = root;
    CodeQLTainttrackingQueryCodeGenerator _codeQLTainttrackingQueryCodeGenerator = new CodeQLTainttrackingQueryCodeGenerator();
    this.query = _codeQLTainttrackingQueryCodeGenerator;
  }

  @Override
  protected String generateInformationFlowModuleUsage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module ");
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append(" = TaintTracking::Global<");
    _builder.append(CodeQLTainttrackingCodeGenerator.CONFIG_NAME);
    _builder.append(">;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathGraph");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  protected String generateConfiguration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("module ");
    _builder.append(CodeQLTainttrackingCodeGenerator.CONFIG_NAME);
    _builder.append(" implements DataFlow::ConfigSig {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("predicate isSource(DataFlow::Node source){");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append(CodeQLTainttrackingCodeGenerator.HAS_LABEL_CHECK_NAME, "\t\t        ");
    _builder.append("(source)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("predicate isSink(DataFlow::Node sink) {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append(CodeQLTainttrackingCodeGenerator.HAS_LABEL_CHECK_NAME, "\t\t        ");
    _builder.append("(sink)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  protected String generateAllowedFlows() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateallowedFlowsSecurityLevel = this.generateallowedFlowsSecurityLevel();
    _builder.append(_generateallowedFlowsSecurityLevel);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateIsFlowAllowedNodes = this.generateIsFlowAllowedNodes();
    _builder.append(_generateIsFlowAllowedNodes);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateallowedFlowsSecurityLevel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate allowedFlows(");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_TYPE_NAME);
    _builder.append(" source, ");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_TYPE_NAME);
    _builder.append(" sink){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<AllowedFlow> _allowedFlows = this.config.getAllowedFlows().getAllowedFlows();
      boolean _hasElements = false;
      for(final AllowedFlow allowedFlow : _allowedFlows) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" or", "\t");
        }
        String _singleAllowedFlow = this.singleAllowedFlow(allowedFlow);
        _builder.append(_singleAllowedFlow, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("or getLevelAsString(source) = getLevelAsString(sink) ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("or exists(SecurityLevel l | allowedFlows(source, l) and allowedFlows(l, sink)) ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("or none()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generateIsFlowAllowedNodes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate isFlowAllowed(DataFlow::Node source, DataFlow::Node sink){");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("allowedFlows(getLabel(source), getLabel(sink))");
    _builder.newLine();
    _builder.append("}   ");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  protected String generateAvailableLabelCheck() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate hasLabel(DataFlow::Node node){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("getLabel(node) != None()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  protected String generateQuery() {
    return this.query.generate();
  }

  @Override
  protected String generateLabelFunction() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateLabellingSupportFunction = this.generateLabellingSupportFunction();
    _builder.append(_generateLabellingSupportFunction);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateLabelingFunction = this.generateLabelingFunction();
    _builder.append(_generateLabelingFunction);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  protected String generateSecurityLevels() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("newtype ");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_TYPE_NAME);
    _builder.append(" = ");
    _builder.newLineIfNotEmpty();
    {
      EList<SecurityLevel> _appliedSecurityLevel = this.config.getAppliedSecurityLevel();
      boolean _hasElements = false;
      for(final SecurityLevel level : _appliedSecurityLevel) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" or", "");
        }
        String _firstUpper = StringExtensions.toFirstUpper(level.getName().replace(";", ""));
        _builder.append(_firstUpper);
        _builder.append("()");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("or None()");
    _builder.newLine();
    return _builder.toString();
  }

  protected String generateLabellingSupportFunction() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateLabelingSupportFunctionForParameter = this.generateLabelingSupportFunctionForParameter();
    _builder.append(_generateLabelingSupportFunctionForParameter);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateLabelingSupportFunctionForField = this.generateLabelingSupportFunctionForField();
    _builder.append(_generateLabelingSupportFunctionForField);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateLabelingSupportFunctionForParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate labelParameter(string className, string methodName, string parameterName, DataFlow::Node node){");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("exists (Class c, Method m, Parameter p | ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("c.contains(m) and ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("c.hasName(className) and ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("m.contains(p) and ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("m.hasName(methodName) and ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("p.hasName(parameterName) ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("and p = node.asParameter()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(") ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generateLabelingSupportFunctionForField() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate labelField(string className, string fieldName, DataFlow::Node node){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("exists(Class c, Field f  | ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("c.hasName(className) and ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("c.contains(f) and");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("f.hasName(fieldName) and ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("node.asExpr().(FieldAccess).getField() = f");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  protected String generateLabelingFunction() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_TYPE_NAME);
    _builder.append(" ");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_FUNCTION_NAME);
    _builder.append("(DataFlow::Node node){");
    _builder.newLineIfNotEmpty();
    {
      EList<SecurityLevelAnnotation> _securityLevelAnnotations = this.config.getSecurityLevelAnnotations();
      boolean _hasElements = false;
      for(final SecurityLevelAnnotation annotation : _securityLevelAnnotations) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" or", "\t");
        }
        _builder.append("\t");
        String _generateSingleParameterLabeling = this.generateSingleParameterLabeling(annotation);
        _builder.append(_generateSingleParameterLabeling, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("or result = None()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String singleAllowedFlow(final AllowedFlow flow) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("source = ");
    String _generateSecurityLevelType = this.generateSecurityLevelType(flow.getFrom());
    _builder.append(_generateSecurityLevelType);
    _builder.append(" and sink = ");
    String _generateSecurityLevelType_1 = this.generateSecurityLevelType(flow.getTo());
    _builder.append(_generateSecurityLevelType_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateSingleParameterLabeling(final SecurityLevelAnnotation anno) {
    if ((anno instanceof ParameterAnnotation)) {
      final String levelString = ((ParameterAnnotation)anno).getSecurityLevel().getName();
      final String className = JavaResolutionUtil.getClassForParameter(this.root, ((ParameterAnnotation)anno).getParameter()).getName();
      final String methodName = JavaResolutionUtil.getMethodContainingParameter(this.root, ((ParameterAnnotation)anno).getParameter()).getName();
      final String parameterName = ((ParameterAnnotation)anno).getParameter().getName();
      return this.generateSingleParameterLabeling(className, methodName, parameterName, ((ParameterAnnotation)anno).getSecurityLevel());
    }
    if ((anno instanceof FieldAnnotation)) {
      final String levelString_1 = ((FieldAnnotation)anno).getSecurityLevel().getName();
      final String className_1 = JavaResolutionUtil.getClassForField(this.root, ((FieldAnnotation)anno).getField()).getName();
      final String fieldName = ((FieldAnnotation)anno).getField().getName();
      return this.generateSingleFieldLabeling(className_1, fieldName, ((FieldAnnotation)anno).getSecurityLevel());
    }
    return null;
  }

  private String generateSingleParameterLabeling(final String className, final String methodName, final String parameterName, final SecurityLevel label) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("labelParameter(\"");
    _builder.append(className);
    _builder.append("\", \"");
    _builder.append(methodName);
    _builder.append("\", \"");
    _builder.append(parameterName);
    _builder.append("\", node) and result = ");
    String _generateSecurityLevelType = this.generateSecurityLevelType(label);
    _builder.append(_generateSecurityLevelType);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateSingleFieldLabeling(final String className, final String fieldName, final SecurityLevel label) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("labelField(\"");
    _builder.append(className);
    _builder.append("\", \"");
    _builder.append(fieldName);
    _builder.append("\", node) and result = ");
    String _generateSecurityLevelType = this.generateSecurityLevelType(label);
    _builder.append(_generateSecurityLevelType);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  @Override
  protected String generateMetaData() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("* @kind path-problem");
    _builder.newLine();
    _builder.append("* @problem.severity warning");
    _builder.newLine();
    _builder.append("* @id ");
    _builder.append(CodeQLTainttrackingCodeGenerator.ID);
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  protected String generatePackageImports() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java");
    _builder.newLine();
    _builder.append("import semmle.code.java.dataflow.TaintTracking");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  protected String generateLevelToStringFunction() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateLevelToString = this.generateLevelToString();
    _builder.append(_generateLevelToString);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateNodeToLevelString = this.generateNodeToLevelString();
    _builder.append(_generateNodeToLevelString);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateLevelToString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("string getLevelAsString(");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_TYPE_NAME);
    _builder.append(" level){");
    _builder.newLineIfNotEmpty();
    {
      EList<SecurityLevel> _appliedSecurityLevel = this.config.getAppliedSecurityLevel();
      boolean _hasElements = false;
      for(final SecurityLevel level : _appliedSecurityLevel) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" or", "\t\t");
        }
        _builder.append("\t\t");
        _builder.append("level = ");
        String _generateSecurityLevelType = this.generateSecurityLevelType(level);
        _builder.append(_generateSecurityLevelType, "\t\t");
        _builder.append(" and result = \"");
        String _name = level.getName();
        _builder.append(_name, "\t\t");
        _builder.append("\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generateNodeToLevelString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("string getNodeLevelAsString(DataFlow::Node node){");
    _builder.newLine();
    _builder.append("\t    \t");
    _builder.append("result = getLevelAsString(getLabel(node))");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generateSecurityLevelType(final SecurityLevel level) {
    StringConcatenation _builder = new StringConcatenation();
    String _firstUpper = StringExtensions.toFirstUpper(level.getName().replace(CodeQLTainttrackingCodeGenerator.SUBLEVEL_DELIMINATOR, ""));
    _builder.append(_firstUpper);
    _builder.append("()");
    return _builder.toString();
  }

  @Override
  protected String generateFunctionCatchingEquality() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("predicate ");
    _builder.append(CodeQLTainttrackingCodeGenerator.CONSIDER_NOT_EQUAL_ELEMENTS);
    _builder.append("(DataFlow::Node node1, DataFlow::Node node2){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("node1.getEnclosingCallable().getDeclaringType().getPackage() != node2.getEnclosingCallable().getDeclaringType().getPackage() ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("or");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("node1.getEnclosingCallable().getDeclaringType().getName() != node2.getEnclosingCallable().getDeclaringType().getName() ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("or ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("node1.asExpr().(FieldAccess).getField().getName() != node2.asExpr().(FieldAccess).getField().getName()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("or ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("node1.getEnclosingCallable().getName() != node2.getEnclosingCallable().getName()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("or node1.asParameter().getName() != node2.asParameter().getName()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  @Override
  protected String generateResultPrinting() {
    StringConcatenation _builder = new StringConcatenation();
    String _generatePrintResult = this.generatePrintResult();
    _builder.append(_generatePrintResult);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generatePrintResultForNode = this.generatePrintResultForNode();
    _builder.append(_generatePrintResultForNode);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generatePrintResultForParameter = this.generatePrintResultForParameter();
    _builder.append(_generatePrintResultForParameter);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generatePrintResultForField = this.generatePrintResultForField();
    _builder.append(_generatePrintResultForField);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generatePrintResult() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("string ");
    _builder.append(CodeQLTainttrackingCodeGenerator.PRINT_RESULT_NAME);
    _builder.append("(");
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathNode source, ");
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathNode sink){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result = ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"(\" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("+ ");
    _builder.append(CodeQLTainttrackingCodeGenerator.PRINT_RESULT_NAME, "    ");
    _builder.append("(source.getNode()) ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("+\"");
    _builder.append(CodeQLTainttrackingCodeGenerator.SYSTEMELEMENT_SECURITYELEMENT_DELIMITER, "    ");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("+ getNodeLevelAsString(source.getNode()) ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("+ \")\" ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("+ \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.SOURCE_SINK_DELIMITER, "    ");
    _builder.append(" (\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("+ ");
    _builder.append(CodeQLTainttrackingCodeGenerator.PRINT_RESULT_NAME, "    ");
    _builder.append("(sink.getNode()) ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("+ \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.SYSTEMELEMENT_SECURITYELEMENT_DELIMITER, "    ");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("+ getNodeLevelAsString(sink.getNode()) ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("+\")\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generatePrintResultForParameter() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("string printParameter(DataFlow::Node node){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("result = node.getEnclosingCallable().getDeclaringType().getPackage() + \".\" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("+ node.getEnclosingCallable().getDeclaringType().getName() + \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.CLASS_METHOD_DELIMITER, "        ");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("+ node.getEnclosingCallable().getName()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("+ \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.METHOD_PARAMETER_DELIMITER, "        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("+ node.asParameter().getName() + \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.SYSTEMELEMENT_TYPE_DELIMITER, "        ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("+ node.asParameter().getType().getName()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generatePrintResultForField() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("string printField(DataFlow::Node node){");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("result = node.getEnclosingCallable().getDeclaringType().getPackage() + \".\" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("+ node.getEnclosingCallable().getDeclaringType().getName() + \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.CLASS_FIELD_DELIMITER, "        ");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("+ node.asExpr().(FieldAccess).getField().getName() + \"");
    _builder.append(CodeQLTainttrackingCodeGenerator.SYSTEMELEMENT_TYPE_DELIMITER, "        ");
    _builder.append("\" ");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("+ node.asExpr().(FieldAccess).getField().getType().getName()");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  private String generatePrintResultForNode() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("string ");
    _builder.append(CodeQLTainttrackingCodeGenerator.PRINT_RESULT_NAME);
    _builder.append("(DataFlow::Node node){");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("result = printField(node) or");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("result = printParameter(node)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
