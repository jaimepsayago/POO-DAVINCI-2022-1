package clase19092022;

public class Futbolista extends SeleccionFutbol{

	private int dorsal;
	private String demarcacion;
	
	public Futbolista() {
		super();//heredo las variables del padres
	}
	public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellido, edad);//heredo las variables del padres
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
	}
	
	public void jugarPartido(){
		System.out.println("jugar partido futbolista");
		
	}
	public void entrenar(){
		System.out.println("entrenar futbolista");
		
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", demarcacion=" + demarcacion + "]";
	}
	
	
}
