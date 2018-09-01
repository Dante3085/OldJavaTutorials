
public class JavaTutorial10MethodenHausaufgabe {
	public static void main (String args[]) {
		
		//Aufgabe: Methoden verschachteln.
		
		System.out.println("Standort: main");
		eins();
		System.out.println("Standort: main erneut");
	}
	
	private static void eins() {
		System.out.println("Standort: eins");
		zwei();
		System.out.println("Standort: eins erneut");
	}
	
	private static void zwei() {
		System.out.println("Standort: zwei");
	}
}
