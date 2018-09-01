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
		button1.addActionListener(new ActionH�ndler());
		add(button1);
		
		//Listener
		addWindowListener(new WindowH�ndler());
	}
	
	private class ActionH�ndler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == button1) {
				Dialog d = new Dialog(UnserFrame.this);
				d.setLocationRelativeTo(UnserFrame.this);
				d.addWindowListener(new WindowH�ndler());
				d.setVisible(true);
			}
		}
	}
	
	private class WindowH�ndler implements WindowListener {

		@Override
		public void windowActivated(WindowEvent e) {								//Wird ausgef�hrt, wenn das Fenster den Fokus kriegt.
			System.out.println("aktiviert");
		}

		@Override																	//Wird ausgef�hrt, wenn das Fenster geschlossen wird. Allerdings nicht, wenn das Programm vorher durch "System.exit(0)" terminiert wurde.
		public void windowClosed(WindowEvent e) {
			System.out.println("closed");
		}

		@Override
		public void windowClosing(WindowEvent e) {									//Wird ausgef�hrt, wenn rotes Kreuz gedr�ckt wird.
			int antwort = JOptionPane.showConfirmDialog(UnserFrame.this, "Sind sie sicher, dass sie das Programm schlie�en wollen?", "Beenden?", JOptionPane.YES_NO_OPTION); //JOptionPane Methode "showConfirmDialog()" �ffnet ein Fenster mit einem Ja und einem Nein Button. Die gefragten Parameter sind 1. Fenster zu dem das Dialogfenster geh�rt 2. Prim�rtext 3. Titeltext 4.
			if (antwort == JOptionPane.YES_OPTION) {
				System.exit(0);
				UnserFrame.this.dispose();
			}
			System.out.println("closing");
		}

		@Override																	//Wird ausgef�hrt, wenn das Fenster seinen Fokus verliert.
		public void windowDeactivated(WindowEvent e) {
			System.out.println("deactivated");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {								//Wird ausgef�hrt, wenn das Fenster wieder "ent"minimiert wird.
			System.out.println("deiconified");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {								//Wird ausgef�hrt, wenn das Fenster minimiert wird.
			System.out.println("iconified");
			
		}

		@Override																	//Wir ausgef�hrt, wenn das Fenster sich zum ersten Mal beim Programmstart �ffnet.
		public void windowOpened(WindowEvent arg0) {
			System.out.println("opened");
			
		}
		
	}
}
