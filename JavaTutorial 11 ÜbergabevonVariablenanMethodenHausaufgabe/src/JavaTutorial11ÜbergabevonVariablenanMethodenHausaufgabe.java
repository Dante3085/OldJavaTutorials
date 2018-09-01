
public class JavaTutorial11ÜbergabevonVariablenanMethodenHausaufgabe {
	public static void main (String args[]) {
		
		//Aufgabe: Methode erstellen, die 2 Variablen vom Typ int zugewiesen bekommt. Diese sollen dann addiert und ausgegeben werden.
		
		int x1,y1;
		x1 = 10;
		y1 = 15;
		
		System.out.println("Variablen x1,y1 erstellt");
		Additionx1y1(x1,y1);
		System.out.println("Fertig");
	}
	
	private static void Additionx1y1(int x2, int y2) {
		System.out.println("Methode Additionx1y1 gestartet und Werte von x1 und y1 in x2 und y2 gespeichert");
		System.out.println(x2 + y2);
		System.out.println("Werte addiert und wiedergegeben");
	}
}
