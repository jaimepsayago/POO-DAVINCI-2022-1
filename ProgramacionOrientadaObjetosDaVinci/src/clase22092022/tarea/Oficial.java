package clase22092022.tarea;

public class Oficial extends Operario {

	public Oficial() {
		
	}
	public Oficial(String nombre) {
		super(nombre);
		System.out.println("constructor oficial");
	}
	@Override
	public String toString() {
		return super.toString()   + "-->oficial";
	}
}
