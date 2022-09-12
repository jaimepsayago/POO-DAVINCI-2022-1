package clase01092022POO;

public abstract class ClaseAbstractaSuperior {

	//me sirven para declarar 
	//propiedades o metodos 
	//y que las clases heredadas los implmementen
	

	
	protected int numero;
	
	//declarados
	abstract void setNumero(int numero);
	
	abstract int getNumero(); 
	//faltan la accion o codifacacino de cada
	//metodo 
	//declarar e implementos
	
	//metodos y propiedades normales
	public void visualizar() {
		System.out.println("cadena clase superior");
	}
	
}
