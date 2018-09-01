
public class JavaTutorial58ThrowsInDerMainUndFinalize  {
	public static void main(String[] args) {
		
		//Falls auch aus der main Methode heraus eine Exception gethrowed wird, stürzt das Programm einfach ab.
		//finalize(): Wird vom Garbage Collector gerufen und wird überschrieben um eine Reihe an Cleanup Aufgaben zu erfüllen.
		
		Hund h = new Hund(5);
		Mensch m1 = new Mensch("karl",70,80,"schwarz",h);
		try {
			Mensch m2 = m1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
