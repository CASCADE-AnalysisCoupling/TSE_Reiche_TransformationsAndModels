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
	private final String FILE_ENDING = "java";
	private final String BASE_PATH = Paths.get("/home/frederik/CodingLocation/Test/").toAbsolutePath().toString();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		PCMJavaCorrespondenceRoot correspondences = PcmjavacorrespondenceFactory.eINSTANCE.createPCMJavaCorrespondenceRoot();
		AccessAnalysisModels models = AccessAnalysisModels.createModelsFromFiles(AccessAnalysisModels.REPOSITORY_PATH, AccessAnalysisModels.CONFIDENTIALITY_SPECIFICATION_PATH);
		Repository repo = models.getRepository();
		ProfileApplication profile = models.getProfile();
		ConfidentialitySpecification spec = models.getConfidentiality();
		
		AccessAnalysis2JOANAModelGenerator modelGenerator = new AccessAnalysis2JOANAModelGenerator();
		modelGenerator.generateJOANAModels(correspondences, repo, profile, spec);
		
		JOANARoot joanaRoot = modelGenerator.getJoanaRoot();
		JavaRoot javaRoot = modelGenerator.getJavaRoot();
		
		JOANAClassOrInterfaceTypeCodeGenerator codeGenerator = new JOANAClassOrInterfaceTypeCodeGenerator(javaRoot, joanaRoot);
		
		Collection<ClassOrInterfaceType> classOrInterfaceTypes = JavaResolutionUtil.getAllClassOrInterfaceTypes(javaRoot);
		
		for(ClassOrInterfaceType type : classOrInterfaceTypes) {
			codeGenerator.setClassOrInterfaceType(type);
			String content = codeGenerator.generate();
			List<Package> packagePath = JavaResolutionUtil.getPackagePathToClassOrInterface(javaRoot, type);
			List<String> pathParts = packagePath.stream().map(pkg -> pkg.getName()).collect(Collectors.toList());
			
		
			String[] pathPartsGettable = pathParts.toArray(new String[0]);
			String path = Paths.get(BASE_PATH, pathPartsGettable).toAbsolutePath().toString();
			
			FileToGenerate file = new FileToGenerate(content, path, type.getName(), FILE_ENDING);
			
			FileOutput.writeToFile(file);
		}
		
		return true;
	}
	
	
	
}
