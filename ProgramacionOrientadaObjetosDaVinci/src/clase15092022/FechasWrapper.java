package clase15092022;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;

public class FechasWrapper {

	public static void main(String[] args) {
		// FECHAS SON HIJOS DE OBJECT
		//JAVA UTIL DATE --> SQL DATE
		//JAVA UTIL DATE --> TIMESTAMP
		//JAVA UTIL CALENDATE --> GREGORIAN CALENDAR
		//GETTERS AND SETTERS CON OBJETOS FECHAS = SE MANEJAN EN MILISEGUNDOS PARA REALIZAR CALCULOS
		//TODAS SON INSTANCIABLES MENOS GREGORIAN (ABSTRACT)
		
		
		//FORMATOS A LAS FECHAS
		SimpleDateFormat formatofecha1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		SimpleDateFormat formatofecha2 = new SimpleDateFormat(" 'Buenos aires, ' dd ' de ' MMMM ' de ' yyyy ");
		java.util.Date momentoActual = new java.util.Date(); //obtener fecha actual
		//cadenas de formatos
		String cadenaFechaFormato1 = formatofecha1.format(momentoActual);
		String cadenaFechaFormato2 = formatofecha2.format(momentoActual);
		//imprimir
		System.out.println("tiempo actual del sistema: " + cadenaFechaFormato1);
		System.out.println("tiempo actual del sistema: " + cadenaFechaFormato2);
		
		//desglose de unidades de tiempo
		//value of para date y timestamp --> en milisegundos
		
		String fechaRecogida1 = "28/06/1969";
		//encapsular
		String fechaTransformada1 = fechaRecogida1.substring(6,10) + "-" + fechaRecogida1.substring(3, 5) + "-"+
		fechaRecogida1.substring(0,2); // 1969 - 06 - 28
		//cadena con el metodo valueOf
		System.out.println("cadena con formado normal "+ fechaTransformada1);
		//encapsulado de fecha para insertar en una base de datos
		Date fechaInsertarBD1 = java.sql.Date.valueOf(fechaTransformada1);
		//visualizar la fecha con formato requerido para base de datos
		System.out.println("cadena con formato para bd por el metodo valueof "+ new SimpleDateFormat("dd-MM-yyyy").format(fechaInsertarBD1)); 
		
		System.out.println("fecha a insertar en bd expresada en milisegundos " + fechaInsertarBD1.getTime());
		
		//calcular el numero de dias entre dos fechas
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MMM-yyyy");
		String cadenaFechaEntrada = "24/01/2019";
		String cadenaFechaEntradaTransformada =cadenaFechaEntrada.substring(6,10) + "-" + cadenaFechaEntrada.substring(3, 5) + "-"+
				cadenaFechaEntrada.substring(0,2);
		Date fechaEntrada = java.sql.Date.valueOf(cadenaFechaEntradaTransformada); //sql date
		java.util.Date fechaSalida = new java.util.Date(); //util date y obtengo la fecha actual del sistema
		//calculo siempre es en milisegundos
		long numeroDias = (fechaSalida.getTime() - fechaEntrada.getTime()) / (24*60*60*1000);
		System.out.println("el numero de dias entre: ");
		System.out.println("el " + formatoFecha.format(fechaEntrada) + "y el " + formatoFecha.format(fechaSalida) 
		+ "es " + numeroDias + " dias");
		
		//Gregorian calendar
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		System.out.println("calendario gregoriano");
		System.out.println(String.format("%02d", gregorianCalendar.get(Calendar.DATE)));
		System.out.println(String.format("%02d", gregorianCalendar.get(Calendar.MONTH)));
		System.out.println(String.format("%04d", gregorianCalendar.get(Calendar.YEAR)));
		
		
		
		
		
	}

}
