package clase14112022ES;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class LecturasdePaginaWeb {

	public static void main(String[] args) {
		try {
			//obtener la direccion web a una variable
			URL url = new URL("https://www.aemet.es/xml/municipios/localidad_03082.xml");
			//obtencion a esa URL
			URLConnection urlConnection = url.openConnection();
			//conectamos con la direccion web
			urlConnection.connect();
			
			//leer la pagina web 
			InputStream inputStream = urlConnection.getInputStream();
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));
			
			//cargar los datos de la pagina web en un archivo
			FileWriter fileWriter = new FileWriter(new File("recursoWeb.txt"));
			
			//imprimir el archivo
			PrintWriter printWriter = new PrintWriter(fileWriter);
			
			//muestre toda la informacion 
			
			boolean escrituraFichero = false;
			
			char[] buffer = new char[1000];
			int numeroCaracteres;
			
			while((numeroCaracteres=bufferReader.read(buffer)) >0) {
				
				if(escrituraFichero)
						printWriter.println(new String (buffer, 0 , numeroCaracteres));
					else
						System.out.println(new String(buffer, 0 , numeroCaracteres));
				
				System.out.println(new String(buffer, 0 , numeroCaracteres));
			}
			
			if (escrituraFichero)
				fileWriter.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
