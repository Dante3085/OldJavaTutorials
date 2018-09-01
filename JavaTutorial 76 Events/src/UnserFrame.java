import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnserFrame extends JFrame {

	JLabel label1;
	JButton zeit;
	JButton differentButton;
	
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
		Font font1 = new Font("Arial", Font.PLAIN, 15);
		
		//Labels
		label1 = new JLabel("This is about Events");
		label1.setBounds(100, 100, 150, 15);
		label1.setFont(font1);
		add(label1);
		
		//Listener
		UnserListener ul = new UnserListener();
		
		//Buttons
		zeit = new JButton("Zeit");
		zeit.setBounds(20, 30, 100, 20);
		zeit.addActionListener(ul);
		add(zeit);
		
		differentButton = new JButton("ResetLabel1");
		differentButton.setBounds(150, 30, 150, 20);
		differentButton.addActionListener(ul);
		add(differentButton);
	}
	
	private class UnserListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if(arg0.getSource() == zeit) {							//getSource liefert ein Objekt zurück. (Falls Zeitbutton gedrückt wurde ...)
				String s;
				s = Long.toString(System.currentTimeMillis());
				label1.setText(Long.toString(arg0.getWhen()));		//Gibt Timestamp des Geschehniszeitpunkt wieder.
			}
			else if (arg0.getSource() == differentButton){
				label1.setText("This is about Events");
			}
		}
	}
}
