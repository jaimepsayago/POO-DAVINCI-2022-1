package clase15092022;

import java.util.Stack;

public class Wrappers {

	public static void main(String[] args) {
		// boolean
		//int
		//long
		//byte
		//date
		
		boolean primitivoBoolean = true; //primitivo
				
		Boolean envoltorioBoolean = new Boolean(primitivoBoolean); //objeto boolean
		envoltorioBoolean.booleanValue();
	
		
		double primitivoDouble = 230.89;
		Double envoltorioDouble = new Double(primitivoDouble);
		
		envoltorioDouble.doubleValue();
		
		//parse
		//convertir de un tipo a otro
		int primitivoInt = Integer.parseInt("12521");
		
		//entero a String 
		String cadena  = Integer.toString(12512);
		
		//
		int primiInt = 12;
		Integer integ= primiInt;
		Integer envolInt = new Integer(primiInt);
		
		//long
		//char
		
		//STRING
		//objeto string
		//array de char 
		
		//explicita
		String cadenaCaracteres = new String ("esta es una cadena de caracteres");
		//implicita
		String cadena12 = "hola esta es una cadena de caracteres";
		
		System.out.println(cadena12);
		System.out.println("tamaño" + cadena12.length());
		System.out.println("la subcadena que ubica pos 14 y 20 es --" + cadena12.substring(14, 20)); 
		System.out.println("la subcadena <una> --" + cadena12.indexOf("una"));
		for (int i =0; i<cadena12.length();i++)
			System.out.println("posicion" + i + " caracter " + cadena12.charAt(i));
		
		//comparaciones de cadenas
		
		String cadena1 = new String("LEOPARDO");
		String cadena2 = new String("LEOPARDO");
		String cadena3 = new String("TIGRE");
		String cadena4 = cadena3;
		
if(cadena1.equals(cadena2))
	System.out.println("verificando con equal el contenido de la cad1 y cad2 es el mismo");
if (cadena1.compareTo(cadena2) ==0 )	
	System.out.println("verificando con comparetocontenido de la cad1 y cad2 es el mismo");	
if (cadena1 == cadena2)
	System.out.println("la referencia cadena 1 y cadena 2 apuntan al mismo objeto");
else
	System.out.println("la referencia cadena 1 y cadena 2 apuntan a objetos diferentes");




	}

}
