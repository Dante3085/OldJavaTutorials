import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UnserFrame extends JFrame {

	JPasswordField pf;
	JLabel label1;
	JButton button1;
	
	UnserFrame() {
		setVisible(true);
		setSize(1920, 1080);
		setTitle("Spieleliste");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setAlwaysOnTop(false);
		setLayout(null);
		
		//Listener
		PasswordListener pl = new PasswordListener();
		
		//Fonts
		Font arialNormal = new Font("Arial", Font.PLAIN, 20);
		Font arialNormalKlein = new Font("Arial", Font.PLAIN, 15);
		Font arialFett = new Font("Arial", Font.BOLD, 20);
		
		//PasswordFields
		pf = new JPasswordField();
		pf.setBounds(775, 40, 300, 25);
		add(pf);
		
		//Labels
		label1 = new JLabel("Label1");
		label1.setBounds(100, 100, 200, 20);
		label1.setFont(arialNormal);
		add(label1);
		
		//Buttons
		button1 = new JButton("Ich kriege das Passwort.");
		button1.setBounds(20, 20, 200, 30);
		button1.addActionListener(pl);
		add(button1);
	}
	
	private class PasswordListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				label1.setText(String.valueOf(pf.getPassword()));
			}
		}
	}
}
