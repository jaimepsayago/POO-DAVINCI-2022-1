package clase03102022PrimerParcial;

public class Alumno extends Persona {
	String curso;
	
	public Alumno() {
	
	}

	public Alumno(int cedula, String nombre, int anio, String curso) {
		super(cedula, nombre, anio);
		this.curso=curso;
				
	}
	
	

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//metodo
	public int calcularEdad() {
		return 2022-this.anio;
	}
	
	public long calcularEdadParametro(String f) {
		String cadenaFecha = f.substring(6,10)+"-"+f.substring(3,5)+"-"+f.substring(0,2);
		//casting de string a tipo fecha
		java.sql.Date fechaEntrada = java.sql.Date.valueOf(cadenaFecha);
		//fecha actual
		java.util.Date fechaSalida = new java.util.Date();
		long numeroDias = (fechaSalida.getTime() - fechaEntrada.getTime())/(24*60*60*1000);
		return numeroDias/365;
	}
	
	public long calcularFechaParametroReferencia(Fecha f) {
		
		return 0;
	}

	
	
	
	
	
	
	
	
}
