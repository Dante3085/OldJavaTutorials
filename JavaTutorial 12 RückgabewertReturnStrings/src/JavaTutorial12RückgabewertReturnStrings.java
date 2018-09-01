
public class JavaTutorial12R�ckgabewertReturnStrings {
	public static void main (String args[]) {
		
		//void: Bedeutet, dass die Methode nichts zur�ck gibt.
		
		int x,y,z;
		x = 1;
		y = 2;
		z = add(x,y);
		
		System.out.println(z);
		
		// Folgende Rechnung ist mathematische eigentlich unsinnig, da bei Umformung 0=5 rauskommen w�rde. Jedoch wird hier lediglich der vorher definiert x Wert 1 mit 5 addiert und erneut in x gespeichert.
		x = x + 5;
		
		System.out.println(x);
		
		// String: Kann Zeichenketten abspeichern.
		String s;
		s = "Hallo Welt";
		
		System.out.println(s);
	}
	
	private static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	/* Ablaufserkl�rung:
	 * 1. Variablen x,y,z werden erstellt. 
	 * 2. x hat den Wert 1 und y hat den Wert 2. z bekommt seinen Wert aus der Methode "add(x,y)", was die Summe der �bernommen Werte von x und y in die Methode ist.
	 * 3. Die Methode "add(x,y)" wird ausgef�hrt. Methode gibt aufgrund des "int" und "return" eine bestimmte Variable bzw. dessen Wert zur�ck.
	 * 4. Diese (neue) Variable ist z, welche ihren Wert aus der Addition von x und y erh�lt.
	 * 5. Dieser Wert wird mit "return z;" zur�ck an die main gesendet.
	 * 6. z aus der main hat seinen wert mit 3 erhalten.
	 * ! Nach einem "return" wird die Methode sofort abgebrochen und nachfolgende Befehle werden nie ausgef�hrt  !
	 */
}
