package clase26092022;

import java.util.ArrayList;

public class AppEjercicio {

	public static void main(String[] args) {
		// obj estudisante
		Estudiante e1 = new Estudiante ("vincente calle", 50, 1234);
		Estudiante e2 = new Estudiante ("juan perez", 24, 5241);
		Estudiante e3 = new Estudiante ("pablo calle", 30, 9845);
		
		//objet profesor
		Profesor p1 = new Profesor("jaime sayago", 38, 999);
		//objet array list de tipo persona
		ArrayList<Persona> personaLista = new ArrayList<Persona>();
		personaLista.add(e1);
		personaLista.add(e2);
		personaLista.add(e3);
		personaLista.add(p1);
		
		System.out.println("visualizar");
		for (Persona p: personaLista) {
			System.out.println(p.toString());
		}
		

	}

}
