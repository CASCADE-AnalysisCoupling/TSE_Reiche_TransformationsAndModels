package edu.kit.kastel.sdq.coupling.alignment.codeqltainttrackingcodegenerator.utils;

import com.google.common.collect.Iterables;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter;
import java.util.Collection;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CodeQLGeneratorUtils {
  public static edu.kit.kastel.sdq.coupling.models.codeql.code.Class getClassForParameter(final CodeRoot root, final Parameter p) {
    List<edu.kit.kastel.sdq.coupling.models.codeql.code.Class> classes = IterableExtensions.<edu.kit.kastel.sdq.coupling.models.codeql.code.Class>toList(Iterables.<edu.kit.kastel.sdq.coupling.models.codeql.code.Class>filter(root.getTypes(), edu.kit.kastel.sdq.coupling.models.codeql.code.Class.class));
    final Function1<edu.kit.kastel.sdq.coupling.models.codeql.code.Class, Boolean> _function = (edu.kit.kastel.sdq.coupling.models.codeql.code.Class c) -> {
      Method _methodContainingParameter = CodeQLGeneratorUtils.getMethodContainingParameter(c.getMethods(), p);
      return Boolean.valueOf((_methodContainingParameter != null));
    };
    edu.kit.kastel.sdq.coupling.models.codeql.code.Class clazz = IterableExtensions.<edu.kit.kastel.sdq.coupling.models.codeql.code.Class>findFirst(classes, _function);
    return clazz;
  }
  
  public static Method getMethodContainingParameter(final Collection<Method> methods, final Parameter toSearch) {
    final Function1<Method, Boolean> _function = (Method m) -> {
      return Boolean.valueOf(m.getParameters().contains(toSearch));
    };
    return IterableExtensions.<Method>findFirst(methods, _function);
  }
  
  public static Method getMethodContainingParameter(final CodeRoot root, final Parameter p) {
    List<edu.kit.kastel.sdq.coupling.models.codeql.code.Class> classes = IterableExtensions.<edu.kit.kastel.sdq.coupling.models.codeql.code.Class>toList(Iterables.<edu.kit.kastel.sdq.coupling.models.codeql.code.Class>filter(root.getTypes(), edu.kit.kastel.sdq.coupling.models.codeql.code.Class.class));
    for (final edu.kit.kastel.sdq.coupling.models.codeql.code.Class clazz : classes) {
      {
        Method method = CodeQLGeneratorUtils.getMethodContainingParameter(clazz.getMethods(), p);
        if ((method != null)) {
          return method;
        }
      }
    }
    return null;
  }
}
