import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnserFrame extends JFrame {
	
	//Innere Klasse hat Zugriff auf Attribute der �u�eren Klasse und kann auf private gesetzt werden, damit nur �u�ere Klasse Zugriff innere Klasse hat.
	
	JButton button;
	JLabel text;
	
	public UnserFrame (boolean visible, int width, int height, String titel, boolean resizable, boolean alwaysOnTop, String jLabel) {
		setVisible(visible);
		setSize(width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle(titel);
		setResizable(resizable);
		setAlwaysOnTop(alwaysOnTop);
		setLayout(null);
		
		JLabel text = new JLabel(jLabel);
		text.setBounds(220, 100, 80, 40);
		add(text);
		
		Font schrift = new Font("Serif", Font.BOLD + Font.ITALIC, 15);
		Font schrift2 = (text.getFont().deriveFont(Font.BOLD + Font.ITALIC, 15));
		text.setFont(schrift2);
		
		JButton button = new JButton("Klick mich!");
		button.setBounds(10, 10, 100, 25);
		button.addActionListener(new UnserListener(text));
		add(button);
	}
	
	private class UnserListener implements ActionListener {
		
		JLabel lbl;
		
		UnserListener (JLabel lbl) {
			this.lbl = lbl;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {						
			lbl.setText("abc");
		}
	}
}
