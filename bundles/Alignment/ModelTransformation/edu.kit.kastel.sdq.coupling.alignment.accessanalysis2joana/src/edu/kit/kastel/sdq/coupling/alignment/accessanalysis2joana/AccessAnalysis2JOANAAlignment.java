package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.supporting.util.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAClassOrInterfaceTypeCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class AccessAnalysis2JOANAAlignment {
	
	public AccessAnalysis2JOANAAlignment(String repositoryPath,
			String confidentialityModelPath, String javaCodeBasePath, String codeBasePackageName, String javaModelPath,
			String joanaModelPath, String correspondenceModelPath, String caseStudy) {
		super();
		this.repositoryPath = repositoryPath;
		this.confidentialityModelPath = confidentialityModelPath;
		this.javaCodeBasePath = javaCodeBasePath;
		this.codeBasePackageName = codeBasePackageName;
		this.javaModelPath = javaModelPath;
		this.joanaModelPath = joanaModelPath;
		this.correspondenceModelPath = correspondenceModelPath;
		AccessAnalysis2JOANAAlignment.caseStudy = caseStudy;
	}

	private final String repositoryPath;
	private final String confidentialityModelPath;
	private final String javaCodeBasePath;
	private final String codeBasePackageName;
	private final String javaModelPath;
	private final String joanaModelPath;
	private final String correspondenceModelPath;
	public static String caseStudy;
	

	private static final String ENTRY_POINT_ID_FILE_NAME = "entryPointIDs";
	private static final String ENTRY_POINT_ID_FILE_ENDING = "txt";
	private static final String JAVA_CODE_FILE_ENDING = "java";
	
	public void performAlignment() {
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(repositoryPath, confidentialityModelPath);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();
		
		AccessAnalysis2JOANAModelGenerator modelGenerator = new AccessAnalysis2JOANAModelGenerator();
		OutputModels output = modelGenerator.generateJOANAModels(correspondences, repo, profile, spec, codeBasePackageName);
		output.writeModelsToFiles(javaModelPath, joanaModelPath, correspondenceModelPath);
		generateAndPrintSourceCode(output.getJavaRoot(), output.getJoanaRoot());
		generateAndPrintEntryPointIDFile(modelGenerator);
		
		System.out.println("Done Alignment Access Analysis 2 JOANA");
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
	
	private void generateAndPrintEntryPointIDFile(AccessAnalysis2JOANAModelGenerator modelGenerator) {
		String entryPointIDFileContent = modelGenerator.generateEntryPointIDsAsString();
		
		FileToGenerate file = new FileToGenerate(entryPointIDFileContent, javaCodeBasePath, ENTRY_POINT_ID_FILE_NAME, ENTRY_POINT_ID_FILE_ENDING);
		file.write();
	}
}
