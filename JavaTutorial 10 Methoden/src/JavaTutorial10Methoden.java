
public class JavaTutorial10Methoden {
	public static void main (String args[]) {
		
		//Methoden: Methoden sind Programmabläufe, die immer wieder aufgerufen werden können, bzw. "Funktionen" eines Objekts.
		
		int x;
		x = 3;
		
		
		schreibeBrot();
		System.out.print(" ist Fertig " + x);
	}
	
	//					Methodenname
	public static void schreibeBrot() {
		
		int x;
		x = 15;
		System.out.print("Brot " + x);
	}
	
	// Die Variable "x" im "public static void main (String args[]) {}" hat nichts mit der Variable "x" im "private static void SchreibeBrot() {}" zu tun.
}
