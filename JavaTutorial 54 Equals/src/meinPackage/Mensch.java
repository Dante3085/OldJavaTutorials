package meinPackage;

public class Mensch extends Lebewesen {

	Mensch (String welcherName, int wieAlt, int welcherIq, String welcheHaarfarbe) {
		name = welcherName;
		alter = wieAlt;
		iq = welcherIq;
		haarfarbe = welcheHaarfarbe;
		anzahlLebewesen++;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Mensch)) {
			return false;
		}
		Mensch m = (Mensch)obj;															//obj wird auf Mensch gecastet.
		if (this.iq != m.iq) {
			return false;
		}
		if (!(this.name.equals(m.name))) {
			return false;
		}
		if (!(this.haarfarbe.equals(m.haarfarbe))) {
			return false;
		}
		if (this.alter != m.alter) {
			return false;
		}
		return true;
	}
}
