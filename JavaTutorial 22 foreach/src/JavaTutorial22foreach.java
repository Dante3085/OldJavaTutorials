

public class JavaTutorial22foreach {
	public static void main(String[] args) {
		
		/* foreach: foreach Schleife behandelt nur Arrays. "for(int j:x)" Das komplette Array x wird in dieser Schleife durchlaufen. Es wird mit jedem 
		 * Durchlauf immer der Wert, wo sich die Schleife gerade befindet in "j" gespeichert.
		 */
		
		int[] x = new int[20];
		
		for(int i = 0; i < x.length+1; i++) {
			x[i] = i;
		}
		
		for(int j: x) {
			System.out.print(j + " ");
		}
	}
}