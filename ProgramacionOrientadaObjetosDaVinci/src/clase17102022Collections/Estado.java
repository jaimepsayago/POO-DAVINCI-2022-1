package clase17102022Collections;

public class Estado{
	
	private int idEstado;
	private String nombre;
	private int numeroHabitantes;
	
	public Estado() {
		
	}
	public Estado(int idEstado, String nombre, int numeroHabitantes) {
		this.idEstado=idEstado;
		this.nombre=nombre;
		this.numeroHabitantes=numeroHabitantes;
		
	}
	public int getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	
	//Tostring()
	//muestra todos los atrbituso
	
	//comparaciones de objetos y contenidos del objeto
	@Override
	public boolean equals(Object objeto) {
		boolean iguales = false;
		
		if (objeto instanceof Estado) {
			Estado estado = (Estado)objeto;
			if ((this.idEstado == estado.idEstado) && (this.nombre.equals(estado.nombre) && (this.numeroHabitantes == 
					estado.numeroHabitantes)) )
				iguales = true;
		}
		
		return iguales;
	}
	
	//hashcode igualmente me sirve para las comparaciones pero es mucho mas rapido ya q convierte el objet en entero y lo compara
	@Override
	public int hashCode() {
		return idEstado + nombre.hashCode() + numeroHabitantes;
	}
	
	

}
