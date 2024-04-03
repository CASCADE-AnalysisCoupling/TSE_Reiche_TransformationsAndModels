package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators;

import com.google.common.collect.Iterables;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.ClassOrInterfaceTypeGenerationTemplate;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Source;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JOANAClassOrInterfaceTypeCodeGenerator extends ClassOrInterfaceTypeGenerationTemplate {
  private final MethodGenerationTemplate methodGenerator;

  private JOANARoot joanaRoot;

  public JOANAClassOrInterfaceTypeCodeGenerator(final JavaRoot javaRoot, final JOANARoot joanaRoot) {
    this.javaRoot = javaRoot;
    this.joanaRoot = joanaRoot;
    JOANAMethodCodeGenerator _jOANAMethodCodeGenerator = new JOANAMethodCodeGenerator(javaRoot, joanaRoot);
    this.methodGenerator = _jOANAMethodCodeGenerator;
  }

  @Override
  protected String generateImports() {
    String collectionImport = "";
    String joanaUIImports = "";
    final Function1<EntryPoint, Boolean> _function = (EntryPoint ep) -> {
      return Boolean.valueOf(super.currentClassOrInterface.getMethod().contains(ep.getMethodIdentification().getMethod()));
    };
    final Function1<EntryPoint, Boolean> _function_1 = (EntryPoint ep) -> {
      int _size = ep.getAnnotation().size();
      return Boolean.valueOf((_size != 0));
    };
    final Function1<EntryPoint, Boolean> _function_2 = (EntryPoint ep) -> {
      final Function1<InformationFlowAnnotation, Boolean> _function_3 = (InformationFlowAnnotation an) -> {
        return Boolean.valueOf((an instanceof Source));
      };
      return Boolean.valueOf(IterableExtensions.<InformationFlowAnnotation>exists(ep.getAnnotation(), _function_3));
    };
    final Iterable<EntryPoint> entryPointsWithSourceAnnotations = IterableExtensions.<EntryPoint>filter(IterableExtensions.<EntryPoint>filter(IterableExtensions.<EntryPoint>filter(this.joanaRoot.getEntrypoint(), _function), _function_1), _function_2);
    boolean _isEmpty = IterableExtensions.isEmpty(entryPointsWithSourceAnnotations);
    final boolean targetedByJOANA = (!_isEmpty);
    if (((this.currentClassOrInterface instanceof edu.kit.kastel.sdq.coupling.models.java.types.Class) && targetedByJOANA)) {
      joanaUIImports = "import edu.kit.joana.ui.annotations.*;";
    }
    final Collection<Type> types = JavaResolutionUtil.getAllNonPrimitiveTypes(this.currentClassOrInterface);
    boolean _isEmpty_1 = IterableExtensions.isEmpty(Iterables.<CollectionType>filter(types, CollectionType.class));
    boolean _not = (!_isEmpty_1);
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
        String _generateMethod = this.generateMethod(method, this.currentClassOrInterface);
        _builder.append(_generateMethod);
      }
    }
    return _builder.toString();
  }

  private String generateMethod(final Method method, final ClassOrInterfaceType parent) {
    this.methodGenerator.setCurrentMethod(method);
    this.methodGenerator.setParent(parent);
    return this.methodGenerator.generate();
  }
}
