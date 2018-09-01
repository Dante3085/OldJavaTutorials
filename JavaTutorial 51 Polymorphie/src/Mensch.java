
public class Mensch extends Lebewesen implements IFortbewegungsmittel {

	public  Mensch (String welcherName, int wieAlt, int welcherIq, String welcheHaarfarbe) {
		name = welcherName;
		alter = wieAlt;
		iq = welcherIq;
		haarfarbe = welcheHaarfarbe;
		anzahlLebewesen++;
	}
	
	public void laufen() {
	 
	
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nAlter: %s\nIq: %s\nHaarfarbe: %s", name, alter, iq, haarfarbe);
	}
}
