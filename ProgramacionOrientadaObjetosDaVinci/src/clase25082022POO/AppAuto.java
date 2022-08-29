package clase25082022POO;


public class AppAuto {

	public static void main(String[] args) {//aplicacion de consola
	
		//instanciar o ejemplarizar una clase
		Auto toyota = new Auto(); 
		//acceso a propiedades
		System.out.println("este auto tiene el ancho"+ toyota.ancho);
		//acceso a metodos o comportamientos
		toyota.mensaje();
		
		Auto renault = new Auto(); //objeto 2
		renault.comer(); //imprimir un mensaje
		System.out.println(renault.dormir()); //devolver un numero
		System.out.println(renault.horaSueño(7, 8));
		
		
		//encapsulado
		Auto ford = new Auto(); //objeto 3
		ford.setColor("Azul"); //agrego
		System.out.println(ford.getColor()); //obtengo
	}

}
