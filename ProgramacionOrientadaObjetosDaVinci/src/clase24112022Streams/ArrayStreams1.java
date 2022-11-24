package clase24112022Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class ArrayStreams1 {

	public static void main(String[] args) {
		//introduccion a streams con arrays
		
		int [] arra= {50,10,250,100,23,45,33,55,67,83,90,92,94,74,200,4005,354,125};
		//recorridos en base a theards o hilos tipo entero
		Arrays.stream(arra, 3, 6)
					.forEach(
							i->{
								System.out.println( 
										Thread.currentThread().getName() 
										+ ": " + i );
							});
		
		String [] arraString= {"aaa","bbb","ccc","ddd","eee"};
		
		//recorridos en base a theards o hilos  tipo String
		Arrays.stream(arraString)
		.forEach(
				i->{
					System.out.println( 
							Thread.currentThread().getName() 
							+ ": " + i );
				});
		
	List<Integer> bigList = List.of(50,10,250, 100, 23, 45, 33, 55, 67, 83, 90, 92, 94, 74, 200, 40052, 3467, 125);

	//recorridos en base a theards o hilos en parelelo
		bigList.parallelStream()
		.forEach(
				i->{
					System.out.println( 
							Thread.currentThread().getName() 
							+ ": " + i );
				});
		
		//builder o construccion y agregacion de datos 
		Stream<Integer> built = Stream.<Integer>builder().add(50).add(10).add(250).build();
		built.forEach(System.out::println);
		
		//generar un streams randomico y leer luego
		Stream<Integer> randomico = 
				Stream.generate(
						//implementar es decir agregar la codificacion
						()-> new Random().nextInt(300)+1
				).limit(5);
		
		randomico.forEach(System.out::println);
	}

}
