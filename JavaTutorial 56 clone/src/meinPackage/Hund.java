package meinPackage;


public class Hund extends Lebewesen implements Cloneable {

	public Hund (int welchesAlter) {
		alter = welchesAlter;
	}
	
	public Hund clone() {
		try {
			return (Hund) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
