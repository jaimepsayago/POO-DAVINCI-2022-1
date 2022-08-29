package clase22082022POO;
/*
 * esto es un comentario para mensajes
 */

//es un comentario de linea
public class Auto {
	//propiedades, caracteristicas, variables
	int ruedas;
	int largo;
	int ancho, motor, peso;
	String modelo;
	//fin propiedades

	//constructor inicializar o dar un estado inicial al objeto y variables
	//constructor vacio
	public Auto() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor = 200;
		peso = 1500;
	}
	
	//comportamientos o metodos
	public void mensaje() {
		System.out.println("mensaje desde clase auto");
	}
	
	//METODOS funciones, procedimientos
	//comer, dormir, horasSueño
	
	

}//fin clase Auto
