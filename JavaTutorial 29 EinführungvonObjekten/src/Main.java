
public class Main {
	public static void main (String args[]) {
		
		// Wir haben nun ein neues Objekts names Karl der Klasse Mensch erstellt.
		Mensch karl = new Mensch();
		
		//Es können natürlich beliebig viele Objekte der Klasse Mensch erstellt werden, die dann alle in der Klasse Mensch erstellten Parameter in sich gespeichert haben.
		Mensch gisela = new Mensch();
		
		//Durch Punktnotation Parameter definieren.
		
		//karls Parameter
		karl.alter = 80;
		karl.iq = 100;
		karl.name = "karl";
		karl.haarfarbe = "grau";
		
		//Giselas Parameter
		gisela.alter = 60;
		gisela.haarfarbe = "braun";
		gisela.iq = 100;
		gisela.name = "Gisela";
		
		//karls Ausgaben
		System.out.println(karl.alter);
		System.out.println(karl.iq);
		System.out.println(karl.name);
		System.out.println(karl.haarfarbe);
		
		//Leerzeile zwischen Parametern der 2 Menschen.
		System.out.println("");
		
		//Giselas Ausgaben
		System.out.println(gisela.alter);
		System.out.println(gisela.iq);
		System.out.println(gisela.name);
		System.out.println(gisela.haarfarbe);
	}
}
