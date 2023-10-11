package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator;

import edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates.CodeQLQueryTemplate;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CodeQLTainttrackingQueryCodeGenerator extends CodeQLQueryTemplate {
  private final String SOURCE_NAME = "source";

  private final String SINK_NAME = "sink";

  @Override
  public String generateSelectClause() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathNode ");
    _builder.append(this.SOURCE_NAME);
    _builder.append(", ");
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::PathNode ");
    _builder.append(this.SINK_NAME);
    return _builder.toString();
  }

  @Override
  public String generateWhereClause() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateFlowPath = this.generateFlowPath();
    _builder.append(_generateFlowPath);
    _builder.append(" and ");
    _builder.append(this.SOURCE_NAME);
    _builder.append(" != ");
    _builder.append(this.SINK_NAME);
    _builder.append(" and ");
    String _generateHasLabelCheck = this.generateHasLabelCheck(this.SOURCE_NAME);
    _builder.append(_generateHasLabelCheck);
    _builder.append(" and ");
    String _generateHasLabelCheck_1 = this.generateHasLabelCheck(this.SINK_NAME);
    _builder.append(_generateHasLabelCheck_1);
    _builder.append(" and ");
    String _generateNotAllowedFlow = this.generateNotAllowedFlow();
    _builder.append(_generateNotAllowedFlow);
    return _builder.toString();
  }

  @Override
  public String generateFromClause() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.SINK_NAME);
    _builder.append(".getNode(), ");
    _builder.append(this.SOURCE_NAME);
    _builder.append(", ");
    _builder.append(this.SINK_NAME);
    _builder.append(", \"Found Flow\"");
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
    _builder.append("not allowedFlow(");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_FUNCTION_NAME);
    _builder.append("(");
    _builder.append(this.SOURCE_NAME);
    _builder.append(".getNode()), ");
    _builder.append(CodeQLTainttrackingCodeGenerator.LABEL_FUNCTION_NAME);
    _builder.append("(");
    _builder.append(this.SINK_NAME);
    _builder.append(".getNode()))");
    return _builder.toString();
  }

  public String generateFlowPath() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CodeQLTainttrackingCodeGenerator.MODULE_NAME);
    _builder.append("::flowPath(");
    _builder.append(this.SOURCE_NAME);
    _builder.append(", ");
    _builder.append(this.SINK_NAME);
    _builder.append(")");
    return _builder.toString();
  }
}
