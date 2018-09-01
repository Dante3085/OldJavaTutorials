import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UnserFrame extends JFrame {

	JButton button1;
	
	public UnserFrame() {
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);
		
		//JButtons
		button1 = new JButton("Button1");
		button1.setBounds(200, 100, 100, 20);
		button1.addActionListener(e -> {											//Dies ist ein LambdaAusdruck!
				if(e.getSource() == button1)
				System.out.println("Button 1 wurde erfolgreich gedrückt!");
		});
		add(button1);
	}
	
	private class ActionHändler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Button 1 wurde erfolgreich gedrückt!");
		}
	}
}
