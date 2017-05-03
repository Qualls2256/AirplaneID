import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AirplaneQuestions extends JFrame {

	JLabel engineType = new JLabel();
	JComboBox<String> engineTypeList = new JComboBox<String>();
	JLabel engineNumber = new JLabel();
	JComboBox<String> engineNumberList = new JComboBox<String>();
	JLabel engineLocation = new JLabel();
	JComboBox<String> engineLocationList = new JComboBox<String>();
	JButton updateButton = new JButton();

	/*
	 * Ask questions about the airplane you are looking at: 1. What type of
	 * engine 2. how many engines 3. Location of engines
	 * 
	 * GUI JOP minimum or Full JFrame
	 */

	public void createGUI() {

		setTitle("Airplane Identification");
		setSize(600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);

		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints;

		engineType.setText("Type of Engine");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		gridConstraints.insets = new Insets(10, 0, 0, 0);
		getContentPane().add(engineType, gridConstraints);

		engineTypeList.setBackground(Color.LIGHT_GRAY);
		engineTypeList.setPreferredSize(new Dimension(125, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 1;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.NORTH;
		getContentPane().add(engineTypeList, gridConstraints);

		engineNumber.setText("Number of Engines");
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		gridConstraints.insets = new Insets(10, 0, 0, 0);
		getContentPane().add(engineNumber, gridConstraints);

		engineNumberList.setBackground(Color.LIGHT_GRAY);
		engineNumberList.setPreferredSize(new Dimension(125, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.NORTH;
		getContentPane().add(engineNumberList, gridConstraints);

		engineLocation.setText("Engine Location");
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		gridConstraints.insets = new Insets(10, 0, 0, 0);
		getContentPane().add(engineLocation, gridConstraints);

		engineLocationList.setBackground(Color.LIGHT_GRAY);
		engineLocationList.setPreferredSize(new Dimension(125, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.NORTH;
		getContentPane().add(engineLocationList, gridConstraints);

		updateButton.setText("Submit Request");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		gridConstraints.insets = new Insets(0, 0, 10, 0);
		getContentPane().add(updateButton, gridConstraints);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateButtonActionPerformed(e);
			}
		});

		engineTypeList.addItem("Jet");
		engineTypeList.addItem("Propeller");

		engineNumberList.addItem("1");
		engineNumberList.addItem("2");
		engineNumberList.addItem("3");
		engineNumberList.addItem("4");

		engineLocationList.addItem("Nose");
		engineLocationList.addItem("Body");
		engineLocationList.addItem("Tail");
		engineLocationList.addItem("Wing");

	}

	private void updateButtonActionPerformed(ActionEvent e) {

	}

}
