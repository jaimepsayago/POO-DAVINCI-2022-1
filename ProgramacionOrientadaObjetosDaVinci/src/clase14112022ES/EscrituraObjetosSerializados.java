package clase14112022ES;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class EscrituraObjetosSerializados {

	public static void main(String[] args) {
		try {
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				 new FileOutputStream(new File("d:\\objetoSerializado.dat")));
				
				//array para agregar objetos
				
				ArrayList<Estado> listaEstados = new ArrayList<>();
				listaEstados.add(new Estado(1, "españa", 122000));
				listaEstados.add(new Estado(2, "portugal", 14000));
				listaEstados.add(new Estado(1, "alemania", 422000));
				listaEstados.add(new Estado(1, "francia", 522000));
				listaEstados.add(new Estado(1, "italia", 322000));
				listaEstados.add(new Estado(1, "grecia", 922000));
				
				//escriba o guarde la infrmacion de la lista en el archivo
				objectOutputStream.writeInt(new Integer(listaEstados.size()));
				for(Estado estado: listaEstados)
					objectOutputStream.writeObject(estado);
				
				objectOutputStream.flush(); //forzar que se cumplan las tareas en el objeto
				objectOutputStream.close(); //cerrar objeto de salida.
				
				for(Estado estado1: listaEstados)
					System.out.println(estado1.toString());
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
