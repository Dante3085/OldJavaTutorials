package meinPackage;

public class JavaTutorial54Equals {
	public static void main(String[] args) {
		
		//2 Personen fahren das Gleiche Auto (2 Autos). 2 Personen fahren dasselbe Auto (2 Personen teilen sich ein einziges Fahrzeug).
		//Damit "equals" wirklich den Inhalt als selben erkennt, muss die Methode "equals" in der Mensch Klasse überschrieben werden.
		
		Mensch m1 = new Mensch("karl", 70, 80, "schwarz");
		Mensch m2 = new Mensch("karl", 70, 80, "schwarz");
		
		System.out.println(m1.equals(m2));								//Ergebnis ist "false", da "equals" die Speicheradresse und eben nicht den Inhalt kontrolliert.
		System.out.println(m1 == m2);									//"equals" ist zwar überschrieben und kann nicht mehr dasselbe (Speicheradresse) prüfen, mit "==" bleibt diese Funktion jedoch erhalten.
		System.out.println(m1.toString());								//Speicheradresse m1
		System.out.println(m2.toString());								//Speicheradresse m2
	}
}
