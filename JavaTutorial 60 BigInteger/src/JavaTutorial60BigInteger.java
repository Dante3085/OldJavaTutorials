import java.math.BigInteger;

public class JavaTutorial60BigInteger {
	public static void main(String[] args) {
		
		//Mit "BigInteger" Klasse können theoretisch unendlich große Zahlen abgespeichert werden (bis Ram voll ist). Internt werden diese BigInteger Zahlen als String abgespeichert.
		//Ein BigInteger Objekt wird wie folgt erstellt: "BigInteger "Name des BigIntegers" = new BigInteger ("Zahl die im BigInteger Objekt gespeichert werden soll");".
		//Die BigInteger Methode "add()" kann 2 BigInteger Zahlen addieren. Der Ablauf ist wie folgt: "Name des BigIntegers = Name des BigInteger.add(Name des BigIntegers);".
		//Methode "divide" dividiert BigInteger Zahlen.
		//Methode "pow" potenziert BigInteger Zahlen.
		//Methode "subtract" subtrahiert BigInteger Zahlen.
		//Methode "multiply" multipliziert BigInteger Zahlen.
		
		//BigInteger Rechnungen sind langsamer als jene von primitiven Datentypen (long, int, short, double etc.).
		
		//System.out.println(Long.MAX_VALUE);
		
		BigInteger big = new BigInteger ("4");
		BigInteger big2 = new BigInteger ("10000000000008541485185858594474758590000000000000");
		
		BigInteger result = big2.add(big);
		System.out.println(result);
		
		result = big2.divide(big);
		System.out.println(result);
		
		result = big.pow(2);
		System.out.println(result);
		
		result = big2.pow(2);
		System.out.println(result);
		
		result = big.subtract(big2);
		System.out.println(result);
		
		result = big.multiply(big2);
		System.out.println(result);
	}
}
