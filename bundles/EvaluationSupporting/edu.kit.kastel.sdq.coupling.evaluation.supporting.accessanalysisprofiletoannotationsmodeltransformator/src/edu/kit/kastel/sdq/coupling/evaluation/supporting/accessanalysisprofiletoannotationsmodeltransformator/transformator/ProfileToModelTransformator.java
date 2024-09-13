package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisprofiletoannotationsmodeltransformator.transformator;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.AccessanalysisannotationsFactory;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.InformationFlowParameterAnnotation;
public class ProfileToModelTransformator {

	
	public static Annotations transformAnnotations(Collection<StereotypeApplication> profileApplications) {
		Collection<StereotypeApplication> informationFlows = profileApplications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow")).collect(Collectors.toList());
		Annotations annotations = AccessanalysisannotationsFactory.eINSTANCE.createAnnotations();
		Collection<InformationFlowParameterAnnotation> parameterAnnotations = new HashSet<InformationFlowParameterAnnotation>();
		for(StereotypeApplication stereotype : informationFlows) {
			
			Object stereotypedObject = stereotype.getAppliedTo();
			OperationSignature stereotypedSignature = null;
			if (stereotypedObject instanceof OperationSignature) {
				stereotypedSignature = (OperationSignature) stereotypedObject;
			} else {
				continue;
			}
			
			Collection<ParametersAndDataPair> paramtersanddatapairs = getParametersAndDataPairsForStereotype(
					stereotype);
			
			
			for (ParametersAndDataPair pair : paramtersanddatapairs) {

				for (String paramsource : filterParametersFromParameterSources(pair.getParameterSources())) {

					Parameter targetParam = stereotypedSignature.getParameters__OperationSignature().stream().filter(param -> param.getParameterName().equals(paramsource)).findFirst().get();
					
					Optional<InformationFlowParameterAnnotation> potentialParameterAnnotation = parameterAnnotations.stream().filter(annot -> annot.getParameter().equals(targetParam)).findFirst();
					
					if(potentialParameterAnnotation.isEmpty()) {
						InformationFlowParameterAnnotation paramAnnot = AccessanalysisannotationsFactory.eINSTANCE.createInformationFlowParameterAnnotation();
						paramAnnot.setOperationSignature(stereotypedSignature);
						paramAnnot.setParameter(targetParam);
						
						paramAnnot.getDataTargets().addAll(pair.getDataTargets());
						
						parameterAnnotations.add(paramAnnot);
						
					} else {
						Set<DataIdentifying> tmpIdents = new HashSet<DataIdentifying>();
						
						
						InformationFlowParameterAnnotation paramAnnot = potentialParameterAnnotation.get();
						tmpIdents.addAll(pair.getDataTargets());
						tmpIdents.addAll(paramAnnot.getDataTargets());
						
						paramAnnot.getDataTargets().clear();
						tmpIdents.addAll(tmpIdents);
						
					}
				}
			}

			
		}
		
		annotations.getInformationFlowAnnotations().addAll(parameterAnnotations);
		
		
		return annotations; 
	}
	
	private static Collection<ParametersAndDataPair> getParametersAndDataPairsForStereotype(
			StereotypeApplication singleStereotype) {
		Collection<StereotypeApplication> appl = Collections.singletonList(singleStereotype);
		Collection<ParametersAndDataPair> parametersAndDataPairs = StereotypeAPIUtil.getTaggedValues(appl,
				"parametersAndDataPairs", ParametersAndDataPair.class);
		return parametersAndDataPairs;
	}
	
	private static Collection<String> filterParametersFromParameterSources(Collection<String> parameterSources) {
		return parameterSources
				.stream().filter(source -> !source.toLowerCase().contains("return")
						&& !source.toLowerCase().contains("sizeof") && !source.toLowerCase().contains("call"))
				.collect(Collectors.toList());
	}

}
