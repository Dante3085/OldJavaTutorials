import javax.swing.JFrame;

public class JavaTutorial64GUIGraphicalUserInterface {
	public static void main (String[] args) {
		
		//Ein JFrame (Fenster) benötigt folgende Importierung: "import javax.swing.JFrame;" und wird wie folgt implementiert: "JFrame NameDesJFrame = new JFrame();"
		//Die JFrame Methode "setVisible(true/false)" kann durch eine boolean Abfrage ein Fenster "sichtbar" oder "unsichtbar" machen.
		/*Die Methode "setSize(width, height)" kann mit einer Breiten- und Höhenangabe die Standardgröße eines Fensters (in Pixeln) festlegen. Natürlich kann das Fenster, während das Programm läuft auch
		 *manuell vergrößert bzw. verkleinert werden.
		 */
		/*JFrame startet bei Programmstart einen neuen Thread. Diesem muss gesagt werden, dass er beendet wird, wenn das Fenster geschlossen wird. Das heißt, bei Schließung des Fensters läuft der Thread immer noch.
		 *Die Methode "setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)"  löst dieses Problem. Bei Schließung des Fensters wird auch das komplette Thread beendet.
		 */
		//Die Methode "setAlwaysOnTop" legt mit einer boolean Abfrage fest, ob sich das Fenster dauerhaft in den Vordergrund drängen darf.
		//Die Methode "setLocation" legt die Position des Fensters beim Start fest (Standard: 0, 0 [y-Koordinate geht von oben nach unten]).
		//Die Methode "setTitle" kann den Programmtitel oben in der Leiste festlegen.
		//Die Methode "setResizable" kann mit einer boolean Abfrage festlegen, ob das Fenster manuell verkleiner bzw. vergrößert werden kann.
		//Die Methode "setLocationRelativeTo" kann die Startposition des Fensters relativ zu einem anderen Fenster festlegen. Bei Eingabe "(null)" wird das Fenster in der Mitte des Bildschirms gestartet.
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(500, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setAlwaysOnTop(false);
		//jf.setLocation(700, 440);
		jf.setTitle("Programm Eins");
		jf.setResizable(false);
		jf.setLocationRelativeTo(null);
	}
}
