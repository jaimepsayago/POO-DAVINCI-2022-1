package clase29082022POO;

public class AppCoche {

	public static void main(String[] args) {
		
		
		Coche coche = new Coche(8, 52.3, 60);
	System.out.println(coche.acelerar()); //metodo viene del padre
	System.out.println(coche.repostar()); //metodo viene del hijo
		

	}

}
