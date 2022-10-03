package clase03102022Interfaces;

public class SubClase2  implements Superior{

	@Override
	public void visualizarCadena() {
		System.out.println("visualizar cadena subclase 2 - tarjeta de credito ");
		
	}

	@Override
	public int devolverNumero() {
		return 5000;
	}

}
