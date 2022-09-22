package clase22092022.tarea;

public abstract class Figura {

	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public Figura() {
		
	}
	//declarar un metodo abstracto
	//no se implementa
	//es decir no va codificado
	public abstract double calcularArea();

	
	//en la clase abstracta
	//TAMBIEN PUEDO DECLARAR METODOS NORMALES
	public void mensajeFigura() {
		System.out.println("mensaje figura");
	}
	
	//getter and setter de color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
