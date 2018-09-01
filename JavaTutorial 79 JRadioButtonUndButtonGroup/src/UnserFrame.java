import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UnserFrame extends JFrame {

	//JRadioButtons sind runde Checkboxen.
	//In ButtonGroup können Buttons reingesteckt werden und immer nur einer von ihnen gleichzeitig aktiv (gedrückt) sein.
	
	JLabel label1;
	JTextField textField1;
	JPanel panel1;
	JRadioButton radioButton1;
	JRadioButton radioButton2;
	JRadioButton radioButton3;
	ButtonGroup buttonGroup1;
	
	UnserFrame() {
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Events");
		setResizable(true);
		setAlwaysOnTop(true);
		setLayout(null);
		
		//Fonts
		Font font1 = new Font("Arial", Font.PLAIN, 15);
		
		//Label
		label1 = new JLabel("Ich werde von RadioButtons verändert.");
		label1.setFont(font1);
		label1.setBounds(100, 100, 300, 15);
		add(label1);
		
		//Panel
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(400, 200, 100, 100);
		add(panel1);
		
		//RadioButton
		radioButton1 = new JRadioButton("radioButton1");
		radioButton1.setBounds(0, 0, 100, 20);
		radioButton1.addItemListener(new AllgemeinerItemListener());
		panel1.add(radioButton1);
		
		radioButton2 = new JRadioButton("radioButton2");
		radioButton2.setBounds(0, 20, 100, 20);
		radioButton2.addItemListener(new AllgemeinerItemListener());
		panel1.add(radioButton2);
		
		radioButton3 = new JRadioButton("radioButton3");
		radioButton3.setBounds(0, 40, 100, 20);
		radioButton3.addItemListener(new AllgemeinerItemListener());
		panel1.add(radioButton3);
		
		//ButtonGroup
		buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);						//add steckt hier lediglich button in buttonGroup und hat nichts mit der Anzeige auf dem Frame zutun.
		buttonGroup1.add(radioButton2);
		buttonGroup1.add(radioButton3);
	}
	
	private class AllgemeinerItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			if (radioButton1.isSelected()) {
			label1.setText("radioButton1");
			}
			else if (radioButton2.isSelected()) {
				label1.setText("radioButton2");
			}
			else if (radioButton3.isSelected()) {
				label1.setText("radioButton3");
			}
		}
	}
}
