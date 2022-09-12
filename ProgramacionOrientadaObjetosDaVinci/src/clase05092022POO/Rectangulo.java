package clase05092022POO;

public class Rectangulo extends FiguraGeometrica{
	private int valor2;
	
	//constructor
	public Rectangulo() {
		
	}
	public Rectangulo(int valor1, int valor2) {
		super(valor1);
		this.valor2=valor2;
	}
	
	protected int getValor2() {
		return valor2;
	}
	protected void serValor2(int valor2) {
		this.valor2=valor2;
	}
}
