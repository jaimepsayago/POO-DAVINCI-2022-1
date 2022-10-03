package clase03102022PrimerParcial;

public class AppLibro {

	public static void main(String[] args) {
		// 4 objetos
		LibroCalificaciones obj1 = new LibroCalificaciones("primer curso");
		
		LibroCalificaciones obj2 = new LibroCalificaciones("segundo curso");
		
		LibroCalificaciones obj3 = new LibroCalificaciones("tercero curso");
		
		LibroCalificaciones obj4 = new LibroCalificaciones();
		obj4.establecerNombreDelCurso("cuarto curso");
		
		obj1.mostrarMensaje();
		obj2.mostrarMensaje();
		obj3.mostrarMensaje();
		obj4.mostrarMensaje();

	}

}
