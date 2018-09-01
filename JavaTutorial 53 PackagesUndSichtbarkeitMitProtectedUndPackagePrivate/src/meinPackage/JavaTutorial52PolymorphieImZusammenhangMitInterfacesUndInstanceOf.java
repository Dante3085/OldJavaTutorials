package meinPackage;

import java.util.Scanner;

public class JavaTutorial52PolymorphieImZusammenhangMitInterfacesUndInstanceOf {
	public static void main (String args[]) {
		
		//Packagenamen fangen per Konvention immer mit einem Kleinbuchstaben an. Das default Package ist eine Eclipse Erfindung und existiert eigentlich nicht.
		//Package private: Auf Methoden, Variablen etc. im selben Package kann von jeder Klasse etc. im selben Package zugegriffen werden.
		
		/*Sichtbarkeitsmodifikatoren:
		 * 
		 * 1."private": so gut wie unsichtbar. Kann nur drauf zugegriffen werden, wenn in gleicher Klasse.
		 * 
		 * 2."package private": Kann nur drauf zugegriffen werden, wenn im gleichen Package.
		 * 
		 * 3."protected": Gleich wie bei package private. Ausnahme: Auf Variablen, Methoden kann bei Vererbung trotzdem zugegriffen werden.
		 * 
		 * 4."public": Zugriff von überall.
		 */
		
		Lebewesen [] l = new Lebewesen [5];
		String eingabe = "";
		
		for (int i = 0; i < l.length; i++) {
			
			Scanner s = new Scanner (System.in);
			System.out.println("Welche Lebewesen sollen erschaffen werden? Mensch oder Hund?");
			eingabe = s.next();
			
			if (eingabe.equals("Mensch")) {
				l[i] = new Mensch();
			}
			
			else if (eingabe.equals("Hund")) {
				l[i] = new Hund();
			}
		}
		
		for (int i = 0; i < l.length; i++) {
			
			if (l[i] instanceof Mensch) {
				System.out.println("Mensch!");
			}
			
			else if (l[i] instanceof Hund) {
				System.out.println("Hund!");
			}
		}
	}
}
