import java.util.Scanner;

public class JavaTutorial15finalHausaufgabe {
	public static void main (String args[]){
		
		/*Aufgabe: Benutzer nach 2 ganzen Zahlen fragen. Miteinander multiplizieren und ausgeben. Nicht Multiplikation benutzen,
		 *  sondern nur Addition und eine Schleife.
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte 2 ganze Zahlen nacheinander eintippen und mit Enter jeweils akzeptieren");
		
		int x,y,z;
		x = s.nextInt();
		y = s.nextInt();
		z = malMitPlus(x,y);
		
		System.out.println(z);
	}
	
	//Multiplikation: 9*3=9+9+9
	private static int malMitPlus(int x, int y) {
		
		int i, z;
		i = 0;
		z = 0;
		
		while(i<x) {
			z = z + y;
			i++;
		}
		
		return z;
	}
}
