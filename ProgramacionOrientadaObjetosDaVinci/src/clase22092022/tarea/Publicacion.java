package clase22092022.tarea;

public abstract class Publicacion {
	private String titulo;
	private String autor;
	private int precio;
	
	//metodo abastract de objeto 
	//Object es el padre de todas clases en java
	//estos metodos no estan implementados 
	protected abstract void setExtension (Object informacionExtension);
	protected abstract Object getExtension();
	
	
	public Publicacion() {
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	

}
