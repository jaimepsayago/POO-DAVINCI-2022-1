package clase22092022.tarea;

public class Directivo extends Empleado{
  
	public Directivo() {
		
	}
	public Directivo(String nombre) {
		super(nombre);
		System.out.println("constructor directivo");
	}
	
	@Override
	public String toString() {
		return super.toString() + "-->Directoivo";
	}
}
