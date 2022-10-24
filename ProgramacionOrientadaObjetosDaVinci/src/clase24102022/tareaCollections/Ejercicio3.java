package clase24102022.tareaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio3 {
	HashSet<Object> FCBarcelona = new HashSet<>();
	
	public void agregarValores(){
		
		FCBarcelona.add("jordi alba");
		FCBarcelona.add("pique");
		FCBarcelona.add("busquets");
		FCBarcelona.add("iniesta");
		FCBarcelona.add("messi");
		
	}
	public void mostrarValores() {
		Iterator<Object> valores = FCBarcelona.iterator();
		while(valores.hasNext()) {
			System.out.println(valores.next());
		}
	}
	public void contains() {
		if(FCBarcelona.contains("Neymar Jr")) {
			System.out.println("Neymar si esta en el conjunt");
		}else {
			System.out.println("Neymar no esta en el conjunt");
		}
			
	}

	//otro conjunto
	HashSet<Object> jugadores = new HashSet<>();
	public void addOtroConjunto() {
		jugadores.add("zapata");
		jugadores.add("Busquets");
	}

	//unir datos

	public void unir() {
		FCBarcelona.addAll(jugadores);
	}
	
	//eliminar
	public void borrar() {
		jugadores.removeAll(jugadores);
		System.out.println("jugadores borrados");
	}
}
