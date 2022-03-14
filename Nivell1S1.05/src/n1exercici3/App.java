package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		FileWriter myWriter;
		
		try {
			
			myWriter = new FileWriter("OutputS105n1e3.txt");
			
			new TreeFileAndFolder().listFolder(new File("C:\\Users\\Pau Rocho\\Desktop\\New folder"), myWriter);
			
			myWriter.close();
			
		} catch (IOException e) {
			
			System.out.println("An error occurred.");
			
			e.printStackTrace();
			
		}
		
		
	}
	
//METODES 
	
		
	

}
