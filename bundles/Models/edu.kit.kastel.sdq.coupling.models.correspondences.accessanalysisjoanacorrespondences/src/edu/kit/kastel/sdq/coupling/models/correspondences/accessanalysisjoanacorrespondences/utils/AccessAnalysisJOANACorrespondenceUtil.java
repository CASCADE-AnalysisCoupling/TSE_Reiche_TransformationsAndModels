package edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.AccessanalysisjoanacorrespondencesFactory;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.DataSetLevelCorrespondence;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.EntryPointCorrespondence;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class AccessAnalysisJOANACorrespondenceUtil {
	
	public static Collection<DataSet> getCorresponding(Level securityLevel,
			Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getDataSetLevelCorrespondences().stream().filter(correspondence -> correspondence.getLevel().equals(securityLevel)).findFirst().get().getDataSets();
	}
	
	public static ConfidentialitySpecification getCorresponding(EntryPoint entryPoint, Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().filter(correspondence -> correspondence.getEntryPoint().equals(entryPoint)).findFirst().get().getAccessAnalysisConfig();
	}

	public static DataSetLevelCorrespondence createDataSetSecurityLevelCorrespondence(Collection<DataSet> dataSets, Level securityLevel) {
		DataSetLevelCorrespondence correspondence = AccessanalysisjoanacorrespondencesFactory.eINSTANCE.createDataSetLevelCorrespondence();
		correspondence.getDataSets().addAll(dataSets);
		correspondence.setLevel(securityLevel);
		return correspondence;
	}
	
	public static EntryPointCorrespondence createConfigurationCorrespondence(ConfidentialitySpecification specification, EntryPoint entryPoint) {
		EntryPointCorrespondence correspondence = AccessanalysisjoanacorrespondencesFactory.eINSTANCE.createEntryPointCorrespondence();
		correspondence.setAccessAnalysisConfig(specification);
		correspondence.setEntryPoint(entryPoint);
		return correspondence;
	}
	
	public static Correspondences_AccessAnalysisJOANA createCorrespondenceModel() {
		return AccessanalysisjoanacorrespondencesFactory.eINSTANCE.createCorrespondences_AccessAnalysisJOANA();
	}
	
	public static void createAndAddIfCorrespondenceNotExists(ConfidentialitySpecification confidentialitySpec, EntryPoint entryPoint, Correspondences_AccessAnalysisJOANA correspondences) {
		if(!correspondenceExists(confidentialitySpec, entryPoint, correspondences)) {
			correspondences.getEntryPointCorrespondences().add(createConfigurationCorrespondence(confidentialitySpec, entryPoint));
		}
	}
	
	public static boolean correspondenceExists(ConfidentialitySpecification confidentialitySpec, EntryPoint entryPoint, Correspondences_AccessAnalysisJOANA correspondences) {
		return correspondences.getEntryPointCorrespondences().stream().anyMatch(correspondence -> {return correspondence.getAccessAnalysisConfig().equals(confidentialitySpec) && correspondence.getEntryPoint().equals(entryPoint);});
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
