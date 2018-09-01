
public class JavaTutorial8KommentareundArrays {
	public static void main (String args[]) {
		
		//Zeilenkommentare werden durch diese Slash Symbole am Anfang der Zeile ausgel�st. Wie der Name schon sagt, erstrecken sich diese Kommentare nur �ber eine Zeile... Au�erdem haben sie keinerlei Effekt auf den Quellcode, da sie vor dem compilen gel�scht werden.
		
		/* Ein Bereichskommentar wird durch ein Slash-
		 * und ein Sternsymbol ausgel�st. Wie man sieht
		 * erstreckt sich diese Kommentarart �ber mehrere
		 * Zeilen und wird mit einem Stern- und Slashsymbol beendet.
		 * Auch diese Kommentarart hat aus dem gleichen Grund
		 * keinen Einfluss auf den Quellcode des Programms.
		 * Die Sternsymbole zwischen Anfang und Ende des
		 * Kommentars haben nur eine �bersichtsfunktion.
		 * Sie k�nnten eigentlich auch gel�scht werden.
		 */
		
		//Array: Ein Array ist eine Variable, in der man mehrere unterschiedliche Variablen speichern kann.
		
		
		int[] i = new int[10];
		
		for (int x = 0; x<10; x++) {
			i[x] = 4;
			System.out.print(i[x] + " ");
		}
		
		
		/*
		int[][] j = new int[10][10];
		int u;
		u = 0;
		
		for (int y = 0; y<10; y++) {
			for (int x = 0; x<10; x++) {
				j[y][x] = u++;
				System.out.print(j[y][x] + " ");
			}
			*/
		
	}
}
