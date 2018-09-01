import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UnserFrame extends JFrame {

	JLabel label1;
	JLabel label2;
	JTextField textField1;
	JTextField textField2;
	JButton button1;
	JButton button2;
	
	UnserFrame() {
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Events");
		setResizable(true);
		setAlwaysOnTop(true);
		setLayout(null);
		
		//Fonts
		Font font1 = new Font("Arial", Font.PLAIN, 15);
		
		//Labels
		label1 = new JLabel("Label1");
		label1.setBounds(50, 20 ,100, 15);
		label1.setFont(font1);
		add(label1);
		
		label2 = new JLabel("Label2");
		label2.setBounds(100, 20 ,100, 15);
		label2.setFont(font1);
		add(label2);
		
		//TextFields
		textField1 = new JTextField();
		textField1.setBounds(50, 40, 200, 20);
		add(textField1);
		
		textField2 = new JTextField();
		textField2.setBounds(50, 60, 200, 20);
		add(textField2);
		
		//Buttons
		button1 = new JButton("Button1");
		button1.setBounds(200, 100, 50, 35);
		add(button1);
		
		button2 = new JButton("Button2");
		button2.setBounds(200, 200, 50, 35);
		add(button2);
		
	}
}
