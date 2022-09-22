package clase22092022.tarea;

public class Operario extends Empleado{
// clase operacion es una clase hija o clase derivada de la clase empleado
	
	public Operario() {
		//pueder ir como no pueder ir la palabra reservada super
		
	}
	public Operario(String nombre) {
		super(nombre);
		System.out.println("constructor operario");
	}
	
	@Override //modificando el metodo toString original para mostrar la informacion de mi clase
	public String toString(){
		return super.toString() + "-->operario";
	}
	
	
}
