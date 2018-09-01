import java.awt.FlowLayout;

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
		
		a = new JButton("a");
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
