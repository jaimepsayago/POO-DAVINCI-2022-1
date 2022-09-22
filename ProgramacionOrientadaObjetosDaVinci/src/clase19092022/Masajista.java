package clase19092022;

public class Masajista extends SeleccionFutbol {

		private String titulacion;
		private int aniosExperiencia;
		
		public Masajista() {
			super();
		}
		public Masajista(int id, String nombre, String apellido, int edad,String titulacion, int aniosExperiencia) {
			super(id, nombre, apellido, edad);
			this.titulacion=titulacion;
			this.aniosExperiencia=aniosExperiencia;
		}
		
		public void darMasaje() {
			System.out.println("realizando masaje - masajista");
		}
		public String getTitulacion() {
			return titulacion;
		}
		public void setTitulacion(String titulacion) {
			this.titulacion = titulacion;
		}
		public int getAniosExperiencia() {
			return aniosExperiencia;
		}
		public void setAniosExperiencia(int aniosExperiencia) {
			this.aniosExperiencia = aniosExperiencia;
		}
		
		
}
