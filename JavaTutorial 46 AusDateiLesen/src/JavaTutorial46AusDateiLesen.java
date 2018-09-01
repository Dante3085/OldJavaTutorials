import java.io.File;

public class JavaTutorial46AusDateiLesen {
	public static void main (String args[]) {
		
		//Beispiel: In einer Datei stehen alle Informationen �ber einen neuen Menschen (Alter,iq,name,haarfarbe), die dem Konstruktor �bergeben werden k�nnen.
		
		File f = new File("C://Users//mjsch//Desktop//javaTestdatei.txt");		//Es wird �berpr�ft, ob folgende Datei im folgenden Pfad zu finden ist (existiert).
		
		DateiH�ndler dh = new DateiH�ndler (f);									//Es wird ein neuer Dateih�ndler erstellt, dessen Konstruktor die oben �berpr�fte Datei "f" �bergeben wird.
		
		Mensch m = dh.lesen();													//Mensch "m" liest mit der Methode "lesen", aus dem DateiH�ndler "dh", die Inforamtionen der Datei "f", welche vorher �bergeben wurde. 
		Mensch u = dh.lesen();													//Mensch "u" liest mit der Methode "lesen", aus dem DateiH�ndler "dh", die Inforamtionen der Datei "f", welche vorher �bergeben wurde.
		
		System.out.println(m.toString());										//Mit �berschriebener "toString()" Methode werden die Informationen f�r Mensch m ausgegeben.
		System.out.println();													//Leerzeile wird erzeugt.
		System.out.println(u.toString());										//Mit �berschriebener "toString()" Methode werden die Informationen f�r Mensch u ausgegeben.
		
		dh.Schlie�en();															//Datei wird geschlossen.
	}
}
