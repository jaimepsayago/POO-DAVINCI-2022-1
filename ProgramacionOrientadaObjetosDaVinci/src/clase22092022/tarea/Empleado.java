package clase22092022.tarea;

public class Empleado {
	private String nombre;
	
	//constructor
	public Empleado() {
		
	}
	public Empleado(String nombre) {
		this.nombre=nombre;
		System.out.println("constructor empleado  " + nombre); //mostrar diferencias
		
	}

	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//metodo string
	//predeterminado en java
	
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}

}
