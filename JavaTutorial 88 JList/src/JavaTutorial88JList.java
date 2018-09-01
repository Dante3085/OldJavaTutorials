import javax.swing.JFrame;
import java.util.Scanner;

public class JavaTutorial88JList {
	public static void main(String[] args) {
		
		//JComboBox ist ein sog. Dropdownmenü
		
		Scanner s = new Scanner(System.in);
		
		LayoutTest lt = new LayoutTest();
		lt.setVisible(true);
		lt.setSize(500, 300);
		lt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lt.setLocationRelativeTo(null);
		lt.setResizable(true);
		
		int[] i = {3, 5, 5, 5, 3};				//Diese Arrays werden in ihrer Größe dynamisch festgelegt, indem der Inhalt direkt reingeschrieben wird und die Größe beliebig mit einem weiteren Eintrag angepasst wird.
		String[] str = {"bla", "sie", "doh"};
		
		System.out.println("Werte eingeben.");
		int[] benutz = {s.nextInt(), s.nextInt(), s.nextInt()};
		System.out.println(benutz[2]);
		
	}
}
