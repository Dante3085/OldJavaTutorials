import java.util.Scanner;

public class JavaTutorial19SwitchHausaufgabe {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bis zu welcher Zahl sollen Primzahlen ermittelt werden?");
		
		// Grenze bis zu der Primzahlen gesucht werden
		int n = s.nextInt();
		
		// beginne bei der Zahl 2 da 1 keine Primzahl ist
		for (int i = 2; i <= n; i++) {
			
			// isPrimzahl ist ein Wahrheitswert, um zu �berpr�fen ob wir eine
			// Primzahl gefunden haben. falls nicht wird sie sp�ter auf false
			// gesetzt.
			
			boolean isPrimzahl = true;
			
			// i durch jede Zahl kleiner als i zu teilen und zu �berpr�fen, ob
			// ein Rest �brig bleibt. BSP. im wiki 25=i und j w�re die Variable
			// die hochgez�hlt wird
			
			for (int j = 2; j < i && isPrimzahl; j++) {
				
				// Wenn eine division als rest 0 hat dann ist die Zahl keine
				// Primzahl und somit ist isPrimzahl auf false zu setzten
				
				if ((i % j) == 0) {
					
					isPrimzahl = false;
				}
			}
			// gib eine Meldung aus falls es sich um eine Primzahl handelt.
			
			if (isPrimzahl) {
				
				System.out.println(i + " ist eine Primzahl!");
			}
		}
	}
}