package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfajoanacorrespondences.Correspondences_EDFAJOANA;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {

	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final Correspondences_EDFAJOANA edfaJoanaCorrespondences;
	private final Configurations edfa_configuration;
	private final Configurations joana_configuration;		

	public OutputModels(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot,
			Correspondences_EDFAJOANA edfaJoanaCorrespondences, Configurations edfa_configuration, Configurations joana_configuration) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.edfaJoanaCorrespondences = edfaJoanaCorrespondences;
		this.edfa_configuration = edfa_configuration;
		this.joana_configuration = joana_configuration;
	}

	public void writeModelsToFiles(String javaModelPath, String joanaModelPath, String correspondenceModelPath,
			String edfaJoanaCorrespondencePath, String joana_Configurations_Path, String edfa_Configurations_Path) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);

		Resource joanaResource = new XMLResourceImpl(URI.createFileURI(joanaModelPath));
		joanaResource.getContents().add(joanaRoot);

		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(correspondenceModelPath));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);

		Resource resourceEdfaJoanaCorrespondence = new XMLResourceImpl(URI.createFileURI(edfaJoanaCorrespondencePath));
		resourceEdfaJoanaCorrespondence.getContents().add(edfaJoanaCorrespondences);
		
		Resource joana_Configurations_Resource = new XMLResourceImpl(URI.createFileURI(joana_Configurations_Path));
		joana_Configurations_Resource.getContents().add(joana_configuration);
		
		Resource edfa_Configurations_Resource = new XMLResourceImpl(URI.createFileURI(edfa_Configurations_Path));
		edfa_Configurations_Resource.getContents().add(edfa_configuration);

		try {
			javaResource.save(null);
			joanaResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceEdfaJoanaCorrespondence.save(null);
			joana_Configurations_Resource.save(null);
			edfa_Configurations_Resource.save(null);
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
