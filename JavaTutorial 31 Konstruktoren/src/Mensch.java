
public class Mensch {
	
	int alter;
	int iq = 0;
	
	String name;
	String haarfarbe;
	
	// Instanzmethoden
	
	void bildung () {
		iq += 5;
	}
	
	void bildung(int wieviel) {
		iq += wieviel;
	}
	
	// Konstruktor
	Mensch (int wieAlt, int welcherIQ) {
		alter = wieAlt;
		iq = welcherIQ;
	}
	
	// Defaultkonstruktor. Kann auch ohne Parametereingabe aufgerufen werden.
	Mensch(){}
}
