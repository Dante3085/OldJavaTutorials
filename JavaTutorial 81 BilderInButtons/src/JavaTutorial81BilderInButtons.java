import javax.swing.JFrame;

public class JavaTutorial81BilderInButtons {
	public static void main(String[] args) {
		
		//Mit Layout Manager können Elemente des Frames sich bei Vergrößerung bzw. Verkleinerung automatisch in die gleiche relative Position wie vorher begeben.
		
		JFrame lt = new LayoutTest();
		lt.setVisible(true);
		lt.setSize(500, 300);
		lt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lt.setLocationRelativeTo(null);
		lt.setResizable(true);
	}
}
