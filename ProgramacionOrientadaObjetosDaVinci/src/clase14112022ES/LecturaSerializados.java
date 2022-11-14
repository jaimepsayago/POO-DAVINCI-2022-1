package clase14112022ES;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LecturaSerializados {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream objectInputStream 
			= new ObjectInputStream(new FileInputStream("objetoSerializado.dat"));
			
			int numeroEstado = objectInputStream.readInt();
			Estado estado; //obj
			
			for(int i=1; i<=numeroEstado; i++) {
				estado = (Estado) objectInputStream.readObject();
				System.out.println("nombre" + estado.getNombre());
				
			}
			objectInputStream.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
