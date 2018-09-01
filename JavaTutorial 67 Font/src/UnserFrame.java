import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UnserFrame extends JFrame {
	
	//Jedes Objekt der Klasse "Font" (Font name = new Font();) erwartet folgende Argumente: Schriftart, Typ, Größe.
	//Die eingetragenen Argumente werden mit der Methode "nameDesLabels.setFont(nameDesFonts)" auf ein Label angewandt.
	//Um sicherzustellen, dass die ausgewählte Schriftart auf dem Betriebsystem existiert kann folgende Methode angewandt werden "Font fontName = (labelName.getFont().deriveFont(Font.typ + Font.typ, Schriftgröße));"
	
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
		
	}
}
