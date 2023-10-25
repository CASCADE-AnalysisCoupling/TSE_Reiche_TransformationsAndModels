package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;

import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.Correspondences;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.ParameterIdentification;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.elementidentifications.ProvidedSignature;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.JavaModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.PCMResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.JavaResolutionUtil;


public class AccessAnalysis2CodeQLStructuralGenerator {
	private final Repository repository;
	private final JavaRoot root;
	private final Correspondences correspondences;
	private final Package classPackages;
	private final Package dataTypePackage;
	private final Package interfacePackage;
	
	public AccessAnalysis2CodeQLStructuralGenerator(Correspondences correspondences, Repository repository) {
		this.correspondences = correspondences;
		this.repository = repository;
		this.root = JavaModelGenerationUtil.generateJavaRoot();
		this.classPackages = JavaModelGenerationUtil.generatePackage("Classes");
		this.dataTypePackage = JavaModelGenerationUtil.generatePackage("DataTypes");
		this.interfacePackage = JavaModelGenerationUtil.generatePackage("Interfaces");
		
	}
	
	public void generateStructuralModel(String basePackageName) {
		
		generatePrimitiveTypes();
		generateClassesFromCompositeTypes(PCMResolutionUtil.filterCompositeDataTypes(repository.getDataTypes__Repository()));
		generateClassesFromBasicComponents(PCMResolutionUtil.filterBasicComponents(repository.getComponents__Repository()));
		
		Package basePackage = JavaModelGenerationUtil.generatePackage(basePackageName);
		basePackage.getSubpackage().add(classPackages);
		basePackage.getSubpackage().add(dataTypePackage);
		basePackage.getSubpackage().add(interfacePackage);
		root.setPackage(basePackage);
	}
	
	private void generatePrimitiveTypes(){
		for(PrimitiveTypeKinds primitiveTypeKind : PrimitiveTypeKinds.VALUES) {
			PrimitiveType type = JavaModelGenerationUtil.generatePrimitiveType(JavaResolutionUtil.translatePrimitiveTypeKindToJavaTypeName(primitiveTypeKind), primitiveTypeKind);
			root.getPrimitivetypes().add(type);
		}
	}
	//Assume only one hierarchy level, no composite containment;
	private void generateClassesFromCompositeTypes(Collection<CompositeDataType> compositeTypes) {
	
		//First Pass: Generate Type so we have all classes without filled fields etc but all types are available
		for(CompositeDataType type : compositeTypes) {
			Class clazz = JavaModelGenerationUtil.generateClass(type.getEntityName());
			correspondences.getClassCompositeTypeCorrespondences().put(type, clazz);
			dataTypePackage.getClassorinterface().add(clazz);
		}
		
		//Second Pass: Fill Classes from CompositeDataTypes with Content
		for(Entry<CompositeDataType, Class> entry : correspondences.getClassCompositeTypeCorrespondences().entrySet()) {
			for(InnerDeclaration innerDeclaration : entry.getKey().getInnerDeclaration_CompositeDataType()) {
				Field field = JavaModelGenerationUtil.generateField(innerDeclaration.getEntityName());
				field.setType(getJavaTypeForPCMDataType(innerDeclaration.getDatatype_InnerDeclaration()));
				entry.getValue().getField().add(field);
			}
		}
	}
	
	private Collection<Class> generateClassesFromBasicComponents(Collection<BasicComponent> components) {
		Collection<Class> generatedClasses = new ArrayList<Class>();
		
		for (BasicComponent component : components) {
			Class clazz = JavaModelGenerationUtil.generateClass(component.getEntityName());
			correspondences.getClassComponentCorrespondences().put(component, clazz);
			generatedClasses.add(clazz);
			classPackages.getClassorinterface().add(clazz);
			generateAndAddProvidedMethodsForClass(clazz);
		}
		
		return generatedClasses;
	}
	
	private void generateAndAddProvidedMethodsForClass(Class clazz){
		
		BasicComponent component = null;
		
		for(Entry<BasicComponent, Class> entry : correspondences.getClassComponentCorrespondences().entrySet()) {
			if(entry.getValue().equals(clazz)) {
				component = entry.getKey();
			}
		}
		
		for(OperationProvidedRole role : PCMResolutionUtil.getOperationProvidedRolesForComponent(component)) {
			for(OperationSignature signature : role.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()) {
				
				ProvidedSignature sig = new ProvidedSignature(role, signature);
				Method method = JavaModelGenerationUtil.generateMethod(signature.getEntityName());
				correspondences.getMethodProvidedSignatureCorrespondences().put(sig, method);
				
				clazz.getMethod().add(method);
				
				
				for(Parameter parameter : signature.getParameters__OperationSignature()) {
					ParameterIdentification paramIdent = new ParameterIdentification(sig, parameter);
					
					edu.kit.kastel.sdq.coupling.models.java.members.Parameter javaParam = JavaModelGenerationUtil.generateParameter(paramIdent.getParamerter().getParameterName());
					
					javaParam.setType(getJavaTypeForPCMDataType(parameter.getDataType__Parameter()));
					correspondences.getParameterToParameterCorrespondences().put(paramIdent, javaParam);
					method.getParameter().add(javaParam);
				}
			}
		}
	}
	
	private PrimitiveType getPrimitiveTypeForPCMPrimitiveType(PrimitiveDataType type) {
		
		PrimitiveType qlType = null;
		
		switch (type.getType().getLiteral()) {
		case "INT":
				qlType = getPrimitiveTypeWithLiteralName("int");
				break;
		case "STRING":
				qlType = getPrimitiveTypeWithLiteralName("string");
				break;
		case "BOOL": 
				qlType = getPrimitiveTypeWithLiteralName("boolean");
				break;
		case "LONG":
				qlType = getPrimitiveTypeWithLiteralName("long");
		default:
			 qlType = null;
		}
		
		return qlType;
		
	}
	
	private PrimitiveType getPrimitiveTypeWithLiteralName(String name) {
		for(PrimitiveType type : root.getPrimitivetypes()) {
			if(type.getKind().getLiteral().equals(name)) {
				return type;
			}
		}
		
		return null;
	}
	
	private Type getJavaTypeForPCMDataType(DataType dataType) {
		if(dataType instanceof PrimitiveDataType) {
			return getPrimitiveTypeForPCMPrimitiveType((PrimitiveDataType) dataType);
		} else if (dataType instanceof CompositeDataType) {
			for(Type clazz : dataTypePackage.getClassorinterface()) {
				if(clazz.getName().equals(((CompositeDataType)dataType).getEntityName())){
					return clazz;
				}
			}
		} else if (dataType instanceof CollectionDataType) {
			return getOrCreateCollectionTypeFromPCMCollectionType((CollectionDataType)dataType);
		}
		return null;
	}
	
	private CollectionType getOrCreateCollectionTypeFromPCMCollectionType(CollectionDataType type) {
		Collection<CollectionType> availableTypes = root.getCollectiontypes();
		
		for(CollectionType available : availableTypes) {
			if(available.getType().equals(getJavaTypeForPCMDataType(type.getInnerType_CollectionDataType()))) {
				return available;
			}
		}
		
		CollectionType newType = JavaModelGenerationUtil.generateCollectionType(getJavaTypeForPCMDataType(type.getInnerType_CollectionDataType()));
		root.getCollectiontypes().add(newType);
		return newType;
	}

	public JavaRoot getRoot() {
		return root;
	}

	public Correspondences getCorrespondences() {
		return correspondences;
	}
	
}
