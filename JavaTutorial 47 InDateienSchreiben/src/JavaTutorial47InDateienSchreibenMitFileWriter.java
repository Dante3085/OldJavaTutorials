import java.io.*;
import java.util.Scanner;

public class JavaTutorial47InDateienSchreibenMitFileWriter {
	public static void main (String args[]) throws IOException {
		
		//Tutorial von Website: "http://www.javaschubla.de/2007/javaerst0260.html"
		
		//Mit "FileWriter" lässt sich in eine Datei schreiben. In dem man einen sog. "BufferedWriter" darüber legt, steigt die Effizienz.
		/*Aufgabe : Wir wollen eine Datei "ausgabe.txt" erstellen. Wenn sie nicht vorhanden ist, wird sie automatisch erstellt, wenn sie vorhanden ist, wird sie ohne nachzufragen überschrieben - es sei denn,
		 *sie ist schreibgeschützt, dann gibt es eine Exception. Wenn man unter Linux keine Schreibrechte für diesen Ordner hat, gibt es ebenfalls eine Exception. 
		 *
		 *Einen Writer oder OutputStream sollte man immer mit close() schließen. Wenn man einen BufferedWriter schließt, wird auch der darunterliegende Stream geschlossen.
		 *
		 *Mit der throws-Klausel signalisiert eine Methode explizit, dass sie eine Exception nicht lokal abfängt, sondern die Fehlerbehandlung dem Aufrufer überlässt.
		 */
		
		FileWriter meinFileWriter = new FileWriter ("C://Users//mjsch//Desktop//javaTestdatei.txt");		//FileWriter "meinFileWriter" mit Dateiname "javaTestdatei.txt" wird erstellt.
		BufferedWriter meinBufferedWriter = new BufferedWriter (meinFileWriter);							//BufferedWriter "meinBufferedWriter" mit FileWriterName "meinFileWriter" wird erstellt.
		Scanner s = new Scanner (System.in);																//Scanner zur Benutzereingabe.
		
		System.out.println("Geben sie 2 mal ein, was sie in die Datei schreiben möchten.");					//Hinweis für den Benutzer, dass jetzt in die Datei geschrieben werden kann.
		
		meinBufferedWriter.write(s.nextLine());																//BufferedWriter "meinBufferedWriter" schreibt "Dies ist ein Test!" in die Datei.
		meinBufferedWriter.newLine();																		//Zeilenumbruch.
		meinBufferedWriter.write(s.nextLine());																//BufferedWriter "meinBufferedWriter" schreibt "Dies ist ein Test!" in die Datei.
		
		meinBufferedWriter.close();																			//BufferedWriter "meinBufferedWriter" wird geschlossen.
		
		System.out.println("Die Datei wurde mit ihrer Eingabe beschrieben!");
	}
}
