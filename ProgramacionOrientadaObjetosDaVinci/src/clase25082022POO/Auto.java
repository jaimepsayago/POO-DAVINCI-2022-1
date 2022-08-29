package clase25082022POO;
/*
 * esto es un comentario para mensajes
 */

//es un comentario de linea
public class Auto {
	//propiedades, caracteristicas, variables
	public int ruedas;
	int largo;
	int ancho, motor, peso;
	private String color;
	private int espejos;
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
	
	//metodo publico sin retorno y sin parametros
	public void comer() {
		//operaciones
		System.out.println("mensaje desde el metodo comer");
	}
	//metodo privado con retorno y sin parametros
	public int dormir() {
		//operacion 
		int suma=0;
		suma+=suma +1; //suma de un valor
		return suma;
	}
	//metodo privado o publico con retorno y con parametros
	public int horaSueño(int a, int b) {
		//operacion
		int suma =0;
		suma = a+ b;
		return suma;
	}
	
	//acceso a los metodos privados, get y set
	//set = agregar un valor
	public void setColor(String color) {
		this.color=color;
		//this significa utilizar la variable de la clase
	
	}
	//get = obtener valor
	public String getColor() {
		return this.color;
	}

	//get
	public int getEspejos() {
		return espejos;
	}
	//set
	public void setEspejos(int espejos) {
		this.espejos = espejos;
	}

	
	
}//fin clase Auto
