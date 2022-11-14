package clase14112022ES;

import java.io.File;
import java.io.FileWriter;

public class ClaseFile {

	public static void main(String[] args) {
		// Clase File
		//crear archivo y puedo leer archivos
		//abrir
		//cerrar
		//eliminar
		try {
		 File fichero = new File("d:\\FicheroEjemplo.txt"); //me busca el archivo
		
		 if(fichero.exists()) {
			 System.out.println("nombre del archiovo " + fichero.getName());
			 System.out.println("Ruta / Path " + fichero.getPath());
			 System.out.println("Ruta absoluta " + fichero.getAbsolutePath());
			 System.out.println("Se puede escribir " + fichero.canWrite());
			 System.out.println("Se puede leer" + fichero.canRead());
			 System.out.println("tamaño" + fichero.length() );
		
		
		 }
		
		 
		} catch (Exception e) {
			e.getMessage();
		
		}
		//fichero.close(); deprecated
		
		//STREAM de datos
		//comunicacin entre el programa y el fichero y permite moverse entre las partes del fichero
		
		//lectura de datos
		
		//File: archivo
		//FileReader: stream para los datos de lectura
		//BufferedReader: permite leer mas de un dato 
		
		
		escribirArchivo();

	}
	
	public static void escribirArchivo() {
		File fichero = null;
		FileWriter writer = null;
		String frase = "esta es una frase";
		
		try {
			writer = new FileWriter("archivo.txt");
			writer.write(frase);
			writer.close();
			System.out.println("archivo guardado");
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

	
}
