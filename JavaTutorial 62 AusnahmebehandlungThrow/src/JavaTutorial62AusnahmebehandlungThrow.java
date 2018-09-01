
public class JavaTutorial62AusnahmebehandlungThrow {
	public static void main(String[] args) {
		
		//Wir wollen ausschlieﬂen, dass ein Mensch jemals ein negatives Alter hat.
		
		
		try {
			Mensch karl = new Mensch(0, 80, "karl", "schwarz");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ACHTUNG! Das Objekt karl ist nach dem try-catch-Block nicht mehr existent.
	}
}
