package clase10112022EjerciosQueuePolimorfismo;

import java.util.ArrayList;

public class AppInformacion {

	public static void main(String[] args) {
		// objetos persona
		//objetos trabajador
		
		Persona p1 = new Persona("Ana", "Garcia", 26);
		Persona p2 = new Persona("Juan", "Calle", 36);
		Trabajador t1 = new Trabajador("Antonio", "Ruiz", 25, 2500);
		Trabajador t2 = new Trabajador("Esteban","Diaz", 25, 36);
		//una lista de tipo personas
		ArrayList<Persona> lPersonas = new ArrayList<Persona>();
		//agregar las personas a la lista
		lPersonas.add(p1);
		lPersonas.add(p2);
		lPersonas.add(t1);
		lPersonas.add(t2);
		
		//mostrar informacion
		for(int i=0; i<lPersonas.size();i++) {
			System.out.println(lPersonas.get(i).toString());
			lPersonas.get(i).calcularPaga();
		}
		
		//Tarea. 
		//1. Agregar 8 objetos de trabajadores
		//2. Calcular que los sueldos mayores a 1500 tienen un bono del 8%
		//3. Calcular que los sueldos mayor a 2000 tienen un bono del 12%
		//4. Generar un metodo calculaPaga y mostrar en consola
		
	}

}
