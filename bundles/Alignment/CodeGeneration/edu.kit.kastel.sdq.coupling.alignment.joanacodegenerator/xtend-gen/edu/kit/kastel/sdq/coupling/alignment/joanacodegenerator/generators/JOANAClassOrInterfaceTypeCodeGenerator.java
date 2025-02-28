package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators;

import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.ClassOrInterfaceTypeGenerationTemplate;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method filter((Object)=>boolean) is undefined for the type EList<EntryPoint>"
      + "\nThe method or field methodIdentification is undefined for the type Object"
      + "\nThe method or field annotation is undefined for the type Object"
      + "\nThe method or field annotation is undefined for the type Object"
      + "\nThe method filter(Class<CollectionType>) is undefined for the type Collection<Type>"
      + "\nThe method filter(Class<ClassOrInterfaceType>) is undefined for the type Collection<Type>"
      + "\nType mismatch: cannot convert from EList<Method> to boolean[]"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nmethod cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nexists cannot be resolved"
      + "\nisEmpty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\ntoList cannot be resolved");
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
