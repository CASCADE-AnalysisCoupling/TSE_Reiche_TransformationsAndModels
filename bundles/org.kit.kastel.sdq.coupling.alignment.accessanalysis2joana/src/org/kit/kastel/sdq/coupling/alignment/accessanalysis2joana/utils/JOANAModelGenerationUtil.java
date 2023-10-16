package org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;

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
}
