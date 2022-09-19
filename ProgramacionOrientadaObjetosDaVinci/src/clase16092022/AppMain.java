package clase16092022;

import java.nio.channels.GatheringByteChannel;

public class AppMain {

	public static void main(String[] args) {
		// datos propietario 1
		Persona datosPropietario1 = new Persona("12345", "Pedro Gimenez", "25452212", new Fecha(9,12,1985));
		//fecha construccion inmueble
		Fecha fechaInmueble1 = new Fecha();
		fechaInmueble1.setDia(19);
		fechaInmueble1.setMes(11);
		fechaInmueble1.setAnio(2005);
		//inmueble 1
		Inmueble inmueble1 = new Inmueble();
		inmueble1.setSuperficie(95);
		inmueble1.setNumeroHabitaciones((byte)3);
		inmueble1.setPrecio(1200000);
		inmueble1.setFechaConstruccion(fechaInmueble1);
		inmueble1.setPropietario(datosPropietario1);
		
		
		//datos propietario2
		Persona datosPropietario2 = new Persona("3545", "Luis Gonzalez", "6598554", new Fecha(26,4,1954));
		//fecha construccion inmueble 2
		Fecha fechaInmueble2 = new Fecha(15,5,2001);
		//piscina
		Piscina piscinaCAsa = new Piscina();
		piscinaCAsa.setCubierta(false);
		piscinaCAsa.setVasoPiscina(VasoPiscina.FIBRA_VIDRIO);
		piscinaCAsa.setVolumen(50);
		
		//garaje
		Garaje garajeCasa = new Garaje();
		garajeCasa.setSuperficie(40);
		garajeCasa.setNumeroPlazas((byte)2);
		garajeCasa.setPuertaAperturaAutomatica(true);
		//inmueble 2
		Inmueble inmueble2 = new Inmueble(22, (byte)4, 450000,fechaInmueble2,datosPropietario2,piscinaCAsa,garajeCasa);

		
		System.out.println("---inmueble 1 ---");
		System.out.println("superficie: " + inmueble1.getSuperficie() + " m2");
		System.out.println("numero Habitaciones: " + inmueble1.getNumeroHabitaciones());
		System.out.println("Precio: " + inmueble1.getPrecio());
		System.out.println("Fecha Construccion: " + inmueble1.getFechaConstruccion().getDia() + inmueble1.getFechaConstruccion().getMes() + 
				inmueble1.getFechaConstruccion().getAnio());
		System.out.println("Nombre propietario: " + inmueble1.getPropietario().getNombre());
		System.out.println("telefono propietario: " + inmueble1.getPropietario().getTelefono());
		
		if ( inmueble1.getPiscina() !=null) {
			System.out.println("volumen de la piscina " + inmueble1.getPiscina().getVolumen()+ " m3");
			System.out.println("descripicion del vaso pisicina: " + inmueble1.getPiscina().getVasoPiscina().getDescripcion());
			
		}
		if (inmueble1.getGaraje() != null) {
			System.out.println("superficie del garaje  " + inmueble1.getGaraje().getSuperficie()+ " m2");
			System.out.println("numero de plazas del garaje  " + inmueble1.getGaraje().getNumeroPlazas());
			if (inmueble1.getGaraje().isPuertaAperturaAutomatica())
				System.out.println("garaje con apertura automatica");
		}
		
		
		System.out.println("---inmueble 2 ---");
		System.out.println("superficie: " + inmueble2.getSuperficie() + " m2");
		System.out.println("numero Habitaciones: " + inmueble2.getNumeroHabitaciones());
		System.out.println("Precio: " + inmueble2.getPrecio());
		System.out.println("Fecha Construccion: " + inmueble2.getFechaConstruccion().getDia() + inmueble2.getFechaConstruccion().getMes() + 
				inmueble2.getFechaConstruccion().getAnio());
		System.out.println("Nombre propietario: " + inmueble2.getPropietario().getNombre());
		System.out.println("telefono propietario: " + inmueble2.getPropietario().getTelefono());
		
		if ( inmueble2.getPiscina() !=null) {
			System.out.println("volumen de la piscina " + inmueble2.getPiscina().getVolumen()+ " m3");
			System.out.println("descripicion del vaso pisicina: " + inmueble2.getPiscina().getVasoPiscina().getDescripcion());
			
		}
		if (inmueble2.getGaraje() != null) {
			System.out.println("superficie del garaje  " + inmueble2.getGaraje().getSuperficie()+ " m2");
			System.out.println("numero de plazas del garaje  " + inmueble2.getGaraje().getNumeroPlazas());
			if (inmueble2.getGaraje().isPuertaAperturaAutomatica())
				System.out.println("garaje con apertura automatica");
		}
		
	}

}
