package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.modelgenerators;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.ExtendedDataFlowAnalysis2JOANA4TravelPlannerHandler;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.ExtendedDataFlowAnalysis2JOANAAlignment;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.OutputModels;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.JPMailPaths;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.TravelPlannerPaths;
import edu.kit.kastel.sdq.coupling.alignment.pcm2java.PCM2JavaStructuralGenerator;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;

public class ExtendedDataFlowAnalysis2JOANAModelsGenerator {
	private JavaRoot javaRoot;
	private JOANARoot joanaRoot;

	public OutputModels generateJOANAModels(PCMJavaCorrespondenceRoot correspondences, Repository repo, ParameterAnnotations extensionRoot, PCMDataDictionary dictionary, String basePackageName) {
		
		PCM2JavaStructuralGenerator structuralGenerator = new PCM2JavaStructuralGenerator(correspondences, repo);
		structuralGenerator.generateStructuralModel(basePackageName);
		
		
		ExtendedDataFlowAnalysis2JOANASecurityGenerator securityGenerator = null;
		//TODO Should be handled by injection/dynamic binding, same as paths
		if(ExtendedDataFlowAnalysis2JOANAAlignment.caseStudy.equals(JPMailPaths.CASE_STUDY_NAME)) {
			securityGenerator = new ExtendedDataFlowAnalysis2JOANASecurityGenerator4HighLow(extensionRoot, correspondences, dictionary);	
		} else if(ExtendedDataFlowAnalysis2JOANAAlignment.caseStudy.equals(TravelPlannerPaths.CASE_STUDY_NAME)) {
			securityGenerator = new ExtendedDataFlowAnalysis2JOANASecurityGenerator4FullDynamicLevels(extensionRoot, correspondences, dictionary);	
		}
			
		
		joanaRoot = securityGenerator.generateJOANASpecification();
		javaRoot = structuralGenerator.getRoot();
		return new OutputModels(javaRoot, joanaRoot, correspondences);

	}

	public JavaRoot getJavaRoot() {
		return javaRoot;
	}
	
	public JOANARoot getJoanaRoot() {
		return joanaRoot;
	}
	
	public String generateEntryPointIDsAsString(JOANARoot targetRoot) {
		
		StringBuilder builder = new StringBuilder();
		
		for(EntryPoint entryPoint : targetRoot.getEntrypoint()) {
			builder.append(String.format("%s %s", entryPoint.getId(), System.lineSeparator()));
		}
		
		return builder.toString();
	}
	
	public String generateEntryPointIDsAsString() {
		return generateEntryPointIDsAsString(joanaRoot);
	}
}
