import java.util.Scanner;

public class JavaTutorial16booleanHausaufgabe {
	public static void  main (String args[]) {
		
		//Aufgabe: Ein Array der Länge 5 erstellen (Die Zahlen werden vom Benutzer eingegeben) und von den Zahlen den Durchschnitt errechnen und als Double ausgeben.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte 5 Zahlen eingeben. Jeweils mit Enter bestätigen.");
		
		double[] a = new double [5];
		a[0] = s.nextDouble();
		a[1] = s.nextDouble();
		a[2] = s.nextDouble();
		a[3] = s.nextDouble();
		a[4] = s.nextDouble();
		
		double Durchschnitt;
		Durchschnitt = (a[0]+a[1]+a[2]+a[3]+a[4])/5;
		
		System.out.println("Der Durchschnitt beträgt " + Durchschnitt + ".");
	}
}
