package clase06102022EjemplosHerencia;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppFiguraInterfaces extends JPanel {

	public static void main(String[] args) {
		// Graphics = dibujos
		//dibujo linesas, eclipses, cuadrados,
		//dibujo de texto
		//presentaciond e imagenes gif y tipo jpeg
		
		JFrame frame = new JFrame("Paint"); //borde y titulo de la ventana y el cuadro de la ventana
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AppFiguraInterfaces panel = new AppFiguraInterfaces(); //panel o lienzo de mi clase principal o main
		//agregar dentro de la ventana (frame) el panel
		frame.add(panel);
		frame.setSize(800, 800);
		frame.setVisible(true);
		
	}
	//graphics tiene un metodo paint() para crear componentes y agregarlos como parametros
	public void paint(Graphics g) {
		//crear un objeto rectangulodibujable y llamar al metodo de dibujar
		RectanguloDibujable rd = new RectanguloDibujable(140.00, 140.00, 20, 20);
		rd.dibujar2D(g);
		CirculoDibujable cd = new CirculoDibujable(80, 40, 44);
		cd.dibujar2D(g);
		
		
	}
	

}
