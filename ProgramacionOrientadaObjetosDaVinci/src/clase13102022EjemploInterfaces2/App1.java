package clase13102022EjemploInterfaces2;

public class App1 implements A {

	@Override
	public void doSth() {
		System.out.println("aplicacion app1");
	}
	
	public static void main(String[] args) {
		
		new App1().doSth(); //objeto de App1 y llamando al metodo correspondiente al objeto

		new App1().doSth();
	}

}
