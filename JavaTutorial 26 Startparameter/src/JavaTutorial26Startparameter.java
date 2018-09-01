
public class JavaTutorial26Startparameter {
	public static void main (String args[]) {
		
		// "void" sagt aus, dass von folgender Methode kein Wert zur�ckgegeben wird. "int" w�rde sagen, dass eine zahl vom Datentyp int zur�ckgegeben wird.
		// "args[]" ist ein Array. args == Argumente.
		// "-console" wurde eingef�gt durch. Rechtsklick "Klassenname" -> Run As -> run configuration -> Arguments -> Programm Arguments -> "-console" eingeben -> apply -> close
		
		if (args[0].equals("-console")) {
			System.out.println("Konsole gestartet");
		}
	}
}
