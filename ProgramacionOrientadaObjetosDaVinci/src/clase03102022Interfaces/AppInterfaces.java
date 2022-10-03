package clase03102022Interfaces;

public class AppInterfaces {

	public static void main(String[] args) {
		// instaciamos objetos que de la subclase1
		SubClase1 sc1 = new SubClase1();
		invocarMetodosSubclase(sc1);
		SubClase2 sc2 = new SubClase2();
		invocarMetodosSubclase(sc2);
		

	}
	
	public static void invocarMetodosSubclase(Superior superior) {
		superior.visualizarCadena();
		System.out.println(superior.devolverNumero());
	}
	

}
