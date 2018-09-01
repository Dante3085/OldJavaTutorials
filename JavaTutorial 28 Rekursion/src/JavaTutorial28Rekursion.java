
public class JavaTutorial28Rekursion {
	public static void main (String args[]) {
		
		int y,z;
		y = 5;
		z = fakultät (y);
		
		System.out.println(z);
	}
	
	private static int fakultät (int x) {
		
		if (x == 1) {
			return 1;
		}
		
		else {
			return fakultät (x-1) * x; // 5! = 
		}
	}
}
