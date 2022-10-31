package clase31102022Polimorfismo;

import java.awt.Graphics;

public class Poligono extends Figura {

	
	@Override
	public void dibuja(Graphics g) {
		System.out.println("dibuja Poligono");
		
	}

	@Override
	public void borra() {
		System.out.println("borra Poligono");
		
	}


}
