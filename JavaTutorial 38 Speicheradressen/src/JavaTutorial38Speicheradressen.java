
public class JavaTutorial38Speicheradressen {
	public static void main (String args[]) {
		
		Mensch ute = new Mensch(90, 100, "grau", "Ute");
		
		System.out.println(ute.toString()); //Was in der Konsole durch "toString" (Methode aus Superklasse "Object" in Java) standartm‰ﬂig ausgegeben wird, ist der Speicherort im Arbeitsspeicher.
											//Hier: Der Speicherort des oben erstellten Menschen ute.
		// komplexe Datentypen haben Speicherstellen im Ram.
	}
}
