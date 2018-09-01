import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JavaTutorial80LayoutManagerEinf�hrungFlowLayout {
	public static void main(String[] args) {
		
		//Mit Layout Manager k�nnen Elemente des Frames sich bei Vergr��erung bzw. Verkleinerung automatisch in die gleiche relative Position wie vorher begeben.
		
		JFrame jf = new UnserFrame();
		JFrame lt = new LayoutTest();
		jf.setVisible(true);
		jf.setSize(500, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setResizable(true);
	}
}
