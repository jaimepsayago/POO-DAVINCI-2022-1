package clase22092022.tarea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AppCuadrado {

	public static void main(String[] args) {
		
		//dos variable
		String colorCuadrado, colorTriangulo;
		double ladoCuadrado, base, altura;
		
		//input de consola.
		//Scanner, BufferReader, InputReader
		//joptionPanel = Graphics = Swing
		//Servlets and JSP = Web 
		
		//introducir texto desde consola
		//cuadrado
		colorCuadrado = leerTexto("introduce el color cuadrado");
		ladoCuadrado = Double.parseDouble(leerTexto("introduce el lado del cuadrado"));
		//operacion
		Cuadrado c = new Cuadrado(colorCuadrado, ladoCuadrado);
		System.out.println("el area del cuadrado es: " + c.calcularArea());
		
		//triangulo
		colorTriangulo = leerTexto("introduce el color Triangulo");
		base = Double.parseDouble(leerTexto("introduce el lado del cuadrado"));
		altura = Double.parseDouble(leerTexto("introduce el lado del cuadrado"));
		//operacion
		Triangulo t = new Triangulo(colorTriangulo, base, altura);
		System.out.println("el area del triangulo es: " + t.calcularArea());
				
	}
	
	public static String leerTexto(String mensaje) {
		String texto;
		try {
			//codificacion
			BufferedReader ingreso = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			texto = ingreso.readLine();
		} catch (Exception e) {
			texto = "error";
			System.out.println("errores " + e.getStackTrace() );
		}
		return texto;
	}

}
