package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisprofiletoannotationsmodeltransformator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisannotations.Annotations;
import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisprofiletoannotationsmodeltransformator.transformator.ProfileToModelTransformator;


public class Accessanalysisprofiletoannotationsmodeltransformator extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		List<IFile> filteredSelection = filterSelection(selection);
		
		IPath repositoryPath = null;
		
		for(IFile file : filteredSelection) {
			
			if(file.getFileExtension().equals("repository")) {
				repositoryPath = file.getLocation().makeAbsolute();
			}
		}
		
		if(repositoryPath == null)
			return false;
		
		InputModels input = InputModels.createModelsFromFiles(repositoryPath.toString());
		Annotations annotations = ProfileToModelTransformator.transformAnnotations(input.getProfile().getStereotypeApplications());
			
		Resource annotationsResource = new XMLResourceImpl(URI.createFileURI("%s.accessanalysisannotations".formatted(repositoryPath.removeFileExtension().toString())));
		annotationsResource.getContents().add(annotations);
			
		try {
			annotationsResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	
	
		return true;
	}

	
	List<IFile> filterSelection(ISelection selection) {
		ArrayList<IFile> files = new ArrayList<IFile>();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			for (Object o : structuredSelection) {
				if (o instanceof IFile) {
					files.add((IFile) o);
				}
			}
		}
		return files;
	}
}
