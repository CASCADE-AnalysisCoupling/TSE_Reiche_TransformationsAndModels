package edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.resolution;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultingspecificationextraction.joana2resultingspecification.models.ResultingSpecification;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.ResultEntry;
import edu.kit.kastel.sdq.coupling.backprojection.resultparser.joana2scar.model.SourceCodeAnalysisResult;
import edu.kit.kastel.sdq.coupling.models.java.members.Parameter;
import edu.kit.kastel.sdq.coupling.models.joana.EntryPoint;

public class ResultingSpecificationResolution4HighLow extends ResultingSpecificationResolution {

	
	private final static String LOW_NAME = "low";
	private final static String HIGH_NAME = "high";
	
	public ResultingSpecificationResolution4HighLow(EntryPoint config) {
		super(config);
	}
	
	public ResultingSpecificationResolution4HighLow() {
		super();
	}


	
	@Override
	public ResultingSpecification calculateResultingSpecification(SourceCodeAnalysisResult scar) {
		
		
		
		List<ResultEntry> parameterSinkResultEntries = scar.getResultEntries().stream().filter(entry -> entry.getSink().getSystemElement() instanceof Parameter).collect(Collectors.toList()); 
		
		for(ResultEntry parameterSinkResultEntry : parameterSinkResultEntries) {
			
			if(parameterSinkResultEntry.getEntryPoint().getLevel().size() != 2 || parameterSinkResultEntry.getEntryPoint().getLattice().getMayFlow().size() != 1) {
				throw new RuntimeException("Configuration contains more than two levels or more than 1 allowed flow. Therefore not high low scenario");
			}
			
			Optional<ResultingSpecEntry> resultSpecEntryForParameter = resultingSpecification.getEntries().stream().filter(entry -> entry.getSystemElement().equals(parameterSinkResultEntry.getSink().getSystemElement())).filter(entry -> entry.getEntryPoint().equals(parameterSinkResultEntry.getEntryPoint())).findAny();
			
			//Many Implicit assumptions here: 
			//1. we have every time the same configuration - see above. 
			//2. We use the High <-> Low Relationship. Flows are only reported when there is a flow from high -> low. 
			//	 Therefore, the resolution has just to replace the low level of a sink with high and store it as resulting specification entry
			//   Therefore, if such a entry exists for a parameter, it is already high. 
			if(resultSpecEntryForParameter.isEmpty()) {
				ResultingSpecEntry resultingSpecEntry = new ResultingSpecEntry((Parameter)parameterSinkResultEntry.getSink().getSystemElement(), parameterSinkResultEntry.getSource().getSecurityProperty(), parameterSinkResultEntry.getEntryPoint());
				resultingSpecification.addEntry(resultingSpecEntry);
			}
		}
		
		return resultingSpecification;
	}
	
}
