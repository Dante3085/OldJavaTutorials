
public class JavaTutorial33static {
	public static void main (String args[]) {
		
		/* "static" ist ein Modifikator. Mit Modifikatoren können Klassen, Attribute, und/oder Methoden für versch. Zwecke gekennzeichnet werden.
		 * Mit static werden Klassenvariablen bzw. Klassenmethoden gekennzeichnet. Sie sind nicht an Objekte gebunden, sondern an eine jeweilige Klasse.
		 * 
		 * Mit "static" versehene Dinge sollten immer mit der Klasse angesprochen werden in der sie erstellte wurden und nicht einer Instanz/dem Objekt in dieser Klasse.
		 * Hier ist das Beispiel "karl.anzahlMenschen" ist FALSCH. "Mensch.anzahlMenschen" ist RICHTIG.
		 */
		
		System.out.println(Mensch.anzahlMenschen);  //Grundanzahl der Menschen wird ausgegeben.
		
		Mensch karl = new Mensch(70,80);			//Neuer Mensch mit Namen Karl wird erstellt.
		
		System.out.println(karl.iq); 					//GrundIQ wird ausgegeben.
		karl.bildung(); 			 					//IQ wird durch Bildung erhöht.
		System.out.println(karl.iq); 					//Durch Bildung erhöhter IQ wird ausgegeben.
		karl.bildung();				 					//IQ wird durch Bildung erhöht.
		System.out.println(karl.iq); 					//Durch Bildung erhöhter IQ wird ausgegeben.
		karl.haarfarbe = "blond";	 					//Haarfarbe wird als "blond" definiert.
		System.out.println(karl.haarfarbe);				//Haarfarbe wird ausgegeben.
		System.out.println(Mensch.anzahlMenschen);  	//anzahlMenschen wird ausgegeben.
		
		Mensch Gisela = new Mensch(90,90);				//Neuer Mensch mit Namen Gisela wird erstellt.
		
		System.out.println(Mensch.anzahlMenschen); 		//anzahlMenschen wird ausgegeben.
		Mensch Raja = new Mensch(77,55);
		System.out.println(Mensch.getAnzahlMenschen()); //anzahlMenschen wird mithilfe der Instanzmethode "getAnzahlMenschen" ausgegeben.
	}
}
