
public class Mensch {

	int alter;
	int iq;
	String haarfarbe;
	String name;
	static int anzahlMenschen = 0;
	
	 public void bildung(int wieviel) {
		iq =+ 5;
	}
	 
	 Mensch (int wieAlt, int welcherIQ) {
		 alter = wieAlt;
		 iq = welcherIQ;
		 anzahlMenschen++;
	 }
	 
	 //Setter: Setzt Variable fest, die übermittelt werden soll.
	 void setAlter(int alter) {
		 this.alter = alter;
	 }
	 
	 //Getter: Übermittelt Variable.
	 int getAlter() {
		 return alter;
	 }
}
