


public class Hund extends Lebewesen implements Cloneable {

	public Hund (int welchesAlter) {
		alter = welchesAlter;
	}
	
	public Hund clone() throws CloneNotSupportedException {
		return (Hund) super.clone();
	}
}
