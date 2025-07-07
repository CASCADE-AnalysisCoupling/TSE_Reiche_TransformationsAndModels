package edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.kit.kastel.sdq.coupling.evaluation.supporting.accessanalysisresultinterpreter.Interpreter;


public class InterpreterHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		List<IFile> filteredSelection = filterSelection(selection);
		
		IPath repositoryPath = null; 
		IPath confidenitalityPath = null;
		IPath adversaryPath = null;
		IPath mappingsPath = null;
		IPath resultPath = null;
		
		
		for(IFile file : filteredSelection) {
			
			if(file.getFileExtension() != null && file.getFileExtension().equals("repository")) {
				repositoryPath = file.getLocation().makeAbsolute();
			} else if (file.getFileExtension() != null && file.getFileExtension().equals("confidentiality")) {
				confidenitalityPath = file.getLocation().makeAbsolute();
			} else if (file.getFileExtension() != null && file.getFileExtension().equals("adversary")) {
				adversaryPath = file.getLocation().makeAbsolute();
			} else if (file.getLocation().makeAbsolute().toString().contains("mappings.txt")) {
				mappingsPath = file.getLocation().makeAbsolute();
			} else if (file.getLocation().makeAbsolute().toString().contains("AccessAnalysisResults")) {
				resultPath = file.getLocation().makeAbsolute();
			}
		}
		
		Interpreter interpeter = new Interpreter();
		
		interpeter.interpret(repositoryPath.toString(), mappingsPath.toString(), resultPath.toString(), adversaryPath.toString(), confidenitalityPath.toString());;
		
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
