package edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates;

import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.Filter;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.java.types.Interface;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public abstract class ClassOrInterfaceTypeGenerationTemplate {
  protected ClassOrInterfaceType currentClassOrInterface;

  protected JavaRoot javaRoot;

  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _checkFilterList = Filter.checkFilterList(this.currentClassOrInterface.getName());
      boolean _not = (!_checkFilterList);
      if (_not) {
        _builder.append("\t");
        String _generatePackageDeclaration = this.generatePackageDeclaration();
        _builder.append(_generatePackageDeclaration, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        String _generateImports = this.generateImports();
        _builder.append(_generateImports, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        String _generateDeclaration = this.generateDeclaration();
        _builder.append(_generateDeclaration, "\t");
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          if ((this.currentClassOrInterface instanceof edu.kit.kastel.sdq.coupling.models.java.types.Class)) {
            _builder.append("\t");
            String _generateFields = this.generateFields();
            _builder.append(_generateFields, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            String _generateConstructors = this.generateConstructors();
            _builder.append(_generateConstructors, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        String _generateMethods = this.generateMethods();
        _builder.append(_generateMethods, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
      }
    }
    return _builder.toString();
  }

  protected String generatePackageDeclaration() {
    final List<edu.kit.kastel.sdq.coupling.models.java.Package> packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(this.javaRoot, this.currentClassOrInterface);
    return String.format("package %s;", JavaResolutionUtil.creatyFullPackagePathFromParts(packagePath));
  }

  protected abstract String generateImports();

  protected String generateDeclaration() {
    if ((this.currentClassOrInterface instanceof Interface)) {
      return this.generateInterfaceDeclaration(((Interface) this.currentClassOrInterface));
    } else {
      if ((this.currentClassOrInterface instanceof edu.kit.kastel.sdq.coupling.models.java.types.Class)) {
        return this.generateClassDeclaration(((edu.kit.kastel.sdq.coupling.models.java.types.Class) this.currentClassOrInterface));
      }
    }
    return "";
  }

  protected String generateConstructors() {
    final edu.kit.kastel.sdq.coupling.models.java.types.Class clazz = ((edu.kit.kastel.sdq.coupling.models.java.types.Class) this.currentClassOrInterface);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = this.currentClassOrInterface.getName();
    _builder.append(_name);
    _builder.append("(");
    String _generateConstructorParameters = this.generateConstructorParameters(clazz);
    _builder.append(_generateConstructorParameters);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateConstructorBody = this.generateConstructorBody(clazz);
    _builder.append(_generateConstructorBody, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }

  protected String generateFields() {
    final edu.kit.kastel.sdq.coupling.models.java.types.Class castedClass = ((edu.kit.kastel.sdq.coupling.models.java.types.Class) this.currentClassOrInterface);
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Field> _field = castedClass.getField();
      boolean _hasElements = false;
      for(final Field field : _field) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          String _lineSeparator = System.lineSeparator();
          _builder.appendImmediate(_lineSeparator, "");
        }
        String _generateField = this.generateField(field);
        _builder.append(_generateField);
      }
    }
    return _builder.toString();
  }

  protected abstract String generateMethods();

  public ClassOrInterfaceType setClassOrInterfaceType(final ClassOrInterfaceType coi) {
    return this.currentClassOrInterface = coi;
  }

  public ClassOrInterfaceType getClassOrInterfaceType() {
    return this.currentClassOrInterface;
  }

  public JavaRoot setJavaRoot(final JavaRoot javaRoot) {
    return this.javaRoot = javaRoot;
  }

  public JavaRoot getJavaRoot() {
    return this.javaRoot;
  }

  private String generateInterfaceDeclaration(final Interface interf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface ");
    String _name = interf.getName();
    _builder.append(_name);
    return _builder.toString();
  }

  private String generateClassDeclaration(final edu.kit.kastel.sdq.coupling.models.java.types.Class clazz) {
    final ArrayList<ClassOrInterfaceType> extendsRelations = new ArrayList<ClassOrInterfaceType>();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = clazz.getName();
    _builder.append(_name);
    {
      int _size = extendsRelations.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append(" extends ");
        String _name_1 = extendsRelations.get(0).getName();
        _builder.append(_name_1);
      }
    }
    {
      int _size_1 = clazz.getImplements().size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append(" implements ");
        {
          EList<Interface> _implements = clazz.getImplements();
          boolean _hasElements = false;
          for(final Interface interf : _implements) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _name_2 = interf.getName();
            _builder.append(_name_2);
          }
        }
      }
    }
    return _builder.toString();
  }

  private String generateConstructorParameters(final edu.kit.kastel.sdq.coupling.models.java.types.Class clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Field> _field = clazz.getField();
      boolean _hasElements = false;
      for(final Field field : _field) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name = field.getType().getName();
        _builder.append(_name);
        _builder.append(" ");
        String _name_1 = field.getName();
        _builder.append(_name_1);
      }
    }
    return _builder.toString();
  }

  private String generateConstructorBody(final edu.kit.kastel.sdq.coupling.models.java.types.Class clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Field> _field = clazz.getField();
      boolean _hasElements = false;
      for(final Field field : _field) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          String _lineSeparator = System.lineSeparator();
          _builder.appendImmediate(_lineSeparator, "");
        }
        _builder.append("this.");
        String _name = field.getName();
        _builder.append(_name);
        _builder.append(" = ");
        String _name_1 = field.getName();
        _builder.append(_name_1);
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("//TODO: Complete constructor");
    _builder.newLine();
    return _builder.toString();
  }

  protected String generateField(final Field field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = field.getType().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _name_1 = field.getName();
    _builder.append(_name_1);
    _builder.append(";");
    return _builder.toString();
  }
}
