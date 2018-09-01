import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;

public class JavaTutorial59List {
	public static void main(String args[]) {
		
		//Listen: Listen sind Arrays, die keine Maximallänge haben. Es können keine primitive Datentypen in den spitzen Klammern der Liste eingetragen werden.
		//Eine Liste wird wie folgt implementiert: "List <komplexerDatentyp(z.B.:Integer)> NameDerListe(z.B.:list) = new ArrayList <kompleyerDatentyp> ();
		//Mit der List Methode "add" lassen sich Werte in aufsteigende Indizes speichern. Die Indizes steigen mit jedem Eintrag um 1 an, beginnend bei 0.
		//Mit der List Methode "get" lässt sich ein Wert mit Verweis auf dessen Index kriegen.
		/*Mit der List Methode "remove" lässt sich ein bereits eingetragener Wert löschen. Alle noch bestehenden Indizes rücken nach. Beispiel: Unten wurde der
		 *Wert "30" aus Index "0" gelöscht. Das heißt, dass der Wert "29548" jetzt den Index 0 trägt.
		 *Mit der List Methode "indexOf" lässt sich der Index eines Wertes erlangen.
		 *Mit der List Methode "size" lässt sich wie mit der Array Methode "length" die derzeitige Größe der Liste bestimmen.
		 *
		 *Der Defaultwert bzw. Fehlerwert ist auch hier "-1".
		 *Arrays sind in der Regel schneller. Es sollte also wenn möglich das Array vorgezogen werden.
		 */
		
		Scanner s = new Scanner (System.in);
		
		List <Integer> list = new ArrayList <Integer> ();
		
		System.out.println("Zahl eingeben.");
		
		list.add(s.nextInt());
		list.add(29548);
		list.add(852541);
		
		list.remove(0);
		
		System.out.println(list.get(0));
		System.out.println(list.indexOf(29548));
		System.out.println(list.size());
	}
}
