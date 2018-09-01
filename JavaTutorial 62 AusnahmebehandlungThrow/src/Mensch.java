
public class Mensch {
	
	int alter, iq;
	String name, haarfarbe;
	static int anzahlLebewesen;
	
	//Bei negativem Alter wird eine Ausnahme an den Aufrufer geworfen.
	
	Mensch (int wieAlt, int welcherIq, String welcherName, String welcheHaarfarbe) throws Exception {
		if (wieAlt < 0) {
			throw new Exception ("Negatives Alter ist nicht erlaubt!");
		}
		this.alter = wieAlt;
		this.iq = welcherIq;
		this.name = welcherName;
		this.haarfarbe = welcheHaarfarbe;
		anzahlLebewesen++;
	}
}
