
public class JavaTutorial34GetterUndSetter {
	public static void main (String args[]) {
		
		Mensch karl = new Mensch(9,9);
	
		System.out.println(Mensch.anzahlMenschen);
		karl.setAlter(13);
		System.out.println(karl.getAlter());
	}
}
