package clase01092022POO;

public class ClaseAbstractaSubclase1 extends ClaseAbstractaSuperior {

	@Override
	void setNumero(int numero) {
		this.numero=numero;
		
	}

	@Override
	int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}
	
	//crear otros metodos u otras propiedades
	public void visualizarOtro() {
		System.out.println("cadena subclase1 en visualizarOtro");
	}

}
