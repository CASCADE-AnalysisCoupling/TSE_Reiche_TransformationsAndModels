package edu.kit.kastel.sdq.coupling.alignment.accessanalysis2joana.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import org.modelversioning.emfprofileapplication.StereotypeApplication;

import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

public class AccessAnalysisResolutionUtil {
	public static Collection<DataSet> filterDataSets(Collection<DataIdentifying> dataidentifying){
		return dataidentifying.stream().filter(ident -> ident instanceof DataSet).map(ident -> (DataSet)ident).collect(Collectors.toList());
	}
	
	public static Collection<StereotypeApplication> filterInformationFlowApplications(Collection<StereotypeApplication> applications){
		return applications.stream().filter(app -> app.getStereotype().getName().equals("InformationFlow")).collect(Collectors.toList()); 
	}
	
	public static Collection<DataSet> getDataSetsForBasicLevels(Collection<DataSet> dataSets, Collection<Level> basicLevels){
		
		Collection<DataSet> fittingSets = new HashSet<DataSet>();
		
		for(Level level : basicLevels) {
			for(DataSet dataSet : dataSets) {
				if(dataSet.getName().equals(level.getName())) {
					fittingSets.add(dataSet);
				}
			}
		}
		return fittingSets;
	}
}
