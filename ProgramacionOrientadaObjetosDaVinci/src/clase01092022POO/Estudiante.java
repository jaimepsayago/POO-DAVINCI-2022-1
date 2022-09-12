package clase01092022POO;

public class Estudiante extends Persona {
private int codigo;
private String facultad;

public Estudiante(int id, String nombre, String apellido,int codigo,String facultad) {
	super(id, nombre, apellido);
	this.facultad=facultad;
	this.codigo=codigo;
}
}