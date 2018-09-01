import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class LayoutTest extends JFrame {

	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton z;
	Color co = Color.WHITE;
	
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
	
	
	private class FarbHändler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == a) {
				getContentPane().setBackground(Color.RED);					
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
				co = JColorChooser.showDialog(null, "Wähle Farbe!", co);						
				getContentPane().setBackground(co);
			}
		}
	}
}