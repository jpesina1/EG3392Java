import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class ColorPanels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("My Window with colored panels");
		frame.setSize(800, 400);   //Pixels
		frame.setLocation(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Hide on close, exit on close, do nothing on close
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setSize(800,400);
		panel1.setLocation(100, 200);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setSize(200, 200);
		panel2.setLocation(50, 100);
		panel2.setBackground(Color.RED);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setSize(200, 200);
		panel3.setBackground(Color.BLUE);		
		panel3.setLocation(300, 100);
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setSize(200, 200);
		panel4.setBackground(Color.YELLOW);		
		panel4.setLocation(550, 100);
		
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setSize(100, 100);
		redLabel.setLocation(130, 30);
		redLabel.setForeground(Color.red);
		redLabel.setFont(new Font("Times", Font.PLAIN, 32));
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setSize(100, 100);
		blueLabel.setLocation(370, 30);
		blueLabel.setForeground(Color.blue);
		blueLabel.setFont(new Font("Vivaldi", Font.PLAIN, 32));
		
		JLabel yellowLabel = new JLabel("Yellow");
		yellowLabel.setSize(100, 100);
		yellowLabel.setLocation(600, 30);
		yellowLabel.setForeground(Color.yellow);
		yellowLabel.setFont(new Font("Arial", Font.PLAIN, 32));
		
		
		
		frame.add(panel1);
		panel1.add(panel2);
		panel1.add(panel3);
		panel1.add(panel4);
		panel1.add(redLabel);
		panel1.add(blueLabel);
		panel1.add(yellowLabel);
		frame.setVisible(true);
		
		}
}