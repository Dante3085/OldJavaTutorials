import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class UnserListener implements ActionListener {
	
	JLabel lbl;
	
	UnserListener (JLabel lbl) {
		this.lbl = lbl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {						//Wird ausgeführt sobald Knopf gedrückt wird.
		lbl.setText("abc");
	}
}
