
public class JavaTutorial11ÜbergabevonVariablenanMethoden {
	public static void main (String args[]) {
		
		int x1,z1;
		x1 = 4;
		z1 = 5;
		
		Schreibex(x1,z1);
	}
	
	private static void Schreibex(int x2, int z2 ) {
		System.out.println(x2);
		System.out.println(z2);
	}
}

/* Ablauferklärung: 
 * 1. In der main wird eine Variable (x) vom Typ integer erstellt.
 * 2. Diese Variable x bekommt den Wert +3.
 * 3. Dann gehen wir in die Methode "Schreibex(x)". Dabei wird der Wert, den die Variable x hat an eben genannte Methode weitergegeben.
 * 4. Die Methode speichert diesen Wert nun in der Variable "y" vom Typ integer.
 * 5. Dann gibt die Methode in der Konsole den Wert der Variable "y" aus.
 */
