import java.util.Scanner;

public class SwitchesBeispielZwei {
	public static void main (String args[]) {
		
		String l =" ";
		
		int schleifeBeenden;
		schleifeBeenden = 0;
		
		while(schleifeBeenden == 0) {
		
			Scanner s = new Scanner(System.in);
			System.out.println("Welcher Fall soll ausgegeben werden?");
			l = s.nextLine();
			
			switch (l) {
		
				case "ersteM�glichkeit":
					System.out.println("ersteM�glichkeitAusgegeben");
					System.out.println("Soll ein weiterer Durchgang gestartet werden? Ja: 0, Nein: 1");
					schleifeBeenden = s.nextInt();
					
					break;
					
				case "zweiteM�glichkeit":
					System.out.println("zweiteM�glichkeitAusgegeben");
					System.out.println("Soll ein weiterer Durchgang gestartet werden? Ja: 0, Nein: 1");
					schleifeBeenden = s.nextInt();
					
					break;
					
				default:
					System.out.println("keineM�glichkeitAusgegeben");
					System.out.println("Soll ein weiterer Durchgang gestartet werden? Ja: 0, Nein: 1");
					schleifeBeenden = s.nextInt();
					
					break;
			}
		}
		
		System.out.println("Programm beendet.");
	}
}
