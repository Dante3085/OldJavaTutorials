import java.util.Scanner;

public class JavaTutorial7Scanner {
	public static void main (String args[]) {
		/*
		int i;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Wie alt bist du?");
		i = s.nextInt();
		
		if (i>=18) {
			System.out.println("Du bist volljährig");
		}
		
		else if (i<18 && i>0) {
			System.out.println("Du bist minderjährig");
		}
		
		else if (i==0) {
			System.out.println("Du bist noch nicht geboren");
		}
		*/
		
		int x;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Bis zu welcher Zahl soll diese Schleife ausgeführt werden?");
		x = s.nextInt();
		
		for (int i = 0;i<=x;i++) {
			System.out.print(i + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("Durchgänge");
	}
}
