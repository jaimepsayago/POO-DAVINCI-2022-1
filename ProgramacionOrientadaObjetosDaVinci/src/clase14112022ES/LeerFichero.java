package clase14112022ES;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {

	public static void main(String[] args) {
		File archivo = null;
		
		FileReader reader = null;
		
		BufferedReader buffer = null;
		
		try {
			archivo = new File("d:\\FicheroEjemplo.txt");
			reader = new FileReader(archivo);
			buffer = new BufferedReader(reader);
			
			String linea;
			while((linea= buffer.readLine()) != null) {
				System.out.println(linea);
			}
			
			//borrar
			//archivo.delete();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
