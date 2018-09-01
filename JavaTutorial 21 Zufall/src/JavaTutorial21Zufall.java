import java.util.Random;
import java.util.Scanner;

public class JavaTutorial21Zufall {
	public static void main (String args[]) {
		
		/* RNG (Random Number Generation/Generator)/Zufall: Der Aufbau des Befehls ist ähnlich wie beim Scanner. "Befehl (Scanner,Random) Name (hier: würfel) = new Befehl();" Siehe Zeile 11 und 12.
		 * Ebenfalls wie beim Scanner, muss der Befehl importiert werden. Siehe dafür Zeile 1.
		 */
		
		Scanner s = new Scanner(System.in);
		Random würfel = new Random();
		
		//Auch die Zuweisung des Befehls ist ähnlich wie beim Scanner. "Variable = Name.nextInt();"
		//Weitere Paramter können in den Klammern () eingegeben werden. 10 würde bedeuten, dass zufällig eine Zahl von 0 bis 9 generiert wird. Also immer von 0 bis eingegebener Wert -1
		
		while (true) {
		int y = würfel.nextInt(6); //Ist jetzt von 1 bis 6. Wie bei "Mensch ärgere dich nicht!"
		System.out.println(y + " ");
		}
	}
}
