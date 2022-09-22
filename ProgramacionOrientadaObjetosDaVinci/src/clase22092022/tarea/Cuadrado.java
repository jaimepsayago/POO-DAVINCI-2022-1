package clase22092022.tarea;

public class Cuadrado extends Figura {

	private double lado;
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado=lado;
	}
	
	@Override
	public double calcularArea() {
		
		return lado*lado;
	}


}
