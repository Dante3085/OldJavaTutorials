import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class JavaTutorial45DateiErstellen {
	public static void main (String args[]) {
		
		File f = new File ("C://Users//mjsch//Desktop//javaTestdatei.txt");
		
		if (!f.exists()) {																			//Falls Datei "f" nicht existiert, soll "javaTestdatei.txt" erstellt werden.
			try {
				Formatter format = new Formatter ("C://Users//mjsch//Desktop//javaTestdatei.txt");
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
