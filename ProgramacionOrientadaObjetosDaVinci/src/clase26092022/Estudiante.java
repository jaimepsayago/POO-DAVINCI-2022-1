package clase26092022;

public class Estudiante  extends Persona{

	public int id;
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	public Estudiante(String nombre, int edad, int id) {
		super(nombre, edad);
		this.id =id;
	} 
	
	//metodo redefinido o reescrito
	@Override
	public String toString() {
		return super.toString() + "id: " + id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
