package clase03102022PrimerParcial;

public class AppAlumno {

	public static void main(String[] args) {
		// 3 objetos
		Alumno a1 = new Alumno();
		a1.setCedula(0321245);
		a1.setNombre("juan");
		a1.setAnio(2000);
		a1.setCurso("segundo");
		
		
		
		Alumno a2  = new Alumno();
		a1.setCedula(0321245);
		a1.setNombre("juan");
		a1.setCurso("segundo");
		String fecha = "24/11/2003";
		//a1.calcularEdadParametro(fecha);
		
		Fecha f1 = new Fecha();
		f1.setAnio(1954);
		f1.setMes(10);
		f1.setDia(4);
		
		
		
		System.out.println("alumno 1:" + a1.toString() );
		System.out.println("alumno 1 edad: " + a1.calcularEdad());
		
		System.out.println("alumno 2:" + a2.toString() );
		System.out.println("alumno 2 edad: " + a2.calcularEdadParametro(fecha));
	}

}
