package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils;

import java.util.Collection;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class JOANAStringUtil {
  public String concatLevels(final Collection<String> levels) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final String level : levels) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("", "");
        }
        String _firstUpper = StringExtensions.toFirstUpper(level);
        _builder.append(_firstUpper);
      }
    }
    return _builder.toString();
  }

  public String toCurlyArray(final Collection<String> strings) {
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

  public String generateTags(final Collection<String> tags) {
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

  public String FlowAnnotation_generateTagsEntry(final Collection<String> tags) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tags = ");
    String _curlyArray = this.toCurlyArray(tags);
    _builder.append(_curlyArray);
    return _builder.toString();
  }

  public String EntryPoint_generateTagEntry(final String tag) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tag = \"");
    _builder.append(tag);
    _builder.append("\"");
    return _builder.toString();
  }

  public String FlowAnnotation_generateLevelEntry(final Collection<String> levels) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("level = \"");
    String _concatLevels = this.concatLevels(levels);
    _builder.append(_concatLevels);
    _builder.append("\"");
    return _builder.toString();
  }

  public String FlowAnnotation_generateLevelEntry(final String level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("level = \"");
    _builder.append(level);
    _builder.append("\"");
    return _builder.toString();
  }

  public String EntryPoint_generateLevelEntry(final Collection<String> levels) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("levels = ");
    String _curlyArray = this.toCurlyArray(levels);
    _builder.append(_curlyArray);
    return _builder.toString();
  }

  public String FlowAnnotation_generateSourceAnnotation(final Collection<String> tags, final Collection<String> levels) {
    final String level = this.concatLevels(levels);
    return this.FlowAnnotation_generateSourceAnnotation(tags, level);
  }

  public String FlowAnnotation_generateSourceAnnotation(final Collection<String> tags, final String level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Source(");
    String _FlowAnnotation_generateTagsEntry = this.FlowAnnotation_generateTagsEntry(tags);
    _builder.append(_FlowAnnotation_generateTagsEntry);
    _builder.append(", ");
    String _FlowAnnotation_generateLevelEntry = this.FlowAnnotation_generateLevelEntry(level);
    _builder.append(_FlowAnnotation_generateLevelEntry);
    _builder.append(")");
    return _builder.toString();
  }

  public String FlowAnnotation_generateSinkAnnotation(final Collection<String> tags, final Collection<String> levels) {
    final String level = this.concatLevels(levels);
    return this.FlowAnnotation_generateSinkAnnotation(tags, level);
  }

  public String FlowAnnotation_generateSinkAnnotation(final Collection<String> tags, final String level) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Sink(");
    String _FlowAnnotation_generateTagsEntry = this.FlowAnnotation_generateTagsEntry(tags);
    _builder.append(_FlowAnnotation_generateTagsEntry);
    _builder.append(", ");
    String _FlowAnnotation_generateLevelEntry = this.FlowAnnotation_generateLevelEntry(level);
    _builder.append(_FlowAnnotation_generateLevelEntry);
    _builder.append(")");
    return _builder.toString();
  }

  public String EntryPoint_generateMayFlow(final String from, final String to) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@MayFlow(from = \"");
    _builder.append(from);
    _builder.append("\", to = \"");
    _builder.append(to);
    _builder.append("\")");
    return _builder.toString();
  }

  public String EntryPoint_generateMayFlow(final Collection<String> from, final Collection<String> to) {
    final String conFrom = this.concatLevels(from);
    final String conTo = this.concatLevels(to);
    return this.EntryPoint_generateMayFlow(conFrom, conTo);
  }

  public String EntryPoint_generateLattice(final Collection<String> mayFlows) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("lattice = ");
    String _curlyArray = this.toCurlyArray(mayFlows);
    _builder.append(_curlyArray);
    return _builder.toString();
  }
}
