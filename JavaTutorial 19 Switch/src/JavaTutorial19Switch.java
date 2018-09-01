import java.util.Scanner;

public class JavaTutorial19Switch {
	public static void main (String args[]) {
		
		/* Switch: Ist eine Alternative zu if. Kann Variable auf mehrere Zustände prüfen. Mit "case""Zahl""Doppelpunkt" wird dann ein möglicher Fall festgelegt.
		 * Falls kein "case" zutrifft, wird der "default" ausgeführt.
		 */
		
		// BEISPIEL EINS
		System.out.println("Wie viele Monde hat die Erde?");
		Scanner s = new Scanner(System.in);
		
		int antwort;
		antwort =  s.nextInt();
		
		switch (antwort) {
		case 0:
			System.out.println("Leider zu wenig!");
			break;
		case 1:
			System.out.println("Exakt!");
			break;
		case 2:
			System.out.println("Zu viele!");
			break;
		default: 
			System.out.println("falsch");
			break;
		}
	}
}
