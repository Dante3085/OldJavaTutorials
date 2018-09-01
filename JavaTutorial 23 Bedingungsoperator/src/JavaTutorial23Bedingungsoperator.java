import java.util.Random;

public class JavaTutorial23Bedingungsoperator {
	public static void main (String args[]) {
		
		/* Bedingungsoperator "?": Falls Ausdruck "x<y" == true, wird die linke Seite von "x:y" (also x) genommen. Bei false die andere Seite.
		 */
		
		int x,y,z,z2;
		x = 4;
		y = 6;
		z = x<y ? x:y;
		z2 = x<y ? 10:100;
		
		System.out.println(z);
		System.out.println(z2);
	}
}
