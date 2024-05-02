package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {

	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final Correspondences_EDFAJOANA edfaJoanaCorrespondences;

	public OutputModels(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			Correspondences_EDFAJOANA edfaJoanaCorrespondences) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.edfaJoanaCorrespondences = edfaJoanaCorrespondences;
	}

	public void writeModelsToFiles(String javaModelPath, String joanaModelPath, String correspondenceModelPath,
			String edfaJoanaCorrespondencePath) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);

		Resource joanaResource = new XMLResourceImpl(URI.createFileURI(joanaModelPath));
		joanaResource.getContents().add(joanaRoot);

		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(correspondenceModelPath));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);

		Resource resourceEdfaJoanaCorrespondence = new XMLResourceImpl(URI.createFileURI(edfaJoanaCorrespondencePath));
		resourceEdfaJoanaCorrespondence.getContents().add(edfaJoanaCorrespondences);

		try {
			javaResource.save(null);
			joanaResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceEdfaJoanaCorrespondence.save(null);
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
