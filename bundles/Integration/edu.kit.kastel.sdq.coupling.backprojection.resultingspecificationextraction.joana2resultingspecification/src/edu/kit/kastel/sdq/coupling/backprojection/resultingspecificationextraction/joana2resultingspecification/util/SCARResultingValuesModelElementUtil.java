package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.util;


import edu.kit.kastel.sdq.coupling.evaluation.supporting.configurationrepresentation.HybridConfiguration;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.Correspondences_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanaresultingvaluescorrespondences.util.JOANAResultingValueCorrespondencesUtil;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.JOANASCARCorrespondences;
import edu.kit.kastel.sdq.coupling.models.correspondences.joanascarcorrespondences.util.JOANASCARCorrespondenceUtil;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;
import edu.kit.kastel.sdq.coupling.models.joana.JOANARoot;
import edu.kit.kastel.sdq.coupling.models.joana.Level;
import edu.kit.kastel.sdq.coupling.models.joana.supporting.util.JOANAResolutionUtil;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.EntryPoint_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Level_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.Parameter_ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.ResolvedImplementationValues;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.impl.EntryPoint_ResolvedImplementationValuesImpl;
import edu.kit.kastel.sdq.coupling.models.joanaresultingvalues.util.JOANAResultingValuesElementHandlingUtil;
import edu.kit.kastel.sdq.coupling.models.joanascar.EntryPoint_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Level_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.Parameter_SCAR;
import edu.kit.kastel.sdq.coupling.models.joanascar.SourceCodeAnalysisResult;

public class SCARResultingValuesModelElementUtil {

	public static Parameter_ResolvedImplementationValues getOrTransformAndAddParameter(
			Parameter_SCAR parameter_SCAR, ResolvedImplementationValues resolvedValues,
			Correspondences_ResolvedImplementationValues correspondence) {

		Parameter_ResolvedImplementationValues parameter_ResultingValues = JOANAResultingValuesElementHandlingUtil
				.getOrCreateAndAddParameter(parameter_SCAR.getParameterIndex(), parameter_SCAR.getParameterType(),
						parameter_SCAR.getMethodName(), parameter_SCAR.getFullyQualifiedClassName(), resolvedValues);
		
		JOANAResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(parameter_SCAR,
				parameter_ResultingValues, correspondence);

		return parameter_ResultingValues;

	}

	public static EntryPoint_ResolvedImplementationValues getOrTransformAndAddConfigurationID(
			EntryPoint_SCAR entryPoint_SCAR, ResolvedImplementationValues resultingValues,
			Correspondences_ResolvedImplementationValues correspondence) {

		
		EntryPoint_ResolvedImplementationValues entryPoint = JOANAResultingValuesElementHandlingUtil.getOrCreateAndAddEntryPointById(entryPoint_SCAR.getTag(), resultingValues);
		
		JOANAResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(entryPoint_SCAR, entryPoint, correspondence);
		
		return entryPoint;
	}

	public static Level_ResolvedImplementationValues getOrTransformAndAddSecurityLevel(Level_SCAR securityLevel_SCAR, EntryPoint_ResolvedImplementationValues entryPoint, 
			JOANASCARCorrespondences joanaScarCorrespondence, ResolvedImplementationValues resultingValues, Correspondences_ResolvedImplementationValues resultingValueCorrespondences) {
				
		return getOrTransformAndAddSecurityLevelByName(securityLevel_SCAR.getName(), entryPoint, joanaScarCorrespondence, resultingValues, resultingValueCorrespondences);
	}
	
	public static Level_ResolvedImplementationValues getOrTransformAndAddSecurityLevelByName(String securityLevelName, EntryPoint_ResolvedImplementationValues entryPoint, JOANASCARCorrespondences codeQLScarCorrespondence, ResolvedImplementationValues resultingValues ,Correspondences_ResolvedImplementationValues resultingValueCorrespondences) {
		
		Level_ResolvedImplementationValues securityLevel_ResultingValues = JOANAResultingValuesElementHandlingUtil.getOrCreateAndAddSecurityLevelByName(securityLevelName, resultingValues);
		EntryPoint_SCAR entryPoint_SCAR = JOANAResultingValueCorrespondencesUtil.getCorresponding(entryPoint, resultingValueCorrespondences);
		HybridConfiguration entryPointConfiguration_JOANA = JOANASCARCorrespondenceUtil.getCorresponding(entryPoint_SCAR, codeQLScarCorrespondence);
		
		EntryPoint entryPoint_JOANA = null;
		
		if(entryPointConfiguration_JOANA.getMainConfigurationElement() instanceof EntryPoint) {
			entryPoint_JOANA = (EntryPoint) entryPointConfiguration_JOANA.getMainConfigurationElement();
		} else {
			throw new RuntimeException("Configuration not correct");
		}
		
		Level securityLeveL_CodeQL = JOANAResolutionUtil.lookupLevel(securityLevel_ResultingValues.getName(), entryPoint_JOANA);
		
		JOANAResultingValueCorrespondencesUtil.createAndAddIfCorrespondenceNotExists(securityLeveL_CodeQL, securityLevel_ResultingValues, resultingValueCorrespondences);
		
		
		return securityLevel_ResultingValues;
	}


}
