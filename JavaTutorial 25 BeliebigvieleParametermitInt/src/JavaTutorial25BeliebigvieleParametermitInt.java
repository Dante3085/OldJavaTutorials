
public class JavaTutorial25BeliebigvieleParametermitInt {
	public static void main (String args[]) {
		
		/* Im Fall, wenn nicht bekannt ist wie viele Parameter von einer Methode erwartet werden.
		 * Siehe unten f�r "(int...x)". Somit wird der Methode eine beliebige Anzahl von Parametern �bergeben, welche alle in einem Array gespeichert werden, dass int Zahlen
		 * erwartet und x hei�t. In diesem Fall wird ein Array der L�nge 3 angelegt, da 3 Zahlen �bergeben werden.
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
