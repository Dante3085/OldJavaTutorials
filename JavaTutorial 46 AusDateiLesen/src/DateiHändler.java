import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DateiHändler {
	
	//Scanner liest nun nicht mehr Informationen, die vom Benutzer eingegeben werden, sondern Informationen die aus der Datei kommen, die dem Konstruktor "DateiHändler" geliefert werden.
	//Das "try/catch - System" gibt für den Fall in dem es keine Datei gibt, eine Fehlermeldung aus.
	
	Scanner s;
	
	DateiHändler (File f) {
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
	
	public void Schließen() {
		s.close();														//Schließt die aufgerufene Datei.
	}
}
