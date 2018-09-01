
public class JavaTutorial15final {
	public static void main (String args[]) {
		
		//"final" verhindert, dass einer Variable mehr als einmal ein Wert gegeben wird.
		final double Pi;
		Pi = 3.14;
		
		//Auf final Variablen kann jedoch normal zugegriffen werden.
		double Pipluseins;
		Pipluseins = Pi + 1;
		
		System.out.println(Pipluseins);
	}
}
