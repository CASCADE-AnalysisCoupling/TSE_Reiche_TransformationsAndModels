package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates;

import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.Filter;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class MethodGenerationTemplate {
  protected Method currentMethod;

  protected ClassOrInterfaceType parent;

  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateAnnotationsAndComments = this.generateAnnotationsAndComments();
    _builder.append(_generateAnnotationsAndComments);
    _builder.newLineIfNotEmpty();
    String _generateHeader = this.generateHeader();
    _builder.append(_generateHeader);
    {
      if ((this.parent instanceof edu.kit.kastel.sdq.coupling.models.java.types.Class)) {
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateBody = this.generateBody();
        _builder.append(_generateBody, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
      } else {
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  protected String generateAnnotationsAndComments() {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }

  protected String generateHeader() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    {
      Type _returntype = this.currentMethod.getReturntype();
      boolean _tripleNotEquals = (_returntype != null);
      if (_tripleNotEquals) {
        String _name = this.currentMethod.getReturntype().getName();
        _builder.append(_name);
      } else {
        _builder.append("void");
      }
    }
    _builder.append(" ");
    String _name_1 = this.currentMethod.getName();
    _builder.append(_name_1);
    _builder.append(" (");
    String _generateParameters = this.generateParameters();
    _builder.append(_generateParameters);
    _builder.append(")");
    return _builder.toString();
  }

  protected String generateParameters() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Parameter> _parameter = this.currentMethod.getParameter();
      boolean _hasElements = false;
      for(final Parameter parameter : _parameter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _generateParameter = this.generateParameter(parameter);
        _builder.append(_generateParameter);
      }
    }
    return _builder.toString();
  }

  protected String generateParameter(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateAnnotations = this.generateAnnotations(parameter);
    _builder.append(_generateAnnotations);
    String _generateParameterTypeName = this.generateParameterTypeName(parameter);
    _builder.append(_generateParameterTypeName);
    _builder.append(" ");
    String _name = parameter.getName();
    _builder.append(_name);
    return _builder.toString();
  }

  protected String generateAnnotations(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }

  protected String generateBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO: auto-generated method stub");
    return _builder.toString();
  }

  public void setCurrentMethod(final Method newMethod) {
    this.currentMethod = newMethod;
  }

  protected String generateParameterTypeName(final Parameter parameter) {
    boolean _contains = parameter.getType().getName().contains(Filter.ARRAY_MARKER);
    if (_contains) {
      String[] parts = parameter.getType().getName().split("Array", (-1));
      int _length = parts.length;
      final int count = (_length - 1);
      String name = parameter.getType().getName().split("_")[0];
      for (int i = 0; (i < count); i++) {
        name = (name + "[]");
      }
      return name;
    } else {
      if ((((parameter.getType().getName().contains(Filter.INTERFACE_MARKER) || 
        parameter.getType().getName().contains(Filter.CLASS_MARKER)) || parameter.getType().getName().contains(Filter.PRIMITIVE_MARKER)) || parameter.getType().getName().contains(Filter.REMOTE_CLASS_MARKER))) {
        return parameter.getType().getName().split("_")[0];
      } else {
        return parameter.getType().getName();
      }
    }
  }

  public Method getCurrentMethod() {
    return this.currentMethod;
  }

  public void setParent(final ClassOrInterfaceType parent) {
    this.parent = parent;
  }

  public ClassOrInterfaceType getParent() {
    return this.parent;
  }
}
