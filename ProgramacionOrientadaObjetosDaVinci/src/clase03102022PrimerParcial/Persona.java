package clase03102022PrimerParcial;

public class Persona {
	int cedula;
	String nombre;
	int anio;
	
	public Persona() {
	
	}

	public Persona(int cedula, String nombre, int anio) {
		this.cedula=cedula;
		this.nombre=nombre;
		this.anio= anio;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", anio=" + anio + "]";
	}
	
	
}
