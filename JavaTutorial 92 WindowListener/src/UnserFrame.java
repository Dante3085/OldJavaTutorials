import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UnserFrame extends JFrame {

	JButton button1;
	
	public UnserFrame() {
		setTitle("UnserFrame");
		setSize(500,300);
		setResizable(false);
		setVisible(true);
		setAlwaysOnTop(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//Buttons
		button1 = new JButton("Dialogfenster");
		button1.setBounds(50, 50, 150, 30);
		button1.addActionListener(new ActionHändler());
		add(button1);
		
		//Listener
		addWindowListener(new WindowHändler());
	}
	
	private class ActionHändler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == button1) {
				Dialog d = new Dialog(UnserFrame.this);
				d.setLocationRelativeTo(UnserFrame.this);
				d.addWindowListener(new WindowHändler());
				d.setVisible(true);
			}
		}
	}
	
	private class WindowHändler implements WindowListener {

		@Override
		public void windowActivated(WindowEvent e) {								//Wird ausgeführt, wenn das Fenster den Fokus kriegt.
			System.out.println("aktiviert");
		}

		@Override																	//Wird ausgeführt, wenn das Fenster geschlossen wird. Allerdings nicht, wenn das Programm vorher durch "System.exit(0)" terminiert wurde.
		public void windowClosed(WindowEvent e) {
			System.out.println("closed");
		}

		@Override
		public void windowClosing(WindowEvent e) {									//Wird ausgeführt, wenn rotes Kreuz gedrückt wird.
			int antwort = JOptionPane.showConfirmDialog(UnserFrame.this, "Sind sie sicher, dass sie das Programm schließen wollen?", "Beenden?", JOptionPane.YES_NO_OPTION); //JOptionPane Methode "showConfirmDialog()" öffnet ein Fenster mit einem Ja und einem Nein Button. Die gefragten Parameter sind 1. Fenster zu dem das Dialogfenster gehört 2. Primärtext 3. Titeltext 4.
			if (antwort == JOptionPane.YES_OPTION) {
				System.exit(0);
				UnserFrame.this.dispose();
			}
			System.out.println("closing");
		}

		@Override																	//Wird ausgeführt, wenn das Fenster seinen Fokus verliert.
		public void windowDeactivated(WindowEvent e) {
			System.out.println("deactivated");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {								//Wird ausgeführt, wenn das Fenster wieder "ent"minimiert wird.
			System.out.println("deiconified");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {								//Wird ausgeführt, wenn das Fenster minimiert wird.
			System.out.println("iconified");
			
		}

		@Override																	//Wir ausgeführt, wenn das Fenster sich zum ersten Mal beim Programmstart öffnet.
		public void windowOpened(WindowEvent arg0) {
			System.out.println("opened");
			
		}
		
	}
}
