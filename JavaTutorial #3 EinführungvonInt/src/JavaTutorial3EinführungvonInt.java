
public class JavaTutorial3EinführungvonInt {
	public static void main (String args[]){
		
		//Hier werden die Funktionen "int" und "double" getestet.
		int x,y,z,a,b;
		x = 9;
		y = 5;
		z = x + y;
		a = x - y;
		b = x * y;
		
			//Die Funktion "double" habe ich aus eigenem Antrieb ausprobiert. Sie kommt nicht im 3. Video vor.
		double i;
		i = 9.5;
		
		
		//Hier wird die Funktion "float" getestet. 
			//Es gibt ein Problem bei der Division Nachkommastellen anzuzeigen (siehe: Berechnung: c=x/y [Zeile:21])
		float c;
		c = x / y;
		
		//Hier werden die vorher definierten Variablen "x" und "y" ausgegeben.
		//Das "+" bedeutet umgangssprachlich "Da kommt noch etwas".
		//Es muss ein Leerzeichen zwischen Ausgabetext (hier: Hello World) und dem nachfolgenden Anführungszeichen eingefügt werden, um ein Leerzeichen in der Konsole zwischen Ausgabetext und dem durch "+" angefügten Teil zu erzielen.
		System.out.println(y);
		System.out.println("Hello world "  + x);
		System.out.println("Bye world "  + i);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);	
	}
}
