package clase22092022.tarea;

import java.util.ArrayList;
import java.util.List;

public class AppRunRevista {

	public static void main(String[] args) {
		// un objeto revista
		// un objeto libro
		// una lista volumenes y luego esta lista agregarlos a libros --> volumenes 
		// mostrar los objetos creados
		
		Revista revista = new Revista();
		revista.setISSN("1234-45454");
		revista.setPeriodicidad("mensual");
		revista.setNumero(1);
		revista.setTitulo("tierra y vida");
		revista.setAutor("lorenzo martinez");
		revista.setPrecio(5);
		revista.setExtension(80);
	
		Libro libro2; //no esta inicializado el objeto
		Libro libro3  = new Libro(); //inicializando el objeto
		
	
		Libro libro = new Libro(); //instanciando un objeto junto con una inicilizacion en nulo.
		libro.setISBN("997-9894-54454");
		libro.setTitulo("mundo animal");
		libro.setAutor("autor");
		libro.setPrecio(598);
		
		//agregar los volumens o tomos del libro
		
		//vamos a crear una lista
		List<Tomo> listaVolumenes = new ArrayList();
		
		//crear cada objeto tomo que vamos a agregar a la lista
		Tomo tomo1 = new Tomo();
		tomo1.setNumeroVolumen((byte)1);
		tomo1.setTitulo("los mamiferos");
		tomo1.setNumeroPaginas(200);
		//agrego el tomo a la lista
		listaVolumenes.add(tomo1);
		
		Tomo tomo2 = new Tomo();
		tomo2.setNumeroVolumen((byte)2);
		tomo2.setTitulo("los reptiles");
		tomo2.setNumeroPaginas(180);
		//agrego el tomo a la lista
		listaVolumenes.add(tomo2);
		
		Tomo tomo3 = new Tomo();
		tomo3.setNumeroVolumen((byte)1);
		tomo3.setTitulo("las aves");
		tomo3.setNumeroPaginas(250);
		//agrego el tomo a la lista
		listaVolumenes.add(tomo3);
		
		// listaVolumenes--tomo1--tomo2--tomo3
		//agregar la listaVolumenes a el libro
		
		libro.setExtension(listaVolumenes);
		//libro -- Extension --listaVolumenes--tomo1--tomo2--tomo3
		
		
		System.out.println("--revista--");
		System.out.println("issn: " + revista.getISSN());
		System.out.println("periodicidad: " + revista.getPeriodicidad());
		System.out.println("numero: " + revista.getNumero());
		System.out.println("titulo: "+ revista.getTitulo());
		System.out.println("autor: " + revista.getAutor());
		System.out.println("precio: " + revista.getPrecio());
		System.out.println("numero paginas: " + revista.getExtension());
		
		
		System.out.println("---libro----");
		System.out.println("isbn: " + libro.getISBN());
		System.out.println("titulo: " + libro.getTitulo());
		System.out.println("autor: " + libro.getAutor());
		System.out.println("precio: "+ libro.getPrecio());
		
		//mostrar la lista de volumenes de libro
		//tener una lista de get de los volumenes
		List<Tomo> listaVolumenesGet = (List<Tomo>) libro.getExtension();
		
		for ( int i = 0; i<listaVolumenesGet.size(); i++) {
			System.out.println("------tomos---");
			Tomo tomo = listaVolumenesGet.get(i);
			System.out.println("volumen: " + tomo.getNumeroVolumen());
			System.out.println("titulo : " + tomo.getTitulo());
			System.out.println("numero de paginas: " + tomo.getNumeroPaginas());
		}
	}

}
