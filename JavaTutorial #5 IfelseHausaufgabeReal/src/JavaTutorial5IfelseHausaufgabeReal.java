import java.util.Scanner;

public class JavaTutorial5IfelseHausaufgabeReal {
	public static void main (String args[]) {
		
		/*Aufgabe: Variable "Alter" erstellen und mit einem Wert versehen. Ab 18 "volljährig" ausgeben.
		 *  Unter 18 "minderjährig" ausgeben. Gleich 0 "noch nicht geboren" ausgeben.
		 */
		
		Scanner s = new Scanner (System.in);
		System.out.println("Bitte Alter eingeben. Mit Enter bestätigen.");
		
		int Alter;
		Alter = s.nextInt();
		
		if (Alter==0) {
			System.out.println("Du wurdest noch nicht geboren");
		}
		
		else if (Alter>0 && Alter<18) {
			System.out.println("Du bist minderjährig");
		}
		
		else if (Alter>=18) {
			System.out.println("Du bist volljährig");
		}
		else {
			System.out.println("FALSCH");
		}
	}
}
