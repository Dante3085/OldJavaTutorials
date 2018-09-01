import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class UnserFrame extends JFrame {
	
	//JCheckBox Klasse erzeugt eine Häkchenbox
	//Listener "ItemListener" ist für Checkboxen gedacht.
	
	JLabel text;
	JButton button;
	JTextField eingabe;
	JCheckBox fett;
	
	public UnserFrame () {
		setVisible(true);
		setSize(500, 300);
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
		button.setEnabled(false);
		add(button);
		
		eingabe = new JTextField();
		eingabe.setBounds(300, 50, 100, 25);
		eingabe.addCaretListener(new SchreibkopfListener());
		add(eingabe);
		
		fett = new JCheckBox("Fett");
		fett.setBounds(10, 200, 150, 25);
		fett.addItemListener(new FettListener());
		add(fett);
	}
	
	private class UnserListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = eingabe.getText();
			text.setText(s);
			//text.setText(eingabe.getText());											
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
	
	private class FettListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if (fett.isSelected()) {
				Font schrift2 = (text.getFont().deriveFont(Font.BOLD + Font.ITALIC, 15));
				text.setFont(schrift2);
			}
			else {
				Font schrift2 = (text.getFont().deriveFont(Font.PLAIN + Font.ITALIC, 15));
				text.setFont(schrift2);
			}
		}
		
	}
}
