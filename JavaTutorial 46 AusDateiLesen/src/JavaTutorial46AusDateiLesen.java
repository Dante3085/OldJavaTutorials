import java.io.File;

public class JavaTutorial46AusDateiLesen {
	public static void main (String args[]) {
		
		//Beispiel: In einer Datei stehen alle Informationen über einen neuen Menschen (Alter,iq,name,haarfarbe), die dem Konstruktor übergeben werden können.
		
		File f = new File("C://Users//mjsch//Desktop//javaTestdatei.txt");		//Es wird überprüft, ob folgende Datei im folgenden Pfad zu finden ist (existiert).
		
		DateiHändler dh = new DateiHändler (f);									//Es wird ein neuer Dateihändler erstellt, dessen Konstruktor die oben überprüfte Datei "f" übergeben wird.
		
		Mensch m = dh.lesen();													//Mensch "m" liest mit der Methode "lesen", aus dem DateiHändler "dh", die Inforamtionen der Datei "f", welche vorher übergeben wurde. 
		Mensch u = dh.lesen();													//Mensch "u" liest mit der Methode "lesen", aus dem DateiHändler "dh", die Inforamtionen der Datei "f", welche vorher übergeben wurde.
		
		System.out.println(m.toString());										//Mit überschriebener "toString()" Methode werden die Informationen für Mensch m ausgegeben.
		System.out.println();													//Leerzeile wird erzeugt.
		System.out.println(u.toString());										//Mit überschriebener "toString()" Methode werden die Informationen für Mensch u ausgegeben.
		
		dh.Schließen();															//Datei wird geschlossen.
	}
}
