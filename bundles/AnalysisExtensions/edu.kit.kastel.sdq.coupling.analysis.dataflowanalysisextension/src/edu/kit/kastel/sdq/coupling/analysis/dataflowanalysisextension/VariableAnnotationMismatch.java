package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import org.palladiosimulator.dataflow.confidentiality.analysis.characteristics.CharacteristicValue;

import edu.kit.kastel.sdq.coupling.models.dataflowanalysisextension.ProvidedParameterCharacteristicAnnotation;

public record VariableAnnotationMismatch(CharacteristicValue charValue, ProvidedParameterCharacteristicAnnotation annotation) {

}
