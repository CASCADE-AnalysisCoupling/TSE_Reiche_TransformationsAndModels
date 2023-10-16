package org.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils;

import java.util.Collection;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.StereotypeApplication;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;

public class AccessAnalysisResolutionUtil {
	public static Collection<DataSet> filterDataSets(Collection<DataIdentifying> dataidentifying){
		return dataidentifying.stream().filter(ident -> ident instanceof DataSet).map(ident -> (DataSet)ident).collect(Collectors.toList());
	}
	
	public static Collection<StereotypeApplication> filterInformationFlowApplications(Collection<StereotypeApplication> applications){
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow")).collect(Collectors.toList()); 
	}
}
