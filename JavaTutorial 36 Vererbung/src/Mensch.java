
public class Mensch extends Lebewesen{ // "extends" f�r "erbt" "Lebewesen" ist die Klasse von der geerbt wird.

	Mensch (int wieAlt, int welcherIQ, String welcheHaarfarbe, String welcherName) {
		alter = wieAlt;
		iq = welcherIQ;
		haarfarbe = welcheHaarfarbe;
		name = welcherName;
		anzahlLebewesen++;
	}
}
