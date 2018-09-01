
public class JavaTutorial95StringBuilder {
	public static void main(String[] args) {
		
		//Wenn ein String sehr groﬂe Inhalte bekommen soll, so ist der StringBuilder sehr hilfreich.
		
		String s = "";
		StringBuilder b = new StringBuilder();
		
		for(int i = 0; i <1000; i++) {
			b.append('0');
		}
		s = b.toString();
		System.out.println(s);
	}
}
