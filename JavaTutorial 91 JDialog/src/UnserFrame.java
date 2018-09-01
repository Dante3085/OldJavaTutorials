import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UnserFrame extends JFrame {

	JButton button1;
	
	public UnserFrame() {
		setTitle("UnserFrame");
		setSize(500,300);
		setResizable(false);
		setVisible(true);
		setAlwaysOnTop(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Buttons
		button1 = new JButton("Dialogfenster");
		button1.setBounds(50, 50, 150, 30);
		button1.addActionListener(new ActionHändler());
		add(button1);
	}
	
	private class ActionHändler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == button1) {
				Dialog d = new Dialog(UnserFrame.this);
				d.setLocationRelativeTo(UnserFrame.this);
				d.setVisible(true);
			}
		}
	}
}
