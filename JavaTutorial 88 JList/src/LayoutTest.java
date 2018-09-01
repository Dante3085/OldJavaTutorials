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
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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
	JList list1;
	String[] string = {"Flasche", "Laptop", "Computer", "Wecker", "Uhr"};
	
	LayoutTest() {
		
		
		super("LayoutTest");
		setLayout(new FlowLayout());
		FarbH�ndler fh = new FarbH�ndler();
		
		
		
		//Arrays
		String[] namen = {"aaa", "bbb", "ccc"};
		int[] zahlen = {1,2,3};
		String[] string = {"Flasche", "Laptop", "Computer", "Wecker", "Uhr"};
		
		//JLists
		list1 = new JList(string);
		list1.setVisibleRowCount(4);
		list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);			//Es k�nnen mehrere Auswahlen durch Schift getroffen werden. Mit "Single Selection" nur ein Intervall.	Bei "Multiple Interval Selection" k�nnen mit STRG beliebig viele Intervalle gew�hlt werden.
		list1.addListSelectionListener(new ListenH�ndler());
		add(new JScrollPane(list1));
		
		//JButtons
		a = new JButton("rot");	
		a.addActionListener(fh);
		add(a);
		
		b = new JButton("Bild zur�ck �ndern");
		b.addActionListener(fh);
		add(b);
		
		c = new JButton("Bild �ndern");
		c.addActionListener(fh);
		add(c);
		
		d = new JButton("File...");
		d.addActionListener(fh);
		add(d);
		
		z = new JButton("eigene");
		z.addActionListener(fh);
		add(z);
		
		//Icons
		icon1 = new ImageIcon(getClass().getResource("Bild 4.png"));
		icon2 = new ImageIcon(getClass().getResource("Bild 5.png"));
		
		//JLabels
		label1 = new JLabel(icon1);
		add(label1);
		
		//JTextAreas
		textArea1 = new JTextArea("Dies ist ein ziemlich langer Text, der eigentlich von extremer Belanglosigkeit ist. ZZZZZZZZZZZZZZzzzzzzzzzzzzzzzzzzzZZZZZZZZZZ", 3, 20);
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		//textArea1.setBackground(getBackground()); 
		textArea1.setOpaque(false);					
		add(textArea1);
		
		//JComboBoxen
		comboBox1 = new JComboBox(namen);
		comboBox1.addItemListener(new ItemH�ndler());
		add(comboBox1);
	}
	
	private class FarbH�ndler implements ActionListener {

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
					System.out.println("Es wurde kein File ausgew�hlt");
				}
				else if (returnValue == JFileChooser.ERROR_OPTION) {
					System.out.println("Error");
				}
			}
			else if (e.getSource() == z) {
				co = JColorChooser.showDialog(null, "W�hle Farbe!", co);						
				getContentPane().setBackground(co);
			}
		}
	}
	
	private class ItemH�ndler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if (arg0.getStateChange() == ItemEvent.SELECTED) {
				System.out.println("Changed to: " + comboBox1.getSelectedIndex()); //Verhindert, dass die sysout 2mal aufgerufen wird. ItemListener wird an 2 Punkten aufgerufen. 1. comboBox Zustand wird ver�ndert. 2. combobox Zustand wird auf diesen bestimmten Zustand ver�ndert.
			}
		}
	}
	
	private class ListenH�ndler implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			if (arg0.getValueIsAdjusting()) {
			System.out.println(list1.getSelectedValuesList());						 			//Methode "getSelectedValues" ist veraltet. Stattdessen "getSelectedValueList"
			}
		}
	}
}