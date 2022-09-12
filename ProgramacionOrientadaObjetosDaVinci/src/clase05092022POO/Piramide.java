package clase05092022POO;

public class Piramide extends Triangulo {
	
	private int valor3;
	
	//implementar un constructor coin todas las variables
	public Piramide(int valor1, int valor2, int valor3) {
		super(valor1, valor2);
		this.valor3=valor3;
	}
	//getters and setters
	
	public int getValor3() {
		return valor3;
	}
	
	public void setValor(int valor3) {
		this.valor3=valor3;
	}
	
}
