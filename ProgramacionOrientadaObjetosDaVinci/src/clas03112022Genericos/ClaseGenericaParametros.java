package clas03112022Genericos;

public class ClaseGenericaParametros <V, T> {

	//usar dos parametos como tipo de datos
	T obj1;
	V obj2;
	
	public ClaseGenericaParametros() {
		
	}
	ClaseGenericaParametros(T o1 , V o2){
		obj1=o1;
		obj2=o2;
	}
	public T getObj1() {
		return obj1;
	}
	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}
	public V getObj2() {
		return obj2;
	}
	public void setObj2(V obj2) {
		this.obj2 = obj2;
	}
	
	//mostrat los tipos de t y v
	public void mostrarTipo() {
		System.out.println("tipo de dato T: " + obj1.getClass().getName());
		System.out.println("tipo de dato V: " + obj2.getClass().getName());
	}
	
}
