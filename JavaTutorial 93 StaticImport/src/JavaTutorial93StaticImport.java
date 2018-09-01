import static java.lang.Math.*;							//Statisches importieren benötigt immer den genauen Teil der importiert werden soll. Hier die gesamte Klasse durch das Sternchen am Ende.

public class JavaTutorial93StaticImport {
	public static void main(String[] args) {
		
		/* In order to get around this, people sometimes put static members into an interface and inherit from that interface. This is a bad idea. In fact, it's such a bad idea that there's a name for 
		 * it: the Constant Interface Antipattern (see Effective Java Item 17). The problem is that a class's use of the static members of another class is a mere implementation detail. When a class 
		 * implements an interface, it becomes part of the class's public API (Application Programming Interface = Programmierschnittstelle). Implementation details should not leak into public APIs.
		 * 
		 * Statisches Importieren kann den Code allerdings für außenstehende unverständlicher machen, da falls das "import static" übersehen wird, Methoden vermeintlich aus dem Nichts auftauchen können.
		 * Korrekterweise sollte man natürlich auf folgende 3 Dinge achten: 1. Wird von irgendeiner Klasse geerbt? 2. Wird irgendein Interface implementiert? 3. Wird statisch importiert?
		 */
		
		System.out.println(cos(0));						//Durch den Import der gesamten Math Klasse kann der Klassenverweis "Math" gelöscht werden.
		System.out.println(cos(PI/2));
		System.out.println(cos(PI));
		System.out.println(cos(PI*3/2));
	}
}
