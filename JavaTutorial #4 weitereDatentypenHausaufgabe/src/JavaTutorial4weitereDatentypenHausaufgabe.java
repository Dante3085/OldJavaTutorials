
public class JavaTutorial4weitereDatentypenHausaufgabe {
	public static void main (String args[]){
		
		//Aufgabe: Drei Variablen. x und y haben fixe Werte und mit Hilfe von z sollen die Werte von x und y vertauscht werden.
		
		int x,y,z;
		x = 1;
		y = 2;
		
		//Die Werte von x und y werden ausgegeben.
		System.out.println("x = " + x + " y = " + y);
		
		//z wird der Wert von x zugewiesen (1). x kann nun der Wert von y zugewiesen werden (2). y wird der Wert von z zugewiesen (1). Somit wurden die Werte von x und y vertauscht.
		z = x;
		x = y;
		y = z;
		
		//Die vertauschten x und y Werte werden ausgegeben. ANMERKUNG: Ein Programm wird immer von oben nacht unten ausgeführt.
		System.out.println("x = " + x + " y = " + y);	
	}
}
