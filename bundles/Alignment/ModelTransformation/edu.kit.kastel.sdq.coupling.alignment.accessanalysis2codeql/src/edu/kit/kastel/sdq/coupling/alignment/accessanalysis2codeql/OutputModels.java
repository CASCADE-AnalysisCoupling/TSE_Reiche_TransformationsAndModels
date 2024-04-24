package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import java.io.IOException;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.AccessAnalysisCodeQLCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;


public class OutputModels {
	
	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondenceRoot;

	public OutputModels(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot, PCMJavaCorrespondenceRoot correspondenceRoot, AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondenceRoot) {
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.accessAnalysisCodeQLCorrespondenceRoot = accessAnalysisCodeQLCorrespondenceRoot;
	}
	
	public static OutputModels createModelsFromFiles(String javaFilePath, String codeqlFilePath, String pcmjavaCorrespondenceFilePath, String accessAnalysisCodeQLCorrespondenceFilePath) {
		ResourceSetImpl resSet = new ResourceSetImpl();

		URI repositoryUri = URI.createFileURI(Path.of(javaFilePath).toAbsolutePath().toString());
		URI confidentialityUri = URI.createFileURI(Path.of(codeqlFilePath).toAbsolutePath().toString());
		URI pcmjavaCorrespondenceUri = URI.createFileURI(Path.of(pcmjavaCorrespondenceFilePath).toAbsolutePath().toString());
		URI accessAnalysisCodeQLCorrespondenceUri = URI.createFileURI(Path.of(accessAnalysisCodeQLCorrespondenceFilePath).toAbsolutePath().toString());
		
		Resource resourceJava = resSet.getResource(repositoryUri, true);
		Resource resourceCodeQL = resSet.getResource(confidentialityUri, true);
		Resource resourcePCMJavaCorrespondence = resSet.getResource(pcmjavaCorrespondenceUri, true);
		Resource resourceAccessAnalysisCodeQLCorrespondenceCorrespondence = resSet.getResource(accessAnalysisCodeQLCorrespondenceUri, true);
		
		try {
			resourceJava.load(null);
			resourceCodeQL.load(null);
			resourcePCMJavaCorrespondence.load(null);
			resourceAccessAnalysisCodeQLCorrespondenceCorrespondence.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		JavaRoot java = (JavaRoot) resourceJava.getContents().get(0);
		TainttrackingRoot tainttracking = (TainttrackingRoot) resourceCodeQL.getContents().get(0);
		PCMJavaCorrespondenceRoot pcmJavaCorrespondenceRoot = (PCMJavaCorrespondenceRoot) resourcePCMJavaCorrespondence.getContents().get(0);
		AccessAnalysisCodeQLCorrespondenceRoot accessAnalysisCodeQLCorrespondenceRoot = (AccessAnalysisCodeQLCorrespondenceRoot) resourceAccessAnalysisCodeQLCorrespondenceCorrespondence.getContents().get(0);
		
		return new OutputModels(java, tainttracking, pcmJavaCorrespondenceRoot, accessAnalysisCodeQLCorrespondenceRoot);
	}
	
	
	public void writeToFiles(String javaModelPath, String codeQLModelPath, String correspondencePath, String accessAnalysisCodeQLCorrespondencePath) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);
		
		Resource codeqlResource = new XMLResourceImpl(URI.createFileURI(codeQLModelPath));
		codeqlResource.getContents().add(tainttrackingRoot);
		
		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(correspondencePath));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);
		
		Resource resourceAccessAnalysisCodeQLCorrespondence = new XMLResourceImpl(URI.createFileURI(accessAnalysisCodeQLCorrespondencePath));
		resourceAccessAnalysisCodeQLCorrespondence.getContents().add(accessAnalysisCodeQLCorrespondenceRoot);
		
		try {
			javaResource.save(null);
			codeqlResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceAccessAnalysisCodeQLCorrespondence.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}

	public TainttrackingRoot getTainttrackingRoot() {
		return tainttrackingRoot;
	}

	public PCMJavaCorrespondenceRoot getCorrespondenceRoot() {
		return correspondenceRoot;
	}
	
	public AccessAnalysisCodeQLCorrespondenceRoot getAccessAnalysisCodeQLCorrespondenceRoot() {
		return accessAnalysisCodeQLCorrespondenceRoot;
	}
}
