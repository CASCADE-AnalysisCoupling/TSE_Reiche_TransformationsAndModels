package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.utils;

import java.util.Collection;


import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.FullyImplicitConfiguration;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class AccessAnalysisJOANACorrespondenceUtil {
	
	public static Collection<DataSet> getCorresponding(Level securityLevel,
			Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getDataSetLevelCorrespondences().stream().filter(correspondence -> correspondence.getLevel().equals(securityLevel)).findFirst().get().getDataSets();
	}
	
	public static FullyImplicitConfiguration getCorresponding(HybridConfiguration entryPoint, Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().filter(correspondence -> correspondence.getEntryPoint().equals(entryPoint)).findFirst().get().getAccessAnalysisConfig();
	}

	public static DataSetLevelCorrespondence createDataSetSecurityLevelCorrespondence(Collection<DataSet> dataSets, Level securityLevel) {
		DataSetLevelCorrespondence correspondence = AccessanalysisjoanacorrespondencesFactory.eINSTANCE.createDataSetLevelCorrespondence();
		correspondence.getDataSets().addAll(dataSets);
		correspondence.setLevel(securityLevel);
		return correspondence;
	}
	
	public static EntryPointCorrespondence createConfigurationCorrespondence(FullyImplicitConfiguration accessAnalysisConfig, HybridConfiguration entryPoint) {
		EntryPointCorrespondence correspondence = AccessanalysisjoanacorrespondencesFactory.eINSTANCE.createEntryPointCorrespondence();
		correspondence.setAccessAnalysisConfig(accessAnalysisConfig);
		correspondence.setEntryPoint(entryPoint);
		return correspondence;
	}
	
	public static Correspondences_AccessAnalysisJOANA createCorrespondenceModel() {
		return AccessanalysisjoanacorrespondencesFactory.eINSTANCE.createCorrespondences_AccessAnalysisJOANA();
	}
	
	public static void createAndAddIfCorrespondenceNotExists(FullyImplicitConfiguration accessAnalysisConfig, HybridConfiguration entryPoint, Correspondences_AccessAnalysisJOANA correspondences) {
		if(!correspondenceExists(accessAnalysisConfig, entryPoint, correspondences)) {
			correspondences.getEntryPointCorrespondences().add(createConfigurationCorrespondence(accessAnalysisConfig, entryPoint));
		}
	}
	
	public static boolean correspondenceExists(FullyImplicitConfiguration accessAnalysisConfig, HybridConfiguration entryPoint, Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getAccessAnalysisConfig().equals(accessAnalysisConfig) && correspondence.getEntryPoint().equals(entryPoint);});
	}
	
	public static void createAndAddIfCorrespondenceNotExists(Collection<DataSet> dataSets, Level level, Correspondences_AccessAnalysisJOANA correspondences) {
		if(!correspondenceExists(dataSets, level, correspondences)) {
			correspondences.getDataSetLevelCorrespondences().add(createDataSetSecurityLevelCorrespondence(dataSets, level));
		}
	}
	
	public static boolean correspondenceExists(Collection<DataSet> dataSets, Level level, Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getDataSetLevelCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getDataSets().containsAll(dataSets) && correspondence.getLevel().equals(level);});
	}
}
