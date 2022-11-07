package clase07112022EstructurasGenericas;

public class AppStackArray {

	public static void main(String[] args) {
		// un objeto de nuestra pila con array
		Stack<Integer> stack = new ArrayStack<>();
		
		stack.push(5);
		stack.push(3);
		stack.push(6);
		
		System.out.println("tamaño" + stack.size());
		System.out.println("indice" + stack.t());
		System.out.println("si esta vacio " + stack.isEmpty());
		System.out.println("top: " + stack.top());
		
		//lectura de la pila
		//for no sabemos y no tenemos un metodo para saber el tamaño exacto de la pila
		while(stack.isEmpty() == false) { //mientras la pila tenga datos
			System.out.println("valores: " + stack.pop());
		}
		System.out.println("vacia: " + stack.isEmpty());
		
		//stack o pila de libo
		Stack<Libro> sLibro = new ArrayStack<Libro>();
		
		//crear algunos objetos de tipo libro
		Libro l1 = new Libro("harry potter", "pepito");
		Libro l2 = new Libro("star wars", "juanito");
		Libro l3 = new Libro("superman", "luisito");
		
		//agregar los datos a la stack
		
		sLibro.push(l1);
		sLibro.push(l2);
		sLibro.push(l3);
		
		while(sLibro.isEmpty() == false) { //mientras la pila tenga datos
			System.out.println("valores: " + sLibro.pop());
		}
		
		//libreria stack de java 
		java.util.Stack s1 = new java.util.Stack();
		
		s1.push("50");
		s1.push("hola");
		s1.push(100);
		s1.push(l1);
		s1.push(80);
		
		while(s1.isEmpty() == false) { //mientras la pila tenga datos
			System.out.println("valores: " + s1.pop());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
