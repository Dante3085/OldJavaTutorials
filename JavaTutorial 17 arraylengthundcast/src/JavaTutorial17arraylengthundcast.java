import java.util.Scanner;

public class JavaTutorial17arraylengthundcast {
	public static void  main (String args[]) {
		
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("Von wie vielen Zahlen wollen sie den Durchschnitt berechnen? Mit Enter bestätigen");
		
		int arrayLänge;
		arrayLänge = s.nextInt();
		
		System.out.println("Bitte " + arrayLänge + " Zahlen eingeben. Jeweils mit Enter bestätigen.");
		
		int[] a = new int [arrayLänge];
		
		for (int i = 0; i<a.length; i++) {
		a[i] = s.nextInt();
		}
		
		double Durchschnitt = durchschnitt(a);
		
		System.out.println(Durchschnitt);
		*/
		
		//cast: Mit cast können Variablen eines Typs (double, int...) in einem anderen Typ gespeichert werden.
		
		int x;
		x = 4;
		
		//long hat größeren Wertebereich als int. Deswegen funktioniert folgende Zuweisung. Andersrum funktionert das nicht!
		long y; 
		y = x;
		
		//cast löst dieses Problem. Damit wird vom einen in den anderen Datentyp umgewandelt. Jeweils immer den neuen, niederen Datentyp in Klammern vor die umgewandelte Variable schreiben.
		x = (int)y;
		
		System.out.println(x + " " + y);
	}
	
	/*
	private static double durchschnitt(int[] a) {
		
		double lösung;
		lösung = 0;
		
		for (int i = 0; i<a.length; i++) {
			lösung += a[i];
		}
		
		lösung /= a.length;
		
		return lösung;
	}
	*/
}
