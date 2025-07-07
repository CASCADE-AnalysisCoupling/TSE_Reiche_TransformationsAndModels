package edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.parser.util;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configuration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;

public class Util {

	public static HybridConfiguration getConfigurationForEntryPoint(String entryPointTag, Configurations configurations){
		
		for(Configuration config : configurations.getConfigurations()) {
			if(config instanceof HybridConfiguration && ((HybridConfiguration) config).getMainConfigurationElement() instanceof EntryPoint) {
				EntryPoint entryPoint = (EntryPoint)((HybridConfiguration)config).getMainConfigurationElement();
				
				if(entryPoint.getId().equals(entryPointTag)) {
					return (HybridConfiguration)config;
				}
			}
				
		}
		
		return null;
		
	}
	
	
}
