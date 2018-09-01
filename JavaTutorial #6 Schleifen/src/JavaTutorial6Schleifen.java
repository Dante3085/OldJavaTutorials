
public class JavaTutorial6Schleifen {
	public static void main (String args[]){
		
		int x;
		x = 0;
		
		System.out.println(x);
		x++; //+1
		System.out.println(x);
		x--; //-1
		System.out.println(x);
		
		//1. Schleife
		while (x<3) {
			x++;
			System.out.println("Dies ist der " + x + "te Durchgang!");
		}
		
		System.out.println("Schleife beendet");
		x = 5;
		
		//2. Schleife "do" wird auch wenn die Bedingung bei while nicht erfüllt ist einmal ausgeführt.
		do {
			x++;
			System.out.println(x);
		}
		
		while (x<3); {
			System.out.println("Dies ist der " + x + "te Durchgang!");
		}
		
		/*3. Schleife "for" braucht 3 Argumente. "int i = 0" erstellt eine int Variable i mit dem Wert 0. "i<3" überprüft bei jedem Schleifendurchgang, ob i noch kleiner 3 ist. i++ wird 
		 * bei jedem Schleifendurchgang durchgeführt.
		 */
		
		/*
		for (int i = 0; i<=10; i++) {
			System.out.println(i);
			if (i==6) {
				System.out.println("Ich bin größer als 5");
			}
			
			else if (i==4) {
				System.out.println("Ich bin kleiner als 5");
			}
		}
		
		System.out.println("Schleife beendet");
		*/
	}
}
