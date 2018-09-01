package meinPackage;

public class JavaTutorial56clone {
	public static void main(String[] args) {
		
		//Bei clonungen von komplexen Datentypen muss auch der komplexe Datentyp eine clone-Methode in sich haben.
		
		Hund h = new Hund(10);
		Mensch m1 = new Mensch("karl", 90, 100, "schwarz", h);
		Mensch m2 = m1.clone(); 
		
		System.out.println("m1Alter: " + m1.alter);
		System.out.println("m2Alter: " + m2.alter);
		
		m1.alter = 80;
		m2.h.alter = 5;															//Bei komplexen Datentypen wird durch "clone" nur die Speicheradresse geklohnt. Deswegen sind die Hundealter gleich. Wurde gefixed.
		
		System.out.println("m1Alter: " + m1.alter);
		System.out.println("m2Alter: " + m2.alter);
		System.out.println("hAlter: " + m1.h.alter);
		System.out.println("hAlter: " + m2.h.alter);
	}	
}
