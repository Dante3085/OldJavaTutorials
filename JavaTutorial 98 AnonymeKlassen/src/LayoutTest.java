import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
	
	//Jeder Taste auf der Tastatur ist ein bestimmter Keycode zugewiesen. Ein Keycode ist eine Zahl. Durch diese Zuweisung kann abgefragt werden, ob eine bestimmte Taste gedr�ckt wurde.
	
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
		list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);	
		list1.addListSelectionListener(new ListenH�ndler() {						//Bei einmaligem Gebrauch einer Klasse, kann eine anonyme Klasse an die Stelle der Instanzierung der Klasse gepackt werden.
			
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				if (arg0.getValueIsAdjusting()) {
				System.out.println(list1.getSelectedValuesList());						 			
				}
			}
		});
		
		add(new JScrollPane(list1));
		
		//JButtons
		a = new JButton("rot");	
		a.addActionListener(fh);
		a.setMnemonic(KeyEvent.VK_R);												
		
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
		//icon1 = new ImageIcon(getClass().getResource("Bild 4.png"));
		//icon2 = new ImageIcon(getClass().getResource("Bild 5.png"));
		
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
		
		//Listener
		addKeyListener(new KeyH�ndler());
		setFocusable(true);																	//L�st den Fokus von einem bestimmten Element des Frames und packt ihn auf das gesamte Frame und erm�glicht so den Tastendruck.
		
		addMouseListener(new MouseH�ndler());
		setFocusable(true);
	}
	
	private class FarbH�ndler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == a) {
				getContentPane().setBackground(Color.RED);	
				requestFocus();																	//"requestFocus()" l�st den Fokus automatisch wieder von dem Element wenn es benutzt wurde und legt ihn wieder auf das gesamte Frame.
			}
			else if (e.getSource() == b) {
				label1.setIcon(icon1);
				requestFocus();
			}
			else if (e.getSource() == c) {
				label1.setIcon(icon2);
				requestFocus();
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
				requestFocus();
			}
			else if (e.getSource() == z) {
				co = JColorChooser.showDialog(null, "W�hle Farbe!", co);						
				getContentPane().setBackground(co);
				requestFocus();
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
	
	private class KeyH�ndler implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {													//Wird ausgef�hrt, wenn eine Taste gedr�ckt wird.
			switch(e.getKeyCode()) {															//"getKeycode()" kann auf den Keycode einer Taste pr�fen. Man kann hier also gleich einem bestimmten Keycode (Zahl) setzen. Dies setzt allerdings vorraus, dass man jeden einzelnen Keycode kennt. Die Klasse KeyEvent bietet allerdings f�r jeden Keycode einen Repr�sentanten. Diese k�nnen mit "KeyEvent.VK_RealnameDerTaste" angesprochen werden.
			
			case KeyEvent.VK_Q: System.out.print("Q");
			break;
			
			case KeyEvent.VK_W: System.out.print("W");
			break;
			
			case KeyEvent.VK_E: System.out.print("E");
			break;
			
			case KeyEvent.VK_R: System.out.print("R");
			break;
			
			case KeyEvent.VK_T: System.out.print("T");
			break;
			
			case KeyEvent.VK_Z: System.out.print("Z");
			break;
			
			case KeyEvent.VK_U: System.out.print("U");
			break;
			
			case KeyEvent.VK_I: System.out.print("I");
			break;
			
			case KeyEvent.VK_O: System.out.print("O");
			break;
			
			case KeyEvent.VK_P: System.out.print("P");
			break;
			
			//case KeyEvent.VK_: System.out.print("T");
			//break;
			
			case KeyEvent.VK_A: System.out.print("A");
			break;
			
			case KeyEvent.VK_S: System.out.print("S");
			break;
			
			case KeyEvent.VK_D: System.out.print("D");
			break;
			
			case KeyEvent.VK_F: System.out.print("F");
			break;
			
			case KeyEvent.VK_G: System.out.print("G");
			break;
			
			case KeyEvent.VK_H: System.out.print("H");
			break;
			
			case KeyEvent.VK_J: System.out.print("J");
			break;
			
			case KeyEvent.VK_K: System.out.print("K");
			break;
			
			case KeyEvent.VK_L: System.out.print("L");
			break;
			
			//case KeyEvent.VK_�: System.out.print("�");
			//break;
			
			//case KeyEvent.VK_�: System.out.print("�");
			//break;
			
			case KeyEvent.VK_Y: System.out.print("Y");
			break;
			
			case KeyEvent.VK_X: System.out.print("X");
			break;
			
			case KeyEvent.VK_C: System.out.print("C");
			break;
			
			case KeyEvent.VK_V: System.out.print("V");
			break;
			
			case KeyEvent.VK_B: System.out.print("B");
			break;
			
			case KeyEvent.VK_N: System.out.print("N");
			break;
			
			case KeyEvent.VK_M: System.out.print("M");
			break;
			
			case KeyEvent.VK_SPACE: System.out.print(" ");
			break;
			
			//case KeyEvent.VK_ESCAPE: System.out.print();
			//break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {												//Wird ausgef�hrt, wenn eine Taste losgelassen wird.
			if(e.getKeyCode() == KeyEvent.VK_0) {
				
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {													//Hier kann der Buchstabe abgefragt werden, der gerade gedr�ckt wurde.
			if(e.getKeyChar() == '�') {														//Umlaute befinden sich nicht in dem urspr�nglich auf der englischen Sprache basierenden KeyCodeRegister. Deshalb muss mithilfe der "char" Funktion  entsprechend des Tastendrucks auf das Zeichen/Symbol der gedr�ckten Taste gepr�ft werden.
				System.out.print("�");
			}
		}
	}
	
	private class MouseH�ndler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {											//�hnlich wie "mousePressed". Wird aber nur ausgef�hrt, wenn die Koordinaten beim Dr�cken und Loslassen dieselben sind.
			System.out.println("mouseClicked at " + e.getX() + " " + e.getY());
		}

		@Override
		public void mouseEntered(MouseEvent e) {											//Wird ausgef�hrt, wenn die Maus das Fenster (Frame) von au�en betritt bzw. wieder betritt.
			System.out.println("enter");
		}

		@Override
		public void mouseExited(MouseEvent e) {												//Wird ausgef�hrt, wenn die Maus das Fenster (Frame) von Innen verl�sst bzw. wieder verl�sst.
			System.out.println("exit");
		}

		@Override
		public void mousePressed(MouseEvent e) {											//Wird ausgef�hrt, wenn eine Maustaste gedr�ckt wird.
			System.out.println("mousePressed at " + e.getX() + " " + e.getY());				//"e.getX()" = x-Koordinate wo von der Position auf die im Fenster gedr�ckt wurde etc.
		}

		@Override
		public void mouseReleased(MouseEvent e) {											//Wird ausgef�hrt, wenn eine Maustaste losgelassen wird.
			System.out.println("mouseReleased at " + e.getX() + " " + e.getY());
		}
	}
}