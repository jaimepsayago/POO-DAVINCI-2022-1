package clase26092022;

public class Persona {
	
	public String nombre;
	public int edad;
	
	public Persona() {
		
	}
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	
}
