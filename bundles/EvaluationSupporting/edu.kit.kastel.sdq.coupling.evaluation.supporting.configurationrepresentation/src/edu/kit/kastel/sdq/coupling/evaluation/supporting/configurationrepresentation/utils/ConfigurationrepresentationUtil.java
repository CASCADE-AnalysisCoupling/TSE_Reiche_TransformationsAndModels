package edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EObject;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.ConfigurationrepresentationFactory;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;

public class ConfigurationrepresentationUtil {

	public static Configurations generateConfigurations() {
		return ConfigurationrepresentationFactory.eINSTANCE.createConfigurations();
	}
	
	public static HybridConfiguration generatedHybridConfiguration(EObject mainConfig, Collection<EObject> modelRoots) {
		HybridConfiguration hybrid = generateHybridConfiguration(mainConfig);
		hybrid.getAdditionalInputs().addAll(modelRoots);
		return hybrid;
	}
	
	public static HybridConfiguration generateHybridConfiguration(EObject mainConfig) {
		HybridConfiguration hybrid = generatedHybridConfiguration();
		hybrid.setMainConfigurationElement(mainConfig);
		
		return hybrid;
	}
	
	public static FullyImplicitConfiguration generadeFullyImplicitConfiguration(Collection<EObject> modelRoots) {
		FullyImplicitConfiguration implicit = generadeFullyImplicitConfiguration();
		implicit.getInputs().addAll(modelRoots);
		
		
		return implicit;
	}
	
	public static FullyImplicitConfiguration generateFullyImplicitConfiguration(EObject... modelRoots) {
	
		return generadeFullyImplicitConfiguration(Arrays.asList(modelRoots));
		
	}
	
	public static FullyImplicitConfiguration generadeFullyImplicitConfiguration() {
		return ConfigurationrepresentationFactory.eINSTANCE.createFullyImplicitConfiguration();
	}
	
	public static HybridConfiguration generatedHybridConfiguration() {
		return ConfigurationrepresentationFactory.eINSTANCE.createHybridConfiguration();
	}
	
}
