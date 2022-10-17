package clase13102022EjemploInterfaces2;

public interface C extends A {
	
	default void doSth() {
		System.out.println("interfaz C");
	}
	

}
