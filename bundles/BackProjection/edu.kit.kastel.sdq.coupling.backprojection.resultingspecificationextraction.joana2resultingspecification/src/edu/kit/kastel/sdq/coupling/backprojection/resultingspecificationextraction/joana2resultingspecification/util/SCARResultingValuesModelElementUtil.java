package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util;

import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPointIdentification_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ParameterIdentification_JOANAResultingValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util.JOANAResultingValuesElementHandlingUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPointIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.ParameterIdentifying;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class SCARResultingValuesModelElementUtil {

	public static ParameterIdentification_JOANAResultingValues getOrTransformAndAddParameterIdentification(
			ParameterIdentifying parameter_SCAR, JOANAResultingValues resultingValues,
			Correspondences_JOANAResultingValues correspondence) {

		//RC8
		ParameterIdentification_JOANAResultingValues parameter_ResultingValues = JOANAResultingValuesElementHandlingUtil
				.getOrCreateAndAddParameter(parameter_SCAR.getParameterIndex(), parameter_SCAR.getParameterType(),
						parameter_SCAR.getMethodName(), parameter_SCAR.getFullyQualifiedClassName(), resultingValues);
		
		JOANAResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(parameter_SCAR,
				parameter_ResultingValues, correspondence);

		return parameter_ResultingValues;

	}

	public static EntryPointIdentification_ResultingValues getOrTransformAndAddConfigurationID(
			EntryPointIdentifying entryPoint_SCAR, JOANAResultingValues resultingValues,
			Correspondences_JOANAResultingValues correspondence) {

		//RC8
		EntryPointIdentification_ResultingValues entryPoint = JOANAResultingValuesElementHandlingUtil.getOrCreateAndAddEntryPointById(entryPoint_SCAR.getTag(), resultingValues);
		
		JOANAResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(entryPoint_SCAR, entryPoint, correspondence);
		
		return entryPoint;
	}

	public static Level_ResultingValues getOrTransformAndAddSecurityLevel(Level_SCAR securityLevel_SCAR, EntryPointIdentification_ResultingValues entryPoint, 
			JOANASCARCorrespondences joanaScarCorrespondence, JOANAResultingValues resultingValues, Correspondences_JOANAResultingValues resultingValueCorrespondences) {
				
		return getOrTransformAndAddSecurityLevelByName(securityLevel_SCAR.getName(), entryPoint, joanaScarCorrespondence, resultingValues, resultingValueCorrespondences);
	}
	
	public static Level_ResultingValues getOrTransformAndAddSecurityLevelByName(String securityLevelName, EntryPointIdentification_ResultingValues entryPoint, JOANASCARCorrespondences codeQLScarCorrespondence, JOANAResultingValues resultingValues ,Correspondences_JOANAResultingValues resultingValueCorrespondences) {
		
		Level_ResultingValues securityLevel_ResultingValues = JOANAResultingValuesElementHandlingUtil.getOrCreateAndAddSecurityLevelByName(securityLevelName, resultingValues);
		EntryPointIdentifying entryPoint_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(entryPoint, resultingValueCorrespondences);
		EntryPoint entryPoint_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(entryPoint_SCAR, codeQLScarCorrespondence);
		
		//RC9,RC10
		Level securityLeveL_CodeQL = JOANAResolutionUtil.lookupLevel(securityLevel_ResultingValues.getName(), entryPoint_JOANA);
		
		JOANAResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(securityLeveL_CodeQL, securityLevel_ResultingValues, resultingValueCorrespondences);
		
		
		return securityLevel_ResultingValues;
	}


}
