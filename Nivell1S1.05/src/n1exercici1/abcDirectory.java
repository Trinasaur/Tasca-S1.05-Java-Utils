package n1exercici1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class abcDirectory {
	
	
//ATRIBUTS
	private static String directory;

//CONSTRUCTOR
	public abcDirectory(String directory) {
		
		abcDirectory.directory = directory;
		
	}
//GETTERS I SETTERS

	static String getDirectory() {
		return directory;
	}

	static void setDirectory(String directory) {
		abcDirectory.directory = directory;
	}
	
//METODES
	
	public void llistar() {
		
		//CREA UN OBJETO PATH CON EL DIRECTORIO RECIBIDO POR PARAMETRO
		Path path = Paths.get(directory);
		ArrayList<Path> bList = new ArrayList<Path>();
		
		//USAMOS UNA FORMA DE GESTIONAR LAS EXCEPTIONS QUE ADEMAS CERRARA LOS STREAMS
		try{
			Stream<Path> subPaths = Files.walk(path);//hacemos un stream con todos los subpaths
			subPaths.forEach(a -> bList.add(a));//añadimos los subpaths a un arrayList
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Collections.sort(bList); //ESTE METODO ORDENA ALPHABETICAMENTE LOS SUBPATHS
		
		bList.forEach(a -> System.out.println(a));//FINALMENTE IMPRIMIMOS LA LISTA PARA PODER VERLA
		
		
	}
}
