package edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.dataflowanalysis.pcm.extension.model.confidentiality.dictionary.PCMDataDictionary;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.modelgenerators.ExtendedDataFlowAnalysis2JOANAModelsGenerator;
import edu.kit.kastel.sdq.coupling.alignment.extendeddataflowanalysis2joana.testpaths.TravelPlannerPaths;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAClassOrInterfaceTypeCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class ExtendedDataFlowAnalysis2JOANAAlignment {


	
	public ExtendedDataFlowAnalysis2JOANAAlignment(String repositoryPath, String parameterAnnotationModelPath,
			String datadictionaryModelPath, String javaCodeBasePath, String codeBasePackageName, String javaModelPath,
			String joanaModelPath, String correspondenceModelPath, String caseStudy) {
		super();
		this.repositoryPath = repositoryPath;
		this.parameterAnnotationModelPath = parameterAnnotationModelPath;
		this.datadictionaryModelPath = datadictionaryModelPath;
		this.javaCodeBasePath = javaCodeBasePath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.joanaModelPath = joanaModelPath;
		this.correspondenceModelPath = correspondenceModelPath;
		ExtendedDataFlowAnalysis2JOANAAlignment.caseStudy = caseStudy;
	}

	private final String repositoryPath;
	private final String parameterAnnotationModelPath;
	private final String datadictionaryModelPath;
	private final String javaCodeBasePath;
	private final String codeBasePackageName;
	private final String javaModelPath;
	private final String joanaModelPath;
	private final String correspondenceModelPath;
	public static String caseStudy;
	
	private static final String JAVA_CODE_FILE_ENDING = "java";
	private static final String ENTRY_POINT_ID_FILE_NAME = "entryPointIDs";
	private static final String ENTRY_POINT_ID_FILE_ENDING = "txt";
	
	public void performAlignment() {
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(repositoryPath, parameterAnnotationModelPath, datadictionaryModelPath);
		Repository repo = models.getRepository();
		ParameterAnnotations parameterAnnotations = models.getExtensionRoot();
		PCMDataDictionary dictionary = models.getDataDictionary();
		
		ExtendedDataFlowAnalysis2JOANAModelsGenerator modelGenerator = new ExtendedDataFlowAnalysis2JOANAModelsGenerator();
		OutputModels output = modelGenerator.generateJOANAModels(correspondences, repo, parameterAnnotations, dictionary, codeBasePackageName);
		output.writeModelsToFiles(javaModelPath, joanaModelPath, correspondenceModelPath);
		generateAndPrintSourceCode(output.getJavaRoot(), output.getJoanaRoot());
		generateAndPrintEntryPointIDFile(modelGenerator);
		
		System.out.println("Done Alignment Extended Dataflow Analysis 2 JOANA");
	}
	
	private void generateAndPrintSourceCode(JavaRoot javaRoot, JOANARoot joanaRoot) {
		JOANAClassOrInterfaceTypeCodeGenerator codeGenerator = new JOANAClassOrInterfaceTypeCodeGenerator(javaRoot, joanaRoot);
		
		Collection<ClassOrInterfaceType> classOrInterfaceTypes = JavaResolutionUtil.getAllClassOrInterfaceTypes(javaRoot);
		
		for(ClassOrInterfaceType type : classOrInterfaceTypes) {
			codeGenerator.setClassOrInterfaceType(type);
			String content = codeGenerator.generate();
			List<Package> packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(javaRoot, type);
			List<String> packagePathPartNames = packagePath.stream().map(pkg -> pkg.getName()).collect(Collectors.toList());
			
			
			List<String> realPathParts = new ArrayList<>();
			realPathParts.add("src");
			for(String packagePathPart : packagePathPartNames) {
				String[] split = packagePathPart.split("\\.");
				
				if(split.length != 0) {
					Arrays.asList(split).forEach(element -> realPathParts.add(element));
				} else {
					realPathParts.add(packagePathPart);
				}
			}
			
			String[] pathPartsGettable = realPathParts.toArray(new String[0]);
			String path = Paths.get(javaCodeBasePath, pathPartsGettable).toAbsolutePath().toString();
			
			FileToGenerate file = new FileToGenerate(content, path, type.getName(), JAVA_CODE_FILE_ENDING);
			file.write();
		}
	}
	
	private void generateAndPrintEntryPointIDFile(ExtendedDataFlowAnalysis2JOANAModelsGenerator modelGenerator) {
		String entryPointIDFileContent = modelGenerator.generateEntryPointIDsAsString();
		
		FileToGenerate file = new FileToGenerate(entryPointIDFileContent, javaCodeBasePath, ENTRY_POINT_ID_FILE_NAME, ENTRY_POINT_ID_FILE_ENDING);
		file.write();
	}
	
}
