package clase24102022.tareaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Pedir por teclado los valores y guardarlos 
		 * en el ArrayList la lectura acaba cuando se introduzca -99
			Recorrer el ArrayList y sumar todos sus elementos
			Mostrar valores, su suma y su media aritmética y cuántos hay superiores a la media

		 */
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>(); //arraylist
		//variables donde guardar la informacion
		int suma=0;
		int media=0;
		int supmedia=0;
		
		//ingreso de valores
		System.out.println("ingrese un numero");
		int valor = entrada.nextInt();
		
		//se introduza el -99
		while(valor != -99) {
			//agregar los valores arraylist
			numeros.add(valor);
			//pedir datos
			System.out.println("ingrese un numero");
			valor = entrada.nextInt();
			
		}
		//realizar las operaciones con la informacin obtenida
		
		for (int i = 0; i<numeros.size(); i++) {
			suma = suma + numeros.get(i);
			media = suma/numeros.size();
			
		}
		
		//contar los valores q son mayores a la media
		for (int i = 0; i<numeros.size(); i++) {
		if(numeros.get(i) > media) {
			if(media !=0)
				supmedia++;
		}
		}
		System.out.println();
		System.out.println("suma: " + suma);
		System.out.println("media: " + media);
		System.out.println("superior a la media: " + supmedia);

	}

}
