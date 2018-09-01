
public class JavaTutorial36Vererbung {
	public static void main (String args[]) {
		
		/*Vererbung: Durch die Vererbung können Eigenschaften, die mehreren Objekten/Klassen zuzuordnen sind effektiv an diese weitergeleitet werden, ohne das der Code jedes Mal neu geschrieben werden
		* muss.
		* Beispiel: übergeordnete Klasse "Lebewesen" gibt Attribute wie "Name" "Alter" usw. an untergeordnete Klassen "Mensch" und "Hund" weiter.
		* Jede Klasse erbt automatisch von der Java Hauptklasse "Object". 
		*/
		
		System.out.println(Mensch.anzahlLebewesen);												//Anzahl der Lebewesen wird vor Erstellung jeglicher Lebewesen überprüft.
																		
		Mensch karl = new Mensch (20, 100, "blond", "Karl");									//Lebewesen und Mensch mit Namen Karl wird erstellt. 20 Jahre alt, iq von 100, blonde Haarfarbe, Name Karl.
		
		System.out.println(Mensch.anzahlLebewesen);												//Anzahl der Lebewesen wird nach Erstellung des ersten Lebewesens überprüft.
		
		Hund gustaf = new Hund (10, "braun", "Gustaf");											//Lebewesen und Hund mit Namen Gustaf wird erstellt. 10 Jahre alt, braune Fellfarbe, Name Gustaf.
		
		System.out.println(Mensch.anzahlLebewesen);												//Anzahl der Lebewesen wird nach Erstellung des zweiten Lebewesens überprüft.
		System.out.println(karl.alter + " " + karl.iq + " " + karl.haarfarbe + " " + karl.name);//Alter, Iq, Haarfarbe und Name von Karl werden ausgegeben.
		System.out.println(gustaf.alter + " " + gustaf.haarfarbe + " " + gustaf.name);			//Alter, Haarfarbe und Name von Gustaf werden ausgegeben.
	}
}
