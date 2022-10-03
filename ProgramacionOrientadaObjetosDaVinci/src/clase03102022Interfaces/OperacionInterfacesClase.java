package clase03102022Interfaces;

public class OperacionInterfacesClase implements OperacionesInterface, OperacionesInterfacesEliminar {

	@Override
	public String insertarNombre(int id, String nombre) {
		//operaciones de bdd
		System.out.println("se insertor el nombre correctamente");
		return "ok-insertado";
	}

	@Override
	public String actualizarNombre(String nombre) {
		// operaciones para actulizada en bdd
		System.out.println("se actualizo el nombre");
		return "ok-actualizado";
	}

	@Override
	public String ejecutarNombre(String nombre) {
		// operaciones para ejecutar o listar
		System.out.println("nombre ejecutado");
		return "nombre-ejecutado";
	}

	@Override
	public String EliminarNombre(String nombre) {
		// operaciones de eliminado
		System.out.println("nombre eliminado");
		return "ok-eliminado";
	}
	
	
}
