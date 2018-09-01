
public class JavaTutorial26Startparameter {
	public static void main (String args[]) {
		
		// "void" sagt aus, dass von folgender Methode kein Wert zurückgegeben wird. "int" würde sagen, dass eine zahl vom Datentyp int zurückgegeben wird.
		// "args[]" ist ein Array. args == Argumente.
		// "-console" wurde eingefügt durch. Rechtsklick "Klassenname" -> Run As -> run configuration -> Arguments -> Programm Arguments -> "-console" eingeben -> apply -> close
		
		if (args[0].equals("-console")) {
			System.out.println("Konsole gestartet");
		}
	}
}
