package clase03102022PrimerParcial;

import java.util.ArrayList;

public class AppBarco {
	public static void main (String [] args) {
		
		ArrayList<Barco> array = new ArrayList<Barco>();
		Devapor dv = new Devapor();
		array.add(dv);
		
		Velero v = new Velero();
		array.add(v);
		
		for(Barco b:array)
			b.alarma();
		
	}

}
