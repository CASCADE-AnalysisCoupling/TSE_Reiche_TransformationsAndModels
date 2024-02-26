package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

import java.util.Collection;

import org.dataflowanalysis.analysis.core.CharacteristicValue;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

public class HighLowConditionProvider extends AllowedConditionsProvider {

	@Override
	public boolean isDataFlowToNodeAllowed(Collection<CharacteristicValue> dataValues, Collection<CharacteristicValue> nodeValues) {
		return !(valuesContain(dataValues, "DataClassification", "low")
				&& valuesContain(nodeValues, "NodeClearance", "attack"));
	}

	@Override
	public boolean isParameterAllocationOnNodeAllowed(Collection<Literal> parameterValues,
			Collection<CharacteristicValue> nodeValues) {

		return !(valuesContain(parameterValues, "low") && valuesContain(nodeValues, "NodeClearance", "attack"));
	}

	@Override
	public boolean isDataFlowToParameterAllowed(Collection<CharacteristicValue> dataValues, Collection<Literal> parameterValues) {
		return valuesContain(dataValues, "DataClassification", "low") && valuesContain(parameterValues, "low")
				|| valuesContain(dataValues, "DataClassification", "high") && valuesContain(parameterValues, "high");
	}



}
