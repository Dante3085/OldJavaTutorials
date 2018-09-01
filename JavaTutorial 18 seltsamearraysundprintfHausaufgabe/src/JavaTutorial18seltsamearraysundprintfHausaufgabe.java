import java.util.Scanner;

public class JavaTutorial18seltsamearraysundprintfHausaufgabe {
	public static void main (String args[]) {
		
		/* Aufgabe: Methode erstellen, die "3 int Werte" erwartet, nämlich "Stunde, Minute, Sekunde". Die Methode soll String zurückliefern, der Zahlen in folgendem Format ausgibt,
		 * [Stunde:Minute:Sekunde];
		 */
		
		System.out.println("Bitte Stunden, Minuten und Sekunden als Zahl eintragen. Jeweils mit Enter bestätigen.");
		Scanner s =  new Scanner(System.in);
		
		int Stunden, Minuten, Sekunden;
		Stunden = s.nextInt();
		Minuten = s.nextInt();
		Sekunden = s.nextInt();
		
		String Uhr = Uhr(Stunden, Minuten, Sekunden);
		System.out.println(Uhr);
	}
	
	private static String Uhr(int x, int y, int z) {
		
		//Zahl vor d und nach Prozent gibt an wie lang der reservierte Platz ist. In diesem Fall 2 Felder.
		String s = String.format("[%2d:%2d:%2d]",x,y,z);
		return s;
	}
}
