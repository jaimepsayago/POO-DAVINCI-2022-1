package clase16092022;

public class Garaje {
	private int superficie;
	private byte numeroPlazas;
	private boolean puertaAperturaAutomatica;
	
	public Garaje() {
		
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public byte getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(byte numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public boolean isPuertaAperturaAutomatica() {
		return puertaAperturaAutomatica;
	}

	public void setPuertaAperturaAutomatica(boolean puertaAperturaAutomatica) {
		this.puertaAperturaAutomatica = puertaAperturaAutomatica;
	}

	@Override
	public String toString() {
		return "Garaje [superficie=" + superficie + ", numeroPlazas=" + numeroPlazas + ", puertaAperturaAutomatica="
				+ puertaAperturaAutomatica + "]";
	}
	
	

}
