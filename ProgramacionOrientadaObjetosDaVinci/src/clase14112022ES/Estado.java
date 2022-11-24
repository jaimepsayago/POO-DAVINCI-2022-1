package clase14112022ES;

public class Estado implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int idEstado;
    private String nombre;
    
private int numeroHabitantes;
    
    public Estado() {
    }
    
    public Estado(int idEstado, String nombre, int numeroHabitantes) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
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

	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", nombre=" + nombre + ", numeroHabitantes=" + numeroHabitantes + "]";
	}    
   
    

}
