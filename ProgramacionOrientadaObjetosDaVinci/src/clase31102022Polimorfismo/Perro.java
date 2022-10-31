package clase31102022Polimorfismo;

public class Perro extends Animal{
	
	public Perro(String nombre) {
		super(nombre);
		System.out.println("Constructor perro, nombre:" + nombre);
	}

	public void comunicarse() {
		System.out.println("metodo comunicarse: el perro ladra... guau guau");
		
	}

	public void tipoAnimal() {
		System.out.println("tipo animal: es un perro");
		
	}

}
