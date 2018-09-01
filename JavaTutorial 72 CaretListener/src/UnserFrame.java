import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class UnserFrame extends JFrame {
	
	//JButton Befehl "setEnabled(true/false)" kann Button aus - oder anschalten.
	//CaretListener hört, ob sich der Schreibkopf (|) in der Textzeile beim Eingeben bewegt.
	//Listener werden mit "attributname.addListener();" hinzugefügt.
	//String Methode "trim" löscht jegliche Weißstellne, Leerzeichen aus dem String heraus.
	
	JButton button;
	JLabel text;
	JTextField eingabe;
	
	public UnserFrame () {
		setVisible(true);
		setSize(500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Programm!");
		setResizable(false);
		setAlwaysOnTop(false);
		setLayout(null);
		
		text = new JLabel("Hallo Welt");
		text.setBounds(220, 100, 80, 40);
		add(text);
		
		Font schrift = new Font("Serif", Font.BOLD + Font.ITALIC, 15);
		Font schrift2 = (text.getFont().deriveFont(Font.BOLD + Font.ITALIC, 15));
		text.setFont(schrift2);
		
		button = new JButton("Klick mich!");
		button.setBounds(10, 10, 100, 25);
		button.addActionListener(new UnserListener());
		button.setEnabled(false);
		add(button);
		
		eingabe = new JTextField();
		eingabe.setBounds(300, 50, 100, 25);
		eingabe.addCaretListener(new SchreibkopfListener());
		add(eingabe);
	}
	
	private class UnserListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = eingabe.getText();
			text.setText(s);
			//text.setText(eingabe.getText());											//Braucht den String "s" nicht.
		}
	}
	
	private class SchreibkopfListener implements CaretListener {

		@Override
		public void caretUpdate(CaretEvent arg0) {
			String s = eingabe.getText();
			s = s.trim();
			if (s.isEmpty()) {
				button.setEnabled(false);
			}
			else {
				button.setEnabled(true);
			}
		}
	}
}
