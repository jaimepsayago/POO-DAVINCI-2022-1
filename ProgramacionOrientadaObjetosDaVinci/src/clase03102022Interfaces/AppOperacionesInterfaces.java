package clase03102022Interfaces;

public class AppOperacionesInterfaces {

	public static void main(String[] args) {
		// ingreso de datos
		
		OperacionInterfacesClase operaciones = new OperacionInterfacesClase();
		operaciones.insertarNombre(1, "juan");
		operaciones.actualizarNombre("pedro");
		operaciones.ejecutarNombre("Pablo");
		operaciones.EliminarNombre("pablo");

	}

}
