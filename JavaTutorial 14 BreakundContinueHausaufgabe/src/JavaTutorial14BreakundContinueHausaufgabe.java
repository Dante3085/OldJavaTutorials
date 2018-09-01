import java.util.Scanner;

public class JavaTutorial14BreakundContinueHausaufgabe {
	
	public static void main(String[] args) {
		
		int x,z;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Geben sie eine Zahl ein");
		x = s.nextInt();
		z = 0;
		
		while(true) {
			
			if(x <= 0) {
				break;
			}
			
			z += x%10;
			x = x / 10;
		}
		
		System.out.println(z); 
	}
	
	/* Ablaufserklärung:
	 * 1. Integer Variablen x und z werden erstellt. Der Datentyp Integer ist wichtig, da durch Nachkommastellen erstens die Bedingung "x<=0" niemals erfüllt werden kann, und zweitens
	 *  keine Reste mit Nachkommastellen existieren. Reste sind natürliche Zahlen.
	 * 2. Ein neuer Scanner wird eingefügt.
	 * 3. Der Benutzer wird nach der Eingabe einer Zahl gefragt.
	 * 4. x wird durch den Scanner beim Benutzer abgefragt.
	 * 5. z wird der Wert 0 gegeben.
	 * 6. Eine "while(true)" Endlosschleife wird gestartet.
	 * 7. In der Schleife: Wenn x kleiner oder gleich 0 wird, wird die Schleife komplett abgebrochen.
	 * 8. In der Schleife: z wird mit "z = z + x % 10" neu definiert.
	 * 9. In der Schleife: x wird mit "x = x / 10" neu definiert.
	 * 10. Die Schleife wird so lange wiederholt, bis x den Wert 0 im Integer Datentyp erhält. 
	 * 11. Nachdem die Schleife abgebrochen wurde, wird der aktuelle z Wert in der Konsole ausgegeben. 
	 */
}
