import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class LayoutTest extends JFrame {
	
	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton z;
	JTextArea textArea1;
	Color co = Color.WHITE;
	JLabel label1;
	JLabel label2;
	Icon icon1;
	Icon icon2;
	JComboBox comboBox1;
	
	LayoutTest() {
		
		
		super("LayoutTest");
		setLayout(new FlowLayout());
		FarbHändler fh = new FarbHändler();
		
		//Arrays
		String[] namen = {"aaa", "bbb", "ccc"};
		int[] zahlen = {1,2,3};
		
		//Buttons
		a = new JButton("rot");	
		a.addActionListener(fh);
		add(a);
		
		b = new JButton("Bild zurück ändern");
		b.addActionListener(fh);
		add(b);
		
		c = new JButton("Bild ändern");
		c.addActionListener(fh);
		add(c);
		
		d = new JButton("File...");
		d.addActionListener(fh);
		add(d);
		
		z = new JButton("eigene");
		z.addActionListener(fh);
		add(z);
		
		//Icons
		icon1 = new ImageIcon(getClass().getResource("Bild 1.png"));
		icon2 = new ImageIcon(getClass().getResource("Bild 3.png"));
		
		//Labels
		label1 = new JLabel(icon1);
		add(label1);
		
		//TextAreas
		textArea1 = new JTextArea("Dies ist ein ziemlich langer Text, der eigentlich von extremer Belanglosigkeit ist. ZZZZZZZZZZZZZZzzzzzzzzzzzzzzzzzzzZZZZZZZZZZ", 3, 20);
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		//textArea1.setBackground(getBackground()); 
		textArea1.setOpaque(false);					
		add(textArea1);
		
		//ComboBoxen
		comboBox1 = new JComboBox(namen);
		comboBox1.addItemListener(new ItemHändler());
		add(comboBox1);
	}
	
	private class FarbHändler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == a) {
				getContentPane().setBackground(Color.RED);					
			}
			else if (e.getSource() == b) {
				label1.setIcon(icon1);
			}
			else if (e.getSource() == c) {
				label1.setIcon(icon2);
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
	
	private class ItemHändler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if (arg0.getStateChange() == ItemEvent.SELECTED) {
				System.out.println("Changed to: " + comboBox1.getSelectedIndex()); //Verhindert, dass die sysout 2mal aufgerufen wird. ItemListener wird an 2 Punkten aufgerufen. 1. comboBox Zustand wird verändert. 2. combobox Zustand wird auf diesen bestimmten Zustand verändert.
			}
		}
	}
}