package clase03102022PrimerParcial;

public class LibroCalificaciones {
/*
 * 1.	Construir la clase LibroCalificaciones tiene un atributo nombreDelCurso de tipo String y privado. 
 * con dos constructores (uno vac�o y otro con el par�metro respectivo), 
 * adem�s implementar los m�todos 
 * de la clase establecerNombreDelCurso (con un par�metro nombre de tipo String), 
 * obtenerNombreDelCurso (que devuelve el tipo String) y mostrarMensaje. 
 * Instanciar cuatro objetos y mostrar un mensaje perteneciente a cada objeto. (2p)
 */
	private String nombreDelCurso;
	
	public LibroCalificaciones() {
		
	}
	public LibroCalificaciones(String nombreDelCurso) {
		this.nombreDelCurso=nombreDelCurso;
	}
	
	
	public void establecerNombreDelCurso (String nombreDelCurso) {
		this.nombreDelCurso=nombreDelCurso;
	}
	public String obtenerNombreDelCurso() {
		return nombreDelCurso;
	}
	
	public void mostrarMensaje() {
		System.out.println("libro de calificaciones: \n Nombre del curso: " + nombreDelCurso);
	}
}
