package meinPackage;


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
	public Mensch clone() {
		try {
			Mensch m = (Mensch) super.clone();
			Hund hund = h.clone();
			m.h = hund;
			return m;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
