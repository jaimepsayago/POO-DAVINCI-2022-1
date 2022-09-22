package clase22092022.tarea;

public class Tecnico extends Operario{

	public Tecnico() {
		
	}
	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("constructor de tecnico");
	}
	@Override
	public String toString() {
		return super.toString()   + "-->tecnico";
	}
}
