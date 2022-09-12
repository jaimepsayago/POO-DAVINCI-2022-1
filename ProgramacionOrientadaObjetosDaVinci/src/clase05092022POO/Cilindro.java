package clase05092022POO;

public class Cilindro extends Circulo{

	private int valor2;
	//sin ningun parametro para agregar dastos a las variables utilizo getters and setters
	public Cilindro() {
		
	}
	//unicamente voy a agregar un valor que hereda del padre
	public Cilindro(int valor1) {
		super(valor1);
	}
	//agrego dos valores el primero del padre y el segundo de la clase cilindro
	public Cilindro(int valor1, int valor2) {
		super(valor1);
		this.valor2= valor2;
	}
	
	//getters and setters
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2=valor2;
	}
	

}
