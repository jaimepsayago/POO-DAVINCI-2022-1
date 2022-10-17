package clase17102022Collections;

import java.util.Arrays;

/*
 * 1.- generar dos arrays
 * 2.- constructor utilizar algunos metodos para manejo de arrays
 * 3.- metodo para mostrar arrays
 * 4.- metodo para buscar arrays 
 * 
 */


public class Collections {
		//definir 3 arrays
	private int intArray[] = {1,2,3,4,5,6};
	private double doubleArray[] = {8.4,9.3,0.2,5.3,6.4};
	private int llenadoArray[]; //array vacio declarado
	private int copiadoArray[];
	
	//constructor de la clase
	//inicializacion de los arrays
	public Collections() {
		//crear un array con 10 elementos;
		llenadoArray = new int[10]; //un tamaño de 10 elementos
		copiadoArray = new int[intArray.length]; //tamaño 6 de elementos igual al array intArray
				
		//llenar los datos
		//metodo fill que sirve para llenar array con cierta cantidad de datos
		Arrays.fill(llenadoArray,7); //llenamos el array con el valor de 7
		//necesito ordenarla de manera ascendente
		//metodo sort
		Arrays.sort(doubleArray);
		
		//copiar arrays
		System.arraycopy(intArray,0, copiadoArray,0, intArray.length);
	
		
	}
	
	//metodo para imprimir todos los arrays
	public void printArrays() {
		System.out.println("double array: ");
		for (double d: doubleArray)
			System.out.print(d);
		System.out.println();
		System.out.println("intArray: ");
		for (int i: intArray)
			System.out.print(i);
		System.out.println();
		
		System.out.println("llenado array: ");
		for (int la: llenadoArray)
			System.out.print(la);
		System.out.println();
		System.out.println("copiado array: ");
		for (int ca: copiadoArray)
			System.out.print(ca);
		
	}
	//buscar el valor en un array
	public int buscar(int value) {
		return Arrays.binarySearch(intArray, value);
	}

}
