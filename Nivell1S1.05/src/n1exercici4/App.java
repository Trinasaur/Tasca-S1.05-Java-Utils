package n1exercici4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		FileWriter myWriter;
		
		try {
			
			myWriter = new FileWriter("OutputS105n1e4.txt");
			
			new TreeFileAndFolder().listFolder(new File("C:\\Users\\Pau Rocho\\Desktop\\New folder"), myWriter);
			
			myWriter.close();
			
		} catch (IOException e) {
			
			System.out.println("An error occurred.");
			
			e.printStackTrace();
			
		}
		
		
		System.out.println("Printem el file que hem creat per consola: ");
		
		leerFile("OutputS105n1e4.txt");
		
		
		
	}
	
//METODE 
	public static void leerFile(String filename) {
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}

}
