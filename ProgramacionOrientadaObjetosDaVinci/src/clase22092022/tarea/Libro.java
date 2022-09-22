package clase22092022.tarea;

import java.util.List;

public class Libro extends Publicacion{

	private String ISBN;
	List<Tomo> listaVolumenes;
	
	public Libro() {
		
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	//metodo abastracto implementado con cast o conversion de tipo de datos, en este caso de Objeto a List<tomo>
	@Override
	protected void setExtension(Object informacionExtension) {
		listaVolumenes = (List<Tomo>)informacionExtension; //cast de informacionExtension a tipo List<Tomo>
		
	}
	@Override
	protected Object getExtension() {
		
		return listaVolumenes;
	}
	
	//metodo para obtener el tamaño de la lista de volumenes
	public int getNumeroVolumenes() {
		return listaVolumenes.size();
	}
	
	
}
