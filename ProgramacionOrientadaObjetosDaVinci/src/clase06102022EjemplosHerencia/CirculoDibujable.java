package clase06102022EjemplosHerencia;

import java.awt.Color;
import java.awt.Graphics;

//variables
// operaciones clase
//metodos interface

public class CirculoDibujable extends Circulo implements FiguraDibujable {

	//variables
	private int x, y;
	//constructores
	public CirculoDibujable(double valor1, int x, int y) {
		super(valor1);
		this.x=x;
		this.y=y;
		
	}
	
	//getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void setCoordenadas(int x, int y) {
		this.x=x;
		this.y=y;
		
	}

	@Override
	public void dibujar2D(Graphics g) {
		g.setColor(Color.green);
		g.drawOval(this.x, this.y, (int)this.valor1,(int)this.valor1);
		
	}

}
