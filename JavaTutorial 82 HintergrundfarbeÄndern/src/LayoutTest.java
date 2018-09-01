import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutTest extends JFrame {

	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton z;
	
	LayoutTest() {
		
		
		super("LayoutTest");
		setLayout(new FlowLayout());
		FarbHändler fh = new FarbHändler();
		
		a = new JButton("rot");	
		a.addActionListener(fh);
		add(a);
		
		b = new JButton("grün");
		b.addActionListener(fh);
		add(b);
		
		c = new JButton("blau");
		c.addActionListener(fh);
		add(c);
		
		d = new JButton("schwarz");
		d.addActionListener(fh);
		add(d);
		
		z = new JButton("eigene");
		z.addActionListener(fh);
		add(z);
	}
	
	//Klassen von Listenern haben meistens "Händler" als Teil des Namens.
	private class FarbHändler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == a) {
				getContentPane().setBackground(Color.RED);					//Nimmt sich das Standardpanel eines Frames, was normal immer grau ist und verändert die Farbe zu rot.
			}
			else if (e.getSource() == b) {
				getContentPane().setBackground(Color.GREEN);
			}
			else if (e.getSource() == c) {
				getContentPane().setBackground(Color.BLUE);
			}
			else if (e.getSource() == d) {
				getContentPane().setBackground(Color.BLACK);
			}
			else if (e.getSource() == z) {
				Color c = new Color(255, 100, 50);							//Farben bestehen im Computer aus 3 Farbwerten von Rot, Grün und Blau. Diesen können Werte von 0 bis 255 annehmen.
				getContentPane().setBackground(c);
			}
		}
	}
}