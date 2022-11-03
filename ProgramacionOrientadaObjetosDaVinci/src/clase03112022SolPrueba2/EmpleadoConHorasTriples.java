package clase03112022SolPrueba2;

public class EmpleadoConHorasTriples extends Empleado {

	private int horasExtras;
	
	
	
	public int getHorasExtras() {
		return horasExtras;
	}



	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}



	@Override
	public double calcularSalario() {
		return (40 )+ (this.horasExtras * 3);
	}

}
