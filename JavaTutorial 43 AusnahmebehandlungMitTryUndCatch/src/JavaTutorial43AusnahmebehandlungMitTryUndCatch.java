import java.util.Scanner;											//Scannerfunktion wird importiert.

public class JavaTutorial43AusnahmebehandlungMitTryUndCatch {
	public static void main (String args[]) {
		
		/*Ausnahmebehandlung (Fehlerbehandlung): Ausnahmefall ist in dieser Situation, dass nicht durch die Zahl 0 geteilt werden darf.
		 * 
		 */
		
		Scanner s = new Scanner (System.in); 						//Neuer Scanner mit Namen "s" wird erstellt.
																	
		
		int x,y,erg;												//3 int - Variablen werden erstellt. 
		x = s.nextInt();											//x soll vom Benutzer besetzt werden.
		y = s.nextInt();											//y soll vom Benutzer besetzt werden.
		try {														//Die Operation Variable "erg" gleich x durch y wird ausprobiert.
		erg = x / y;
		}
		catch (Exception e) {										//Falls ein Fehler bzw. eine Ausnahme auftritt wird ein festgelegter Text plus die Fehlerinformationen ausgegeben
			System.out.println("ERROR!" + e.toString());
			erg = 0;												
		}
		System.out.println(erg);									//erg wird ausgegeben.
	}
}
