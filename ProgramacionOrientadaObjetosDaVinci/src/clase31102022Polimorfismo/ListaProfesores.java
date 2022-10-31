package clase31102022Polimorfismo;

import java.util.ArrayList;

public class ListaProfesores {
	//operaciones con datos de agregar y mostrar
	
	//delcar un arrayLista de tipo profesro
	private ArrayList<Profesor> listProfesores;
	
	public ListaProfesores() {
		//inicializar un arraylist de tipo profesr
		listProfesores = new ArrayList<Profesor>();
				
	}
	
	//getrters and setters
	
	//metodos
	
	//agregar profesr
	public void agregarProfesor(Profesor profesor) {
		listProfesores.add(profesor);
	}
	
	//listar los profesor
	public void listar() {
		System.out.println("mostrar todos los profesor de listado array");
		for(Profesor p:listProfesores) {
			System.out.println(p.toString());
		}
	}
	
	

}
