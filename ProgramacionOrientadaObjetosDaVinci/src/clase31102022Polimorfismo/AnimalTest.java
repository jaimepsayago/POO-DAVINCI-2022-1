package clase31102022Polimorfismo;

public class AnimalTest {

	public static void main(String[] args) {
	
		//operaciones polimorficas
		//crear un animal de tipo perro
		Animal animal = new Perro("Bobby");
		animal.tipoAnimal();
		animal.comunicarse();
		System.out.println();
		
		//un obj perro de tipo perro
		Perro perro = new Perro("hercules");
		perro.tipoAnimal();
		System.out.println();
		
		//crear un ojbeto polimorfico, un obj perro de tipo animal
		//con referencia a un objeto
		Animal animalPoli = perro;
		animalPoli.tipoAnimal();
		System.out.println();
		
		//un objeto gato de tipo animal
		Animal gato = new Gato("gatita");
		gato.tipoAnimal();
		gato.comunicarse();
		System.out.println();
		
		
		//objetos desde la interface
		//objeto gato de tipo Ianimal
		
		Ianimal gato2 = new Gato("lola"); //aplicando polimorfismo con la interface
		gato2.comunicarse();
		System.out.println("constante desde interface"+  gato2.valor);
		System.out.println();
		
		//array de objetos como una prueba
		Animal animales [] = { new Perro("simon"), new Perro("paco"), 
				new Gato("mimi"), new Perro("rocky")};
		//array de objetos de tipo animal
		for (Animal a: animales) {
			System.out.println(a.getNombre());
			a.tipoAnimal();
			a.comunicarse();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
