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
import javax.swing.JTextArea;

public class LayoutTest extends JFrame {

	//Wichtigster Konstruktor der JTextArea: ("Text", Rows oder auch wie viele Zeilen, Columns oder auch Breite der JTextArea [nichtPixel])
	
	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton z;
	JTextArea textArea1;
	Color co = Color.WHITE;
	
	LayoutTest() {
		
		
		super("LayoutTest");
		setLayout(new FlowLayout());
		FarbHändler fh = new FarbHändler();
		
		//Buttons
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
		
		//TextAreas
		textArea1 = new JTextArea("Dies ist ein ziemlich langer Text, der eigentlich von extremer Belanglosigkeit ist. ZZZZZZZZZZZZZZzzzzzzzzzzzzzzzzzzzZZZZZZZZZZ", 3, 20);
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		//textArea1.setBackground(getBackground()); //Nimmt sich den Standardhintergrund des Frames und setzt ihn für die TextArea auch so.
		textArea1.setOpaque(false);					//Macht den Hintergrund der TextArea Transparent.
		add(textArea1);
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
				File file = fc.getSelectedFile();							
				
				if (returnValue == JFileChooser.APPROVE_OPTION) {			
				System.out.println(file.getPath());
				}
				else if (returnValue == JFileChooser.CANCEL_OPTION) {		
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