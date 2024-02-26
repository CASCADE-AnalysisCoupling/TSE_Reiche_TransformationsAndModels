package edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.util;

import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.GeneralOperationParameterIdentification;
import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ProvidedOperationParameterIdentification;

public class ParameterAnnotationResolutionUtil {

	private ParameterAnnotationResolutionUtil() {
		
	}
	
	public static boolean providedOperationParameterIdentificationFits(
			ProvidedOperationParameterIdentification parameterIdent, OperationProvidedRole providedRoleToCheck,
			OperationSignature operationSignaturetoCheck) {
		return providedRoleToCheck.getId().equals(parameterIdent.getProvidedRole().getId())
				&& providedRoleToCheck.getProvidedInterface__OperationProvidedRole().getSignatures__OperationInterface()
						.contains(operationSignaturetoCheck)
				&& generalParameterIdentificationFits(parameterIdent, operationSignaturetoCheck);
	}
	
	public static boolean generalParameterIdentificationFits(GeneralOperationParameterIdentification parameterIdent,
			OperationSignature toCheckAgainst) {
		return parameterIdent.getOperationSignature().getId().equals(toCheckAgainst.getId());
	}
	
}
