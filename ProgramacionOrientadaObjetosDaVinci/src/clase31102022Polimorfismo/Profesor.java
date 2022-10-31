package clase31102022Polimorfismo;

public class Profesor  extends Persona{
	private String idProfesor;
	
	public Profesor() {
		super();
		
	}
	public Profesor(String nombre, String apellido, int edad, String idProfesor) {
		super(nombre, apellido,edad);
		this.idProfesor=idProfesor;
		
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + getNombre() + " " + getApellido() +" " + getEdad() + "]";
	}
	
	

}
