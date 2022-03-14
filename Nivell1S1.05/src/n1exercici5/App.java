package n1exercici5;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class App {

	public static void main(String[] args) {
		
		Person person = new Person (1, "Pau", 2);
		
		try {
			
			writeObjectToFile(person);
			
		} catch (IOException e) {
		
			System.out.println(e.getMessage());
			
		}
		
		try {
			person = readObjectToFile();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(person.toString());
		
	}
	
//METODE 
	
	public static void writeObjectToFile(Person person) throws IOException {
		//EL FILE ES BINARIO PARA METER EL OBJECTO SERIALIZADO
		ObjectOutputStream objectOutputStream = new  ObjectOutputStream(new FileOutputStream("Person.ser"));
		
		objectOutputStream.writeObject(person);
	}
	
	public static Person readObjectToFile() throws IOException, ClassNotFoundException {

		ObjectInputStream objectInputStream = new  ObjectInputStream(new FileInputStream("Person.ser"));
		
		Person person = (Person) objectInputStream.readObject();
		
		return person;
	}

}
