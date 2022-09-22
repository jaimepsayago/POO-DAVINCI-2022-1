package clase19092022;

import java.util.ArrayList;

public class AppSeleccion {

	public static void main(String[] args) {
		// crear objeto, agregarlos en una lista y luego mostrarlos
		
		Entrenador delBosque = new Entrenador (1, "vicente", "del bosque", 60, "id432");
		Futbolista iniesta = new Futbolista (2, "andres", "iniesta", 35, 6, "marcador" );
		Masajista raulMartines = new Masajista(3, "raul", "martinez", 40, "lic fisioterapia", 18);
		
		//agregar los objetos auna lista
		ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartines);
		
		//ejercutar la aplicacion y visualizar los objetos ingresados en la lista
		System.out.println("visualizar objetos");
		for(SeleccionFutbol integrante:integrantes ) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido()+ "-->");
			integrante.concentrarse();
		}
		
		//viaje
		for(SeleccionFutbol integrante:integrantes ) {
			System.out.println(integrante.getNombre() + " " + integrante.getApellido()+ "-->");
			integrante.viajar();
		}

	}

}
