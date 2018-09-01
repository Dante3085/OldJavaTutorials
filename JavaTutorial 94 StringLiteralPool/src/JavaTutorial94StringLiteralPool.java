
public class JavaTutorial94StringLiteralPool {
	public static void main(String[] args) {
		
		/* Jeglicher Stringinhalt wird in den "StringConstantPool" geschmissen. Sollte es also vorkommen, dass eine neue Stringvariable den gleichen Inhalt hat wie eine vorher erstellte Stringvariable,
		 * so wird für die neue Stringvariable lediglich zu dem Inhalt des ersten Strings, der ja gleich ist, gezeigt. So wird vermieden das gleiche Inhalte unnötig dupliziert werden und dadurch mehr 
		 * Speicher verbrauchen.
		 */
		
		String s = "Hi";
		String s2 = "Hi";
		
		System.out.println(s.equals(s2) ); //Dieses Beispiel zeigt, dass beide Strings zu dem selben Wort zeigen. "==" überprüft Speicheradresse. "equals" den eigentlichen Inhalt.
	}
}
