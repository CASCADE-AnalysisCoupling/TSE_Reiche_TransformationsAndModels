package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.modelgenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;

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
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.CodeQLModelgenerationUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.CodeQLResolutionUtil;
import edu.kit.kastel.sdq.coupling.alignment.accessanalysis2codeql.accessanalysis2codeqlmodel.utils.PCMResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Class;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CodeRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.code.CollectionType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Field;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Method;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveType;
import edu.kit.kastel.sdq.coupling.models.codeql.code.PrimitiveTypeNames;
import edu.kit.kastel.sdq.coupling.models.codeql.code.Type;

public class PCM2CodeQLStructuralGenerator {
	private final Repository repository;
	private final CodeRoot root;
	private final Correspondences correspondences;
	
	public PCM2CodeQLStructuralGenerator(Correspondences correspondences, Repository repository) {
		this.correspondences = correspondences;
		this.repository = repository;
		this.root = CodeQLModelgenerationUtil.generateCodeRoot();
	}
	
	public void generateStructuralModel() {
		generatePrimitiveTypes();
		generateClassesFromCompositeTypes(PCMResolutionUtil.filterCompositeDataTypes(repository.getDataTypes__Repository()));
		generateClassesFromBasicComponents(PCMResolutionUtil.filterBasicComponents(repository.getComponents__Repository()));
	}
	
	private void generatePrimitiveTypes(){
		for(PrimitiveTypeNames name : PrimitiveTypeNames.VALUES) {
			PrimitiveType type = CodeQLModelgenerationUtil.generatePrimitiveType();
			
			type.setPrimitiveTypeName(name);
			type.setName(name.getLiteral());
			root.getTypes().add(type);
		}
	}
	//Assume only one hierarchy level, no composite containment;
	private void generateClassesFromCompositeTypes(Collection<CompositeDataType> compositeTypes) {
	
		//First Pass: Generate Type so we have all classes without filled fields etc but all types are available
		for(CompositeDataType type : compositeTypes) {
			Class clazz = CodeQLModelgenerationUtil.generateClass(type.getEntityName());
			correspondences.getClassCompositeTypeCorrespondences().put(type, clazz);
			root.getTypes().add(clazz);
		}
		
		//Second Pass: Fill Classes from CompositeDataTypes with Content
		for(Entry<CompositeDataType, Class> entry : correspondences.getClassCompositeTypeCorrespondences().entrySet()) {
			for(InnerDeclaration innerDeclaration : entry.getKey().getInnerDeclaration_CompositeDataType()) {
				Field field = CodeQLModelgenerationUtil.generateField(innerDeclaration.getEntityName());
				field.setType(getQLTypeForPCMDataType(innerDeclaration.getDatatype_InnerDeclaration()));
				entry.getValue().getFields().add(field);
			}
		}
	}
	
	private Collection<Class> generateClassesFromBasicComponents(Collection<BasicComponent> components) {
		Collection<Class> generatedClasses = new ArrayList<Class>();
		
		for (BasicComponent component : components) {
			Class clazz = CodeQLModelgenerationUtil.generateClass(component.getEntityName());
			correspondences.getClassComponentCorrespondences().put(component, clazz);
			generatedClasses.add(clazz);
			root.getTypes().add(clazz);
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
				Method method = CodeQLModelgenerationUtil.generateMethod(signature.getEntityName());
				correspondences.getMethodProvidedSignatureCorrespondences().put(sig, method);
				
				clazz.getMethods().add(method);
				
				
				for(Parameter parameter : signature.getParameters__OperationSignature()) {
					ParameterIdentification paramIdent = new ParameterIdentification(sig, parameter);
					
					edu.kit.kastel.sdq.coupling.models.codeql.code.Parameter qlParam = CodeQLModelgenerationUtil.generateParameter(paramIdent.getParamerter().getParameterName());
					
					qlParam.setType(getQLTypeForPCMDataType(parameter.getDataType__Parameter()));
					correspondences.getParameterToParameterCorrespondences().put(paramIdent, qlParam);
					method.getParameters().add(qlParam);
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
		for(PrimitiveType type : CodeQLResolutionUtil.filterPrimitiveTypes(root.getTypes())) {
			if(type.getPrimitiveTypeName().getLiteral().equals(name)) {
				return type;
			}
		}
		
		return null;
	}
	
	private Type getQLTypeForPCMDataType(DataType dataType) {
		if(dataType instanceof PrimitiveDataType) {
			return getPrimitiveTypeForPCMPrimitiveType((PrimitiveDataType) dataType);
		} else if (dataType instanceof CompositeDataType) {
			for(Type clazz : CodeQLResolutionUtil.filterClassesFromTypes(root.getTypes())) {
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
		Collection<CollectionType> availableTypes = CodeQLResolutionUtil.filterCollectionType(root.getTypes());
		
		for(CollectionType available : availableTypes) {
			if(available.getType().equals(getQLTypeForPCMDataType(type.getInnerType_CollectionDataType()))) {
				return available;
			}
		}
		
		CollectionType newType = CodeQLModelgenerationUtil.generateCollectionType(getQLTypeForPCMDataType(type.getInnerType_CollectionDataType()));
		root.getTypes().add(newType);
		return newType;
	}

	public CodeRoot getRoot() {
		return root;
	}

	public Correspondences getCorrespondences() {
		return correspondences;
	}
	
}
