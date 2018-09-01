
public class JavaTutorial24�berladungen {
	public static void main (String args[]) {
	
		// �berladung: Bedeutet, dass derselbe Methodenname mehrfach in einer Klasse vorkommt.
		/* Vorraussetzungen (mindestens eine muss erf�llt sein): 1. Datentyp mindestens eines �bergabeparameters ist anders als in den �brigen gleichnamigen Methoden.
		 * 2. Die Anzahl der �bergabeparameter ist unterschiedlich.
		 */
		
		int x,y,z,z1;
		x = 3;
		y = 5;
		z = rechnen (x,y); //1. rechnen Methode wird ausgef�hrt.
		z1 = rechnen (x,y,false); //2. rechnen Methode wird ausgef�hrt, da f�r die 1. rechnen Methode die Parameterliste nicht mehr stimmt.
		
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
