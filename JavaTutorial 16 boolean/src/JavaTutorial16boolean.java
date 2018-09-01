
public class JavaTutorial16boolean {
	public static void main (String args[]) {
		
		//boolean Variablen können einen wahr oder einen falsch Zustand einnehmen.
		
		int x,y;
		x = 9;
		y = 11;
		
		boolean b1,b2;
		b1 = x<y || (x<3 && y>3);
		b2 = x>y;
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
