

public class JavaTutorial63Threads {
	public static void main(String[] args) {
		
		
		//Thread: Ist praktisch eine neue main Methode, die parallel zur normalen main Methode l�uft.  Alle bisher geschriebenen Programme haben immer nur einen Thread gehabt. Somit bietet "Multithreading" deutlich mehr Rechenleistung.
		
		/*Thread(Wikipedia): In der Informatik bezeichnet Thread � auch Aktivit�tstr�ger oder leichtgewichtiger Prozess genannt � einen Ausf�hrungsstrang oder eine Ausf�hrungsreihenfolge in der Abarbeitung eines Programms. Ein Thread ist 
		 *Teil eines Prozesses. Man unterscheidet zwei Arten von Threads:
		 *1.Threads im engeren Sinne, die sogenannten Kernel-Threads, laufen ab unter Steuerung durch das Betriebssystem.
		 *2.Im Gegensatz dazu stehen die sogenannten User-Threads, die das Computerprogramm des Anwenders komplett selbst verwalten muss.
		 *
		 *Multithreading(Wikipedia): (auch Nebenl�ufigkeit, Mehrstr�ngigkeit oder Mehrf�digkeit genannt) bezeichnet in der Informatik das gleichzeitige (oder quasi-gleichzeitige) Abarbeiten mehrerer Threads (Ausf�hrungsstr�nge) innerhalb eines
		 *einzelnen Prozesses oder eines Tasks (ein Anwendungsprogramm).
		 */
		
		for (int i = 0; i <= 8; i++) {
		UnserThread ut1 = new UnserThread ();
		Thread x = new Thread (ut1);
		x.start();
		}
	}
}
