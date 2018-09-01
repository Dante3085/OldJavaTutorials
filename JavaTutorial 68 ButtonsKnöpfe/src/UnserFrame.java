import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnserFrame extends JFrame {
	
	//Mit der Klasse "JButton" lassen sich Knöpfe auf Fenstern anzeigen lassen. Implementiert werden sie wie folgt: "JButton nameDesButtons = new JButton("TextDesButtons");".
	//Mit der Methode "setBounds" lassen sich wie beim Label der Standort und die Größe des Buttons festlegen.
	//Mit der Methode "add(NameDesButtons)" wird der Button hinzugefügt.
	
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
		add(text);
		text.setBounds(220, 100, 80, 40);
		
		Font schrift = new Font("Serif", Font.BOLD + Font.ITALIC, 15);
		Font schrift2 = (text.getFont().deriveFont(Font.BOLD + Font.ITALIC, 15));
		text.setFont(schrift2);
		
		JButton button = new JButton("Klick mich!");
		button.setBounds(10, 10, 100, 25);
		add(button);
	}
}
