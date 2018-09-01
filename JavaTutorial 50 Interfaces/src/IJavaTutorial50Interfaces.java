
public interface IJavaTutorial50Interfaces {
	
	//In Interfaces können nur abstrakte Methoden definiert werden. Deswegen kann das "abstract" vor Methoden auch weggelassen werden.
	/*Vom Aufbau her sind Interfaces einer Klasse sehr ähnlich, sie sind nahezu vergleichbar mit abstrakten Klassen, welche nur Methodendeklarationen enthalten. Der einzige Unterschied zu einer Klasse 
	 * besteht darin, dass ein Interface keine Implementierungen besitzt, sondern nur Methodenköpfe und Konstanten.
	 * 
	 * Es kann immer nur von einer Klasse gleichzeitig geerbt werden. Jedoch von beliebig vielen Interfaces (keyword: "implements").
	 */
	
	void laufen();
	
	int i = 3; //Jegliche Variable im Interface ist automatisch "final". Egal ob man die Modifikation konkret hinschreibt oder nicht.
}
