
public abstract class Lebewesen {

	int alter;
	int iq;
	String name;
	String haarfarbe;
	
	//Das "abstract" bei einer Methode erzwingt bei jeder Subklasse, bzw. Klasse die von jener Klasse mit der abstrakten Methode erbt, dass sie eine gleichnamige Methode enth�lt.
	//Einfach gesagt: Wenn unser Begriff des Lebewesens sich auf Lebewesen mit Beinen beschr�nkt, so sollte jedes Lebewesen, dass von der Klasse Lebewesen erbt auch laufen k�nnen.
	abstract void laufen(double schrittl�nge);
}
