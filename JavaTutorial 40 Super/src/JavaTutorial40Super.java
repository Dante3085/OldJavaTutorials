import java.util.Scanner;

public class JavaTutorial40Super {
	public static void main (String args[]) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Geben sie Alter, iq, name und haarfarbe des Menschen ein");
		
		int x,y;
		x = s.nextInt();
		y = s.nextInt();
		
		Scanner z = new Scanner (System.in);
		
		String q,w;
		q = z.nextLine();
		w = z.nextLine();
		
		Mensch karl = new Mensch(x, y, q, w);
		
		System.out.println(karl.toString());
		
		/* Super: Mit "Super" kann auf eine überschriebene Methode zugegriffen werden.
		 * Beispiel in Klasse "Mensch".
		 */
	}
}
