
public class JavaTutorial12RückgabewertReturnStrings {
	public static void main (String args[]) {
		
		//void: Bedeutet, dass die Methode nichts zurück gibt.
		
		int x,y,z;
		x = 1;
		y = 2;
		z = add(x,y);
		
		System.out.println(z);
		
		// Folgende Rechnung ist mathematische eigentlich unsinnig, da bei Umformung 0=5 rauskommen würde. Jedoch wird hier lediglich der vorher definiert x Wert 1 mit 5 addiert und erneut in x gespeichert.
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
	
	/* Ablaufserklärung:
	 * 1. Variablen x,y,z werden erstellt. 
	 * 2. x hat den Wert 1 und y hat den Wert 2. z bekommt seinen Wert aus der Methode "add(x,y)", was die Summe der übernommen Werte von x und y in die Methode ist.
	 * 3. Die Methode "add(x,y)" wird ausgeführt. Methode gibt aufgrund des "int" und "return" eine bestimmte Variable bzw. dessen Wert zurück.
	 * 4. Diese (neue) Variable ist z, welche ihren Wert aus der Addition von x und y erhält.
	 * 5. Dieser Wert wird mit "return z;" zurück an die main gesendet.
	 * 6. z aus der main hat seinen wert mit 3 erhalten.
	 * ! Nach einem "return" wird die Methode sofort abgebrochen und nachfolgende Befehle werden nie ausgeführt  !
	 */
}
