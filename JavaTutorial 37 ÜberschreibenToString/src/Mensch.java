
public class Mensch extends Lebewesen{

	Mensch(int wieAlt, int welcherIq, String welcheHaarfarbe, String welcherName) {
		alter = wieAlt;
		iq = welcherIq;
		haarfarbe = welcheHaarfarbe;
		name = welcherName;
		anzahlLebewesen++;
	}
	
	/*Methode "toString" gibt verschiedene Strings an Aufrufer zurück. "%s" sind die Platzhalter bei Strings. Bei "printf" sind "%d" die Platzhalter. "\n" sorgt für einen Zeilenumbruch.
	 * Hier wird die Methode "toString" der Superklasse "Object" von Java überschrieben. Es kann auch ein "@Override" verwendet, um sicherzustellen, dass auch eine existierende Methode überschrieben
	 * wird. "@Override" veranlasst Java dazu, nach der zu überschreibenden Methode zu suchen. Falls diese nicht vorhanden ist, gibt es einen Error.
	 */
	
	@Override
	public String toString() {
		return String.format("%s\n Alter: %s\n IQ: %s\n Haarfarbe: %s", name, alter, iq, haarfarbe);
	}
}
