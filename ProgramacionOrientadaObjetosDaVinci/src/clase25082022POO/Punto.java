package clase25082022POO;

public class Punto {
	//abstracción
	//definir una clase Punto y contiene las coordenas x y de un punto en un plano
	
	private int x, y; //coordenadas x y
	private int z;
	//sobrecarga de metodos: es utilizar el mismo metodo con diferents parametros pero generando las misma funcionalidad
	//constructor 
	public Punto(){
		
	}
	//constructor con un valor parametrizado y otro fijo
	public Punto(int x) {
		this.x=x;
		this.y=50;
	}
	//constructor con valores iniciales
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Punto(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z =z;
	}
	
	//getters and setters
	//get x
	public int getX() {
		return this.x;
	}
	//set
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	
}
