import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UnserFrame extends JFrame {

	//Das JPanel ist also jetzt ein Kasten um die beiden JLabel "�berschrift1" und "�berschrift2".
	
	JLabel �berschrift1;
	JLabel �berschrift2;
	JPanel panel;
	
	public UnserFrame() {
		setVisible(true);
		setSize(1000, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("JPanel");
		setResizable(true);
		setAlwaysOnTop(true);
		setLayout(null);
		
		//JPanel
		panel = new JPanel();
		panel.setBounds(100, 200, 150, 150);
		panel.setLayout(null);
		add(panel);
		
		//JLabel
		�berschrift1 = new JLabel("�berschrift 1");
		�berschrift1.setBounds(0, 0, 200, 15);
		panel.add(�berschrift1);
		
		�berschrift2 = new JLabel("�berschrift 2");
		�berschrift2.setBounds(0, 50, 200, 15);
		panel.add(�berschrift2);
		
	}
}
