import javax.swing.JFrame;

public class JavaTutorial84JFileChooser {
	public static void main(String[] args) {
		
		LayoutTest lt = new LayoutTest();
		lt.setVisible(true);
		lt.setSize(500, 300);
		lt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lt.setLocationRelativeTo(null);
		lt.setResizable(true);
		lt.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
