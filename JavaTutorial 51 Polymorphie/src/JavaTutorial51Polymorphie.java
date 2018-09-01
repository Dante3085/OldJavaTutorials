import java.util.Scanner;

public class JavaTutorial51Polymorphie {
	public static void main (String args[]) {
		
		/*Polymorphie: Methoden können der sogenannten Polymorphie unterliegen. Polymorphie ist griechisch und bedeutet Vielgestaltigkeit. Von Polymorphie spricht man in Java beispielsweise, wenn  zwei
		 * 
		 *Klassen denselben Methodennamen verwenden, aber die Implementierung der Methoden sich unterscheidet. Häufig wird Polymorphie bei der Vererbung verwendet, d. h., dass einer Variablen nicht nur 
		 *
		 *Objekte vom Typ der bei der Deklaration angegebenen Klasse zugewiesen werden können, sondern auch Objekte vom Typ der Kindsklassen. Dies funktioniert nur, weil jede Kindsklasse auch alle 
		 *
		 *Methoden und Attribute ihrer Elternklassen implementieren muss (java-tutorial.org).
		 * 
		 */
		
		String welchesLebewesen = "";
		
		Lebewesen [] l = new Lebewesen [5];
		
		for (int i = 0; i <l.length; i++) {
			
			Scanner s = new Scanner (System.in);
			System.out.println("Welches Lebewesen soll erschaffen werden? Mensch oder Hund?");
			welchesLebewesen = s.next();
			
			if (welchesLebewesen.equals("Mensch")) {
				
				System.out.println("Geben sie in dieser Reihenfolge die Eigenschaften des Menschen ein: Name, Alter, Iq, Haarfarbe");
				l[i] = new Mensch(s.next(), s.nextInt(),s.nextInt(), s.next());
				System.out.println(l[i].toString());
			}
			
			else if (welchesLebewesen.equals("Hund")) {
				l[i] = new Hund();
			}
			
			System.out.println("Anzahl Lebewesen" + " " + Lebewesen.anzahlLebewesen);
		}
	}
}
