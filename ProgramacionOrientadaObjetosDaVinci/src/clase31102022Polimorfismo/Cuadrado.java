package clase31102022Polimorfismo;

import java.awt.Graphics;

public class Cuadrado extends Figura {

	
	@Override
	public void dibuja(Graphics g) {
		System.out.println("dibuja cuadrado");
		
	}

	@Override
	public void borra() {
		System.out.println("borra cuadrado");
		
	}


}
