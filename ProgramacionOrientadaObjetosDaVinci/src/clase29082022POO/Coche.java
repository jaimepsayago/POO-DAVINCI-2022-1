package clase29082022POO;

public class Coche extends Vehiculo {
	//variables
	public int ruedas=4; //override
	public int gasolina;
	
	
	//constructor
public Coche(int ruedas, 
			double velocidad, int gasolina) {
		super(); //cargue a la hijo la herencia del padre
		this.gasolina = gasolina;
	}

	//metodos
	public int repostar() {
		return 20;
	}
	
}
