package clase22092022.tarea;

public class Revista extends Publicacion {
	
	private String ISSN;
	private String periodicidad;
	private int numero; //numerador de coleccion
	private int numeroPaginas;
	
	public Revista(){
		
	}
	
	public String getISSN() {
		return ISSN;
	}
	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	protected void setExtension(Object informacionExtension) {
		// numero de paginas de esta revista
		numeroPaginas = ((Integer)informacionExtension).intValue(); 
		
	}

	@Override
	protected Object getExtension() {
		return new Integer(numeroPaginas);
	}

}
