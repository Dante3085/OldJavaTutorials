package meinPackage;

public class JavaTutorial55Systemzeit {
	public static void main(String[] args) {
		
		//Jeder PC hat eine Systemzeit, nach der Uhrzeit und Datum berrechnet werden.
		Long l = Long.MAX_VALUE;
		System.out.println(System.currentTimeMillis());									//Gibt Systemzeit zur�ck. Die Systemzeit wird wie die Methode schon vermuten l�sst, in Millisekunden gez�hlt (Seit 1. Januar 1970).
		System.out.println(l);
	}
}
