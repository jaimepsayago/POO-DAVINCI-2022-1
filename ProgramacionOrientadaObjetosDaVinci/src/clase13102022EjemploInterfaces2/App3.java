package clase13102022EjemploInterfaces2;

public class App3 implements B, A {

	@Override
	public void doSth() {
	 A.super.doSth(); //sobreescribiendo el metodo y arreglando
	 //algun comflicto con otra interfaz
	}
	
	public static void main(String[] args) {
		new App3().doSth();

	}

}
