package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {
	public static final String JOANA_MODEL_FILE_ENDING = "joana";
	public static final String JAVA_MODEL_FILE_ENDING = "java";
	public static final String JAVA_MODEL_NAME = "joanajava4accessanalysis";
	public static final String JOANA_MODEL_NAME = "joana4accessanalysis";
	public static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	public static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "joanajava4accessanalysis";
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	
	public OutputModels(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
	}
	
	public void writeModelsToFiles(final String JAVA_MODEL_PATH, final String JOANA_MODEL_PATH, final String PCMJAVACORRESPONDENCE_MODE_PATH) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(JAVA_MODEL_PATH));
		javaResource.getContents().add(javaRoot);
		
		Resource joanaResource = new XMLResourceImpl(URI.createFileURI(JOANA_MODEL_PATH));
		joanaResource.getContents().add(joanaRoot);
		
		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(PCMJAVACORRESPONDENCE_MODE_PATH));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);
		
		// TODO: FIX MODEL CREATION AS IT DOES NOT OUTPUT ALL MODELS!!!
		try {
			javaResource.save(null);
			joanaResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
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
