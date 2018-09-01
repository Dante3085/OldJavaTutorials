
public class Mensch extends Lebewesen {

	Mensch (int wieAlt, int welcherIQ, String welcherName, String welcheHaarfarbe) {
		alter = wieAlt;
		iq = welcherIQ;
		name = welcherName;
		haarfarbe = welcheHaarfarbe;
		anzahlLebewesen++;
	}
	
	@Override
	public String toString() {
		return String.format("Alter: %s\nIQ: %s\nName: %s\nHaarfarbe: %s\nSpeicheradresse: %s", alter, iq, name, haarfarbe, super.toString());
	}
}
