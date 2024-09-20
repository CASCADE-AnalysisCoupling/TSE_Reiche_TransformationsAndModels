package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {

	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences;
	private final Configurations joana_Configurations;
	private final Configurations accessAnalysis_Configurations;
	
	public OutputModels(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot, Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences, Configurations joana_Configurations, Configurations accessAnalysis_Configurations) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.accessAnalysisJOANACorrespondences = accessAnalysisJOANACorrespondences;
		this.joana_Configurations = joana_Configurations;
		this.accessAnalysis_Configurations = accessAnalysis_Configurations;
	}
	
	
	public void writeModelsToFiles(String javaModelPath, String joanaModelPath, String correspondenceModelPath, String accessAnalysisJOANACorrespondencesLocation, String joana_Configurations_Path, String accessAnalysis_Configurations_Path) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);
		
		Resource joanaResource = new XMLResourceImpl(URI.createFileURI(joanaModelPath));
		joanaResource.getContents().add(joanaRoot);
		
		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(correspondenceModelPath));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);
		
		Resource resourceAccessAnalysisJOANACorrespondence = new XMLResourceImpl(URI.createFileURI(accessAnalysisJOANACorrespondencesLocation));
		resourceAccessAnalysisJOANACorrespondence.getContents().add(accessAnalysisJOANACorrespondences);
		
		Resource joana_Configurations_Resource = new XMLResourceImpl(URI.createFileURI(joana_Configurations_Path));
		joana_Configurations_Resource.getContents().add(joana_Configurations);
		
		Resource accessAnalysis_Configurations_Resource = new XMLResourceImpl(URI.createFileURI(accessAnalysis_Configurations_Path));
		accessAnalysis_Configurations_Resource.getContents().add(accessAnalysis_Configurations);
		
		
		try {
			javaResource.save(null);
			joanaResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceAccessAnalysisJOANACorrespondence.save(null);
			joana_Configurations_Resource.save(null);
			accessAnalysis_Configurations_Resource.save(null);
			//resourcePCMJavaCorrespondence.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public JOANARoot getJoanaRoot() {
		return joanaRoot;
	}

	public PCMJavaCorrespondenceRoot getCorrespondenceRoot() {
		return correspondenceRoot;
	}
}
