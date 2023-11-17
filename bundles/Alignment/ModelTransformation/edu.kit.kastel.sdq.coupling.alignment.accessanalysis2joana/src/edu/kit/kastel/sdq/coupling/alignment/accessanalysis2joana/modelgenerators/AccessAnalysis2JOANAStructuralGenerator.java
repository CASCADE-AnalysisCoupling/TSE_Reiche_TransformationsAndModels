package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map.Entry;

import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.PCMResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.generation.javacodegenerator.utils.JavaResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.java.JavaRoot;
import edu.kit.kastel.sdq.coupling.models.java.Package;
import edu.kit.kastel.sdq.coupling.models.java.members.Field;
import edu.kit.kastel.sdq.coupling.models.java.members.Method;
import edu.kit.kastel.sdq.coupling.models.java.types.Class;
import edu.kit.kastel.sdq.coupling.models.java.types.CollectionType;
import edu.kit.kastel.sdq.coupling.models.java.types.Interface;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.java.types.PrimitiveTypeKinds;
import edu.kit.kastel.sdq.coupling.models.java.types.Type;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.BasicComponent2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.CompositeDataType2Class;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.OperationInterface2Interface;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMJavaCorrespondenceRoot;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.PCMParameter2JavaParameter;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedOperationSignature2JavaMethod;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.pcmjavacorrespondence.ProvidedSignature;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.Repository;


import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.JavaModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.PCMJavaCorrespondenceModelGenerationUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils.PCMJavaCorrespondenceResolutionUtils;


public class AccessAnalysis2JOANAStructuralGenerator {

	private final Repository repository;
	private final JavaRoot root;
	private final PCMJavaCorrespondenceRoot correspondences;
	private final Package classPackages;
	private final Package dataTypePackage;
	private final Package interfacePackage;
	
	public AccessAnalysis2JOANAStructuralGenerator(PCMJavaCorrespondenceRoot correspondences, Repository repository) {
		this.correspondences = correspondences;
		this.repository = repository;
		this.root = JavaModelGenerationUtil.generateJavaRoot();
		this.classPackages = JavaModelGenerationUtil.generatePackage("components");
		this.dataTypePackage = JavaModelGenerationUtil.generatePackage("datatypes");
		this.interfacePackage = JavaModelGenerationUtil.generatePackage("interfaces");
	}
	
	public void generateStructuralModel(String basePackageName) {
		
		generatePrimitiveTypes();
		generateClassesFromCompositeTypes(PCMResolutionUtil.filterCompositeDataTypes(repository.getDataTypes__Repository()));
		generateClassesFromBasicComponents(PCMResolutionUtil.filterBasicComponents(repository.getComponents__Repository()));
		generateInterfacesFromInterfaces(PCMResolutionUtil.filterOperationInterfaces(repository.getInterfaces__Repository()));
		
		Package basePackage = JavaModelGenerationUtil.generatePackage(basePackageName);
		basePackage.getSubpackage().add(classPackages);
		basePackage.getSubpackage().add(dataTypePackage);
		basePackage.getSubpackage().add(interfacePackage);
		root.setPackage(basePackage);
	}
	
	private void generatePrimitiveTypes(){
		for(PrimitiveTypeKinds primitiveTypeKind : PrimitiveTypeKinds.VALUES) {
			
			
			PrimitiveType type = JavaModelGenerationUtil.generatePrimitiveType(JavaResolutionUtil.translatePrimitiveTypeKindToJavaTypeName(primitiveTypeKind),primitiveTypeKind);
			root.getPrimitivetypes().add(type);
		}
	}
	//Assume only one hierarchy level, no composite containment;
	private void generateClassesFromCompositeTypes(Collection<CompositeDataType> compositeTypes) {
	
		//First Pass: Generate Type so we have all classes without filled fields etc but all types are available
		for(CompositeDataType type : compositeTypes) {
			Class clazz = JavaModelGenerationUtil.generateClass(type.getEntityName());
			CompositeDataType2Class datatype2class = PCMJavaCorrespondenceModelGenerationUtil.generateCompositeDataType2Class(type, clazz);
			correspondences.getCompositedatatype2class().add(datatype2class);
			dataTypePackage.getClassorinterface().add(clazz);
		}
		
		//Second Pass: Fill Classes from CompositeDataTypes with Content
		for(CompositeDataType2Class datatype2classCorrespondence : correspondences.getCompositedatatype2class()) {
			for(InnerDeclaration innerDeclaration : datatype2classCorrespondence.getCompositeDataType().getInnerDeclaration_CompositeDataType()) {
				Field field = JavaModelGenerationUtil.generateField(innerDeclaration.getEntityName());
				field.setType(getJavaTypeForPCMDataType(innerDeclaration.getDatatype_InnerDeclaration()));
				datatype2classCorrespondence.getJavaClass().getField().add(field);
			}
		}
	}
	
	private Collection<Class> generateClassesFromBasicComponents(Collection<BasicComponent> components) {
		Collection<Class> generatedClasses = new ArrayList<Class>();
		
		for (BasicComponent component : components) {
			Class clazz = JavaModelGenerationUtil.generateClass(component.getEntityName());
			BasicComponent2Class component2ClassCorrespondence = PCMJavaCorrespondenceModelGenerationUtil.generateBasicComponent2Class(component, clazz);
			correspondences.getBasiccomponent2class().add(component2ClassCorrespondence);
			generatedClasses.add(clazz);
			classPackages.getClassorinterface().add(clazz);
			generateAndAddProvidedMethodsForClass(clazz);
		}
		
		return generatedClasses;
	}
	
	private Collection<Interface> generateInterfacesFromInterfaces(Collection<OperationInterface> interfaces){
		Collection<Interface> generatedInterfaces = new HashSet<Interface>();
		
		for(OperationInterface interf : interfaces) {
			Interface generatedInterface = JavaModelGenerationUtil.generateInterface(interf.getEntityName());
			interfacePackage.getClassorinterface().add(generatedInterface);
			generatedInterfaces.add(generatedInterface);
			OperationInterface2Interface interfaceCorrespondence = PCMJavaCorrespondenceModelGenerationUtil.generateOperationInterface2Interface(interf, generatedInterface);
			correspondences.getOperationInterface2interface().add(interfaceCorrespondence);
			for(OperationSignature sig : interf.getSignatures__OperationInterface()) {
				Method generatedMethod = JavaModelGenerationUtil.generateMethod(sig.getEntityName());
				generatedInterface.getMethod().add(generatedMethod);
				for(Parameter param : sig.getParameters__OperationSignature()) {
					edu.kit.kastel.sdq.coupling.models.java.members.Parameter javaParam = JavaModelGenerationUtil.generateParameter(param.getParameterName());
					javaParam.setType(getJavaTypeForPCMDataType(param.getDataType__Parameter()));
					//correspondences.getPcmparameter2javaparameter().put(param, javaParam);
					generatedMethod.getParameter().add(javaParam);
				}
			}
		}
		
		return generatedInterfaces;
		
	}
	
	private void generateAndAddProvidedMethodsForClass(Class clazz){
		
		BasicComponent component = null;
		
		for(BasicComponent2Class component2class : correspondences.getBasiccomponent2class()) {
			if(component2class.getJavaClass().equals(clazz)) {
				component = component2class.getComponent();
			}
		}
		
		for(OperationProvidedRole role : PCMResolutionUtil.getOperationProvidedRolesForComponent(component)) {
			for(OperationSignature signature : role.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()) {
				
				ProvidedSignature sig = PCMJavaCorrespondenceModelGenerationUtil.generateProvidedSignature(role, signature);
				Method method = JavaModelGenerationUtil.generateMethod(signature.getEntityName());
				ProvidedOperationSignature2JavaMethod sig2Method = PCMJavaCorrespondenceModelGenerationUtil.generateProvidedOperationSignature2JavaMethod(sig, method);
				correspondences.getProvidedoperationsignature2javamethod().add(sig2Method);
				
				clazz.getMethod().add(method);
				
				
				for(Parameter parameter : signature.getParameters__OperationSignature()) {
					ProvidedParameterIdentification paramIdent = PCMJavaCorrespondenceModelGenerationUtil.generateProvidedParameterIdentification(sig, parameter);
					
					edu.kit.kastel.sdq.coupling.models.java.members.Parameter javaParam = JavaModelGenerationUtil.generateParameter(paramIdent.getParameter().getParameterName());
					
					javaParam.setType(getJavaTypeForPCMDataType(parameter.getDataType__Parameter()));
					PCMParameter2JavaParameter paramcorrespondence = PCMJavaCorrespondenceModelGenerationUtil.generatePcmParameter2JavaParameter(paramIdent, javaParam);
					
					correspondences.getPcmparameter2javaparameter().add(paramcorrespondence);
					method.getParameter().add(javaParam);
				}
			}
		}
	}
	
	private PrimitiveType getPrimitiveTypeForPCMPrimitiveType(PrimitiveDataType type) {
		
		PrimitiveType primitiveType = null;
		
		switch (type.getType().getLiteral()) {
		case "INT":
				primitiveType = getPrimitiveTypeWithLiteralName("int");
				break;
		case "STRING":
				primitiveType = getPrimitiveTypeWithLiteralName("string");
				break;
		case "BOOL": 
				primitiveType = getPrimitiveTypeWithLiteralName("boolean");
				break;
		case "LONG":
				primitiveType = getPrimitiveTypeWithLiteralName("long");
				break;
		default:
			primitiveType = null;
		}
		
		return primitiveType;
		
	}
	
	private PrimitiveType getPrimitiveTypeWithLiteralName(String name) {
		for(PrimitiveType type : root.getPrimitivetypes()) {
			if(type.getKind().getLiteral().toLowerCase().equals(name.toLowerCase())) {
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

	public PCMJavaCorrespondenceRoot getCorrespondences() {
		return correspondences;
	}
	
}

