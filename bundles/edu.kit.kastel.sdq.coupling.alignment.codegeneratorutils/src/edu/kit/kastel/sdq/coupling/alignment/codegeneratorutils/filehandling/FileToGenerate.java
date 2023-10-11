package edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling;

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
	
}
