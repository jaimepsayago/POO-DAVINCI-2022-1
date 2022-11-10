package clase10112022EjerciosQueuePolimorfismo;

/**
 * 
 * @author JSH
 * @version 0.1
 * @fecha nov 2022
 * 
 *
 */

public class Trabajador extends Persona{
	private double salario;
	
	public Trabajador() {
	
	}

	public Trabajador(String nombre, String apellido, int edad, double salario) {
		super(nombre,apellido,edad);
		this.salario=salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		
		return "Trabajador" + super.toString() + "[salario=" + salario + "]";
	}
	
	

	
}
