import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnserFrame extends JFrame {

	JLabel label1;
	JButton button1;
	
	public UnserFrame() {
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setSize(500, 300);
		setAlwaysOnTop(true);
		setBackground(Color.GREEN);
		setTitle("Unser Frame");
		
		//Fonts
		Font schrift1 = new Font("Arial", Font.BOLD, 15);
		
		//JLabels
		label1 = new JLabel("JLabel1");
		label1.setBounds(200, 50, 100, 15);
		label1.setFont(schrift1);
		add(label1);
		
		//JButtons
		button1 = new JButton("JButton1");
		button1.setBounds(100, 100, 125, 30);
		add(button1);
		
	}
}
