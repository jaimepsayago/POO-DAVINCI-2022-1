package clase03102022Interfaces;

public class SubClase1 implements Superior{

	@Override
	public void visualizarCadena() {
		System.out.println("cadena de efectivo");
		
	}

	@Override
	public int devolverNumero() {
		return 10;
	}
	
	

}
