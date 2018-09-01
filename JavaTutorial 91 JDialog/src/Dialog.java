import javax.swing.JDialog;
import javax.swing.JTextPane;

public class Dialog extends JDialog {

	public Dialog(UnserFrame f) {
		super(f);
		setTitle("Dialog");
		setResizable(false);
		setModalityType(DEFAULT_MODALITY_TYPE);						//Zwingt den Fokus auf das Dialogfenster, sodass alle anderen Fenster nicht ansprechbar sind.
		
		//JTextPanes
		JTextPane nachricht = new JTextPane();
		nachricht.setText("Apfel und Kuchen\nmit Computer");
		nachricht.setBackground(getContentPane().getBackground());	//Gleiche Hintergrundfarbe wie das Ursprungsfenster.
		nachricht.setEditable(false);
		add(nachricht);
		
		//Allgemeines
		pack();														//Ermittelt alle Bestandteile des Fensters und setzt dadurch die Größe. Muss immer am Ende stehen.
	}
}
