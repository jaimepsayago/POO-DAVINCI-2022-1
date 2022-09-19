package clase16092022;

public class Piscina {
	private int volumen;
	private boolean cubierta;
	private VasoPiscina vasoPiscina;
	
	public Piscina() {
		
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public boolean isCubierta() {
		return cubierta;
	}

	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	public VasoPiscina getVasoPiscina() {
		return vasoPiscina;
	}

	public void setVasoPiscina(VasoPiscina vasoPiscina) {
		this.vasoPiscina = vasoPiscina;
	}

	@Override
	public String toString() {
		return "Piscina [volumen=" + volumen + ", cubierta=" + cubierta + ", vasoPiscina=" + vasoPiscina + "]";
	}
	
	//ToString
	
	

}
