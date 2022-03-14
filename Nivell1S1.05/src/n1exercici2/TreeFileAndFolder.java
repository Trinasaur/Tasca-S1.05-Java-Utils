package n1exercici2;

import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TreeFileAndFolder {

	public void listFolder(File directory) {
		
		File[] subDirs = directory.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
		});
		
		System.out.println("\n Directori: " + directory.getAbsolutePath() 
		+ " (D)" + fechaFormat(directory.lastModified()));
		
		listFile(directory);
		
		for (File folder : subDirs) {
			listFolder(folder);
		}
	
	}

	private void listFile(File directory) {
		
		File[] files = directory.listFiles(); 
		for (File file: files) {
			System.out.println("\n File: " + file.getName() + " (F) "+ fechaFormat(file.lastModified()));
		}
		
		
	}
	private String fechaFormat(long timer) {
		
		return new SimpleDateFormat("dd-MM-yyyy").format(new Date(timer));
	}
	
	
	
}
