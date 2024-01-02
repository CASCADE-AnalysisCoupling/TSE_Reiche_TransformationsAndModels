package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {
	private static final String JOANA_MODEL_FILE_ENDING = "joana";
	private static final String JAVA_MODEL_FILE_ENDING = "java";
	private static final String JAVA_MODEL_NAME = "joanajava4accessanalysis";
	private static final String JOANA_MODEL_NAME = "joana4accessanalysis";
	private static final String PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING = "pcmjavacorrespondence";
	private static final String PCMJAVACORRESPONDENCE_MODEL_NAME = "joanajava4accessanalysis";
	
	private final JavaRoot javaRoot;
	private final JOANARoot joanaRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	
	//for testing
	private static final String MODEL_PATH_TEMPLATE = "%s/%s/Models/%s/%s.%s";
	private static final String TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER = "edu.kit.kastel.sdq.coupling.casestudy.travelplanner.model.joana4accessanalysis";
	public static final String JAVA_MODEL_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, InputModels.USER_SPECIFIC_REPO_PATH, InputModels.EVAL_REPO_SPECIFIC_PATH, TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, JAVA_MODEL_NAME, JAVA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String JOANA_MODEL_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, InputModels.USER_SPECIFIC_REPO_PATH, InputModels.EVAL_REPO_SPECIFIC_PATH, TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, JOANA_MODEL_NAME, JOANA_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	public static final String PCMJAVACORRESPONDENCE_MODE_PATH = Paths.get(String.format(MODEL_PATH_TEMPLATE, InputModels.USER_SPECIFIC_REPO_PATH, InputModels.EVAL_REPO_SPECIFIC_PATH, TRAVEL_PLANNER_JOANA_MODELS_BASEFOLDER, PCMJAVACORRESPONDENCE_MODEL_NAME, PCMJAVACORRESPONDENCE_MODEL_FILE_ENDING)).toAbsolutePath().toString();
	
	public OutputModels(JavaRoot javaRoot, JOANARoot joanaRoot, PCMJavaCorrespondenceRoot correspondenceRoot) {
		this.javaRoot = javaRoot;
		this.joanaRoot = joanaRoot;
		this.correspondenceRoot = correspondenceRoot;
	}
	
	public void writeModelsToFiles() {
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
