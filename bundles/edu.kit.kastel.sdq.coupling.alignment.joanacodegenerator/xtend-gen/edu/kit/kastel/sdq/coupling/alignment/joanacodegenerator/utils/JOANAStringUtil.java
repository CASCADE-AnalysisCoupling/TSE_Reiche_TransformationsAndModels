package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils;

import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Lattice;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JOANAStringUtil {
  public static String toCurlyArray(final Collection<String> strings) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final String string : strings) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("{");
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(string);
      }
      if (_hasElements) {
        _builder.append("}");
      }
    }
    return _builder.toString();
  }
  
  public static String generateTags(final Collection<String> tags) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final String tag : tags) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(tag);
      }
    }
    return _builder.toString();
  }
  
  public static String FlowAnnotation_generateTagsEntry(final Collection<String> tags) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tags = ");
    String _curlyArray = JOANAStringUtil.toCurlyArray(tags);
    _builder.append(_curlyArray);
    return _builder.toString();
  }
  
  public static String EntryPoint_generateTagEntry(final String tag) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tag = \"");
    _builder.append(tag);
    _builder.append("\"");
    return _builder.toString();
  }
  
  public static String FlowAnnotation_generateLevelEntry(final String level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("level = \"");
    _builder.append(level);
    _builder.append("\"");
    return _builder.toString();
  }
  
  public static String EntryPoint_generateLevelsEntry(final Collection<Level> levels) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("levels = {");
    _builder.newLine();
    _builder.append("\t");
    {
      boolean _hasElements = false;
      for(final Level level : levels) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(", ");
          String _lineSeparator = System.lineSeparator();
          _builder_1.append(_lineSeparator);
          _builder.appendImmediate(_builder_1.toString(), "\t");
        }
        _builder.append("\"");
        String _name = level.getName();
        _builder.append(_name, "\t");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder.toString();
  }
  
  public static String FlowAnnotation_generateSourcesAnnotation(final Map<Level, Collection<String>> levelToTagsMappings) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<Map.Entry<Level, Collection<String>>> _entrySet = levelToTagsMappings.entrySet();
      boolean _hasElements = false;
      for(final Map.Entry<Level, Collection<String>> entry : _entrySet) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ", "");
        }
        String _FlowAnnotation_generateSourceAnnotation = JOANAStringUtil.FlowAnnotation_generateSourceAnnotation(entry.getKey(), entry.getValue());
        _builder.append(_FlowAnnotation_generateSourceAnnotation);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String FlowAnnotation_generateSourceAnnotation(final Level level, final Collection<String> tags) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Source(");
    String _FlowAnnotation_generateTagsEntry = JOANAStringUtil.FlowAnnotation_generateTagsEntry(tags);
    _builder.append(_FlowAnnotation_generateTagsEntry);
    _builder.append(", ");
    String _FlowAnnotation_generateLevelEntry = JOANAStringUtil.FlowAnnotation_generateLevelEntry(level.getName());
    _builder.append(_FlowAnnotation_generateLevelEntry);
    _builder.append(")");
    return _builder.toString();
  }
  
  public static String FlowAnnotation_generateSinkAnnotation(final Map<Level, Collection<String>> levelToTagsMappings) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Set<Map.Entry<Level, Collection<String>>> _entrySet = levelToTagsMappings.entrySet();
      boolean _hasElements = false;
      for(final Map.Entry<Level, Collection<String>> entry : _entrySet) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" ", "");
        }
        String _FlowAnnotation_generateSinkAnnotation = JOANAStringUtil.FlowAnnotation_generateSinkAnnotation(entry.getKey(), entry.getValue());
        _builder.append(_FlowAnnotation_generateSinkAnnotation);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public static String FlowAnnotation_generateSinkAnnotation(final Level level, final Collection<String> tags) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Sink(");
    String _FlowAnnotation_generateTagsEntry = JOANAStringUtil.FlowAnnotation_generateTagsEntry(tags);
    _builder.append(_FlowAnnotation_generateTagsEntry);
    _builder.append(", ");
    String _FlowAnnotation_generateLevelEntry = JOANAStringUtil.FlowAnnotation_generateLevelEntry(level.getName());
    _builder.append(_FlowAnnotation_generateLevelEntry);
    _builder.append(")");
    return _builder.toString();
  }
  
  public static String EntryPoint_generateMayFlow(final MayFlow mayflow) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@MayFlow(from = \"");
    String _name = mayflow.getFrom().getName();
    _builder.append(_name);
    _builder.append("\", to = \"");
    String _name_1 = mayflow.getTo().getName();
    _builder.append(_name_1);
    _builder.append("\")");
    return _builder.toString();
  }
  
  public static String EntryPoint_generateLattice(final Lattice lattice) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("lattice = {");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<MayFlow> _mayFlow = lattice.getMayFlow();
      boolean _hasElements = false;
      for(final MayFlow mayFlow : _mayFlow) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append(",");
          String _lineSeparator = System.lineSeparator();
          _builder_1.append(_lineSeparator);
          _builder.appendImmediate(_builder_1.toString(), "\t");
        }
        String _EntryPoint_generateMayFlow = JOANAStringUtil.EntryPoint_generateMayFlow(mayFlow);
        _builder.append(_EntryPoint_generateMayFlow, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    return _builder.toString();
  }
  
  public static String EntryPoint_generateEntryPoint(final EntryPoint entryPoint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@EntryPoint(");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("tag = \"");
    String _id = entryPoint.getId();
    _builder.append(_id, "\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _EntryPoint_generateLevelsEntry = JOANAStringUtil.EntryPoint_generateLevelsEntry(entryPoint.getLevel());
    _builder.append(_EntryPoint_generateLevelsEntry, "\t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _EntryPoint_generateLattice = JOANAStringUtil.EntryPoint_generateLattice(entryPoint.getLattice());
    _builder.append(_EntryPoint_generateLattice, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static String EntryPoint_generateEntryPoints(final Collection<EntryPoint> entryPoints) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final EntryPoint entryPoint : entryPoints) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          String _lineSeparator = System.lineSeparator();
          _builder.appendImmediate(_lineSeparator, "");
        }
        String _EntryPoint_generateEntryPoint = JOANAStringUtil.EntryPoint_generateEntryPoint(entryPoint);
        _builder.append(_EntryPoint_generateEntryPoint);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
