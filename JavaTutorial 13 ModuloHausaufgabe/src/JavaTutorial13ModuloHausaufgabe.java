import java.util.Scanner;

public class JavaTutorial13ModuloHausaufgabe {
	public static void main (String args[]) {
		
		/* Aufgabe: Methode, die eine Int Variable erwartet und zurückgibt wie oft in diese Variable 1000 rein passt. Hab ich jetzt mit double gemacht, damit auch Kommazahlen ausgegeben
		 *  werden können.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte eine Zahl eingeben, bei der überprüft werden soll, wie oft 1000 in sie rein passt.");
		
		double x,z;
		x = s.nextInt();
		z = tausend(x);
		
		System.out.println(z);
	}
	
	private static double tausend(double x) {
		
		double z;
		z = x / 1000;
		
		return z;
	}
}
