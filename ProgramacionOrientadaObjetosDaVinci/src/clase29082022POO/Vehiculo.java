package clase29082022POO;

public class Vehiculo {
	//caracteristicas, propiedad, variables
	public int ruedas;
	public double velocidad;
	//constructor
	public Vehiculo() {
		
	}
	
	//metodos
	public int acelerar() {
		int v=10;
		v = v+ 20;
		return v;
	}
	public int frenar() {
		return 0;
	}

}
