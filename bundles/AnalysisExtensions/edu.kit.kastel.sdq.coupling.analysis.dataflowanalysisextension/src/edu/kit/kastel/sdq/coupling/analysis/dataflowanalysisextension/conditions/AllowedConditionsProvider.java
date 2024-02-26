package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension.conditions;

import java.util.Collection;
import java.util.List;

import org.dataflowanalysis.analysis.core.CharacteristicValue;
import org.dataflowanalysis.pcm.extension.dictionary.characterized.DataDictionaryCharacterized.Literal;

public abstract class AllowedConditionsProvider {
	public abstract boolean isDataFlowToNodeAllowed(Collection<CharacteristicValue> dataValues,
			Collection<CharacteristicValue> nodeValues);

	public abstract boolean isParameterAllocationOnNodeAllowed(Collection<Literal> parameterValues,
			Collection<CharacteristicValue> nodeValues);

	public abstract boolean isDataFlowToParameterAllowed(Collection<CharacteristicValue> dataValues,
			Collection<Literal> parameterValues);

	protected boolean isCharacteristicValue(CharacteristicValue value, String enumType, String enumValue) {
		return value.getTypeName().equals(enumType) && value.getValueName().equals(enumValue);
	}

	protected boolean valuesContain(Collection<CharacteristicValue> dataValues, String enumType, String enumValue) {
		return dataValues.stream().anyMatch(value -> isCharacteristicValue(value, enumType, enumValue));
	}

	protected boolean valuesContain(Collection<Literal> parameterValues,
			// String enumType, TODO: We should support the enum types, however, due to EMF
			// Resolution problems, not possible as enum type is not resolved.
			String enumValue) {

		return parameterValues.stream().anyMatch(value -> value.getName().equals(enumValue));
	}

	protected boolean containsAll(Collection<CharacteristicValue> toCheck, Collection<CharacteristicValue> against) {

		for (CharacteristicValue valueAgainst : against) {
			if (!toCheck.contains(valueAgainst)) {
				return false;
			}
		}

		return true;
	}

	protected boolean containsAllLiterals(Collection<CharacteristicValue> toCheck, Collection<Literal> against) {

			for (Literal valueAgainst : against) {
				if(!toCheck.stream().map(CharacteristicValue::getValueName).anyMatch(toCheckValue -> toCheckValue.equals(valueAgainst.getName()))) {
					return false;
				}
			}
		
		return true;
	}
}
