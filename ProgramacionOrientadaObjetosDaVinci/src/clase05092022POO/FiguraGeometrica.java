package clase05092022POO;

public class FiguraGeometrica {
	
	protected int valor1;
	
	//constructor
	public FiguraGeometrica() {
		
	}
	public FiguraGeometrica(int valor1) {
		super(); //herencia ala clase padre o superclase --> //OBJECT
		this.valor1=valor1;
		
	}
	
	//metodos
	//getters and setters
	protected int getValor1() {
		return valor1;
	}
	protected void setValor1(int valor1) {
		this.valor1=valor1;
		//valor1 = variable;
	}
}
