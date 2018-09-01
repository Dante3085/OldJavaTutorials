
public class JavaTutorial24Überladungen {
	public static void main (String args[]) {
	
		// Überladung: Bedeutet, dass derselbe Methodenname mehrfach in einer Klasse vorkommt.
		/* Vorraussetzungen (mindestens eine muss erfüllt sein): 1. Datentyp mindestens eines Übergabeparameters ist anders als in den übrigen gleichnamigen Methoden.
		 * 2. Die Anzahl der Übergabeparameter ist unterschiedlich.
		 */
		
		int x,y,z,z1;
		x = 3;
		y = 5;
		z = rechnen (x,y); //1. rechnen Methode wird ausgeführt.
		z1 = rechnen (x,y,false); //2. rechnen Methode wird ausgeführt, da für die 1. rechnen Methode die Parameterliste nicht mehr stimmt.
		
		System.out.println(z);
		System.out.println(z1);
	}
	
	public static int rechnen (int x, int y) {
		
		int z;
		z = x + y;
		
		return z;
	}
	
	public static int  rechnen (int x, int y, boolean plus) {
		
		int z;
		 
		if (plus) {
			z = rechnen (x,y);
			return z;
		}
		
		else {
			z = x - y;
			return z;
		}
	}
}
