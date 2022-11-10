package clase10112022EjerciosQueuePolimorfismo;

import java.util.Iterator;
import java.util.LinkedList;

public class AppQueue {

	public static void main(String[] args) {
		// crear obj de tipo Queue y utilizar los metodos creados
		
		Queue<Integer> cola = new ArrayQueue<Integer>();
		cola.addQueue(8);
		cola.addQueue(12);
		cola.addQueue(28);
		
		System.out.println("primer valor: "+ cola.first());
		//recorrer
		while(!cola.isEmpty()) {
			System.out.println("elementos de la cola: " + cola.deQueue());
		}
		
		//Emulacin de una cola con linkedlist
		//linkedlist es una coleccion dinamica que aumenta o disminuye su tamaño en tiempo de ejecucion
		LinkedList<String> list = new LinkedList<String>();
		list.add("hola");
		list.add("mundo");
		list.add("en java");
		
		//agregar dastos al inicio
		list.addFirst("primer dato");
		list.addLast("ultimo dato");
		
		//como no conocemos el tamaño 
		//agregar un datos y obtenerlo
		Object datoObtenido = list.get(0); //obtengo el primer dato
		System.out.println("dato en la posicion 0: "  + datoObtenido);
		
		//agregar un dato en cualquier posicion
		list.set(3, "cambio en el elemento 3");
		list.add("este un dato agregado");
		
		//mostrat esta lista
		//iterator
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) { //mientras el iteratr tenga datos continue obteniendolos
			System.out.println(iterator.next());
		}
		
		//guardar en los datos en un archivo o en una base de datos
		
		//capa de negocio
		
		/*arquitectura 3 capas: 
		1.presentacion(pagina web, app escritorio, endpoint (entre aplicaciones), frontend)
		2. capa de negocio: operaciones con datos se realiza aqui (BackEnd)
		3. capa de datos: bdd (BackEnd)
		*/
		
		

	}

}
