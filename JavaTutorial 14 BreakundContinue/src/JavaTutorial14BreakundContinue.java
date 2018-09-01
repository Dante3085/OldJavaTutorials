import java.util.Scanner;

public class JavaTutorial14BreakundContinue {
	public static void main (String args[]) {
		
		/* break: Bricht eine Schleife komplett ab.
		 * 
		 */
		
		/* continue: Bricht aktuellen Schleifendurchgang ab, aber nicht die komplette Schleife
		 * 
		 */
		
		/*
		 // Fakultät
		System.out.println("Zahl eingeben");
		Scanner s = new Scanner(System.in);
		
		double zahl, fakultät;
		zahl = s.nextInt();
		fakultät = 1;
		
		while(true) {
			if (zahl<=1){
				break;
			}
			
			fakultät *= zahl; //fakultät *= zahl == fakultät = fakultät * zahl
			zahl--;
		}
		
		System.out.println(fakultät);
		*/
		
		for (int i = 0; i<2; i++) {
			if (i<1) {
				System.out.println("Es wurde continued");
				continue;
			}
			
			System.out.println("Nicht mehr continued");
		}
	}
}
