
public class JavaTutorial28Rekursion {
	public static void main (String args[]) {
		
		int y,z;
		y = 5;
		z = fakult�t (y);
		
		System.out.println(z);
	}
	
	private static int fakult�t (int x) {
		
		if (x == 1) {
			return 1;
		}
		
		else {
			return fakult�t (x-1) * x; // 5! = 
		}
	}
}
