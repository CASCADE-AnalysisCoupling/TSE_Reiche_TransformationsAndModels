package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import edu.kit.kastel.sdq.coupling.models.correspondences.accessanalysisjoanacorrespondences.Correspondences_AccessAnalysisJOANA;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {

	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences;
	
	public OutputModels(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot, Correspondences_AccessAnalysisJOANA accessAnalysisJOANACorrespondences) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.accessAnalysisJOANACorrespondences = accessAnalysisJOANACorrespondences;
	}
	
	
	public void writeModelsToFiles(String javaModelPath, String joanaModelPath, String correspondenceModelPath, String accessAnalysisJOANACorrespondencesLocation) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);
		
		Resource joanaResource = new XMLResourceImpl(URI.createFileURI(joanaModelPath));
		joanaResource.getContents().add(joanaRoot);
		
		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(correspondenceModelPath));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);
		
		Resource resourceAccessAnalysisJOANACorrespondence = new XMLResourceImpl(URI.createFileURI(accessAnalysisJOANACorrespondencesLocation));
		resourceAccessAnalysisJOANACorrespondence.getContents().add(accessAnalysisJOANACorrespondences);
		
		try {
			javaResource.save(null);
			joanaResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceAccessAnalysisJOANACorrespondence.save(null);
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
