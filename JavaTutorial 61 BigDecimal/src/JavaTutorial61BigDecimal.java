import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaTutorial61BigDecimal {
	public static void main(String[] args) {
		
		//BigDecimal: Mit BigDecimal k�nnen unendlich gro�e Nachkommastellen erzeugt werden. Die Methoden sind deckungsgleich mit BigInteger.
		//Bei Zahlen mit unendlich gro�en Nachkommastellen, also z.B.: 1/3, muss der Computer wissen wann er aufh�ren soll, da sonst eine Exception auftritt. Dies kann mit einer bestimmten �berladung der "divide" Methode erreicht werden.
		/*Mit der Methode "divide(BigDecimal Name, bis zu welcer Stelle soll gerechnet werden, Rundungsmethode)" kann bei einer Division die unendlich gro�e Nachkommastellen erzeugt, bestimmt werden bis zu welcher Stelle gerechnet 
		 *und wie gerundet werden soll.
		 */
		
		BigDecimal bigd = new BigDecimal ("1");
		BigDecimal bigd2 = new BigDecimal ("3");
		bigd = bigd.divide(bigd2,2500, BigDecimal.ROUND_DOWN);
		
		System.out.println(bigd);
	}
}
