package clase17102022Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class AppUsandoArrays {

	public static void main(String[] args) {
	
		Collections arrayCollection = new Collections();
		arrayCollection.printArrays();

	
		//buscar el dato en un array
		int ubicacion = arrayCollection.buscar(5);
		System.out.println("buscar el valor 5 en arrayInt: " + ubicacion);
		
		//1.- instanciar un objeto
		//2.- agregarlo en un arraylist
		//3.- recorrerlo
		//4.- recorrerlo con las diferentes opciones disponibles
		
		Estado estado1; 
		ArrayList<Estado> estados = new ArrayList<>();//arraylist
	
		// int arrayEjemplo[] = {1,2}; //array
		 
		 
		estado1 = new Estado (1, "España", 465700000);
		estados.add(estado1);//agregar estado1 a arraylist
		estado1 = new Estado (2, "Portugal", 105700000);
		estados.add(estado1);
		
		estado1 = new Estado (3, "Alemania", 85700000);
		estados.add(estado1);
		
		estado1 = new Estado (4, "Francia", 365700000);
		estados.add(estado1);
		estado1 = new Estado (5, "italia", 665700000);
		estados.add(estado1);
		
		//recorrido
		System.out.println("-------------------recorrido size get");
		Estado estado2;
		for (int i=0;i<estados.size();i++) {
			estado2 = estados.get(i);
			System.out.println("id del estado: " + estado2.getIdEstado());
			System.out.println("nombre del estado: " + estado2.getNombre());
			System.out.println("habitantes del estado: " + estado2.getNumeroHabitantes());
		}
		System.out.println("-------------------recorrido for each for mejorado");
		for (Estado estado3: estados) {
			System.out.println("id del estado: " + estado3.getIdEstado());
			System.out.println("nombre del estado: " + estado3.getNombre());
			System.out.println("habitantes del estado: " + estado3.getNumeroHabitantes());
		}
		System.out.println("-------------------recorrido Iterator");
		Estado estado4;
		Iterator<Estado> iteratorEstado = estados.iterator();
		while(iteratorEstado.hasNext()) {
			estado4= iteratorEstado.next(); //me muestra el valor del objeto
			System.out.println("id del estado: " + estado4.getIdEstado());
			System.out.println("nombre del estado: " + estado4.getNombre());
			System.out.println("habitantes del estado: " + estado4.getNumeroHabitantes());
		}
		System.out.println("-------------------recorrido Enumeration");
		Estado estado5;
		Enumeration<Estado> enumerationEstado = java.util.Collections.enumeration(estados);
		while(enumerationEstado.hasMoreElements()) {
			estado5 = enumerationEstado.nextElement();
			System.out.println("id del estado: " + estado5.getIdEstado());
			System.out.println("nombre del estado: " + estado5.getNombre());
			System.out.println("habitantes del estado: " + estado5.getNumeroHabitantes());
		}
		System.out.println("-------------------recorrido OBJECT array");
		Object[] arrayEstado = estados.toArray(); //convertir estados en array y agregarlo al objeto array
		for(int i=0; i<arrayEstado.length; i++) {
			System.out.println("id del estado: " + ((Estado)arrayEstado[i]).getIdEstado());
			System.out.println("nombre del estado: " + ((Estado)arrayEstado[i]).getNombre());
			System.out.println("habitantes del estado: " + ((Estado)arrayEstado[i]).getNumeroHabitantes());
		}
		//agregar un objeto para eliminar
		Estado estadoEliminar  = estado1;
		
		//removerlos
		estados.remove(estadoEliminar); //elimina el objeot que ocupa la poscion en el arraylist
		System.out.println("tamaño estados" + estados.size());
		System.out.println("-------------------recorrido OBJECT array");
		Object[] arrayEstado1 = estados.toArray(); //convertir estados en array y agregarlo al objeto array
		for(int i=0; i<arrayEstado1.length; i++) {
			System.out.println("id del estado: " + ((Estado)arrayEstado1[i]).getIdEstado());
			System.out.println("nombre del estado: " + ((Estado)arrayEstado1[i]).getNombre());
			System.out.println("habitantes del estado: " + ((Estado)arrayEstado1[i]).getNumeroHabitantes());
		}
		System.out.println("estado1 " + estado1.getNombre());
		
		//metodo clear
		estados.clear();
		System.out.println("tamaño estados despues de clear " + estados.size());
		
		//MAP
		//clave y el valor
		//01 argentina
		//02 chile
		//03 OBJETO(vaior atributos)
		
	}

}
