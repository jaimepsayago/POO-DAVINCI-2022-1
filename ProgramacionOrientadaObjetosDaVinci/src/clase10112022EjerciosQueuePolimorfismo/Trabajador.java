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
	public void calcularPaga(){
		if(salario>1500.0 && salario < 2000) {
			double bono = (salario*8)/100;
			System.out.println("mayor a 1500: " + bono);
		}else
			if(salario>2000.0) {
				double bono  = (salario*10)/100;
				System.out.println("mayor a 2000: " + bono);
			}
    }

	@Override
	public String toString() {
		return "Trabajador" + super.toString() + "[salario=" + salario + "]";
	}
	
	

	
}
