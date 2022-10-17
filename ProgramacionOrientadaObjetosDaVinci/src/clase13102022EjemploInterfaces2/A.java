package clase13102022EjemploInterfaces2;

public interface A {
//a partir de java 11
//tenemos dentro de la interfaz una caracteristica 
//de implementar  metodos dentro de la interfaz	
	default void doSth() {
		System.out.println("interfaz A");
	}
	
	
}
