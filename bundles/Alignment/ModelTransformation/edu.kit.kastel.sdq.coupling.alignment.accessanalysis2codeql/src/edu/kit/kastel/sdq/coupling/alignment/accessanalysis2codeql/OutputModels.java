package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql;

import java.io.IOException;
import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.Configurations;
import edu.kit.kastel.sdq.coupling.models.accessanalysiscodeqlcorrespondence.Correspondences_AccessAnalysisCodeQL;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingRoot;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;



public class OutputModels {
	
	private final JavaRoot javaRoot;
	private final TainttrackingRoot tainttrackingRoot;
	private final PCMJavaCorrespondenceRoot pcmJavacorrespondenceRoot;
	private final Correspondences_AccessAnalysisCodeQL correspondences_AccessAnalysisCodeQL;
	private final Configurations codeql_Configurations;
	private final Configurations accessAnalysis_Configurations;


	public OutputModels(JavaRoot javaRoot, TainttrackingRoot tainttrackingRoot, PCMJavaCorrespondenceRoot correspondenceRoot, Correspondences_AccessAnalysisCodeQL accessAnalysisCodeQLCorrespondenceRoot, Configurations codeql_Configurations, Configurations accessAnalysis_Configurations) {
		this.javaRoot = javaRoot;
		this.tainttrackingRoot = tainttrackingRoot;
		this.pcmJavacorrespondenceRoot = correspondenceRoot;
		this.correspondences_AccessAnalysisCodeQL = accessAnalysisCodeQLCorrespondenceRoot;
		this.codeql_Configurations = codeql_Configurations;
		this.accessAnalysis_Configurations = accessAnalysis_Configurations;
	}
	
	public void writeToFiles(String javaModelPath, String codeQLModelPath, String pcmJavacorrespondencePath, String accessAnalysisCodeQLCorrespondencePath, String codeQlConfigurations_Path, String accessAnalysis_Configurations_Path) {
		Resource javaResource = new XMLResourceImpl(URI.createFileURI(javaModelPath));
		javaResource.getContents().add(javaRoot);
		
		Resource codeqlResource = new XMLResourceImpl(URI.createFileURI(codeQLModelPath));
		codeqlResource.getContents().add(tainttrackingRoot);
		
		Resource resourcePCMJavaCorrespondence = new XMLResourceImpl(URI.createFileURI(pcmJavacorrespondencePath));
		resourcePCMJavaCorrespondence.getContents().add(pcmJavacorrespondenceRoot);
		
		Resource resourceAccessAnalysisCodeQLCorrespondence = new XMLResourceImpl(URI.createFileURI(accessAnalysisCodeQLCorrespondencePath));
		resourceAccessAnalysisCodeQLCorrespondence.getContents().add(correspondences_AccessAnalysisCodeQL);
		
		Resource codeQl_Configurations_Resource = new XMLResourceImpl(URI.createFileURI(codeQlConfigurations_Path));
		codeQl_Configurations_Resource.getContents().add(codeql_Configurations);
		
		Resource accessAnalysis_Configurations_Resource = new XMLResourceImpl(URI.createFileURI(accessAnalysis_Configurations_Path));
		accessAnalysis_Configurations_Resource.getContents().add(accessAnalysis_Configurations);
		
		try {
			javaResource.save(null);
			codeqlResource.save(null);
			resourcePCMJavaCorrespondence.save(null);
			resourceAccessAnalysisCodeQLCorrespondence.save(null);
			codeQl_Configurations_Resource.save(null);
			accessAnalysis_Configurations_Resource.save(null);
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
		return pcmJavacorrespondenceRoot;
	}
	
	public Correspondences_AccessAnalysisCodeQL getAccessAnalysisCodeQLCorrespondenceRoot() {
		return correspondences_AccessAnalysisCodeQL;
	}
	
	public Configurations getCodeQLConfigruations() {
		return codeql_Configurations;
	}
	
	public Configurations getAccessAnalysis_Configurations() {
		return accessAnalysis_Configurations;
	}

	
}
