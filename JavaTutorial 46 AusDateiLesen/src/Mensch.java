
public class Mensch extends Lebewesen {

	Mensch (int wieAlt, int welcherIq, String welcherName, String welcheHaarfarbe) {
		alter = wieAlt;
		iq = welcherIq;
		name = welcherName;
		haarfarbe = welcheHaarfarbe;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s\nAlter: %s\nIQ: %s\nHaarfarbe: %s\nSpeicheradresse: %s", name, alter, iq, haarfarbe, super.toString());
	}
}
