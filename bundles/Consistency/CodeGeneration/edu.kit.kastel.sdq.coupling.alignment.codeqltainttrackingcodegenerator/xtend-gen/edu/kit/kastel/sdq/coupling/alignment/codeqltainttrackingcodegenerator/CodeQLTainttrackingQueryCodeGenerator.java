package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator;

import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeQLTainttrackingQueryCodeGenerator extends CodeQLQueryTemplate {
  public static final String SOURCE_NAME = "source";

  public static final String SINK_NAME = "sink";

  @Override
  public String generateSelectClause() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SINK_NAME);
    _builder.append(".getNode(), ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SOURCE_NAME);
    _builder.append(", ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SINK_NAME);
    _builder.append(", ");
    String _generateMessage = this.generateMessage();
    _builder.append(_generateMessage);
    return _builder.toString();
  }

  @Override
  public String generateWhereClause() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateFlowPath = this.generateFlowPath();
    _builder.append(_generateFlowPath);
    _builder.append(" and ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SOURCE_NAME);
    _builder.append(" != ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SINK_NAME);
    _builder.append(" and ");
    String _generateNotAllowedFlow = this.generateNotAllowedFlow();
    _builder.append(_generateNotAllowedFlow);
    _builder.append(" and ");
    String _generateNotEqualElementsCheck = this.generateNotEqualElementsCheck();
    _builder.append(_generateNotEqualElementsCheck);
    return _builder.toString();
  }

  @Override
  public String generateFromClause() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathNode ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SOURCE_NAME);
    _builder.append(", ");
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathNode ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SINK_NAME);
    return _builder.toString();
  }

  public String generateHasLabelCheck(final String element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.HAS_LABEL_CHECK_NAME);
    _builder.append("(");
    _builder.append(element);
    _builder.append(")");
    return _builder.toString();
  }

  public String generateNotAllowedFlow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("not isFlowAllowed(");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SOURCE_NAME);
    _builder.append(".getNode(), ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SINK_NAME);
    _builder.append(".getNode())");
    return _builder.toString();
  }

  public String generateFlowPath() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::flowPath(");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SOURCE_NAME);
    _builder.append(", ");
    _builder.append(CodeQLTainttrackingQueryCodeGenerator.SINK_NAME);
    _builder.append(")");
    return _builder.toString();
  }

  public String generateMessage() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.PRINT_RESULT_NAME);
    _builder.append("(source, sink)");
    return _builder.toString();
  }

  public String generateNotEqualElementsCheck() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("notEqualElements(source.getNode(), sink.getNode())");
    return _builder.toString();
  }
}
