
public class Mensch {
	
	int alter;
	int iq = 0;
	
	String name;
	String haarfarbe;
	
	//Das hier ist eine Instanzmethode. Instanzmethoden sind Methoden, die von einer Klasse ausgef�hrt werden k�nnen
	void bildung () {
		iq += 5;
	}
	
	void bildung(int wieviel) {
		iq += wieviel;
	}
}
