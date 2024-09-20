package edu.kit.kastel.sdq.coupling.models.joana.supporting.util;

import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;
import edu.kit.kastel.sdq.coupling.models.joana.ParametertIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.Sink;
import edu.kit.kastel.sdq.coupling.models.joana.Source;

public class JOANAModelGenerationUtil {

	public static Level generateLevel(String name) {
		Level level = JoanaFactory.eINSTANCE.createLevel();
		level.setName(name);
		return level;
	}
	
	public static MayFlow generateMayFlow(Level from, Level to) {
		MayFlow mayflow = JoanaFactory.eINSTANCE.createMayFlow();
		mayflow.setFrom(from);
		mayflow.setTo(to);
		return mayflow;
	}
	
	public static Sink generateSink(Level level, ParametertIdentifying parameter) {
		Sink sink = JoanaFactory.eINSTANCE.createSink();
		sink.setLevel(level);
		sink.setSystemElementIdentification(parameter);
		return sink;
	}
	
	public static Source generateSource(Level level, ParametertIdentifying parameter) {
		Source source = JoanaFactory.eINSTANCE.createSource();
		source.setLevel(level);
		source.setSystemElementIdentification(parameter);
		return source;
	}
	
	public static ParametertIdentifying generateParameterIdentifying(Parameter param) {
		ParametertIdentifying ident = JoanaFactory.eINSTANCE.createParametertIdentifying();
		ident.setParameter(param);
		return ident; 
	}

}
