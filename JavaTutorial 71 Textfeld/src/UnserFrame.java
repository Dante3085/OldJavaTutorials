import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UnserFrame extends JFrame {
	
	//Klasse JTextField erzeugt ein Textfeld. (import javax.swing.JTextField)
	//add(elementname) fügt dem Fenster ein bestimmtes Element hinzu (z.B.: JLabel, JButtons, JTextFields).
	//TextField Methode "getText" liefert einen String zurück.
	//Attribute wie JButton "button" dürfen nicht so initialisiert werden "JButton button = new JButton("...");", sonder so "button = new JButton("...");".
	
	JButton button;
	JLabel text;
	JTextField eingabe;
	
	public UnserFrame () {
		setVisible(true);
		setSize(500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Programm!");
		setResizable(true);
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
		add(button);
		
		eingabe = new JTextField();
		eingabe.setBounds(300, 50, 100, 25);
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
}
