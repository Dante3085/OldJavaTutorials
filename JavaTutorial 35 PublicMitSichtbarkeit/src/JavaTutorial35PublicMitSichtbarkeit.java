
public class JavaTutorial35PublicMitSichtbarkeit {
	public static void main (String args[]) {
		
		/* public/private: sind Sichtbarkeitsmodifier. Durch public sind alle durch public markierten Elemente von auﬂen sichtbar, bzw. andere Klassen haben Zugriff von auﬂen. Durch private passiert
		 * das Gegenteil. Andere Klassen haben von auﬂen keinen Zugriff auf das mit private modifizierte Element. Wenn Eigenschaft in privater Klasse public ist, kann eine fremde Klasse trotzdem nicht
		 * auf die Eigenschaft zugreifen.
		 */
		
		int b, z;
		b = 100;
		z = PublicPrivateTest.add(b);
		System.out.println(z);
		z = PublicPrivateTest.sub(z);  //Fehler mit Absicht, um private in anderer Klasse zu verdeutlichen.
		System.out.println(z);
	}
}
