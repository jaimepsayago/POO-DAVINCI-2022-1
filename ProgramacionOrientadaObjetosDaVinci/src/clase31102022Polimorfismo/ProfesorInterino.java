package clase31102022Polimorfismo;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {

	//fecha de comienzo de trabajo
	private Calendar fechaComienzoTrabajoInterino;
	
	
	public ProfesorInterino()
	{
		super();
	}
	public ProfesorInterino(String nombre, String apellido, int edad, String idProfesor,Calendar fechaComienzoTrabajoInterino) {
		super(nombre, apellido,edad, idProfesor);
		this.fechaComienzoTrabajoInterino=fechaComienzoTrabajoInterino;
	}
	public Calendar getFechaComienzoTrabajoInterino() {
		return fechaComienzoTrabajoInterino;
	}
	public void setFechaComienzoTrabajoInterino(Calendar fechaComienzoTrabajoInterino) {
		this.fechaComienzoTrabajoInterino = fechaComienzoTrabajoInterino;
	}
	@Override
	public String toString() {
		return "ProfesorInterino [fechaComienzoTrabajoInterino=" + fechaComienzoTrabajoInterino.toString() + "]";
	}
	
	
	
	
}
