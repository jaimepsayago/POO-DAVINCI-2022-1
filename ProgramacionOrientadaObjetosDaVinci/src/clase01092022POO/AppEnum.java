package clase01092022POO;

public class AppEnum {

	public static void main(String[] args) {
		//crear objetos enum
		VasoPiscina vasoPiscina = null;
		//agregar un valor al objeto enum
		vasoPiscina = vasoPiscina.HORMIGON;
		
		//utilizacion de ENUM
		
		if (vasoPiscina == vasoPiscina.HORMIGON)
			System.out.println("facilita el transporte y rapida instalacion");
		switch (vasoPiscina) {
		case HORMIGON:
			System.out.println("es el sistema tradicional");
			break;
		case ACERO_INOXIDABLE:
			System.out.println("es el sistema de superficie mayor");
			break;
		case HINCHABLE:
			System.out.println("es el sistema mas economico");
			break;
		case FIBRA_VIDRIO:
			System.out.println("es el de facil transporte");
			break;
		
		}

	}

}
