package clase26092022;

public class Profesor extends Persona{

	int salario;
	
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	public Profesor(String nombre, int edad, int salario) {
		super(nombre, edad);
		this.salario=salario;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	//metodo heredado
	//no va ningun codigo
	
	
	
	
}
