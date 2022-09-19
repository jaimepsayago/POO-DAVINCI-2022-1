package clase16092022;

public class Persona {
	private String dni;
	private String nombre;
	private String telefono;
	private Fecha fechaNacimiento;
	
	public Persona() {
		
	}
	public Persona(String dni, String nombre, String telefono, Fecha fechaNacimiento) {
		this.dni= dni;
		this.nombre= nombre;
		this.telefono = telefono;
		this.fechaNacimiento= fechaNacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	

}
