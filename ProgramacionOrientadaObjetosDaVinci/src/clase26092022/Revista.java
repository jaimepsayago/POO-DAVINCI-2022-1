package clase26092022;

public class Revista extends Publicacion  {
	
	public int numeroEjemplaresPorAnyo;
	public String periodicidad;
	
	Revista(){
		
	}
	Revista(String editor, String fecha,int numeroEjempladresPorAnyo, String periodicidad){
		super(editor, fecha);
		this.numeroEjemplaresPorAnyo = numeroEjempladresPorAnyo;
		this.periodicidad=periodicidad;
		
	}
	public int getNumeroEjemplaresPorAnyo() {
		return numeroEjemplaresPorAnyo;
	}
	public void setNumeroEjemplaresPorAnyo(int numeroEjemplaresPorAnyo) {
		this.numeroEjemplaresPorAnyo = numeroEjemplaresPorAnyo;
	}
	public String getPeriodicidad() {
		return periodicidad;
	}
	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	
	
	
}
