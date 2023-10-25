package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators;

import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils.JOANAResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils.JOANAStringUtil;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.InformationFlowAnnotation;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.Sink;
import edu.kit.kastel.sdq.coupling.models.joana.Source;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class JOANAMethodCodeGenerator extends MethodGenerationTemplate {
  private final JOANARoot joanaRoot;
  
  public JOANAMethodCodeGenerator(final JavaRoot javaRoot, final JOANARoot joanaRoot) {
    this.joanaRoot = joanaRoot;
  }
  
  @Override
  protected String generateAnnotationsAndComments() {
    return JOANAStringUtil.EntryPoint_generateEntryPoints(JOANAResolutionUtil.getEntryPointsForMethod(this.joanaRoot, this.currentMethod));
  }
  
  @Override
  protected String generateAnnotations(final Parameter parameter) {
    final Collection<Source> sources = JOANAResolutionUtil.getSourcesForParameter(this.joanaRoot, parameter);
    final Collection<Sink> sinks = JOANAResolutionUtil.getSinksForParameter(this.joanaRoot, parameter);
    final Function1<Source, InformationFlowAnnotation> _function = (Source source) -> {
      return ((InformationFlowAnnotation) source);
    };
    final List<InformationFlowAnnotation> annotSources = IterableExtensions.<InformationFlowAnnotation>toList(IterableExtensions.<Source, InformationFlowAnnotation>map(sources, _function));
    final Function1<Sink, InformationFlowAnnotation> _function_1 = (Sink sink) -> {
      return ((InformationFlowAnnotation) sink);
    };
    final List<InformationFlowAnnotation> annotSinks = IterableExtensions.<InformationFlowAnnotation>toList(IterableExtensions.<Sink, InformationFlowAnnotation>map(sinks, _function_1));
    final Map<Level, Collection<String>> levelToTagMappingsForSources = JOANAResolutionUtil.generateLevelTagsMappingsForAnnotations(this.joanaRoot, annotSources);
    final Map<Level, Collection<String>> levelToTagMappingsForSinks = JOANAResolutionUtil.generateLevelTagsMappingsForAnnotations(this.joanaRoot, annotSinks);
    final String generatedSourceAnnotations = JOANAStringUtil.FlowAnnotation_generateSourcesAnnotation(levelToTagMappingsForSources);
    final String generatedSinkAnnotations = JOANAStringUtil.FlowAnnotation_generateSinkAnnotation(levelToTagMappingsForSinks);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(generatedSourceAnnotations);
    _builder.append(" ");
    _builder.append(generatedSinkAnnotations);
    return _builder.toString();
  }
}
