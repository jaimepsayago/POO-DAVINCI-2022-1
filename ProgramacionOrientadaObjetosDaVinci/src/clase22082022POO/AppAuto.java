package clase22082022POO;


public class AppAuto {

	public static void main(String[] args) {//aplicacion de consola
	
		//instanciar o ejemplarizar una clase
		Auto toyota = new Auto();  //objeto 1
		//acceso a propiedades
		System.out.println("este auto tiene el ancho"+ toyota.ancho);
		//acceso a metodos o comportamientos
		toyota.mensaje();
		
		
	}

}
