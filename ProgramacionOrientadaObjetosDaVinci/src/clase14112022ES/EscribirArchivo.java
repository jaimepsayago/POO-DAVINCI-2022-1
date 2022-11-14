package clase14112022ES;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {

	public static void main(String[] args) {
		// FileWriter 
		
		File fichero = null;
		FileWriter writer = null;
		PrintWriter pw = null;
		String frase= "esto es un archivo generado";
		try {
		//	fichero = new File("escrituraFichero.txt");
			writer = new FileWriter("escrituraFichero.txt");
			
			//pw = new PrintWriter(writer);
			
			for(int i =0;i<10; i++) {
				//pw.println("linea \n " + i);
				writer.write("linea " + i + "\n");
			}
		writer.close(); //no cerre el writer!!!!
			System.out.println("archivo guardado");
			
		//borrar archivo
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
