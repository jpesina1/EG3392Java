import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CustomFontWindow extends JFrame {
	JPanel panel1, panel2, panel3;
	JTextField text;
	JRadioButton arial, times, verdana;
	ButtonGroup group;
	JCheckBox boldBox, redBox;
	Font font;

	public CustomFontWindow() {

		setPreferredSize(new Dimension(400, 400));

		panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(100, 100));
		add(panel1);
		panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(10, 25));
		panel2.setLayout(new GridLayout(1, 3));
		add(panel2);
		panel3 = new JPanel();
		panel3.setPreferredSize(new Dimension(100, 25));
		// add(panel3);

		font = new Font("Arial", Font.PLAIN, 30);
		text = new JTextField("Hello");
		text.setPreferredSize(new Dimension(100, 30));
		text.setFont(font);
		panel1.add(text);

		arial = new JRadioButton("Arial", true);
		times = new JRadioButton("Times");
		verdana = new JRadioButton("Verdana");
		group = new ButtonGroup();
		group.add(arial);
		group.add(times);
		group.add(verdana);

		boldBox = new JCheckBox("Bold");
		redBox = new JCheckBox("Red");

		boldBox.addItemListener(new CheckBoxListener());
		redBox.addItemListener(new CheckBoxListener());



		arial.addActionListener(new RadioButtonListener());
		times.addActionListener(new RadioButtonListener());
		verdana.addActionListener(new RadioButtonListener());

		panel2.add(arial);
		panel2.add(times);
		panel2.add(verdana);
		panel3.add(boldBox);
		panel3.add(redBox);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class RadioButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == arial) {
				font = new Font("Arial", Font.PLAIN, 30);
				text.setFont(font);
			} else if (e.getSource() == times) {
				font = new Font("Times", Font.PLAIN, 30);
				text.setFont(font);
			} else if (e.getSource() == verdana) {
				font = new Font("Verdana", Font.PLAIN, 30);
				text.setFont(font);
			}
		}
	}
		private abstract class CheckBoxListener implements ItemListener {
			public void itemStateChanged(ItemEvent e) {
				if (e.getSource() == boldBox) {
					if (boldBox.isSelected()) {
						if (e.getSource() == arial) {
							font = new Font("Arial", Font.BOLD, 30);
							text.setFont(font);
						} else if (e.getSource() == times) {
							font = new Font("Times", Font.BOLD, 30);
							text.setFont(font);
						} else if (e.getSource() == verdana) {
							font = new Font("Verdana", Font.BOLD, 30);
							text.setFont(font);
						}
					} else {
						if (e.getSource() == arial) {
							font = new Font("Arial", Font.PLAIN, 30);
							text.setFont(font);
						} else if (e.getSource() == times) {
							font = new Font("Times", Font.PLAIN, 30);
							text.setFont(font);
						} else if (e.getSource() == verdana) {
							font = new Font("Verdana", Font.PLAIN, 30);
							text.setFont(font);
						}
					}
				} else if (e.getSource() == redBox) {
					if (redBox.isSelected()) {
						redBox.setForeground(Color.red);
					} else {
						redBox.setForeground(Color.black);
					}

				}
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CustomFontWindow();
	}

}
