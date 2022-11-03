package clase03112022SolPrueba2;

public abstract class Empleado {
	
	private int horasTrabajadas;
	private double sueldoPorHora;
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double getSueldoPorHora() {
		return sueldoPorHora;
	}
	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public abstract double calcularSalario();

}

//classes