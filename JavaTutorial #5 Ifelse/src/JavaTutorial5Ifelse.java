
public class JavaTutorial5Ifelse {
 public static void main (String args[]){
	 
	 int x;
	 x = 4;
	 
	 //Operatoren: == (gleich); !(Negation von einem anderen Operator, Bsp.: "!=" für nicht gleich); +; -; /; <=; >=; && (und); || (oder);
	 //Durch geschweifte Klammern nach dem if (...) können mehrere Befehle reingeschrieben werden.
	 if (x<3){
		 System.out.println("x ist kleiner als 3.");
		 System.out.println("Sagt der Computer.");
	 }
		
	 //Durch geschweifte Klammern nach dem else können mehrere Befehle reingeschrieben werden.
	 else{
		 System.out.println("x ist nicht kleiner als 3.");
		 System.out.println("Sagt der Computer ebenfalls.");
	 }	 
 }
}
