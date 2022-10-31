package clase31102022Polimorfismo;

public class Gato extends Animal {

	
	public Gato(String nombre) {
		super(nombre);
		System.out.println("Constructor gato: " + nombre);
	}
	
	//no necesitamos!
	//recien aqui implementamos el metodo x eso no necesitamos el override
	public void comunicarse() {
		System.out.println("metodo comunicarse: el gato maulla: Miau, Miau");
		
		
	}

	//no vaya por que no esta implementado, 
	//recien aqui lo estoy implementado
	public void tipoAnimal() {
		System.out.println("Tipo animal: es un gato");
		
	}

}
