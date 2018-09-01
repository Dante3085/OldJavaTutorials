import java.util.Scanner;

public class JavaTutorial8KommentareundArraysHausaufgabe {
	public static void main (String args[]) {
		
		/*Aufgabe: Einen kleinen Taschenrechner erstellen, der den Benutzer nach zwei Zahlen fragt, die miteinander addiert werden sollen.
		 * Alle 3 Variablen sollen in einem Array gespeichert werden, dass die Länge 3 hat. 
		 */
		
		int[] i = new int[3];
		
		Scanner s = new Scanner (System.in); //Warum sagt er, dass "s" nie geschlossen wird?
		System.out.println("Gib einen Wert für x und einen Wert für y ein. Diese beiden Werte werden dann addiert.");
		i[0] = s.nextInt();
		i[1] = s.nextInt();
		i[2] = i[0] + i[1];
		System.out.print(i[0] + "+" + i[1] + "=" + i[2]);
	}
}
