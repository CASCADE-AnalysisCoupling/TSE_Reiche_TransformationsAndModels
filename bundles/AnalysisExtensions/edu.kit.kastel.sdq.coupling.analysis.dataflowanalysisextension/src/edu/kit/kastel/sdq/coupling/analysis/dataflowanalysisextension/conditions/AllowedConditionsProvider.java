package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

import java.util.List;

import org.dataflowanalysis.analysis.core.CharacteristicValue;

public interface AllowedConditionsProvider {
	boolean isDataFlowToNodeAllowed(List<CharacteristicValue> dataValues, List<CharacteristicValue> nodeValues);
	boolean isParameterAllocationOnNodeAllowed();
}
