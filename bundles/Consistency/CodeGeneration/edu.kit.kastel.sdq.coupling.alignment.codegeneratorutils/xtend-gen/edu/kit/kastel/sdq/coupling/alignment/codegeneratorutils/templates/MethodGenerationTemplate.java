package edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.templates;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class MethodGenerationTemplate {
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateComments = this.generateComments();
    _builder.append(_generateComments);
    _builder.newLineIfNotEmpty();
    String _generateHeader = this.generateHeader();
    _builder.append(_generateHeader);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateBody = this.generateBody();
    _builder.append(_generateBody, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }

  protected abstract String generateComments();

  protected abstract String generateHeader();

  protected abstract String generateBody();
}
