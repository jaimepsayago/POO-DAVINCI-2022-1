package clase31102022Polimorfismo;

import java.util.Calendar;

public class AppProfesor {
	
	public static void main(String[] args) {
		
	
	//objeto de tipo profesor
	Profesor p1 = new Profesor("juan", "calle", 33, "prof-123");
	
	//fecha para agregar luego a un profesor interino
	Calendar fech1 = Calendar.getInstance();
	fech1.set(2022,01,22);
	
	//objeto de tipo profesor interino
	ProfesorInterino pI1 = new ProfesorInterino("pablo","alvarez", 54, "prof-999",fech1 );
	
	//objeto tipo lista para profesores
	ListaProfesores listaProfesores = new ListaProfesores();
	
	//agregar objetos a la lista
	listaProfesores.agregarProfesor(p1); //profesr
	listaProfesores.agregarProfesor(pI1); //profesor interino
	//estos dos objetos son diferentes en caracteristicas y variables
	
	//mostrat los datos
	listaProfesores.listar();
	
	
	
	}
	
}
