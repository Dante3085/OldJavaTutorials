import java.util.Scanner;

public class SwitchesBeispielZweiZweiterVersuch {
	public static void main (String args[]) {
		
		String l = "";
		boolean schleifeStarten = true;
		
		while (schleifeStarten == true) {
			
			Scanner s = new Scanner (System.in);
			System.out.println("Welche M�glichkeit wollen sie ausw�hlen? M�glichkeiten: 1, 2");
			l = s.nextLine();
			
			switch (l) {
			
			case "1":
				System.out.println("Erste M�glichkeit ausgegeben.");
				System.out.println("Wollen sie noch einen Durchgang machen? Ja: true, Nein: false");
				schleifeStarten = s.nextBoolean();
				break;
				
			case "2":
				System.out.println("Zweite M�glichkeit ausgegeben.");
				System.out.println("Wollen sie noch einen Durchgang machen? Ja: true, Nein: false");
				schleifeStarten = s.nextBoolean();
				break;
				
			default:
				System.out.println("Keine der beiden M�glichkeiten gew�hlt.");
				System.out.println("Wollen sie noch einen Durchgang machen? Ja: true, Nein: false");
				schleifeStarten = s.nextBoolean();
				break;
			}
		}
		
		System.out.println("Programm beendet.");
	}
}
