import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateiH�ndler {
	
	//Scanner liest nun nicht mehr Informationen, die vom Benutzer eingegeben werden, sondern Informationen die aus der Datei kommen, die dem Konstruktor "DateiH�ndler" geliefert werden.
	//Das "try/catch - System" gibt f�r den Fall in dem es keine Datei gibt, eine Fehlermeldung aus.
	
	Scanner s;
	
	DateiH�ndler (File f) {
		try {
			s = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Mensch lesen () {
		if (s.hasNext()) {
			int alter = s.nextInt();
			int iq = s.nextInt();
			String name = s.next();
			String haarfarbe = s.next();
			return new Mensch (alter,iq,name,haarfarbe);
		}
		return null;
	}
	
	public void Schlie�en() {
		s.close();														//Schlie�t die aufgerufene Datei.
	}
}
