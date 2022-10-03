package clase03102022Interfaces;

public class AppCantante {

	public static void main(String[] args) {
		//trabajar con los objetos
		Persona p = new Persona();
		Canario c = new Canario();
		
		hacerCantar(p);
		hacerCantar(c);
		
		

	}
	
	public static void hacerCantar(Cantante c) {
		c.cantar();
	}

}
