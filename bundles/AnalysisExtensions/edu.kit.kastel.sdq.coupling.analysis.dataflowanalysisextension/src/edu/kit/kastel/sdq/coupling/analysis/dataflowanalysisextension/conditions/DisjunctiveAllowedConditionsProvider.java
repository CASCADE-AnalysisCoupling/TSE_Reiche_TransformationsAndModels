package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

import java.util.Collection;

import org.dataflowanalysis.analysis.core.CharacteristicValue;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

public class DisjunctiveAllowedConditionsProvider extends AllowedConditionsProvider{

	@Override
	public boolean isDataFlowToNodeAllowed(Collection<CharacteristicValue> dataValues,
			Collection<CharacteristicValue> nodeValues) {
		return nodeValues.isEmpty() || dataValues.size() <= nodeValues.size() && containsAll(nodeValues, dataValues);
	}

	@Override
	public boolean isParameterAllocationOnNodeAllowed(Collection<Literal> parameterValues,
			Collection<CharacteristicValue> nodeValues) {
		// TODO Auto-generated method stub
		return parameterValues.size() <= nodeValues.size() && containsAllLiterals(nodeValues, parameterValues);
	}

	@Override
	public boolean isDataFlowToParameterAllowed(Collection<CharacteristicValue> dataValues,
			Collection<Literal> parameterValues) {
		return true;
	}

}
