package edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators;

import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.templates.MethodGenerationTemplate;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.utils.JOANAStringUtil;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;

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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method map((Object)=>InformationFlowAnnotation) is undefined for the type Collection<Source>"
      + "\nThe method map((Object)=>InformationFlowAnnotation) is undefined for the type Collection<Sink>"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ntoList cannot be resolved"
      + "\ntoList cannot be resolved");
  }
}
