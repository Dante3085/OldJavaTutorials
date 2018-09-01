import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UnserFrame extends JFrame {

	//Das JPanel ist also jetzt ein Kasten um die beiden JLabel "überschrift1" und "überschrift2".
	
	JLabel überschrift1;
	JLabel überschrift2;
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
		überschrift1 = new JLabel("Überschrift 1");
		überschrift1.setBounds(0, 0, 200, 15);
		panel.add(überschrift1);
		
		überschrift2 = new JLabel("Überschrift 2");
		überschrift2.setBounds(0, 50, 200, 15);
		panel.add(überschrift2);
		
	}
}
