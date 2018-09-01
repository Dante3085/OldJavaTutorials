import java.util.Scanner;

public class JavaTutorial97JavaDocAnnotations {
	
	/**
	 * 
	 * @param schrittlänge Speichert in sich die Benutzereingabe der Schrittlänge
	 * @return Gibt irgendein redundantes Ergebnis an den Aufrufer zurück.
	 */
	public int laufen(int schrittlänge) {
		int ergebnis = schrittlänge;
		return ergebnis;
	}
	
	public static void main(String[] args) {
		
		/**
		 * @see
		 * @author mjsch
		 * Dies hier ist ein Javadoc Kommentar und er wird in der fertigen Javadoc sichtbar sein.
		 * Javadoc Kommentare sind ein sehr nützliches Tool, um Klassen oder andere Dinge in einem Programm zu beschreiben und diese Beschreibungen als festen Bestandteil der eigenen Klassen etc. zu haben.
		 * @param beispielparameter Macht Dinge
		 * @since 1.5.3 Zeigt ab welcher Version etwas vorhanden war (Abwärtskompatibilität)
		 * @return irgendeinen Scheiß
		 */
		
	}
}
