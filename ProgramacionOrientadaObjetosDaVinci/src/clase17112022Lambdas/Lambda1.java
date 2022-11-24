package clase17112022Lambdas;

import java.util.ArrayList;

public class Lambda1 {

	public static void main(String[] args) {
		// arraylist y utiizar funciones lambdas
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(9);
		
		numbers.forEach(
				(n) -> {
					System.out.println(n);
				}
			);
		
		
		//normalmente para imprimir
		//for(int i=0; i<numbers.size(); i++) { Array
		//	System.out.println("imprimir array" + numbers);
		//}
			
		
			
		

	}

}
