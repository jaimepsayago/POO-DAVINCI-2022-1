package clase26092022;

public class Publicacion {
	//atributos
	public String editor;
	public String fecha;
	
	public Publicacion() {
		
	}
	public Publicacion(String editor, String fecha) {
		this.editor=editor;
		this.fecha=fecha;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
