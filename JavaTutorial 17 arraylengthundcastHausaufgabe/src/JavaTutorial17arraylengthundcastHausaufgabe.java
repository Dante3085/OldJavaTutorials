import java.util.Scanner;

public class JavaTutorial17arraylengthundcastHausaufgabe {
	public static void main (String args[]) {
		
		//Aufgabe: Benutzer soll gefragt werden, wie viele Zahlen er eingeben will. Zahlen sollen wie folgt ausgegeben werden: [3,2,4,5,1,2,5]. !Kein Komma nach der letzten Zahl!
		
		Scanner s = new Scanner(System.in);
		System.out.println("Wie viele Zahlen wollen sie eingeben? Mit Enter bestätigen.");
		
		int arrayLänge;
		arrayLänge = s.nextInt();
		
		int [] a = new int [arrayLänge];
		
		System.out.println("Geben sie ihre Zahlen ein. Jeweils mit Enter bestätigen.");
		
		for (int i = 0; i<a.length; i++) {
			a[i] = s.nextInt();
		}
		
		for (int j = 0; j<a.length; j++) {
			
			String t = "[";
			String u = "]";
			
			if (j==0) {
				System.out.print(t);
			}
			
			System.out.print(a[j]);
			
			if (j<a.length-1) {
				System.out.print(",");
			}
			
			if (j==a.length-1) {
				System.out.print(u);
			}
		}
	}
}
