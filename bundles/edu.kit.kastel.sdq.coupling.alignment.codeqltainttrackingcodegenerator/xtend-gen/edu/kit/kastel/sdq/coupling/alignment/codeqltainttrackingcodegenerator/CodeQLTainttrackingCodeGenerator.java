package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator;

import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLTainttrackingTemplate;
import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.utils.CodeQLGeneratorUtils;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.Configuration;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.ParameterAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
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

  private final CodeQLQueryTemplate query;

  private final Configuration config;

  private final CodeRoot root;

  public CodeQLTainttrackingCodeGenerator(final CodeRoot root, final Configuration config) {
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
    _builder.append("predicate isAllowedFlow(DataFlow::Node source, DataFlow::Node sink){");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<AllowedFlow> _allowedFlows = this.config.getAllowedFlows();
      boolean _hasElements = false;
      for(final AllowedFlow allowedFlow : _allowedFlows) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("or \n", "\t");
        }
        String _singleAllowedFlow = this.singleAllowedFlow(allowedFlow);
        _builder.append(_singleAllowedFlow, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
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
    _builder.append("newtype SecurityLevel = ");
    _builder.newLine();
    {
      EList<SecurityLevel> _appliedSecurityLevel = this.config.getAppliedSecurityLevel();
      boolean _hasElements = false;
      for(final SecurityLevel level : _appliedSecurityLevel) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("or ", "");
        }
        String _firstUpper = StringExtensions.toFirstUpper(level.getEntityName());
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
    _builder.append("bindingset[className, methodName, parameterName]");
    _builder.newLine();
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

  protected String generateLabelingFunction() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SecurityLevel ");
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
          _builder.appendImmediate("\n or \n", "\t");
        }
        _builder.append("\t");
        String _generateSingleLabelling = this.generateSingleLabelling(annotation);
        _builder.append(_generateSingleLabelling, "\t");
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
    _builder.append("getLabel(source) = ");
    String _firstUpper = StringExtensions.toFirstUpper(flow.getFrom().getEntityName());
    _builder.append(_firstUpper);
    _builder.append("() and getLabel(sink) = ");
    String _firstUpper_1 = StringExtensions.toFirstUpper(flow.getTo().getEntityName());
    _builder.append(_firstUpper_1);
    _builder.append("()");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  private String generateSingleLabelling(final SecurityLevelAnnotation anno) {
    if ((anno instanceof ParameterAnnotation)) {
      final String levelString = ((ParameterAnnotation)anno).getSecurityLevel().getEntityName();
      final String className = CodeQLGeneratorUtils.getClassForParameter(this.root, ((ParameterAnnotation)anno).getParameter()).getEntityName();
      final String methodName = CodeQLGeneratorUtils.getMethodContainingParameter(this.root, ((ParameterAnnotation)anno).getParameter()).getEntityName();
      final String parameterName = ((ParameterAnnotation)anno).getParameter().getEntityName();
      return this.generateSingleLabelling(className, methodName, parameterName, levelString);
    }
    return null;
  }

  private String generateSingleLabelling(final String className, final String methodName, final String parameterName, final String label) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("labelParameter(\"");
    _builder.append(className);
    _builder.append("\", \"");
    _builder.append(methodName);
    _builder.append("\", \"");
    _builder.append(parameterName);
    _builder.append("\", node) and result = ");
    String _firstUpper = StringExtensions.toFirstUpper(label);
    _builder.append(_firstUpper);
    _builder.append("() ");
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
    _builder.append("* @problem.severity warnining");
    _builder.newLine();
    _builder.append("* @id ");
    _builder.append(CodeQLTainttrackingCodeGenerator.ID);
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    return _builder.toString();
  }
}
