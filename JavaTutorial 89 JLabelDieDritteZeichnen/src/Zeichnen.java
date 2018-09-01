import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Zeichnen extends JFrame{
	
	//Antialiasing nimmt den Durchschnittswert zwischen der Farbe des Vordergrunds und jener des Hintergrunds, wodurch ein sauberer Übergang und damit eine Kantenglättung erfolgt.
	
	Label label1;
	BufferedImage bimg1 = null;

	public Zeichnen() {
		super("Zeichnen");
		try {
			bimg1 = ImageIO.read(Zeichnen.class.getClassLoader().getResourceAsStream("Bild 4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setLayout(null);
		
		//Label
		label1 = new Label();
		label1.setBounds(0, 0, 500, 300);
		add(label1);
	}
	
	private class Label extends JLabel {
		@Override
		protected void paintComponent(Graphics g) {															//Die Graphics "g" übermittelte Klasse ist quasi der Stift zum zeichnen.
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;																//Sorgt dafür das g als Graphics2D Objekt anerkannt wird (eigentlich ist es das schon).
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);		//Schaltet Antialiasing für g2d an.
			
			g.setColor(Color.GREEN);																		//Setzt die Farbe von etwas das g zeichnet. Muss vor dem was g zeichnet gesetzt werden. 
			g.drawRect(10, 10, 100, 100);																	//Zeichnet ein Rechteck mit eingegebenen Parametern.
			g.setColor(new Color (255, 200 ,34));
			g.fillRect(200, 100, 100, 100);
			g.setColor(new Color (0, 0, 255, 200));															//Der 4. RGB Wert bei einer Farbe ist ein sog. Alpha-Kanal. Er gibt die Deckkraft der Farbe an.
			g.fillOval(250, 50, 100, 100);
			g.drawImage(bimg1, 350, 100, null);																//Zeichnet als BufferedImage referenziertes Bild.
			
			repaint();																						//Eigentlich nicht korrekt, da Endlosschleife.
			System.out.println("Done");
		}
	}
}
