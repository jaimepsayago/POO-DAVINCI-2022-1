package clase24102022.tareaCollections;

import java.util.LinkedList;

public class Ejercicio2 {
/*
 * Teniendo una clase llamada “Persona”
public class Persona {
int id;String nombre;
public Persona(int id, String nom){this.id_class=id;this.nombre=nom;}
Utilizando la colección linkedlist realizar los siguientes metodos: 
agregar elementos, agregar al inicio, agregar al fin, 
remover elemento, visualizar

 */
	public static void main(String[] args) {
		LinkedList<Persona> listaPersona = new LinkedList<>();
		//agregar datos
		Persona p = new Persona (1, "Juan");
		listaPersona.add(p);
		p = new Persona (2, "Pedro");
		listaPersona.add(p);
		p = new Persona (3, "Pablo");
		listaPersona.add(p);
		p = new Persona (4, "Marcelo");
		listaPersona.add(p);
		p = new Persona (5, "Lucia");
		listaPersona.add(p);
		p = new Persona (6, "Maria");
		listaPersona.add(p);
		
		System.out.println("imprimir lista");
		System.out.println(listaPersona);
		
		//agregar al inicio
		p = new Persona (7, "Persona Primero");
		listaPersona.addFirst(p);
		System.out.println("imprimir lista");
		System.out.println(listaPersona);
		
		//agregar al fin 
		p = new Persona (8, "Persona Ultimo");
		listaPersona.addLast(p);
		System.out.println("imprimir lista");
		System.out.println(listaPersona);
		
		//remover un elemento
		listaPersona.remove(6);
		System.out.println("imprimir lista");
		System.out.println(listaPersona);
		
		//visualizar
		
	}
}
