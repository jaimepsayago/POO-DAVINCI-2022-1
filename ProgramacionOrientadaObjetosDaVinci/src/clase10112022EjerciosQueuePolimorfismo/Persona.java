package clase10112022EjerciosQueuePolimorfismo;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	Persona(){
		
	}
	Persona(String n, String a, int e){
		this.nombre=n;
		this.apellido=a;
		this.edad=e;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellido + ", edad=" + edad + "]";
	}
	
	

}
