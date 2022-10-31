package clase31102022Polimorfismo;

import java.awt.Graphics;

public class Circulo extends Figura {

	
	
	@Override
	public void dibuja(Graphics g) {
		System.out.println("dibuja circulo");
		
	}

	@Override
	public void borra() {
		System.out.println("borra circulo");
		
	}

}
