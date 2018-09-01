
public class JavaTutorial57AusnahmebehandlungMitThrows  {
	public static void main(String[] args) {
		
		Hund h = new Hund(5);
		Mensch m1 = new Mensch("karl",70,80,"schwarz",h);
		try {
			Mensch m2 = m1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
