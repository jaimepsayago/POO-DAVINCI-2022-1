package clase31102022Polimorfismo;

import java.awt.Graphics;

public class AppFigura {

	public static void main(String[] args) {
	
		//creamos dos objetos 
		Circulo c = new Circulo();
		Poligono p = new Poligono();
		
		//tengo un metodo mueveFigura
		Graphics g=null;
		
		mueveFigura(c,g);
		mueveFigura(p,g);


	}
	
	public static void mueveFigura(Figura f, Graphics g)
	{
		f.borra();
		f.dibuja(g);
	}


}
