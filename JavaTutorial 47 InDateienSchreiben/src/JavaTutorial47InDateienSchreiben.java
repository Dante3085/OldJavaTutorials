import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaTutorial47InDateienSchreiben {
	public static void main (String args[]) {
		
		/*Aufgabe: Programm, dass den Benutzer fragt in welche Datei geschrieben werden soll. Anschließend wird überprüft, ob diese Datei existiert. Wenn sie existiert, wird der bereits enthaltene Inhalt
		 * ausgegeben und eine Eingabe vom Benutzer hinten dran gehangen. Falls die Datei noch nicht existiert, soll sie erstellt werden und das in sie hineingeschrieben werden, was vom Benutzer eingegeben
		 * wird.
		 */
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Welche Datei soll gelesen werden?");
		String dateiName = s.next();
		String dateiInhalt = "";
		File f = new File ("C://Users//mjsch//Desktop"+dateiName+".txt");
		
		if (f.exists()) {
			
			try {
				Scanner dateiLeser = new Scanner (f);
				while (dateiLeser.hasNext()) {
					dateiInhalt += dateiLeser.next();
				}
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			
		}
	}
}
