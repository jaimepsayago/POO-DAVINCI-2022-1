package clase24102022.tareaCollections;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class EjercicioColegio {
	LinkedHashMap<Integer, Colegio> alumno = new LinkedHashMap();
	
	public void addAlumno(String nacionalidad) {
	//añade la nacionalidad de un nuevo alumno
	if (alumno.containsKey(nacionalidad)) {
		Colegio c = new Colegio(1,"juan");
		alumno.put(1, c);
		}
	}
		
	void showAll(){
		Iterator<Integer> iA = alumno.keySet().iterator();
        while (iA.hasNext()) {
            Integer keyEstado = iA.next(); 
            System.out.println("datos: "+alumno.get(keyEstado.intValue()).getNombre());    
	}
	}
	void showNacionalidad(){
		for (Integer a: alumno.keySet()) {
			System.out.println("show dato" + alumno.get(a.intValue()).getNombre());
			
		}
	}
	
	public int cuantos()
	{
		return alumno.size();
	}

	public void borra() {
	//Elimina los datos insertados.
		alumno.remove(alumno);
	}
}
