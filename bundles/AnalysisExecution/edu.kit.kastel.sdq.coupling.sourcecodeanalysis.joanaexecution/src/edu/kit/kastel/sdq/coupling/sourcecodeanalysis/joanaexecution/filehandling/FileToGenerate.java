package edu.kit.kastel.sdq.coupling.sourcecodeanalysis.joanaexecution.filehandling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileToGenerate {

	private final String fileEnding;
	private String content;
	private final String folderPath;
	private final String fileName;
	
	public FileToGenerate(String content, String folderPath, String fileName, String fileEnding) {
		this.fileEnding = fileEnding;
		this.content = content;
		this.folderPath = folderPath;
		this.fileName = fileName;
	}
	
	public FileToGenerate(String content, String path) {
		this.content = content;
		
		String fileNameWithEnding = Path.of(path).toAbsolutePath().getFileName().toString();
		String[] fileNameAndEnding = fileNameWithEnding.split("\\."); 
		
		this.fileName = fileNameAndEnding[0];
		this.fileEnding = fileNameAndEnding[1];
		
		this.folderPath = Path.of(path).getParent().toAbsolutePath().toString();
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFolderPath() {
		return folderPath;
	}

	public String getFileEnding() {
		return fileEnding;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public String generateFullAbsolutePath() {
		return Paths.get(folderPath, String.format("%s.%s", fileName, fileEnding)).toAbsolutePath().toString();
	}
	
	public void write() {
		FileOutput.writeToFile(this);
	}
	
}
