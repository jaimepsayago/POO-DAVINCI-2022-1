package clase01092022POO;

public class AppClaseAbstracta {

	public static void main(String[] args) {
		ClaseAbstractaSubclase1 objSubclase1 = new ClaseAbstractaSubclase1();
		
		objSubclase1.setNumero(80);

		System.out.println("numero encapsulado de objeto 1 mediante met setnumero: "+ 
		objSubclase1.getNumero());
		
		objSubclase1.visualizar();
		objSubclase1.visualizarOtro();
	}

}
