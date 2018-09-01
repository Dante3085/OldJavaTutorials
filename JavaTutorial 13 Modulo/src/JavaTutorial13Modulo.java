
public class JavaTutorial13Modulo {
	public static void main (String args[]) {
		
		/* Modulo: Befasst sich mit dem Restwert bei einer Division. Symbol: "%"
		 * Bsp.: 9/7=1.
		 *       7
		 *       _
		 *       2<---Das ist der Rest
		 */
		
		int x,y,z;
		x = 7;
		y = 4;
		//z = x % y;
		
		//System.out.println(z); //Es wird 2 ausgegeben. Das ist der Rest bei der Division von 7/5.
		
		if (x % 2 == 0) {
			System.out.println("x ist gerade!");
		}
		
		else {
			System.out.println("x ist ungerade!");
		}
		
		if (y % 2 == 0) {
			System.out.println("y ist gerade!");
		}
		
		else {
			System.out.println("y ist ungerade!");
		}
		
		if(x == 10) {
			System.out.println("");
		}
	}
}
