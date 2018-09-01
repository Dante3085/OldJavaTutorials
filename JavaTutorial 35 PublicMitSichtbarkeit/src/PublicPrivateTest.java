
public class PublicPrivateTest {

	public static int add(int a) { //Instanzmethode ist public. Kann also von außen gesehen und benutzt werden. Dazu siehe andere Klasse: JavaTutorial35PublicMitSichtbarkeit.
		a = a + 5;
		return a;
	}
	
	private static int sub(int a) { //Instanzmethode ist private und kann daher nicht von außen gesehen oder benutzt werden. Dazu siehe andere Klasse: JavaTutorial35PublicMitSichtbarkeit.
		a = a - 5;
		return a;
	}
}
