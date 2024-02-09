package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;


import org.dataflowanalysis.analysis.core.CharacteristicValue;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

public record VariableAnnotationMismatch(CharacteristicValue charValue, ParameterAnnotations annotation) {

}
