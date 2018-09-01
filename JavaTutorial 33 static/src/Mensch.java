
public class Mensch {
	
	//Eigenschaften von "Mensch"
	int alter;
	int iq = 0;
	static int anzahlMenschen = 0;
	String name;
	String haarfarbe;
	
	//Instanzmethoden von "Mensch"
	void bildung() {
		iq += 5;
	}
	
	void bildung(int wieviel) {
		iq += wieviel;
	}
	
	Mensch (int wieAlt, int welcherIQ) {
		alter = wieAlt;
		iq = welcherIQ;
		anzahlMenschen++;
	}
	
	static int getAnzahlMenschen() {
		return anzahlMenschen;
	}
}
