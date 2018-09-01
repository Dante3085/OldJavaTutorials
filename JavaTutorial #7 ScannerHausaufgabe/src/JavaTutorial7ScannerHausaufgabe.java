import java.util.Scanner;

public class JavaTutorial7ScannerHausaufgabe {
	public static void main (String args[]) {
		
		//Aufgabe: Einen kleinen Taschenrechner erstellen, der den Benutzer nach zwei Zahlen fragt, die miteinander addiert werden sollen.
		
		int x,y,z;
		
		Scanner s = new Scanner (System.in); //Warum sagt er, dass "s" nie geschlossen wird?
		System.out.println("Gib einen Wert für x und einen Wert für y ein. Diese beiden Werte werden dann addiert.");
		x = s.nextInt();
		y = s.nextInt();
		z = x + y;
		System.out.println(x + "+" + y + "=" + z);
	}
}
