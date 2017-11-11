import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TempConverter extends JFrame{
	JButton con;
	JTextField cel;
	JTextField far;
	JPanel panel;
	JLabel celText;
	JLabel farText;
	double celsius ;
	double farenheit;

	public TempConverter(){
			setPreferredSize(new Dimension(600,600));
			Font font = new Font("Arial", Font.PLAIN, 20);

			panel = new JPanel();
			panel.setSize(400, 400);
		
			con = new JButton("Convert");
		
			celText = new JLabel("Celsius");
			celText.setFont(font);
			
			farText = new JLabel("Farenheit");
			farText.setFont(font);
			
			cel = new JTextField(celsius + "");
			cel.setFont(font);
			cel.setPreferredSize(new Dimension(75,20));
			far = new JTextField(farenheit + "");
			far.setFont(font);
			far.setPreferredSize(new Dimension(75,20));
			//far.setEnabled(false);
		
			add(panel);
			panel.add(celText);
			panel.add(cel);
			panel.add(farText);
			panel.add(far);	
			panel.add(con);
			
			pack();
			con.addActionListener(new Listener());
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		}
	
		public class Listener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Toolkit.getDefaultToolkit().beep();
				farenheit = Double.parseDouble(cel.getText()) * (9.0/5.0) + 32;
				far.setText(farenheit + "");
				
			
			}
		}
		
		public static void main(String[] args) {
		new TempConverter();
		}
	
}
