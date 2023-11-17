package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana;

import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.types.ClassOrInterfaceType;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators.AccessAnalysis2JOANAModelGenerator;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileOutput;
import edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling.FileToGenerate;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.joanacodegenerator.generators.JOANAClassOrInterfaceTypeCodeGenerator;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PcmjavacorrespondenceFactory;

public class AccessAnalysis2JOANAHandler extends AbstractHandler{
	private static final String JAVA_CODE_FILE_ENDING = "java";
	private static final String JAVA_CODE_BASE_PATH = Paths.get("/home/frederik/Arbeitsplatz/eclipse/accessanalysis/runtime-EclipseApplication/joanaTestModel/").toAbsolutePath().toString();
	private static final String ENTRY_POINT_ID_FILE_NAME = "entryPointIDs";
	private static final String ENTRY_POINT_ID_FILE_ENDING = "txt";
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		InputModels models = InputModels.createModelsFromFiles(InputModels.REPOSITORY_PATH, InputModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();
		
		AccessAnalysis2JOANAModelGenerator modelGenerator = new AccessAnalysis2JOANAModelGenerator();
		OutputModels output = modelGenerator.generateJOANAModels(correspondences, repo, profile, spec);
		output.writeModelsToFiles();
		generateAndPrintSourceCode(output.getJavaRoot(), output.getJoanaRoot());
		generateAndPrintEntryPointIDFile(modelGenerator);
		
		return true;
	}
	
	private void generateAndPrintSourceCode(JavaRoot javaRoot, JOANARoot joanaRoot) {
		JOANAClassOrInterfaceTypeCodeGenerator codeGenerator = new JOANAClassOrInterfaceTypeCodeGenerator(javaRoot, joanaRoot);
		
		Collection<ClassOrInterfaceType> classOrInterfaceTypes = JavaResolutionUtil.getAllClassOrInterfaceTypes(javaRoot);
		
		for(ClassOrInterfaceType type : classOrInterfaceTypes) {
			codeGenerator.setClassOrInterfaceType(type);
			String content = codeGenerator.generate();
			List<Package> packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(javaRoot, type);
			List<String> packagePathPartNames = packagePath.stream().map(pkg -> pkg.getName()).collect(Collectors.toList());
			
		
			String[] pathPartsGettable = packagePathPartNames.toArray(new String[0]);
			String path = Paths.get(JAVA_CODE_BASE_PATH, pathPartsGettable).toAbsolutePath().toString();
			
			FileToGenerate file = new FileToGenerate(content, path, type.getName(), JAVA_CODE_FILE_ENDING);
			file.write();
		}
	}
	
	private void generateAndPrintEntryPointIDFile(AccessAnalysis2JOANAModelGenerator modelGenerator) {
		String entryPointIDFileContent = modelGenerator.generateEntryPointIDsAsString();
		
		FileToGenerate file = new FileToGenerate(entryPointIDFileContent, JAVA_CODE_BASE_PATH, ENTRY_POINT_ID_FILE_NAME, ENTRY_POINT_ID_FILE_ENDING);
		file.write();
	}
}
