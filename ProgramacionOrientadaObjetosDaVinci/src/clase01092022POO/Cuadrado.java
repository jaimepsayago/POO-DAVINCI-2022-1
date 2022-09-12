package clase01092022POO;

public class Cuadrado {
	protected int valor1;
	
	public Cuadrado() {
		
	}
	public Cuadrado(int valor1) {
		this.valor1= valor1;
	}
	
	//metodos
	public int getArea() {
		return (int) Math.pow(this.valor1,2);
	}

}
