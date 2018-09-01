
public class JavaTutorial20Labels {
	public static void main (String args[]) {
		
		/* Label: Mit einem Label kann ein Block ({}) benannt werden und somit auf ihn zugegriffen werden. Unten wird mithilfe des Labels "whileSchleife" der Schleife while, das Continue auf die
		 * while Schleife anstatt auf die direkt über ihm liegende for Schleife bezogen.
		 */
		
		int Grenze;
		Grenze = 1;
		
		
		whileSchleife:while (Grenze<3) {
			Grenze ++;
			System.out.println("in while");
			
			for(int i = 0; i<Grenze; i++) {
				System.out.println("in for");
				continue whileSchleife;
			}
		}
	}
}
