import java.util.Scanner;

public class JavaTutorial5IfelseHausaufgabeReal {
	public static void main (String args[]) {
		
		/*Aufgabe: Variable "Alter" erstellen und mit einem Wert versehen. Ab 18 "vollj�hrig" ausgeben.
		 *  Unter 18 "minderj�hrig" ausgeben. Gleich 0 "noch nicht geboren" ausgeben.
		 */
		
		Scanner s = new Scanner (System.in);
		System.out.println("Bitte Alter eingeben. Mit Enter best�tigen.");
		
		int Alter;
		Alter = s.nextInt();
		
		if (Alter==0) {
			System.out.println("Du wurdest noch nicht geboren");
		}
		
		else if (Alter>0 && Alter<18) {
			System.out.println("Du bist minderj�hrig");
		}
		
		else if (Alter>=18) {
			System.out.println("Du bist vollj�hrig");
		}
		else {
			System.out.println("FALSCH");
		}
	}
}
