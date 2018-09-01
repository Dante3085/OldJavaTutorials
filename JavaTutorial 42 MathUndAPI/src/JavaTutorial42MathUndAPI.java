import java.util.Scanner;

public class JavaTutorial42MathUndAPI {
	public static void main (String args[]) {
		
		//Java API: Zusammenfassung aller Klassen die standartm‰ﬂig in Java vorhanden sind. (Link: https://docs.oracle.com/javase/7/docs/api/)
		//Beispiele an der Klasse "Math" und dessen Methoden
		
		System.out.println("Dies ist ein Programm, dass Potenzrechnungen vollziehen soll. Geben sie zu erst die Basis ein. Danach best‰tigen sie mit return. Als zweites geben sie den Exponenten ein und best‰tigen wieder mit return. ");
		
		Scanner s = new Scanner (System.in);
		
		double x, res;
		x = s.nextDouble();
		res = Math.pow(x, s.nextDouble());
		
		System.out.println(res);
	}
}
