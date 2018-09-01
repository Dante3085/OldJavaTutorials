


public class Mensch extends Lebewesen implements Cloneable{									//Cloneable ist ein "flatInterface", das hei�t es ist leer.

	Hund h;
	
	Mensch (String welcherName, int wieAlt, int welcherIq, String welcheHaarfarbe, Hund hund) {
		name = welcherName;
		alter = wieAlt;
		iq = welcherIq;
		haarfarbe = welcheHaarfarbe;
		h = hund;
		anzahlLebewesen++;
	}
	
	@Override																				//"clone" Methode wird �berschrieben, da sie standartm��ig nur mit dem Modifier "protected" funktioniert.
	public Mensch clone() throws CloneNotSupportedException {								//"throws": Verschiebt die Verantwortung des Fehlers zum Aufrufer. Falls Exception (hei�e Kartoffel) auftaucht, wird sie einfach weitergeworfen.
		Mensch m = (Mensch) super.clone();
		Hund hund = h.clone();
		m.h = hund;
		return m;
	}
}
