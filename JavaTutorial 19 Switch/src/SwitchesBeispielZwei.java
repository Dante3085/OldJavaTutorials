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
		
				case "ersteMöglichkeit":
					System.out.println("ersteMöglichkeitAusgegeben");
					System.out.println("Soll ein weiterer Durchgang gestartet werden? Ja: 0, Nein: 1");
					schleifeBeenden = s.nextInt();
					
					break;
					
				case "zweiteMöglichkeit":
					System.out.println("zweiteMöglichkeitAusgegeben");
					System.out.println("Soll ein weiterer Durchgang gestartet werden? Ja: 0, Nein: 1");
					schleifeBeenden = s.nextInt();
					
					break;
					
				default:
					System.out.println("keineMöglichkeitAusgegeben");
					System.out.println("Soll ein weiterer Durchgang gestartet werden? Ja: 0, Nein: 1");
					schleifeBeenden = s.nextInt();
					
					break;
			}
		}
		
		System.out.println("Programm beendet.");
	}
}
