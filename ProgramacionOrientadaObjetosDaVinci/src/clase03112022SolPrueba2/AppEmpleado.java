package clase03112022SolPrueba2;

import java.util.Scanner;

public class AppEmpleado {

	public static void main(String[] args) {
		//agregar el ingreso de las horas
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingrese las horas trabajadas");
		int horasTrabajadas = sc.nextInt();
		
		System.out.println("ingrese el sueldo por hra");
		int sueldoHora = sc.nextInt();
		
		
		if(horasTrabajadas <40) {
			System.out.println("el suledo es " + horasTrabajadas * sueldoHora);
		}
		else if(horasTrabajadas > 40 && horasTrabajadas<= 45) {
			int horaExt = horasTrabajadas-40;
			EmpleadoConHorasDobles e1 = new EmpleadoConHorasDobles();
			e1.setHorasExtras(horaExt);
			System.out.println("sueldo joranada doble: " + e1.calcularSalario());
		}
		else if (horasTrabajadas > 45) {
			int horaExt = horasTrabajadas-40;
			EmpleadoConHorasTriples e2 = new EmpleadoConHorasTriples();
			e2.setHorasExtras(horaExt);
			System.out.println("sueldo joranada tripe: " + e2.calcularSalario());
		}
	}

}
