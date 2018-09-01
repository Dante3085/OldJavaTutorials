import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnserFrame extends JFrame {
	
	//Mit der Klasse "JLabel" lässt sich Text auf dem Fenster anzeigen. Dafür muss ein JLabel Objekt erstellt werden "JLabel name = new JLabel("Test");
	//Der Text muss hinzugefügt werden mit "add(Name des Objektes)".
	//Der Ort des Textes muss festgelegt werden mit "name.setBounds(x, y, width, height)".
	
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
		add(text);
		text.setBounds(220, 100, 80, 40);
	}
}
