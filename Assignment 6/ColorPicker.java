import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPicker extends JFrame {

	Color color;
	JPanel panel;
	int x = 0;
	int y = 0;
	int myChoice = 100;

	public ColorPicker() {

		color = new Color(x, y, myChoice);
		setSize(400, 400);
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(255, 255));
		panel.setBackground(color);
		panel.setOpaque(true);
		panel.addMouseListener(new MouseMotionListener());
		addMouseListener(new MouseMotionListener());

		add(panel);

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	// MOUSEMOTIONLISTENER
	public class MouseMotionListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("MouseClicked");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			x = e.getX();
			y = e.getY();
			myChoice = 100;
			color = new Color(x, y, myChoice);
			System.out.println(e.getX() + " " + e.getY());
			panel.setBackground(color);
			System.out.println("Entered panel");
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Left panel");
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorPicker();
	}

}
