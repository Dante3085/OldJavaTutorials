import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutTest extends JFrame {

	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton e;
	
	LayoutTest() {
		
		super("LayoutTest");
		setLayout(new FlowLayout());
		
		//"Icon" ist ein Interface. "ImageIcon" ist eine Klasse, die von Icon erbt. ImageIcon hat einen Konstruktor, der ein Objekt erwartet, dass eine URL(Verzeichnisse) ist. URL des Bildes wird geladen.
		Icon x = new ImageIcon(getClass().getResource("Bild 1.png"));
		Icon y = new ImageIcon(getClass().getResource("Bild 2.png"));
		Icon z = new ImageIcon(getClass().getResource("Bild 3.png"));
		
		a = new JButton("a", x);		//Falls Icon aus irgendeinem Grund nicht geladen werden kann wir "DefaultText" angegeben. In diesem Fall "a".
		a.setRolloverIcon(z);
		add(a);
		
		b = new JButton("b");
		add(b);
		
		c = new JButton("c");
		add(c);
		
		d = new JButton("d");
		add(d);
		
		e = new JButton("e");
		add(e);
	}
}
