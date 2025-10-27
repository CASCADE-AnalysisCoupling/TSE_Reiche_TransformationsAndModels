package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.templates;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class CodeQLQueryTemplate {
  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from ");
    String _generateFromClause = this.generateFromClause();
    _builder.append(_generateFromClause);
    _builder.newLineIfNotEmpty();
    _builder.append("where ");
    String _generateWhereClause = this.generateWhereClause();
    _builder.append(_generateWhereClause);
    _builder.newLineIfNotEmpty();
    _builder.append("select ");
    String _generateSelectClause = this.generateSelectClause();
    _builder.append(_generateSelectClause);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected abstract String generateSelectClause();

  protected abstract String generateWhereClause();

  protected abstract String generateFromClause();
}
