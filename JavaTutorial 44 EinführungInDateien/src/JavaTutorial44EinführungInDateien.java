import java.io.File;

public class JavaTutorial44EinführungInDateien {
	public static void main (String args[]) {
		
		//Hier geht es darum zu testen, ob es eine bestimmte Datei gibt.
		
		File f = new File("Y://Videos//Filme//Die Jagd - mit Mads Mikkelsen (2012) - - Ac3HD1080//Die Jagd.mkv");
		
		if (f.exists()) {
			System.out.println("Die Datei " + f.getName() + " gibt es!");
		}
		else {
			System.out.println("Die Datei " + f.getName() + "gibt es nicht!");
		}
	}
}
