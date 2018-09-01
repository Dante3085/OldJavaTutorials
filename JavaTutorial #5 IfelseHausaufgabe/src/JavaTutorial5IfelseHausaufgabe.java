
public class JavaTutorial5IfelseHausaufgabe {
	public static void main (String args[]){
		
		/*Aufgabe: Variable "Alter" erstellen und mit einem Wert versehen. Ab 18 "vollj‰hrig" ausgeben.
		 *  Unter 18 "minderj‰hrig" ausgeben. Unter 0 "noch nicht geboren" ausgeben.
		 *  PROBLEM: Wie kann ich erreichen, dass z.B. bei Alter = 15 "Du bist minderj‰hrig" ausgegeben wird, dann das Alter = 25 gesetzt wird,
		 *  "Du bist vollj‰hrig" ausgegeben wird, nochmals das Alter = -1 gesetzt wird und schlieﬂlich " Du bist noch nicht geboren" ausgegeben
		 *  wird?
		 */
		
		//Hier werden die Variablen erstellt/definiert.
		int Alter,x,y;
		//Alter = 69;
		boolean f1 = true;
		boolean f2 = true;	
		boolean f3 = true;
		x = 25;
		y = -1;
		for ( int Alter1 = 0; Alter1 <= 19; Alter1 ++ ) {
		//Hier wird geschaut, ob "Alter" grˆﬂer oder gleich 0 ist (Minderj‰hrigkeit).
		if (Alter1==0) {
			if (f1==true) {
			System.out.println("Du bist noch nicht geboren");
			f1=false;
			}
		}		      
		
		//Hier wird geschaut, ob "Alter" grˆﬂer oder gleich 0 ist (Minderj‰hrigkeit).
		else if (Alter1>=0 && Alter1<18) {
			if (f2==true) {
			System.out.println("Du bist noch minderj‰hrig");
			f2=false;
			}
		}		
		//Hier wird geschaut, ob "Alter" grˆﬂer oder gleich 18 ist (Vollj‰hrigkeit).
		
		else if (Alter1>=18 && Alter1<70) {
			if (f3==true) {
			System.out.println("Du bist vollj‰hrig");
			f3=false;
			}
		}
		
		}
		
		/*Hier wird geschaut, ob "Alter" kleiner 0 ist (noch nicht geboren).
		if (Alter<0) {
			System.out.println("Du bist noch nicht geboren");
		}
		
		//Hier wird ein Beispiel f¸r "else if" gegeben.
		if (Alter>100 && Alter<179) {
			System.out.println("Du bist sehr alt");
		}
		
		else if (Alter>180) {
			System.out.println("So alt ist noch niemand geworden");
		}*/
	}
}
