package clase26092022;

public class AppPublicacion {

	public static void main(String[] args) {
		// dos objetos revista y libro 
		//mostrar en pantalla su atributos
		
		Revista revista = new Revista();
		revista.setEditor("editorial sabana");
		revista.setFecha("12/12/2022");
		revista.setPeriodicidad("dos volumenes");
		revista.setNumeroEjemplaresPorAnyo(4);
		
		System.out.println("-----------revista");
		System.out.println("editor: " + revista.getEditor());
		System.out.println("fechas: " + revista.getFecha());
		System.out.println("periodicidad: " + revista.getPeriodicidad());
		System.out.println("numero ejemplares: " + revista.getNumeroEjemplaresPorAnyo());
		
		Libro libro = new Libro("editorial sabana", "15/1/2022","93483", "Juan Perez");
		System.out.println("-----------libro");
		System.out.println("editor: " + libro.getEditor());
		System.out.println("fechas: " + libro.getFecha());
		System.out.println("isbn: " + libro.getIsbn());
		System.out.println("autor: " + libro.getNombreAutor());
		
		
	}

}
