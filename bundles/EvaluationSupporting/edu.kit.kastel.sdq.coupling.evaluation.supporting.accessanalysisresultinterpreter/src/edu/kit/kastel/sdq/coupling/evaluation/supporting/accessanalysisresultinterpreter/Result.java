package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

public class Result {

	private RepositoryComponent component;
	private OperationSignature signature;
	private Parameter parameter;
	private Adversary adversary;
	private Collection<DataSet> causingDatasets;
	private String requiredProvided;
	
	public String getRequiredProvided() {
		return requiredProvided;
	}

	public void setRequired(String requiredProvided) {
		this.requiredProvided = requiredProvided;
	}

	public Result() {
		this.causingDatasets = new ArrayList<DataSet>();
	}
	
	
	@Override
	public String toString() {
		List<String> dataSetNames = causingDatasets.stream().map(DataSet::getName)
				.collect(Collectors.toList());
		String dataSetsOutput = String.join(",", dataSetNames); 
		
		return String.format("Component %s; %s Signature %s; Parameter %s; Adversary %s, Causing Datasets: [%s]", component.getEntityName(),requiredProvided ,signature.getEntityName(), parameter.getParameterName(), adversary.getName(), dataSetsOutput);
	}

	public RepositoryComponent getComponent() {
		return component;
	}

	public void setComponent(RepositoryComponent component) {
		this.component = component;
	}

	public OperationSignature getSignature() {
		return signature;
	}

	public void setSignature(OperationSignature signature) {
		this.signature = signature;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}

	public Adversary getAdversary() {
		return adversary;
	}

	public void setAdversary(Adversary adversary) {
		this.adversary = adversary;
	}

	public Collection<DataSet> getCausingDatasets() {
		return causingDatasets;
	}

	public void setCausingDatasets(Collection<DataSet> causingDatasets) {
		this.causingDatasets = causingDatasets;
	}
	
	public void addDataSet(DataSet dataSet) {
		causingDatasets.add(dataSet);
	}
}
