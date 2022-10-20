package clase17102022Collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Vector;

public class AppCollectionMap {

	public static void main(String[] args) {
		Estado estado1; //creamos un objeto Estado
		
		//instanciar un map
		LinkedHashMap<Integer, Estado> estados = new LinkedHashMap<>();
		
		//hashset 
		LinkedHashSet<Estado> listaEstadosHashSet = new LinkedHashSet<>();
		estado1= new Estado(1,"España", 46552212);
		//agregar a la lista hashmap
		listaEstadosHashSet.add(estado1);
		//instanciar otro objeto y agregarlo al map
		estado1 = new Estado(2,"Portugal", 45787744);
		listaEstadosHashSet.add(estado1);
		estado1 = new Estado(3,"Alemania", 95787744);
		listaEstadosHashSet.add(estado1);
		estado1 = new Estado(4,"Francia", 25787744);
		listaEstadosHashSet.add(estado1);
		estado1 = new Estado(5,"Italia", 65787744);
		listaEstadosHashSet.add(estado1);

		//si existe un valor o no y esta duplicado
		Estado estadoDuplicado = new Estado(4,"Francia", 25787744);
		listaEstadosHashSet.add(estadoDuplicado);
		if(listaEstadosHashSet.contains(estadoDuplicado))
			System.out.println("ya existe el objeto en el set");
		
		
		//Vector
		//es parecido array pero con metodos
		Vector<Estado> vectorEstados = new Vector<>();
		estado1= new Estado(1,"España", 46552212);
		vectorEstados.addElement(estado1);
		estado1 = new Estado(2,"Portugal", 45787744);
		vectorEstados.addElement(estado1);
		estado1 = new Estado(3,"Alemania", 95787744);
		vectorEstados.addElement(estado1);
		estado1 = new Estado(4,"Francia", 25787744);
		vectorEstados.addElement(estado1);
		estado1 = new Estado(5,"Italia", 65787744);
		vectorEstados.addElement(estado1);

		//recorrido for foreach iterator enumerator
		Estado estado2;
		for(int i=0; i<vectorEstados.size(); i++)
		{
			estado2 = vectorEstados.elementAt(i);
			System.out.println("id del vector: " + estado2.getIdEstado());
			System.out.println("nombre del vector: " + estado2.getNombre());
			System.out.println("habitantes: " + estado2.getNumeroHabitantes());
		}
		
		
		
		//instanciar objetos y agregarlo al map
		estado1= new Estado(1,"España", 46552212);
		//agregar a la lista hashmap
		estados.put(estado1.getIdEstado(), estado1);
		//instanciar otro objeto y agregarlo al map
		estado1 = new Estado(2,"Portugal", 45787744);
		estados.put(estado1.getIdEstado(), estado1);
		estado1 = new Estado(3,"Alemania", 95787744);
		estados.put(estado1.getIdEstado(), estado1);
		estado1 = new Estado(4,"Francia", 25787744);
		estados.put(estado1.getIdEstado(), estado1);
		estado1 = new Estado(5,"Italia", 65787744);
		estados.put(estado1.getIdEstado(), estado1);
		
		System.out.println("--------recorrido de hashmap");
		Iterator<Integer> iteratorEstados = estados.keySet().iterator();
		while(iteratorEstados.hasNext()) {
			Integer KeyEstado = iteratorEstados.next();
			System.out.println("id del hashmap: " + estados.get(KeyEstado.intValue()).getIdEstado());
			System.out.println("nombre del hashmap: " + estados.get(KeyEstado.intValue()).getNombre());
			System.out.println("habitantes: " + estados.get(KeyEstado.intValue()).getNumeroHabitantes());
			
		}
		System.out.println("--------busqueda de una valor -> CLAVE");
		Integer claveBuscada = new Integer(20);
		if(estados.containsKey(claveBuscada)) {
			Estado estado3 = estados.get(claveBuscada);
			System.out.println("id del hashmap: " + estado3.getIdEstado());
			System.out.println("nombre del hashmap: " + estado3.getNombre());
			System.out.println("habitantes: " + estado3.getNumeroHabitantes());
		}else {
			System.out.println("valor de la clave no existe en el Map!");
		}

	}

}
