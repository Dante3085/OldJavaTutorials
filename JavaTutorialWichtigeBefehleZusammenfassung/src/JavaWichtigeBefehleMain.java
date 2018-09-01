import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaWichtigeBefehleMain {
	public static void main(String[] args) {
		
		//Gibt den in der Klammer geschriebenen Text in der Konsole aus.
		System.out.println("Hello World");
		
		//Erstellt eine Zahlenvariable vom Datentyp int mit dem Namen "ersteZahl". int Variablen umfassen natürliche Zahlen von -2147483648 bis 2147483647.
		int ersteZahl;
		System.out.println("intMinValue: " + Integer.MIN_VALUE + " / " + "IntMaxValue: " + Integer.MAX_VALUE);
		
		//Erstellt eine Zahlenvariable vom Datentyp double mit dem Namen "ergebnis". double Variablen umfassen natürliche sowie Kommazahlen von 4.9^-324 bis 1.797693134862317308^308.
		double ergebnis;
		System.out.println("doubleMinValue: " + Double.MIN_VALUE + " / " + "doubleMaxValue: " + Double.MAX_VALUE);
		
		//Erstellt eine Charvariable mit dem Namen "einZeichen". Charvariablen können immer nur ein Zeichen in sich speichern. Chars können natürlich mit Arrays kombiniert werden, um so mehr Zeichen kompakt zu speichern.
		char einZeichen;
		einZeichen = 'z';
		System.out.println(einZeichen);
		
		//Erstellt einen String mit dem Namen "vieleZeichen". Strings speichern beliebi große Zeichenketten in sich.
		String vieleZeichen;
		vieleZeichen = "blabla und bla.";
		System.out.println(vieleZeichen);
		
		//Erstellt eine Variable vom Typ boolean. Boolean - Variablen können nur 2 Werte annehmen. Entweder "true" oder "false". Sie dienen zur einfachen des Wahrheitsgehalt von Aussagen.
		boolean gesetzt;
		gesetzt = true;
		System.out.println(gesetzt);
		gesetzt = false;
		System.out.println(gesetzt);
		
		//Wandelt (auch casten genannt) die int Variable "intZahl" in eine double Variable mit dem Namen "kommazahl" um.
		double kommazahl;
		int intZahl;
		intZahl = 3;
		System.out.println(intZahl);
		kommazahl = (int)intZahl;
		System.out.println(kommazahl);
		
		//Speichert mithilfe der Stringmethode "charAt()" ein Zeichen des Strings "stringVariable" mithilfe einer Indexangabe in der char Variable "zeichen" ab.
		char zeichen;
		String stringVariable;
		stringVariable = "Hallo";
		System.out.println(stringVariable);
		zeichen = stringVariable.charAt(1);
		System.out.println(zeichen);
		
		//Gibt die Länge des String "stringVariable" an.
		int stringLänge = stringVariable.length();
		System.out.println(stringLänge);
		
		//Speichert die Summe von "zahlEins" und "zahlZwei" in "ergebnisZwei".
		int zahlEins, zahlZwei, ergebnisZwei;
		zahlEins = 5;
		zahlZwei = 4;
		ergebnisZwei = zahlEins + zahlZwei;
		System.out.println(ergebnisZwei);
		
		//BufferedReader muss erst importiert werden. Buffered Reader ermöglicht die Verarbeitung von Benutzereingaben. Muss mit try/catch ummantelt werden. "readLine()" liest die Benutzereingabe ein.
		String strInput = "";
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Eingabe tätigen...");
		try{
		strInput = input.readLine();	
		}
		catch (Exception e){
			System.out.println("ERROR");
		}
		System.out.println(strInput);
		
		//try/catch - Blöcke dienen der Fehlerverabeitung. In den try - Abschnitt wird normale Code des Programms eingetragen, der eventuell Probleme aufweisen kann. Der catch - Abschnitt ist die Reaktion auf ein Problem, beispielsweise eine Nachricht an den Benutzer des Programms.
		try{
			
		}
		catch (Exception name) {
			
		}
		
		/* if - Abfragen führen nach Überprüfung einer in den Klammern gesetzten Bedingung, eine Befehlsabfolge durch, die in den darauffolgenden geschwungenen Klammern aufzufinden ist. Falls die ursprüngliche Bedingung nicht erfüllt wurde, können mit 
		 * beliebig vielen "else if()" Statements, die nach dem gleichen Prinzip wie das if Statement funktionieren, weitere Bedingungen hinzugefügt werden. Mit einem "else" Statement kann praktisch eine Standardreaktion hinzugefügt werden, die immer dann
		 * eintritt, wenn keine der vorher beschriebenen Bedingungen erfüllt wurde.
		 */
		int x = 3;
		if(x == 3) {
			System.out.println("X war also 3. Ich wusste es!");
		}
		else if(x == 4) {
			System.out.println("X war anscheinend doch 4. Schade...");
		}
		else {
			System.out.println("Mit der Zahl hab' ich in keinster Weise gerechnet...ha...ha.");
		}
		
		//Eine while Schleife führt ihren Inhalt so lange aus, bis ihre Bedingung nicht mehr erfüllt ist.
		int y = 4;
		while(y == 4) {
			System.out.println("Y muss jetzt 4 sein.");
			y++;
		}
		System.out.println("Y kann jetzt nicht mehr 4 sein.");
		
		//Eine do - while - Schleife ist eine kopfgesteuerte Schleife. Das heißt, bevor ihre Bedingung überhaupt erst geprüft wird, hat bereits ein Schleifendurchgang stattgefunden. Oder anders, der Schleifencode wird immer mindestens 1mal ausgeführt.
		int z = 3;
		do {
			System.out.println("Schleife wird ausgeführt");
			z = 4;
		}
		while(z == 3);
		System.out.println("Schleife ist beendet.");
		
		//Die Integer Mehode "parseInt()" wandelt eine String Variable in eine int Variable um.
		String zahlAlsString = "43";
		System.out.println("zahlAlsString " + zahlAlsString);
		int stringZuInt;
		stringZuInt = Integer.parseInt(zahlAlsString);
		System.out.println("stringZuInt " + stringZuInt);
		
		double stringZuDouble;
		stringZuDouble = Double.parseDouble(zahlAlsString);
		System.out.println("stringZuDouble " + stringZuDouble);
	}
}
