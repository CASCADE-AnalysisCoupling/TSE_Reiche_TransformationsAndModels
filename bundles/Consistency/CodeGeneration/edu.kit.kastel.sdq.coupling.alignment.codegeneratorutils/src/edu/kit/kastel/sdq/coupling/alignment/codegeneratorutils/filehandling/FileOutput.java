package edu.kit.kastel.sdq.coupling.alignment.codegeneratorutils.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutput {
	
	public static void writeToFile(FileToGenerate file) {
		FileWriter writer = null;
		File path = new File(file.generateFullAbsolutePath());
		try {
			path.getParentFile().mkdirs();
			path.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			writer = new FileWriter(path, false);
			writer.write(file.getContent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
