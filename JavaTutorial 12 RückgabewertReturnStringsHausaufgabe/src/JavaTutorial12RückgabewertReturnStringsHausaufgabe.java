import java.util.Scanner;

public class JavaTutorial12RückgabewertReturnStringsHausaufgabe {
	public static void main (String args[]) {
		
		/* Aufgabe: Methode erstellen, die 3 Variablen erwartet. 2 "double" Variablen und 1 String. Im String kann jeglicher arithmetischer Operator gespeichert werden. Dann jeweilige Rechnung
		 * mit den 2 Zahlen machen und das wieder zurückgeben.
		 * Besser ausgedrückt. Ein Taschenrechner der die arithmetischen Operatoren plus, minus, mal und geteilt erkennt und damit rechnen kann.  
		 */
		
		double x,y,z;
		
		String s;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Rechnung eingeben. Für jede Zahl und jedes Zeichen eine Zeile!");
		x = scan.nextInt();
		//String wird ohne Datentyp wie "int" oder "double" eingelesen.
		s = scan.next();
		y = scan.nextInt();
		z = rechnen(x,y,s);
		System.out.println(z);
	}
	
	private static double rechnen (double x, double y, String s) {
		
		double z;
		
		if (s.equals ("+")) 
			z = x + y;
		
		else if (s.equals ("-")) 
			z = x - y;	
		
		else if (s.equals ("*")) 
			z = x * y;
		
		else if (s.equals ("/")) 
			z = x / y;
			
		else {
			System.out.println("Bitte nur folgende Operatoren verwenden: +,-,*,/");
			return -1; //-1 ist eine allgemeine Zahl für eine Fehlermeldung. Die oben stehende Meldung sollte eine korrekte Rechnung mit dem Ergebnis -1 zusätzlich ausschließen.
		}
		
		return z;
	}
}
