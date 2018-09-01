
public class JavaTutorial25BeliebigvieleParametermitInt {
	public static void main (String args[]) {
		
		/* Im Fall, wenn nicht bekannt ist wie viele Parameter von einer Methode erwartet werden.
		 * Siehe unten für "(int...x)". Somit wird der Methode eine beliebige Anzahl von Parametern übergeben, welche alle in einem Array gespeichert werden, dass int Zahlen
		 * erwartet und x heißt. In diesem Fall wird ein Array der Länge 3 angelegt, da 3 Zahlen übergeben werden.
		 */
		
		int x,y,z,z2;
		x = 3;
		y = 5;
		z = 9;
		z2 = rechnen (x,y,z,55,443,5623,-3000);
		
		System.out.println(z2);
	}
	
	private static int rechnen (int...x) {
		
		int z;
		z = 0;
		
		for (int i = 0; i<x.length; i++) {
			z += x[i];
		}
		
		return z;
	}
}
