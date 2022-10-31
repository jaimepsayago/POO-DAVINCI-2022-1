package clase31102022Polimorfismo;

public abstract class Animal implements Ianimal {

	public String nombre;
	
	public Animal() {
	
	}
	
	public Animal(String nombre) {
		this.nombre=nombre;
		//mensaje
		System.out.println("constructor Animal: " + this.nombre);
	}
	
	//implementamos aqui un metodo de una interface o de una clase abstracta
	/*public void comunicarse() {
		System.out.println("metodo comunicarse: Animal");
		
		
	}*/
	
	public String getNombre() {
		return nombre;
	}

	
	//mas metodos que no son implementados
	public abstract void tipoAnimal();

}
