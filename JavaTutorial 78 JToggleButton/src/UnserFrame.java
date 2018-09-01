import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class UnserFrame extends JFrame {

	//ToggleButtons sind praktisch Checkboxen.
	
	JLabel label1;
	JButton button1;
	JToggleButton toggleButton1;
	JTextField textField1;
	JPasswordField passwordField1;
	
	UnserFrame() {
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Events");
		setResizable(true);
		setAlwaysOnTop(true);
		setLayout(null);
		
		
		//Fonts
		Font arialNormal = new Font("Arial", Font.PLAIN, 20);
		Font arialNormalKlein = new Font("Arial", Font.PLAIN, 15);
		Font arialNormalFett = new Font("Arial", Font.BOLD, 20);
		
		//JLabel
		label1 = new JLabel("Label1");
		label1.setBounds(100, 100, 150, 20);
		label1.setFont(arialNormal);
		add(label1);
		
		//ToggleButtons
		toggleButton1 = new JToggleButton("Fett");
		toggleButton1.setBounds(25,20,80,50);
		toggleButton1.addActionListener(new AllgemeinerActionListener());
		add(toggleButton1);
	}
	
	private class AllgemeinerActionListener implements ActionListener {

		//Fonts
		Font arialNormal = new Font("Arial", Font.PLAIN, 20);
		Font arialNormalKlein = new Font("Arial", Font.PLAIN, 15);
		Font arialNormalFett = new Font("Arial", Font.BOLD, 20);
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (toggleButton1.isSelected()) {
				label1.setFont(arialNormalFett);
			}
			else {
				label1.setFont(arialNormal);
			}
		}
	}
}
