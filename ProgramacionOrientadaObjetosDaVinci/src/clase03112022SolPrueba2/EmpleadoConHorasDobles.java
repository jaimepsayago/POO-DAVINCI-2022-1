package clase03112022SolPrueba2;

public class EmpleadoConHorasDobles extends Empleado {

	private int horasExtras;
	//private double sueldoHora;
	
	
	
	@Override
	public double calcularSalario() {
		return (40 )+ (this.horasExtras * 2);
	}



	public int getHorasExtras() {
		return horasExtras;
	}



	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

}
