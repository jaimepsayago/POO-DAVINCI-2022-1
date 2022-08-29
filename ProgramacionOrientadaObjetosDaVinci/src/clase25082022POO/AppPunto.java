package clase25082022POO;

public class AppPunto {

	public static void main(String[] args) {
		//imprimir en consola
		
		Punto p; //creando un objeto 
		//incializar
		p = new Punto(10,54); //obj1
		
		//Punto p1 = new Punto(20);
		
		Punto p2 = new Punto();
		p2.setX(60);
		p2.setY(80);
		
		System.out.println(p.getY());
	}

}
