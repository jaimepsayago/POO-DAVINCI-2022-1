package clase24102022.tareaCollections;

import java.util.Objects;



public class Colegio {
	public Integer id;
	public String nombre;
	
	
	public Colegio() {
		// TODO Auto-generated constructor stub
	}
	public Colegio(Integer id, String nombre) {
		this.id=id;
		this.nombre=nombre;
			
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Colego id=" + id + ", nombre=  " + nombre;
	}
	
	//hash code
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
	
	//compareTo
	public int compareTo(Persona p) {
		return this.id.compareTo(p.getId());
	}
}
