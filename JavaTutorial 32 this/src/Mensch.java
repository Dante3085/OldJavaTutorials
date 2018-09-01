
public class Mensch {

	int alter;
	int iq;
	String haarfarbe;
	String name;
	
	void bildung () {
		iq += 5;
	}
	
	void bildung (int wieviel) {
		iq += wieviel;
	}
	
	Mensch (int alter, int iq, String name, String haarfarbe) {
		this.alter = alter; // "this" zeigt Java, dass es jetzt um das "alter" geht, dass oben in der Klasse initialisiert ist, und nicht das in der Konstruktion initialisierte "alter.
		this.iq = iq;
		this.name = name;
		this.haarfarbe = haarfarbe;
	}
	
	Mensch () {}
}
