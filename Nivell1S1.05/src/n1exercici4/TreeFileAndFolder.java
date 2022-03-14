package n1exercici4;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;   // Import the FileWriter class
import java.text.SimpleDateFormat;
import java.util.Date;

public class TreeFileAndFolder {

	public void listFolder(File directory, FileWriter myWriter) {
			
		File[] subDirs = directory.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
		
		try {
			
			myWriter.write("\n Directori: " + directory.getAbsolutePath() 
			+ " (D)" + fechaFormat(directory.lastModified()));
			
			System.out.println("Successfully wrote to the file.");
			
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		listFile(directory, myWriter);
		
		for (File folder : subDirs) {
			listFolder(folder, myWriter);
		}
	
	}

	private void listFile(File directory, FileWriter myWriter) {
		
		File[] files = directory.listFiles(); 
		for (File file: files) {
			
			try {
				
				myWriter.write("\n File: " + file.getName() 
				+ " (F) "+fechaFormat(file.lastModified()));
				
				
				System.out.println("Successfully wrote to the file.");
				
			} catch (Exception e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}
		
		
	}
	private String fechaFormat(long timer) {
		
		return new SimpleDateFormat("dd-MM-yyyy").format(new Date(timer));
	}
	
	
	
}
