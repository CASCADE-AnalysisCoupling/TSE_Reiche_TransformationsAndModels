package edu.kit.kastel.sdq.coupling.analysis.dataflowanalysisextension;

import java.util.ArrayList;
import java.util.List;

import org.dataflowanalysis.analysis.pcm.resource.PCMURIResourceProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edu.kit.kastel.sdq.coupling.models.extension.dataflowanalysis.parameterannotation.ParameterAnnotations;

public class ParameterAnnotationExtensionResourceProvider extends PCMURIResourceProvider {

	private URI parameterAnnotationExtensionRootURI;
	private ParameterAnnotations parameterAnnotations; 
	
	public ParameterAnnotationExtensionResourceProvider(URI usageModelURI, URI allocationModelURI, URI nodeCharacteristicsURI, URI parameterAnnotationExtensionURI) {
		super(usageModelURI, allocationModelURI, nodeCharacteristicsURI);
		this.parameterAnnotationExtensionRootURI = parameterAnnotationExtensionURI;
	}

	@Override
	public void loadRequiredResources() {

		
		super.loadRequiredResources();
		this.parameterAnnotations = (ParameterAnnotations) this.loadModelContent(parameterAnnotationExtensionRootURI);
		
		List<Resource> loadedResources = null;
		do {
			loadedResources = new ArrayList<>(this.resources.getResources());
			loadedResources.forEach(it->EcoreUtil.resolveAll(it));
		} while (loadedResources.size() != this.resources.getResources().size());
	}
	
	public ParameterAnnotations getParameterAnnotations() {
		return parameterAnnotations;
	}

}
