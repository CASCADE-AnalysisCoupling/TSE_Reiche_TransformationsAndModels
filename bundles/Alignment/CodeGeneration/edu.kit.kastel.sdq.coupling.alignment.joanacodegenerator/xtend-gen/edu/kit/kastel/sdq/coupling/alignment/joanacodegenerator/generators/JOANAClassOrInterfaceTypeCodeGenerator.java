package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators;

import com.google.common.collect.Iterables;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.ClassOrInterfaceTypeGenerationTemplate;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAMethodCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import edu.kit.kastel.sdq.coupling.models.java.types.Interface;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JOANAClassOrInterfaceTypeCodeGenerator extends ClassOrInterfaceTypeGenerationTemplate {
  private final JavaRoot javaRoot;
  
  private final MethodGenerationTemplate methodGenerator;
  
  public JOANAClassOrInterfaceTypeCodeGenerator(final JavaRoot javaRoot, final JOANARoot joanaRoot) {
    this.javaRoot = javaRoot;
    JOANAMethodCodeGenerator _jOANAMethodCodeGenerator = new JOANAMethodCodeGenerator(javaRoot, joanaRoot);
    this.methodGenerator = _jOANAMethodCodeGenerator;
  }
  
  @Override
  protected String generatePackageDeclaration() {
    final List<edu.kit.kastel.sdq.coupling.models.java.Package> packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(this.javaRoot, this.currentClassOrInterface);
    return JavaResolutionUtil.createFullyQualifiedPath(packagePath, this.currentClassOrInterface);
  }
  
  @Override
  protected String generateImports() {
    String collectionImport = "";
    final String joanaUIImports = "import edu.kit.joana.ui.annotations.*;";
    final Collection<Type> types = JavaResolutionUtil.getAllNonPrimitiveTypes(this.currentClassOrInterface);
    boolean _isEmpty = IterableExtensions.isEmpty(Iterables.<CollectionType>filter(types, CollectionType.class));
    boolean _not = (!_isEmpty);
    if (_not) {
      collectionImport = "import java.util.Collection;";
    }
    final List<ClassOrInterfaceType> classOrInterfaceTypes = IterableExtensions.<ClassOrInterfaceType>toList(Iterables.<ClassOrInterfaceType>filter(types, ClassOrInterfaceType.class));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(joanaUIImports);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append(collectionImport);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      boolean _hasElements = false;
      for(final ClassOrInterfaceType classOrInterfaceType : classOrInterfaceTypes) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          String _lineSeparator = System.lineSeparator();
          _builder.appendImmediate(_lineSeparator, "");
        }
        _builder.append("import ");
        String _createFullyQualifiedPath = JavaResolutionUtil.createFullyQualifiedPath(this.javaRoot, classOrInterfaceType);
        _builder.append(_createFullyQualifiedPath);
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Override
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
              _builder.appendImmediate("\' ", "");
            }
            String _name_2 = interf.getName();
            _builder.append(_name_2);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  @Override
  protected String generateConstructors() {
    if ((this.currentClassOrInterface instanceof Interface)) {
      return "";
    }
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
    return _builder.toString();
  }
  
  @Override
  protected String generateFields() {
    if ((this.currentClassOrInterface instanceof Interface)) {
      return "";
    }
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
  
  @Override
  protected String generateMethods() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Method> _method = this.currentClassOrInterface.getMethod();
      boolean _hasElements = false;
      for(final Method method : _method) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          String _lineSeparator = System.lineSeparator();
          _builder.appendImmediate(_lineSeparator, "");
        }
        String _generateMethod = this.generateMethod(method);
        _builder.append(_generateMethod);
      }
    }
    return _builder.toString();
  }
  
  private String generateField(final Field field) {
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
  
  private String generateMethod(final Method method) {
    this.methodGenerator.setCurrentMethod(method);
    return this.methodGenerator.generate();
  }
}
