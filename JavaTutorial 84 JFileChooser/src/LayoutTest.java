import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
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
		
		d = new JButton("File...");
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
				JFileChooser fc = new JFileChooser();
				int returnValue = fc.showOpenDialog(null);
				File file = fc.getSelectedFile();							//File das vom showOpenDialog gegeben wurde wird durch getSelectedFile genommen und in file abgespeichert.
				
				if (returnValue == JFileChooser.APPROVE_OPTION) {			//Falls ein File ausgewählt wurde, läuft die korrekte Aktion ab.
				System.out.println(file.getPath());
				}
				else if (returnValue == JFileChooser.CANCEL_OPTION) {		//Falls kein File ausgewählt wurde, wird eine Exception verarbeitet. Hier mit Cancel_Option und einer sysout Message.
					System.out.println("Es wurde kein File ausgewählt");
				}
				else if (returnValue == JFileChooser.ERROR_OPTION) {
					System.out.println("Error");
				}
			}
			else if (e.getSource() == z) {
				co = JColorChooser.showDialog(null, "Wähle Farbe!", co);						
				getContentPane().setBackground(co);
			}
		}
	}
}