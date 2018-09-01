
public class JavaTutorial9Bl�cke {
	public static void main (String args[]) {
		
		/*Bl�cke: Ein Block fasst eine Gruppe von Anweisungen zusammen, die hintereinander ausgef�hrt werden. Anders gesagt: Ein Block ist eine Anweisung, die in geschweiften Klammern { } 
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
