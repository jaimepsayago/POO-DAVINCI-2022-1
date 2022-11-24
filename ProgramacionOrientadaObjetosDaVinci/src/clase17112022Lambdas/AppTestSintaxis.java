package clase17112022Lambdas;

public class AppTestSintaxis {

	public static void main(String[] args) {
		// NORMALMENTE IMPLEMENTACION
		
		//CSintaxis interfaceNormal = new CSintaxis();
		//interfaceNormal.aceptar(12);
		
		//()->{}
		//implementando la funcion
		
		/*Sintaxis f = (valor) ->{
			System.out.println("hola mundo f lambda "+ valor);
			
		};*/
		
		Sintaxis f = (valor, valor1) -> 
			System.out.println("hola mundo f lambda "+ valor + valor1);
		
		
		f.aceptar(12,3);

		
		//implementando en una clase anonima para el metodo funcional
		StringProcessor nSP = new StringProcessor() {
			@Override
			public String process(String x) {
				return x.toUpperCase();
			}
		}; 
		
		System.out.println(nSP.process("hola") );
		
		
		//inferencia
		InteferenciaTipo_2 f1 = () -> System.out.println("hola mundo");
		
		//f1.accept();
		
		AppTestSintaxis test = new AppTestSintaxis();
		test.metodo(f1);
		
		
			
	}
	public void metodo(InteferenciaTipo_2 parametro) {
		parametro.accept();
	}

}
