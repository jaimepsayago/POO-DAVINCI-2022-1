package clas03112022Genericos;

import java.util.ArrayList;
import java.util.List;

public class AppGenerico {

	public static void main(String[] args) {
		// objeto de tipo caja
		Caja c = new Caja();
		c.setDatos(46);
		c.setDato1("hola");
	//	c.setDato1(11.5); //problema de implementacion
		
		CajaGenerica<Integer> cajaG = 
			new	CajaGenerica<Integer>();
		cajaG.setDato(45);
	
		CajaGenerica<String> cajaGS = 
				new	CajaGenerica<String>();

		
		//gener una clase generica con dos parametros 
	
		
		ClaseGenericaParametros<Integer, String>
		claseGenerica = new ClaseGenericaParametros(20, "generico");
		
		claseGenerica.mostrarTipo();
		
		
		//metodo generico
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		List<String> sList = new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		
		//funciones generica para leer estas dos listas de tipos diferentes
		leerLista(intList);
		leerLista(sList);
	}

	//metodo generico
	public static <T> void leerLista (List<T> list) {
		for(T elemento: list)
			System.out.println("estos son los elementos: " + elemento);
	}
	
}
