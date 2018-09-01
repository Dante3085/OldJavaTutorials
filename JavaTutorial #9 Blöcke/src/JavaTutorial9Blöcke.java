
public class JavaTutorial9Blöcke {
	public static void main (String args[]) {
		
		/*Blöcke: Ein Block fasst eine Gruppe von Anweisungen zusammen, die hintereinander ausgeführt werden. Anders gesagt: Ein Block ist eine Anweisung, die in geschweiften Klammern { } 
		 *eine Folge von Anweisungen zu einer neuen Anweisung zusammenfasst.
		 */
		
		int x;
		x=0;
		
		//Alles was hier in der Schleife steht ist die Gruppe von Anweisungen im Block { } der Schleife zusammengefasst.
		while (x<3) {
			x++;
			System.out.println("Dies ist der " + x + "te Durchgang!");
		}
	}
}
