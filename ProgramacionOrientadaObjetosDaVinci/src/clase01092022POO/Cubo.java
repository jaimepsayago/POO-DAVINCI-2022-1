package clase01092022POO;

public class Cubo extends Cuadrado{
	//no tengo propiedades
	
	public Cubo() {
		
	}
	public Cubo(int valor1) {
		super(valor1);//enviando variables de aqui a la clase Padre
	//super(); //llamando a las varialbes de la clase padre
	
	}
	
	//sobre escritura del metodo
	public int getArea() {
		return (int) Math.pow(this.valor1, 3);
	}
	
}
