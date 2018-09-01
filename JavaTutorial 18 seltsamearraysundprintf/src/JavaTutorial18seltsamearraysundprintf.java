
public class JavaTutorial18seltsamearraysundprintf {
	public static void main (String args[]) {
		
		/*
		int [] zahlen = new int [10];
		zahlen [0] = 1;
		
		System.out.println(zahlen[0]);
		seltsam(zahlen);
		System.out.println(zahlen[0]);
		*/
		
		int x,y;
		x = 1;
		y = 22;
		
		// "%d" ist Platzhalter für jeweils erste Variable, die nach Komma zu finden ist.
		System.out.printf("Hallo!%d blah %d blah",x,y);
		System.out.println();
		
		//Kann auch in String gespeichert werden und dann als println ausgegeben werden.
		String s = String.format("Hallo!%d blah %d blah",x,y);
		System.out.println(s);		
	
	}
	
	/*
	private static void seltsam(int [] x) {
		x[0]++;
	}
	*/
	
	/*Erklärung: Eigentlich haben Variablen in verschiedenen Methoden nichts miteinander zu tun, bzw. keinen Einfluss aufeinander. Bei Arrays ist dies anders. Ohne einen neuen Wert zurückzugeben,
	 * wurde das Array "zahlen" aus der "main" Methode, dessen Werte in einem anderen Array in der "seltsam" Methode gespeichert wurden, von der Operation "x[0]++;" in der "seltsam" Methode um 1
	 * an der Stelle [0] erhöht.
	 * Die anfangs erwähnte Regel gilt natürlich noch für alle anderen primitiven Datentypen (short, int, long, float, double ...)
	 */
}
