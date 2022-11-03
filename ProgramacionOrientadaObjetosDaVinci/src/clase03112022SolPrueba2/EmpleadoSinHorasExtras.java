package clase03112022SolPrueba2;

public class EmpleadoSinHorasExtras extends Empleado {

	@Override
	public double calcularSalario() {
		throw new UnsupportedOperationException("no tiene acceso a este metodo");
	}

}
