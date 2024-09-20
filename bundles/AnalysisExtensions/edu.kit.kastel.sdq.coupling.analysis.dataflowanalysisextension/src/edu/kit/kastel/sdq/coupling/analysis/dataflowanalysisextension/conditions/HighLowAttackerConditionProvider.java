package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

import java.util.Collection;

import org.dataflowanalysis.analysis.core.CharacteristicValue;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

public class HighLowAttackerConditionProvider extends AllowedConditionsProvider {

	@Override
	public boolean isDataFlowToNodeAllowed(Collection<CharacteristicValue> dataValues, Collection<CharacteristicValue> nodeValues) {
		return dataValues.isEmpty() || nodeValues.isEmpty() || !(valuesContain(dataValues, "DataClassification", "high")
				&& valuesContain(nodeValues, "NodeClearance", "attack"));
	}

	@Override
	public boolean isParameterAllocationOnNodeAllowed(Collection<Literal> parameterValues,
			Collection<CharacteristicValue> nodeValues) {
		return parameterValues.isEmpty() || nodeValues.isEmpty() || !(valuesContain(parameterValues, "high") && valuesContain(nodeValues, "NodeClearance", "attack"));
	}

	@Override
	public boolean isDataFlowToParameterAllowed(Collection<CharacteristicValue> dataValues, Collection<Literal> parameterValues) {
		
		boolean containsHigh = valuesContain(dataValues, "DataClassification", "high");
		boolean containsHighLit = valuesContain(parameterValues, "high");
		
		
		return dataValues.isEmpty() || parameterValues.isEmpty() || (valuesContain(dataValues, "DataClassification", "low") && valuesContain(parameterValues, "low"))
				|| ( containsHigh && containsHighLit);
	}



}
