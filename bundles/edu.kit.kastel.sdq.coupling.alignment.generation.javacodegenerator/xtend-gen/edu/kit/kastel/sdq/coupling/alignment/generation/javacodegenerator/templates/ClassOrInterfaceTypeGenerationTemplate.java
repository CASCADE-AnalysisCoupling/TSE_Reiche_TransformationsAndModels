package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates;

import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class ClassOrInterfaceTypeGenerationTemplate {
  protected ClassOrInterfaceType currentClassOrInterface;
  
  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    String _generatePackageDeclaration = this.generatePackageDeclaration();
    _builder.append(_generatePackageDeclaration);
    _builder.newLineIfNotEmpty();
    String _generateImports = this.generateImports();
    _builder.append(_generateImports);
    _builder.newLineIfNotEmpty();
    String _generateDeclaration = this.generateDeclaration();
    _builder.append(_generateDeclaration);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateFields = this.generateFields();
    _builder.append(_generateFields, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateConstructors = this.generateConstructors();
    _builder.append(_generateConstructors, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateMethods = this.generateMethods();
    _builder.append(_generateMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder.toString();
  }
  
  protected abstract String generatePackageDeclaration();
  
  protected abstract String generateImports();
  
  protected abstract String generateDeclaration();
  
  protected abstract String generateConstructors();
  
  protected abstract String generateFields();
  
  protected abstract String generateMethods();
  
  public ClassOrInterfaceType setClassOrInterfaceType(final ClassOrInterfaceType coi) {
    return this.currentClassOrInterface = coi;
  }
  
  public ClassOrInterfaceType getClassOrInterfaceType() {
    return this.currentClassOrInterface;
  }
}
