package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2codeql;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.correspondences.edfacodeqlcorrespondences.Correspondences_EDFACodeQL;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class OutputModels {

	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot correspondenceRoot;
	private final Correspondences_EDFACodeQL edfaCodeQLCorrespondences;
			
	public OutputModels(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot, PCMJavaCorrespondenceRoot correspondenceRoot, Correspondences_EDFACodeQL edfaCodeQLCorrespondences) {
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.correspondenceRoot = correspondenceRoot;
		this.edfaCodeQLCorrespondences = edfaCodeQLCorrespondences;
	}
	
	public void writeToFiles(String javaModelPath, String codeQLModelPath, String correspondencePath, String edfaCodeQLCorrespondencesPath) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);
		
		Resource codeqlResource = new XMLResourceImpl(URI.createFileURI(codeQLModelPath));
		codeqlResource.getContents().add(tainttrackingRoot);
		
		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(correspondencePath));
		resourcePCMJavaCorrespondence.getContents().add(correspondenceRoot);
		
		Resource resourceEDFACodeQLCorrespondences = new XMLResourceImpl(URI.createFileURI(edfaCodeQLCorrespondencesPath));
		resourceEDFACodeQLCorrespondences.getContents().add(edfaCodeQLCorrespondences);
		
		try {
			javaResource.save(null);
			codeqlResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceEDFACodeQLCorrespondences.save(null);
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
}
