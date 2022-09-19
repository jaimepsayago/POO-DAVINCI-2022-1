package clase16092022;

public enum VasoPiscina {
	HORMIGON(400,"Estructurado de hormigon armado"),
	ACERO_INOXIDABLE (500, "paneles de acero inoxidable"),
	HINCHABLE (200, "PVC permite hinchado con bomba de aire"),
	FIBRA_VIDRIO(300, "Poliester reforzado con fibra de vidio");
	
	private int precioPorMetroCubico;
	private String descripcion;
	
	private VasoPiscina(int precioPorMetroCubico, String descripcion) {
		this.precioPorMetroCubico = precioPorMetroCubico;
		this.descripcion = descripcion;
	}

	public int getPrecioPorMetroCubico() {
		return precioPorMetroCubico;
	}

	public void setPrecioPorMetroCubico(int precioPorMetroCubico) {
		this.precioPorMetroCubico = precioPorMetroCubico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
